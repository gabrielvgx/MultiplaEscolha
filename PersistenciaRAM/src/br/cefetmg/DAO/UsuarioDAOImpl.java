package br.cefetmg.DAO;

import br.cefetmg.dominio.Usuario;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class UsuarioDAOImpl implements UsuarioDAO {

    private final Map<Long, Usuario> usuarios;

    public UsuarioDAOImpl() {
        usuarios = new LinkedHashMap<>();
    }

    @Override
    public void inserir(Usuario obj) {
        usuarios.put(obj.getId(), obj);

    }

    @Override
    public Usuario consultar(long id) {
        if (usuarios.containsKey(id)) {
            return usuarios.get(id);
        } else {
            return null;
        }
    }

    @Override
    public boolean alterar(long idObjetoAntigo, Usuario novoObj) {
        if (usuarios.containsKey(idObjetoAntigo)) {
            usuarios.replace(idObjetoAntigo, (Usuario) novoObj);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Usuario excluir(long id) {
        if (usuarios.containsKey(id)) {
            return usuarios.remove(id);
        } else {
            return null;
        }
    }

    @Override
    public List<Usuario> listar() {
        LinkedList lista = new LinkedList(usuarios.values());
        return lista;
    }
}
