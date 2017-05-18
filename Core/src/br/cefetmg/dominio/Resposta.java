package br.cefetmg.dominio;

import java.util.Map;

public class Resposta {

    private int contRespostaCerta;
    private int contRespostaErrada;

    public Resposta(Questao questao) {
        questao.getAlternativas();
    }

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
