package br.cefetmg.DAO;

import br.cefetmg.exception.ExcecaoNegocio;
import br.cefetmg.exception.ExcecaoPersistencia;
import java.util.ArrayList;
import java.util.Map;

public interface DesempenhoDAO {
    public void inserir(int acertos, int tentativas) throws ExcecaoNegocio;
    public Map <Long, ArrayList> consultar() throws ExcecaoPersistencia; // retorna a id auto_increment e a relação de acertos, data de acesso e retorna os dados do ArrayList.
}