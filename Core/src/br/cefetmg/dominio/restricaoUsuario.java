package br.cefetmg.dominio;

public class restricaoUsuario {

    Questao questao;
    Usuario usuario;
    Resposta resposta;
    private short n;

    public void restricaoResposta(Usuario usuario) {
        switch (usuario.getTipo()) {
            case 1:
                do {
                    resposta.validacaoResposta(questao);
                    n++;
                } while (n < 10);
                break;
            case 2:
                resposta.validacaoResposta(questao);
                break;
        }
    }
}
