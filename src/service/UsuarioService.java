package service;

import java.util.ArrayList;
import java.util.List;

import model.Usuario;

public class UsuarioService {

    private List<Usuario> usuarios;

    public UsuarioService() {
        usuarios = new ArrayList<>();
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public List<Usuario> listarUsuarios() {
        return usuarios;
    }

    public Usuario buscarPorEmail(String email) {

        for (Usuario usuario : usuarios) {

            if (usuario.getEmail().equalsIgnoreCase(email)) {
                return usuario;
            }

        }

        return null;
    }

    public Usuario buscarPorId(String id) {

        for (Usuario usuario : usuarios) {

            if (usuario.getId().equals(id)) {
                return usuario;
            }

        }

        return null;
    }

    public void removerUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }

    public Usuario login(String email, String senha) {

        for (Usuario usuario : usuarios) {

            if (usuario.getEmail().equalsIgnoreCase(email)
                    && usuario.getSenha().equals(senha)) {

                return usuario;
            }

        }

        return null;
    }
}