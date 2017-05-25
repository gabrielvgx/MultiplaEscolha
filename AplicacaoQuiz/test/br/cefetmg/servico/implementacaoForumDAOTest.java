package br.cefetmg.servico;

import br.cefetmg.DAO.ForumDAOImpl;
import br.cefetmg.exception.ExcecaoNegocio;
import br.cefetmg.exception.ExcecaoPersistencia;
import org.junit.Test;
import static org.junit.Assert.*;

public class implementacaoForumDAOTest {
    
    //private final  implementacaoForumDAO objeto;
   // private final ForumDAOImpl forumDAO;
    
    public implementacaoForumDAOTest() {
       // this.forumDAO = ForumDAOImpl.getInstance();
       // this.objeto = new implementacaoForumDAO(forumDAO);
    }
    
    @Test
    public void inserirComentario(){
        implementacaoForumDAO objeto;
        ForumDAOImpl forumDAO;
        forumDAO = ForumDAOImpl.getInstance();
        objeto = new implementacaoForumDAO(forumDAO);
        try{
            objeto.inserirComentario(1L, "Isto é um comentário!");
        }catch(ExcecaoNegocio | ExcecaoPersistencia e){
            fail ("O teste falhou.");
            return;
        }
        System.out.println("O teste passou!");
    }
    
    /*
    @Test
    public void inserirComentarioNull(){
        try{
            objeto.inserirComentario((long)1, null);
        }catch(ExcecaoNegocio | ExcecaoPersistencia e){
            System.out.println("O teste passou!");
            return;
        }
        fail ("O teste falhou! O comentário não pode ser nulo.");
    }
    
    @Test
    public void editarComentario(){
        try{
            objeto.editarComentario((long)1, (long)1, "Isto é um comentário!");
        }catch(ExcecaoNegocio | ExcecaoPersistencia e){
            fail ("O teste falhou.");
            return;
        }
        System.out.println("O teste passou!");
    }
    
    @Test
    public void editarComentarioNull(){
        try{
            objeto.editarComentario((long)1, (long)1, null);
        }catch(ExcecaoNegocio | ExcecaoPersistencia e){
            System.out.println("O teste passou!");
            return;
        }
        fail ("O teste falhou! O novo comentário não pode ser nulo.");
    }
    
    @Test
    public void pesquisarComentario(){
        try{
            objeto.pesquisarComentario((long)1, "comentário");
        }catch(ExcecaoPersistencia e){
            fail ("O teste falhou.");
            return;
        }
        System.out.println("O teste passou!");
    }
    
    @Test
    public void pesquisarComentarioNull(){
        try{
            objeto.pesquisarComentario((long)1, null);
        }catch(ExcecaoPersistencia e){
            System.out.println("O teste passou!");
            return;
        }
        fail ("O teste falhou! A palvra chave não pode ser nula.");
    }
    */
}
