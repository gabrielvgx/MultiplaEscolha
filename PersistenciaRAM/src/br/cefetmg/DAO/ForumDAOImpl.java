package br.cefetmg.DAO;

import br.cefetmg.dominio.Forum;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ForumDAOImpl implements ForumDAO {

    private Map<Long, Forum> objeto;

    private static ForumDAOImpl forumDAO = null;
    private static List<Forum> forum = new ArrayList<>();

    private ForumDAOImpl() {
    }

    public static ForumDAOImpl getInstance() {
        if (forumDAO == null) {
            forumDAO = new ForumDAOImpl();
        }
        return forumDAO;
    }

    @Override
    public void inserir(long idQuestao, String comentario) {
        objeto.put(idQuestao, new Forum(comentario));
    }

    @Override
    public boolean editar(long idQuestao, long idComentario, String novoComentario) {
        if (objeto.containsKey(idQuestao)) {
            if (objeto.containsKey(idComentario)) {
                objeto.replace(idComentario, new Forum(novoComentario));
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public void excluir(long idQuestao, long idComentario) {
        if (objeto.containsKey(idQuestao)) {
            if (objeto.containsKey(idComentario)) {
                objeto.remove(idComentario);
            }
        }
    }

    @Override
    public void curtir(long idQuestao, long idComentario) {
        if (objeto.containsKey(idQuestao)) {
            if (objeto.containsKey(idComentario)) {
                objeto.get(idQuestao).incrementaLike();
            }
        }
    }

    @Override
    public String pesquisar(long idQuestao, String palavraChave) {
        if (objeto.containsKey(idQuestao)) {
            String comentario = objeto.get(idQuestao).getComentario();
            if (comentario.contains(palavraChave)) {
                return comentario;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }
}
