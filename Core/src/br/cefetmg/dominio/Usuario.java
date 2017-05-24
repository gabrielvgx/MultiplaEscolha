package br.cefetmg.dominio;

import java.util.Map;

public class Usuario extends Pessoa {

    private long idUsuario;
    private String login;
    private String senha;

    public Usuario(){}
    public Usuario(long id, String primeiroNome, String ultimoNome, int idade, char sexo, String email, String telefone, String login, String senha) {
        super(primeiroNome, ultimoNome, idade, sexo, email, telefone);
        this.idUsuario = id;
        this.login = login;
        this.senha = senha;
    }    
    public Usuario(long idUsuario, String login, String senha){
        this.idUsuario = idUsuario;
        this.login = login;
        this.senha = senha;
    }
    public Usuario(long id) {
        this.idUsuario = id;

    }
    public <K, V> Usuario(Map<K, V> atributos) {

        int nAtributos = this.getClass().getDeclaredFields().length - 1;

        for (int i = 0; i <= nAtributos; i++) {

            try {
                String nomeAtributo = this.getClass().getDeclaredFields()[i].getName();
                this.getClass().getDeclaredFields()[i].set(this, this.getClass().getDeclaredFields()[i].getType().cast(atributos.get(nomeAtributo)));
            } catch (IllegalArgumentException | IllegalAccessException ex) {
            }
        }
        for (int i = 0; i <= nAtributos; i++) {
            String nomeAtributo = this.getClass().getDeclaredFields()[i].getName();
            try {
                System.out.println(nomeAtributo + " = " + this.getClass().getDeclaredFields()[i].get(this));
            } catch (SecurityException | IllegalArgumentException | IllegalAccessException ex) {
            }
        }
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }



    public long getId() {
        return idUsuario;
    }

    public void setId(long id) {
        this.idUsuario = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
