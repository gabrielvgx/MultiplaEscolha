package br.cefetmg.servico;

import br.cefetmg.DAO.ForumDAO;

public class implementacaoForumDAO implements ForumDAO {

    private final ForumDAO forumDAO;
    
    public implementacaoForumDAO(ForumDAO forumDAO) {
        this.forumDAO = forumDAO;
    }
    
    @Override
    public void inserir(long idQuestao, String comentario) {
        forumDAO.inserir(idQuestao, comentario);
    }
    
    @Override
    public boolean editar(long idQuestao, long idComentario, String novoComentario) {
        return forumDAO.editar(idQuestao, idComentario, novoComentario);
    }
    
    @Override
    public void excluir(long idQuestao, long idComentario) {
        forumDAO.excluir(idQuestao, idComentario);
    }
    
    @Override
    public void curtir(long idQuestao, long idComentario) {
        forumDAO.curtir(idQuestao, idComentario);
    }
    
    @Override
    public String pesquisar(long idQuestao, String palavraChave) {
        return forumDAO.pesquisar(idQuestao, palavraChave);
    }   
}