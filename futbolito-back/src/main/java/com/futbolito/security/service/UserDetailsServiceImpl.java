package com.futbolito.security.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.futbolito.modelo.entidades.User;
import com.futbolito.modelo.repository.IUsuarioRolRepositorio;
import com.futbolito.security.entity.MainUser;
import com.futbolito.services.interfaces.IUsuarioServicio;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private IUsuarioServicio usuarioSer;
    
	@Autowired
	private IUsuarioRolRepositorio usuarioRolRepositorio;

    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
    	System.out.println("*****************paso por aqui");
        User usuario = usuarioSer.getByNombreUsuario(nombreUsuario).get();
        usuario.setRoles( usuarioRolRepositorio.listarRolesPorUsuario(usuario.getIdUser()));
        
        System.out.println("*****************usuario que se crea" + usuario);
        return MainUser.build(usuario);
    }
}
