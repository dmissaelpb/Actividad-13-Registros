package com.app3.app13.controller;

import com.app3.app13.dao.IPersonaDAO;

public class PersonaController {
    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping("/usuarios")  // general busqueda
    @ResponseStatus(HttpStatus.OK)
    public List<Usuario>
    getUsusarios(){

        return usuarioService.findAll();
    }

    @PostMapping("/buscar_usuario") //** unica de usuario
    public ResponseEntity<?> findUsuario(@RequestBody Usuario usuario){
        Usuario usuarioDb = usuarioService.findUsuario(usuario);
        if(usuarioDb!=null) {
            return new ResponseEntity<>(usuarioDb, HttpStatus.OK);
        }else {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/update/{id}")  //*******
    public ResponseEntity<?> updateUsuario(@PathVariable(value="id")Long id, @RequestBody Usuario usuario){
        Usuario usuarioDB = null;
        usuarioDB = usuarioService.findById(id);
        if(usuarioDB != null) {
            usuarioDB.setEmail(usuario.getEmail());
            usuarioDB.setNombre(usuario.getNombre());
            usuarioDB.setFoto(usuario.getFoto());
            usuarioService.uptadeUsuario(usuarioDB);
            return new ResponseEntity<>(usuarioDB, HttpStatus.OK);
        }else {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/actualizar_sql")
    public ResponseEntity<?> updateUsuarioSql(@RequestBody Usuario usuario){
        Usuario usuarioDb = null;
        usuarioDb = usuarioService.findByIdSQL(usuario.getId());
        if(usuarioDb != null) {
            usuarioDb.setEmail(usuario.getEmail());
            usuarioDb.setNombre(usuario.getNombre());
            usuarioDb.setFoto(usuario.getFoto());
            usuarioService.uptadeUsuario(usuarioDb);
            return new ResponseEntity<>(usuarioDb, HttpStatus.OK);
        }else {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/eliminar/{id}") //*****
    public ResponseEntity<Void> deleteUsuario(@PathVariable(value="id")Long id){
        usuarioService.deleteUsuario(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @PostMapping("eliminar_post")
    public ResponseEntity<Void> deleteUsuarioPost(@RequestBody Usuario usuario){
        if(usuarioService.findUsuario(usuario)!=null) {
            usuarioService.deleteUsuario(usuario);
            return new ResponseEntity<Void>(HttpStatus.OK);
        }
        return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
    }
    }
