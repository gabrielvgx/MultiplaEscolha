package br.cefetmg.servico;

import br.cefetmg.exception.ExcecaoNegocio;
import br.cefetmg.exception.ExcecaoPersistencia;

public interface PersistenciaDesempenhoDAO {
    public void inserirDesempenho(int acertos, int tentativas) throws ExcecaoNegocio;
    public double consultarDesempenho(Long idDesempenho) throws ExcecaoPersistencia;
}
