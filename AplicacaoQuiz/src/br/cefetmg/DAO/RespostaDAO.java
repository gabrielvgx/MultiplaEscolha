package br.cefetmg.DAO;

import br.cefetmg.dominio.Resposta;

public interface RespostaDAO {
    public void gravarResposta (Resposta resposta);
    public Resposta excluirResposta (Resposta resposta);  
}