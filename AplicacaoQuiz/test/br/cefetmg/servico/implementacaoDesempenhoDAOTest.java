/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.servico;

import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import br.cefetmg.exception.ExcecaoNegocio;
import br.cefetmg.exception.ExcecaoPersistencia;
import br.cefetmg.servico.implementacaoDesempenhoDAO;
/**
 *
 * @author Aluno
 */
public class implementacaoDesempenhoDAOTest {
    
    public implementacaoDesempenhoDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Os métodos não podem ser testadas pois não está implementada a persistência
     */
    @Test
    public void testInserirDesempenho() throws Exception {
        implementacaoDesempenhoDAO objeto = new implementacaoDesempenhoDAO(null);
        System.out.println("Teste de inserirDesempenho");
        int acertos = 0;
        int tentativas = 5;

        try{
            objeto.inserirDesempenho(acertos, tentativas);
        } catch (ExcecaoNegocio e) {
            return;
        }
        fail("O teste não passou!!");
    }

    @Test
    public void testConsultarDesempenho() throws Exception {
        
        implementacaoDesempenhoDAO objeto1 = new implementacaoDesempenhoDAO(null);
        System.out.println("Teste do método consultarDesempenho");
        
        double expResult = 70.1;
        double result = objeto1.consultarDesempenho(1);

        try {
            assertEquals(expResult,result);
        } catch (Exception e) {
            fail("Erro");
        }
    }
    
}
