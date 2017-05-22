package br.cefetmg.dominio;

import br.cefetmg.exception.ExcecaoNegocio;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Sessao {

    private Usuario usuarioLogado;
    private Map<Questao, String> questoesRespondidas;
    private int numeroRespondidasVF;
    private int numeroRespondidasFechada;
    private int numeroAcertosVF;
    private int numeroAcertosFechada;
    private int limiteQuestoes;

    public Sessao() {
        questoesRespondidas = new LinkedHashMap<>();
    }

    public Sessao(Usuario usuarioLogado) {
        this();
        this.usuarioLogado = usuarioLogado;
        if (usuarioLogado instanceof Anonimo) {
            limiteQuestoes = 10;
        }
    }

    public void contabilizaQuestaoRespondida(Questao questaoRespondida, String resposta) {
        questoesRespondidas.put(questaoRespondida, resposta);

        switch (questaoRespondida.getTipoQuestao()) {
            case "VF":
                char[] gabaritoSeparado = resposta.toCharArray();
                numeroRespondidasVF += gabaritoSeparado.length;
                boolean[] gabaritoBooleano = new boolean[gabaritoSeparado.length];
                for (int i = 0; i < gabaritoSeparado.length; i++) {
                    if (gabaritoSeparado[i] == 'V') {
                        gabaritoBooleano[i] = true;
                    } else {
                        gabaritoBooleano[i] = false;
                    }
                }
                ArrayList respostasCorretas = new ArrayList(questaoRespondida.getAlternativas().values());
                for (int i = 0; i < gabaritoBooleano.length; i++) {
                    if ((boolean) respostasCorretas.get(i) == gabaritoBooleano[i]) {
                        numeroAcertosVF++;
                    }
                }
                break;
            case "fechada":
                if (questaoRespondida.getAlternativas().get(resposta)) {
                    numeroAcertosFechada++;
                }
                numeroRespondidasFechada++;
                break;
        }
    }

    public void questaoRespondida(Questao questao, String resposta) throws ExcecaoNegocio {
        if (usuarioLogado instanceof Anonimo) {
            if (limiteQuestoes <= 10) {
                contabilizaQuestaoRespondida(questao, resposta);
            } else {
                throw new ExcecaoNegocio("Numero maximo de questoes respondidas para esse perfil de Usuario!");

            }
        } else {
            contabilizaQuestaoRespondida(questao, resposta);

        }
    }

    public Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(Usuario usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }

    public Map<Questao, String> getQuestoesRespondidas() {
        return questoesRespondidas;
    }

    public void setQuestoesRespondidas(Map<Questao, String> questoesRespondidas) {
        this.questoesRespondidas = questoesRespondidas;
    }

    public int getNumeroRespondidasVF() {
        return numeroRespondidasVF;
    }

    public void setNumeroRespondidasVF(int numeroRespondidasVF) {
        this.numeroRespondidasVF = numeroRespondidasVF;
    }

    public int getNumeroRespondidasFechada() {
        return numeroRespondidasFechada;
    }

    public void setNumeroRespondidasFechada(int numeroRespondidasFechada) {
        this.numeroRespondidasFechada = numeroRespondidasFechada;
    }

    public int getNumeroAcertosVF() {
        return numeroAcertosVF;
    }

    public void setNumeroAcertosVF(int numeroAcertosVF) {
        this.numeroAcertosVF = numeroAcertosVF;
    }

    public int getNumeroAcertosFechada() {
        return numeroAcertosFechada;
    }

    public void setNumeroAcertosFechada(int numeroAcertosFechada) {
        this.numeroAcertosFechada = numeroAcertosFechada;
    }

}
