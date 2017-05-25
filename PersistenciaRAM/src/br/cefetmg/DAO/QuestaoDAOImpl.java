package br.cefetmg.DAO;

import br.cefetmg.dominio.Questao;
import br.cefetmg.exception.ExcecaoPersistencia;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class QuestaoDAOImpl implements QuestaoDAO{

    private static Map<Long,Questao> questaoDB = new LinkedHashMap<>();    
    private Long contador; //numero de questoes no questaodb
    
    private QuestaoDAOImpl() {
        contador=0L;
    }

    @Override
    synchronized public void inserir(Questao obj) throws ExcecaoPersistencia{
        if(obj == null){
            throw new ExcecaoPersistencia("Questao não pode ser null");
        }
        if (obj.getIdQuestao()!=null && questaoDB.containsKey(obj.getIdQuestao())){
            throw new ExcecaoPersistencia("Chave duplicada");
        }
        Long idNovo = ++contador;
        obj.setIdQuestao(idNovo);
        questaoDB.put(idNovo, obj);
                
    }
    
    
    @Override
    synchronized public void alterar(Questao obj) throws ExcecaoPersistencia {

        if (obj == null)
            throw new ExcecaoPersistencia("Entidade não pode ser nula.");              
        if(obj.getIdQuestao() == null)
            throw new ExcecaoPersistencia("Questao sem id");
        if(!questaoDB.containsKey(obj.getIdQuestao())){
            throw new ExcecaoPersistencia("Chave não cadastrada no banco de dados");
        }
        questaoDB.replace(obj.getIdQuestao(), obj);
    }

    @Override
    synchronized public Questao excluir(Long idQuestao) throws ExcecaoPersistencia {

        if (idQuestao == null)
            throw new ExcecaoPersistencia("Chave da entidade não pode ser nulo.");
        
        if (!questaoDB.containsKey(idQuestao))
            throw new ExcecaoPersistencia("Não existe entidade com a chave " + idQuestao + ".");
        
        return questaoDB.remove(idQuestao);
    }

    @Override
    synchronized public Questao consultar(Long idQuestao) throws ExcecaoPersistencia {
        
        if (idQuestao == null)
            throw new ExcecaoPersistencia("Chave da entidade não pode ser nulo.");
        
        if (!questaoDB.containsKey(idQuestao))
            throw new ExcecaoPersistencia("Não existe entidade com a chave " + idQuestao + ".");
        
        return questaoDB.get(idQuestao);        
        
    }
    @Override
    public List<Questao> listar() throws ExcecaoPersistencia {
        return new ArrayList<>(questaoDB.values());        
    }    

}
