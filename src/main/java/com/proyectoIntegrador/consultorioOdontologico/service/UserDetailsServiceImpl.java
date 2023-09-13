package com.proyectoIntegrador.consultorioOdontologico.service;

import com.proyectoIntegrador.consultorioOdontologico.entity.Usuario;
import com.proyectoIntegrador.consultorioOdontologico.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Set;

@Service
@Transactional
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UsuarioRepository usuarioRepository;



    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //Buscar usuario de DB

        Usuario usuario = usuarioRepository.findUsuarioByUsername(username).orElseThrow(() -> new UsernameNotFoundException("Usuario  no encontrado"));

        //Lista de Permisos/Roles. En NUESTRO caso solo tienen un ROL.
        Set<GrantedAuthority> grantList = new HashSet<>();
        GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(usuario.getRol().toString());
        grantList.add(grantedAuthority);


        //Devuelvo un usuario de Spring
        UserDetails user = new User(usuario.getUsername(), usuario.getPassword(), grantList);

        return user;
    }
}
