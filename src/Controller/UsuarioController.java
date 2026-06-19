package Controller;

import model.Usuario;
import service.UsuarioService;

import java.util.List;

public class UsuarioController {

    private UsuarioService usuarioService;

    public UsuarioController() {
        this.usuarioService = new UsuarioService();
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarioService.cadastrarUsuario(usuario);
    }

    public List<Usuario> listarUsuarios() {
        return usuarioService.listarUsuarios();
    }

    public Usuario login(String email, String senha) {
        return usuarioService.login(email, senha);
    }
}