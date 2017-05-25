/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.servico;

import br.cefetmg.DAO.ForumDAOImpl;
import br.cefetmg.dominio.Forum;
import br.cefetmg.dominio.Questao;
import br.cefetmg.exception.ExcecaoNegocio;
import br.cefetmg.exception.ExcecaoPersistencia;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 *
 * @author GVGX_TECNOLOGIA
 */
public class implementacaoForumDAOTest {

    private final implementacaoForumDAO instancia;
    private final ForumDAOImpl forumDAO;

    public implementacaoForumDAOTest() {
        this.forumDAO = ForumDAOImpl.getInstance();
        this.instancia = new implementacaoForumDAO(forumDAO);
    }

    @Test
    public void inserirComentario() {
        Questao Q = new Questao();
        try {
            instancia.inserirComentario(Q.getIdQuestao(), "Isto é um comentário!");
        } catch (ExcecaoNegocio | ExcecaoPersistencia e) {
            System.out.println("O teste passou!");
            return;
        }
        fail("O teste falhou.");
    }

    @Test
    public void inserirComentarioNull() {
        Questao Q = new Questao();
        try {
            instancia.inserirComentario(Q.getIdQuestao(), null);
        } catch (ExcecaoNegocio | ExcecaoPersistencia e) {
            System.out.println("O teste passou!");
            return;
        }
        fail("O teste falhou! O comentário não pode ser nulo.");
    }

    @Test
    public void editarComentario() {
        Questao Q = new Questao();
        Forum F = new Forum();
        try {
            instancia.editarComentario(Q.getIdQuestao(), F.getIdComentario(), "Isto é um comentário!");
        } catch (ExcecaoNegocio | ExcecaoPersistencia e) {
            System.out.println("O teste passou!");
            return;
        }
        fail("O teste falhou.");
    }

    @Test
    public void editarComentarioNull() {
        Questao Q = new Questao();
        Forum F = new Forum();
        try {
            instancia.editarComentario(Q.getIdQuestao(), F.getIdComentario(), null);
        } catch (ExcecaoNegocio | ExcecaoPersistencia e) {
            System.out.println("O teste passou!");
            return;
        }
        fail("O teste falhou! O novo comentário não pode ser nulo.");
    }

    @Test
    public void excluirComentario() {
        Questao Q = new Questao();
        Forum F = new Forum();
        try {
            instancia.excluirComentario(Q.getIdQuestao(), F.getIdComentario());
        } catch (ExcecaoPersistencia e) {
            System.out.println("O teste passou!");
            return;
        }
        fail("O teste falhou.");
    }

    @Test
    public void curtirComentario() {
        Questao Q = new Questao();
        Forum F = new Forum();
        try {
            instancia.curtirComentario(Q.getIdQuestao(), F.getIdComentario());
        } catch (ExcecaoPersistencia e) {
            System.out.println("O teste passou!");
            return;
        }
        fail("O teste falhou.");
    }

    @Test
    public void pesquisarComentario() {
        try {
            instancia.pesquisarComentario((long) 1, "comentário");
        } catch (ExcecaoPersistencia e) {
            System.out.println("O teste passou!");
            return;
        }
        fail("O teste falhou.");
    }

    @Test
    public void pesquisarComentarioNull() {
        try {
            instancia.pesquisarComentario((long) 1, null);
        } catch (ExcecaoPersistencia e) {
            System.out.println("O teste passou!");
            return;
        }
        fail("O teste falhou! A palvra chave não pode ser nula.");
    }
}