package br.cefetmg.servico;

import br.cefetmg.exception.ExcecaoNegocio;
import br.cefetmg.exception.ExcecaoPersistencia;
import java.util.ArrayList;
import java.util.Map;

public interface PersistenciaDesempenhoDAO {
    public void inserirDesempenho(int acertos, int tentativas) throws ExcecaoNegocio;
    public double consultarDesempenho(long idDesempenho) throws ExcecaoPersistencia;
}
