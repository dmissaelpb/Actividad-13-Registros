package com.app3.app13.service;

public interface IPersonaService {
    public List<Usuario> findAll();

    public void save(Usuario usuario);

    public Usuario findUsuario(Usuario usuario);

    public Usuario checkUsuarioLogin(Usuario usuario);

    public void deleteUsuario(Usuario usuario);

    public Usuario uptadeUsuario(Usuario usuario);

    public Optional<Usuario> findUsuarioById(Long usuario_id);

    public void deleteUsuario(Long id);

    public Usuario findById(Long id);

    public Usuario findByIdSQL(Long id);

}
