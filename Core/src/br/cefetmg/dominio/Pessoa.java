package br.cefetmg.dominio;

public class Pessoa {

    private String primeiroNome;
    private String ultimoNome;
    private int idade;
    private char sexo;
    private String email;
    private String numeroTelefone;

    public Pessoa() {
    }

    public Pessoa(String primeiroNome, String ultimoNome, int idade, char sexo, String email, String numeroTelefone) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.idade = idade;
        this.sexo = sexo;
        this.email = email;
        this.numeroTelefone = numeroTelefone;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
