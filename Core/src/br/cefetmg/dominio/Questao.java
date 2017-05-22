package br.cefetmg.dominio;

import java.util.ArrayList;
import java.util.Map;

public class Questao {
//Teste de versionamento

    private Long idQuestao;
    private ArrayList<String> enunciado;
    private Map<String, Boolean> alternativas;
    private ArrayList<String> pathImagens;
    private String tipoQuestao;
    public Questao() {
    }

    public Questao(Long idQuestao) {
        this.idQuestao = idQuestao;
    }

    public Questao(Long idQuestao, ArrayList<String> enunciado, Map<String, Boolean> alternativas, String tipoQuestao, ArrayList<String> pathImagens) {
        this.idQuestao = idQuestao;
        this.enunciado = enunciado;
        this.alternativas = alternativas;
        this.tipoQuestao = tipoQuestao;
        this.pathImagens = pathImagens;
    }

    public Questao(Long idQuestao, ArrayList<String> enunciado, Map<String, Boolean> alternativas, String tipoQuestao) {
        this.idQuestao = idQuestao;
        this.enunciado = enunciado;
        this.alternativas = alternativas;
        this.tipoQuestao = tipoQuestao;
    }

    public <K, V> Questao(Map<K, V> atributos) {

        int nAtributos = this.getClass().getDeclaredFields().length - 1;

        for (int i = 0; i <= nAtributos; i++) {

            try {
                String nomeAtributo = this.getClass().getDeclaredFields()[i].getName();
                this.getClass().getDeclaredFields()[i].set(this, this.getClass().getDeclaredFields()[i].getType().cast(atributos.get(nomeAtributo)));
            } catch (IllegalArgumentException | IllegalAccessException ex) {
            }
        }
    }

    public void mostrarAtributos() {
        int nAtributos = this.getClass().getDeclaredFields().length - 1;
        for (int i = 0; i <= nAtributos; i++) {
            String nomeAtributo = this.getClass().getDeclaredFields()[i].getName();
            try {
                System.out.println(nomeAtributo + " = " + this.getClass().getDeclaredFields()[i].get(this));
            } catch (SecurityException | IllegalArgumentException | IllegalAccessException ex) {
            }
        }

    }

    public Long getIdQuestao() {
        return idQuestao;
    }

    public void setIdQuestao(Long idQuestao) {
        this.idQuestao = idQuestao;
    }

    public ArrayList<String> getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(ArrayList<String> enunciado) {
        this.enunciado = enunciado;
    }

    public Map<String, Boolean> getAlternativas() {
        return alternativas;
    }

    public void setAlternativas(Map<String, Boolean> alternativas) {
        this.alternativas = alternativas;
    }

    public ArrayList<String> getPathImagens() {
        return pathImagens;
    }

    public void setPathImagens(ArrayList<String> pathImagens) {
        this.pathImagens = pathImagens;
    }

    public String getTipoQuestao() {
        return tipoQuestao;
    }

    public void setTipoQuestao(String tipoQuestao) {
        this.tipoQuestao = tipoQuestao;
    }

}
