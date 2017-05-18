package br.cefetmg.DAO;

import java.util.ArrayList;
import java.util.Map;

public interface DesempenhoDAO {
    public void inserirDesempenho(int acertos, int tentativas);
    public Map <Long, ArrayList> consultarDesempenho(); // retorna a id auto_increment e a relação de acertos, data de acesso e retorna os dados do ArrayList.
}