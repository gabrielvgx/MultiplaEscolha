package br.cefetmg.dominio;

public class Anonimo extends Usuario {

    public Anonimo() {
    }

    public Anonimo(Long id, String login, String senha) {
        super(id, login, senha);
    }

    public Anonimo(Long id, String primeiroNome, String ultimoNome, int idade, char sexo, String email, String telefone, String login, String senha) {
        super(id, primeiroNome, ultimoNome, idade, sexo, email, telefone, login, senha);
    }

}
