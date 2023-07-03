package com.cooweb.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cooweb.dao.UsuarioDao;
import com.cooweb.models.Usuario;

@RestController
public class UsuarioController {
	@Autowired
	private UsuarioDao usuarioDao;
	
    
    @RequestMapping(value="api/usuarios")
    public List<Usuario>  getUsuarios() {
    	
    	List<Usuario> user=usuarioDao.obtenerUsuarios();
    	
    	return user;
    }
    
    
}
