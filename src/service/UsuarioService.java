package service;

import java.util.List;

import model.Usuario;
import repository.UsuarioRepository;

public class UsuarioService {

    private UsuarioRepository repository;

    public UsuarioService() {
        repository = new UsuarioRepository();
    }

    public void cadastrarUsuario(Usuario usuario) {
        repository.salvar(usuario);
    }

    public List<Usuario> listarUsuarios() {
        return repository.listarTodos();
    }

    public Usuario buscarPorEmail(String email) {

        for (Usuario usuario : repository.listarTodos()) {

            if (usuario.getEmail().equalsIgnoreCase(email)) {
                return usuario;
            }
        }

        return null;
    }

    public Usuario buscarPorId(String id) {

        for (Usuario usuario : repository.listarTodos()) {

            if (usuario.getId().equals(id)) {
                return usuario;
            }
        }

        return null;
    }

    public Usuario login(String email, String senha) {

        for (Usuario usuario : repository.listarTodos()) {

            if (usuario.getEmail().equalsIgnoreCase(email)
                    && usuario.getSenha().equals(senha)) {

                return usuario;
            }
        }

        return null;
    }

    public void removerUsuario(Usuario usuario) {
        repository.remover(usuario);
    }
}