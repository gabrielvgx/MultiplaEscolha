package br.cefetmg.servico;

import br.cefetmg.DAO.QuestaoDAO;
import br.cefetmg.dominio.Questao;
import java.util.List;

public class implementacaoQuestaoDAO implements QuestaoDAO{
    private final QuestaoDAO dao;
    
    public implementacaoQuestaoDAO(QuestaoDAO dao){
        this.dao = dao;
    }
    @Override
    public void inserir(Questao obj) {
        dao.inserir(obj);
    }

    @Override
    public Questao consultar(long id) {
        return dao.consultar(id);
    }

    @Override
    public boolean alterar(long idObjetoAntigo, Questao novoObj) {
        return dao.alterar(idObjetoAntigo, novoObj);
    }

    @Override
    public Questao excluir(long id) {
        return dao.excluir(id);
    }

    @Override
    public List<Questao> listar() {
        return dao.listar();
    }

}
