/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.dominio;

import java.util.Map;

/**
 *
 * @author jaops
 */
public class Resposta {

   //  Questao questao;
   // private Map<String, Boolean> alternativa;
    //commit
    private int contRespostaCerta;
    private int contRespostaErrada;

    public Resposta(Questao questao) {
        questao.getAlternativas();
    }

/*    public Resposta(String textoAlternativa) {
        alternativa.put(textoAlternativa, true);
    }
*/
    public boolean validacaoResposta(Questao questao) {
        for (Map.Entry<String, Boolean> entry : questao.getAlternativas().entrySet()) {
            String key = entry.getKey();
            Boolean value = entry.getValue();
                if (value == true) {
                    contRespostaCerta++; // coloquei um contador, mas pode ser uma interação 
                    // com o programa em si.
                    return true;
                } else {
                    contRespostaErrada++;
                    return false;
                }
        }
        return false;
    }


}
