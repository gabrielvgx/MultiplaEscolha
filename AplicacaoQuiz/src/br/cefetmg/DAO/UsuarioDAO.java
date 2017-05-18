package br.cefetmg.DAO;

import br.cefetmg.dominio.Usuario;
import java.util.List;

public interface UsuarioDAO {
    public void inserir(Usuario obj);
    public Usuario consultar(long idUsuario);
    public boolean alterar(long idObjetoAntigo, Usuario novoObj);
    public Usuario excluir(long idUsuario);
    public List<Usuario> listar();
}