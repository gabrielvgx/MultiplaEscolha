package br.cefetmg.dominio;

import br.cefetmg.exception.ExcecaoNegocio;

public class Desempenho {

    private int acerto;
    private int tentativa;
    //private int numeroErrosFechada;
    //private int numeroErrosVF;
    // private int medio; //contador
    private int malDesempenho; //contador
    private int bomDesempenho; //contador
    private int totalAcertos;

    public Desempenho() {
        //     numeroErrosFechada = (sessao.getNumeroRespondidasFechada())
        //      - (sessao.getNumeroAcertosFechada());
        //     numeroErrosVF = (sessao.getNumeroRespondidasVF())
        //    - (sessao.getNumeroAcertosVF());
        tentativa = sessao.getNumeroRespondidasFechada()
                + sessao.getNumeroRespondidasVF();
        totalAcertos = sessao.getNumeroAcertosFechada()
                + sessao.getNumeroAcertosVF();
    }

    Sessao sessao = new Sessao();

    public void geraDesempenho() throws ExcecaoNegocio {

        if (tentativa == 0 && acerto > 0) {
            throw new ExcecaoNegocio("O desempenho depende do numero de "
                    + "tentativas e nao ha como ter acerto sem tentativas");
        }
        if (tentativa > 0) {
            if (tentativa > totalAcertos) {
                malDesempenho++;
            }
            if (tentativa == totalAcertos) {
                bomDesempenho++;
            }
        }
    }

    public int getTentativa() {
        return tentativa;
    }

    public int getMalDesempenho() {
        return malDesempenho;
    }

    public int getBomDesempenho() {
        return bomDesempenho;
    }

    public int getTotalAcertos() {
        return totalAcertos;
    }

}
