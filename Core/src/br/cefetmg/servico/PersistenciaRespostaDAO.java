/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.servico;

import br.cefetmg.dominio.Resposta;

/**
 *
 * @author jaops
 */
public interface PersistenciaRespostaDAO {
    public void gravarResposta (Resposta resposta);
    public Resposta excluirResosta (Resposta resposta);

}
