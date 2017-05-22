package br.cefetmg.servico;

import br.cefetmg.DAO.ForumDAO;
import br.cefetmg.exception.ExcecaoNegocio;
import br.cefetmg.exception.ExcecaoPersistencia;

public class implementacaoForumDAO implements PersistenciaForumDAO {

    private final ForumDAO forumDAO;

    public implementacaoForumDAO(ForumDAO forumDAO) {
        this.forumDAO = forumDAO;
    }

    @Override
    public void inserirComentario(long idQuestao, String comentario) throws ExcecaoNegocio, ExcecaoPersistencia {

        //Como comparar idQuestao com null para lançar a exceção?
        
        if (comentario == null) {
            throw new ExcecaoNegocio("Nenhum comentário foi inserido.");
        }

        forumDAO.inserir(idQuestao, comentario);
    }

    @Override
    public boolean editarComentario(long idQuestao, long idComentario, String novoComentario) throws ExcecaoNegocio, ExcecaoPersistencia {

        if (novoComentario == null) {
            throw new ExcecaoNegocio("Nenhum novo comentário foi inserido.");
        }

        return forumDAO.editar(idQuestao, idComentario, novoComentario);
    }

    @Override
    public void excluirComentario(long idQuestao, long idComentario) throws ExcecaoPersistencia {
        forumDAO.excluir(idQuestao, idComentario);
    }

    @Override
    public void curtirComentario(long idQuestao, long idComentario) throws ExcecaoNegocio, ExcecaoPersistencia {
        forumDAO.curtir(idQuestao, idComentario);
    }

    @Override
    public String pesquisarComentario(long idQuestao, String palavraChave) throws ExcecaoPersistencia {

        if (palavraChave == null) {
            throw new ExcecaoPersistencia("A palavra-chave não pode ser nula");
        }

        return forumDAO.pesquisar(idQuestao, palavraChave);
    }
}
