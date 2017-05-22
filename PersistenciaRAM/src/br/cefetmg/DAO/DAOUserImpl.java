package br.cefetmg.DAO;

import br.cefetmg.dominio.Usuario;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class UsuarioDAOImpl implements UsuarioDAO {

    private final Map<Long, Usuario> objetos;

    public UsuarioDAOImpl() {
        objetos = new LinkedHashMap<>();
    }

    @Override
    public void inserir(Usuario obj) {
        objetos.put(obj.getId(), obj);

    }

    @Override
    public Usuario consultar(long id) {
        if (objetos.containsKey(id)) {
            return objetos.get(id);
        } else {
            return null;
        }
    }

    @Override
    public boolean alterar(long idObjetoAntigo, Usuario novoObj) {
        if (objetos.containsKey(idObjetoAntigo)) {
            objetos.replace(idObjetoAntigo, (Usuario) novoObj);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Usuario excluir(long id) {
        if (objetos.containsKey(id)) {
            return objetos.remove(id);
        } else {
            return null;
        }
    }

    @Override
    public List<Usuario> listar() {
        LinkedList lista = new LinkedList(objetos.values());
        return lista;
    }
}
