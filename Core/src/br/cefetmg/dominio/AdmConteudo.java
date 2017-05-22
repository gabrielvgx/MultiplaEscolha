package br.cefetmg.dominio;

public class AdmConteudo extends Usuario {

    public AdmConteudo() {
    }

    public AdmConteudo(Long id, String login, String senha) {
        super(id, login, senha);
    }

    public AdmConteudo(Long id, String primeiroNome, String ultimoNome, int idade, char sexo, String email, String telefone, String login, String senha) {
        super(id, primeiroNome, ultimoNome, idade, sexo, email, telefone, login, senha);
    }
}
