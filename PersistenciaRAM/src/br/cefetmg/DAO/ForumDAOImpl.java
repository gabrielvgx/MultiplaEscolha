package br.cefetmg.DAO;

import br.cefetmg.dominio.Forum;
import br.cefetmg.exception.ExcecaoPersistencia;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ForumDAOImpl implements ForumDAO {

    private Map<Long, Forum> objeto;

    private static ForumDAOImpl forumDAO = null;
    private static List<Forum> forum = new ArrayList<>();

    private ForumDAOImpl() {
        objeto = new LinkedHashMap<>();
    }

    public static ForumDAOImpl getInstance() {
        if (forumDAO == null) {
            forumDAO = new ForumDAOImpl();
        }
        return forumDAO;
    }

    @Override
    public void inserir(long idQuestao, String comentario) throws ExcecaoPersistencia {
        /*
        if (objeto.containsKey(idQuestao) == false) {
            throw new ExcecaoPersistencia("O idQuestao não pode ser nulo");
        }
        */
        if (comentario == null) {
            throw new ExcecaoPersistencia("O comentario não pode ser nulo");
        }
        
        objeto.put(idQuestao, new Forum(comentario));
    }

    @Override
    public boolean editar(long idQuestao, long idComentario, String novoComentario) throws ExcecaoPersistencia {
        /*
        if (objeto.containsKey(idQuestao) == false) {
            throw new ExcecaoPersistencia("O idQuestao não pode ser nulo");
        }

        if (objeto.containsKey(idComentario) == false) {
            throw new ExcecaoPersistencia("O idComentario não pode ser nulo");
        }
        */
        
        if (novoComentario == null) {
            throw new ExcecaoPersistencia("O novo comentario não pode ser nulo");
        }

        objeto.replace(idComentario, new Forum(novoComentario));

        return true;
    }

    @Override
    public void excluir(long idQuestao, long idComentario) throws ExcecaoPersistencia {
        if (objeto.containsKey(idQuestao) == false) {
            throw new ExcecaoPersistencia("O idQuestao não pode ser nulo");
        }

        if (objeto.containsKey(idComentario) == false) {
            throw new ExcecaoPersistencia("O idComentario não pode ser nulo");
        }

        objeto.remove(idComentario);
    }

    @Override
    public void curtir(long idQuestao, long idComentario) throws ExcecaoPersistencia {
        if (objeto.containsKey(idQuestao) == false) {
            throw new ExcecaoPersistencia("O idQuestao não pode ser nulo");
        }

        if (objeto.containsKey(idComentario) == false) {
            throw new ExcecaoPersistencia("O idComentario não pode ser nulo");
        }

        objeto.get(idQuestao).incrementaLike();
    }

    @Override
    public String pesquisar(long idQuestao, String palavraChave) throws ExcecaoPersistencia {
        /*
        if (objeto.containsKey(idQuestao) == false) {
            throw new ExcecaoPersistencia("O idQuestao não pode ser nulo");
        }

        if (palavraChave == null) {
            throw new ExcecaoPersistencia("A palavra-chave não pode ser nula");
        }
        */
        
        String comentario = objeto.get(idQuestao).getComentario();
        if (comentario.contains(palavraChave)) {
            return comentario;
        } else {
            return null;
        }
    }
}
