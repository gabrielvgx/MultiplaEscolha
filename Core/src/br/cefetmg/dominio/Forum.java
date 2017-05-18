package br.cefetmg.dominio;

public class Forum {//Comentario
    private static long idComentario;
    private String comentario;
    private static long like;

    public Forum() {}

    public Forum(String comentario) {
        this.comentario = comentario;
        idComentario++;
    }

    public long getIdComentario() {
        return idComentario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    } 
    
    public void incrementaLike(){
        like ++;
    }
}
