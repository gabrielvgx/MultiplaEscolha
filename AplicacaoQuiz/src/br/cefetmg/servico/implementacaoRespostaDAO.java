package br.cefetmg.servico;

import br.cefetmg.DAO.RespostaDAO;
import br.cefetmg.dominio.Resposta;

public class implementacaoRespostaDAO implements RespostaDAO {
    
    private final RespostaDAO dao;
            
    public implementacaoRespostaDAO (RespostaDAO dao) {
        this.dao=dao;
    }
    
    @Override
    public void gravarResposta(Resposta resposta) {
        dao.gravarResposta(resposta);
    }

    @Override
    public Resposta excluirResposta(Resposta resposta) {
        return dao.excluirResposta(resposta);
    }
    
}
