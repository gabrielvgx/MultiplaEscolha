package br.cefetmg.servico;

import br.cefetmg.DAO.DesempenhoDAO;
import java.util.ArrayList;
import java.util.Map;

public class implementacaoDesempenhoDAO implements DesempenhoDAO {

    private final DesempenhoDAO dao;

    public implementacaoDesempenhoDAO(DesempenhoDAO dao) {
        this.dao = dao;
    }

    @Override
    public void inserirDesempenho(int acertos, int tentativas) {
        dao.inserirDesempenho(acertos, tentativas);
    }

    @Override
    public Map<Long, ArrayList> consultarDesempenho() {
        return dao.consultarDesempenho();  //informa a porcentagem de acertos
    }
}