package br.cefetmg.DAO;

import br.cefetmg.dominio.Questao;
import br.cefetmg.exception.ExcecaoPersistencia;
import java.util.List;

public interface QuestaoDAO {
    public void inserir(Questao obj) throws ExcecaoPersistencia;
    public Questao consultar(Long idQuestao) throws ExcecaoPersistencia;
    public void alterar(Questao novoObj) throws ExcecaoPersistencia;
    public Questao excluir(Long idQuestao) throws ExcecaoPersistencia;
    public List<Questao> listar() throws ExcecaoPersistencia;
}