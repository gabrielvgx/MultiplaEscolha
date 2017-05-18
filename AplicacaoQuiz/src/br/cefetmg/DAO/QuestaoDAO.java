package br.cefetmg.DAO;

import br.cefetmg.dominio.Questao;
import java.util.List;

public interface QuestaoDAO {
    public void inserir(Questao obj);
    public Questao consultar(long idQuestao);
    public boolean alterar(long idObjetoAntigo, Questao novoObj);
    public Questao excluir(long idQuestao);
    public List<Questao> listar();
}