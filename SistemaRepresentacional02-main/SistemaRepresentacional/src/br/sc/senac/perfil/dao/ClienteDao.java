package br.sc.senac.perfil.dao;


public interface UsuarioDao {

    public Usuario acharPorId(Integer id);

    public boolean autenticacao();

    public void insercao(Usuario usuario);
}