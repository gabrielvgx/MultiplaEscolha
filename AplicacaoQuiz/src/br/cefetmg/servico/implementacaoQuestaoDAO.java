package br.cefetmg.servico;

import br.cefetmg.DAO.QuestaoDAO;
import br.cefetmg.dominio.Questao;
import br.cefetmg.exception.ExcecaoPersistencia;
import java.util.List;

public class implementacaoQuestaoDAO implements QuestaoDAO{
    private final QuestaoDAO dao;
    
    public implementacaoQuestaoDAO(QuestaoDAO dao){
        this.dao = dao;
    }
    @Override
    public void inserir(Questao obj) throws ExcecaoPersistencia {
        dao.inserir(obj);
    }

    @Override
    public Questao consultar(Long id) throws ExcecaoPersistencia {
        return dao.consultar(id);
    }

    @Override
    public void alterar(Questao novoObj) throws ExcecaoPersistencia {
        dao.alterar(novoObj);
    }

    @Override
    public Questao excluir(Long id) throws ExcecaoPersistencia {
        return dao.excluir(id);
    }

    @Override
    public List<Questao> listar() throws ExcecaoPersistencia {
        return dao.listar();
    }

}
