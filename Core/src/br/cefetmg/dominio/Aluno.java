package br.cefetmg.dominio;

public class Aluno extends Usuario {

    public Aluno() {}
    public Aluno(Long id, String login, String senha){
        super(id,login,senha);
    }

    public Aluno(Long id, String primeiroNome, String ultimoNome, int idade, char sexo, String email, String telefone, String login, String senha) {
        super(id, primeiroNome, ultimoNome, idade, sexo, email, telefone, login, senha);
    }

}
