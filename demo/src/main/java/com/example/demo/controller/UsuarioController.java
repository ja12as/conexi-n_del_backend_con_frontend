
package com.example.demo.controller;

/**
 *
 * @author Lenovo
 */
import com.example.demo.entity.Usuario;
import com.example.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;

@RestController
@RequestMapping("/autor")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/listar")
    public ResponseEntity<List<Usuario>> listUsers(ModelMap modelo) {
        
        List<Usuario> listarUsuario = usuarioService.usersList();
        return ResponseEntity.ok(listarUsuario);
    }

}
