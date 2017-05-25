package br.cefetmg.servico;

import br.cefetmg.DAO.DesempenhoDAO;
import br.cefetmg.exception.ExcecaoNegocio;
import br.cefetmg.exception.ExcecaoPersistencia;

public class implementacaoDesempenhoDAO implements PersistenciaDesempenhoDAO {

    private final DesempenhoDAO desempenhoDAO;

    public implementacaoDesempenhoDAO(DesempenhoDAO dao) {
        this.desempenhoDAO = dao;
    }

    @Override
    public void inserirDesempenho(int acertos, int tentativas) throws ExcecaoNegocio {
        if((tentativas==0)&&(acertos>0)){
            throw new ExcecaoNegocio ("Não é possível ter um número de acertos maior que zero se não forem realizadas tentativas");
        }
        desempenhoDAO.inserir(acertos, tentativas);
    }

    @Override
    public double consultarDesempenho(long idDesempenho) throws ExcecaoPersistencia {
        return desempenhoDAO.consultar(idDesempenho);  //informa a porcentagem de acertos.
    }
}