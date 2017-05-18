package br.cefetmg.servico;

public interface PersistenciaForumDAO {
    public void inserirComentario(long idQuestao, String comentario);
    public boolean editarComentario(long idQuestao, long idComentario, String novoComentario);
    public void excluirComentario(long idQuestao, long idComentario);
    public void curtirComentario(long idQuestao, long idComentario);
    public void pesquisarComentario(long idQuestao, String palavraChave);
}
