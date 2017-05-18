package br.cefetmg.servico;

import br.cefetmg.DAO.UsuarioDAO;
import br.cefetmg.dominio.Usuario;
import br.cefetmg.dominio.Questao;
import br.cefetmg.dominio.Resposta;
import java.util.List;

public class implementacaoUsuarioDAO implements UsuarioDAO{
    private final UsuarioDAO dao;
    
    public implementacaoUsuarioDAO(UsuarioDAO dao){
        this.dao = dao;
    }
    @Override
    public void inserir(Usuario obj) {
        dao.inserir(obj);
    }

    @Override
    public Usuario consultar(long id) {
        return dao.consultar(id);
    }

    @Override
    public boolean alterar(long idObjetoAntigo, Usuario novoObj) {
        return dao.alterar(idObjetoAntigo, novoObj);
    }

    @Override
    public Usuario excluir(long id) {
        return dao.excluir(id);
    }

    @Override
    public List<Usuario> listar() {
        return dao.listar();
    }
}
