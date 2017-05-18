package br.cefetmg.DAO;

public interface ForumDAO {
    public void inserir(long idQuestao, String comentario);
    public boolean editar(long idQuestao, long idComentario, String novoComentario);
    public void excluir(long idQuestao, long idComentario);
    public void curtir(long idQuestao, long idComentario);
    public String pesquisar(long idQuestao, String palavraChave);
}