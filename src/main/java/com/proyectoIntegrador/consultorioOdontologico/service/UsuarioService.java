package com.proyectoIntegrador.consultorioOdontologico.service;

import com.proyectoIntegrador.consultorioOdontologico.entity.Usuario;
import com.proyectoIntegrador.consultorioOdontologico.repository.UsuarioRepository;
import com.proyectoIntegrador.consultorioOdontologico.util.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;


    public Usuario guardar(Usuario d) {
        return usuarioRepository.save(d);
    }

    public Usuario buscar(Integer id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public List<Usuario> buscarTodos() {
        return usuarioRepository.findAll();
    }

    public void eliminar(Integer id) {
        if (!usuarioRepository.existsById(id)) throw new ResourceNotFoundException(id.toString(), "Usuario Id");

        usuarioRepository.deleteById(id);
    }

    public Usuario actualizar(Usuario d) {
        return usuarioRepository.save(d);
    }
}
