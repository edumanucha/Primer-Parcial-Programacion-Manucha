package com.cooweb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.cooweb.dao.ProductoDao;
import com.cooweb.models.Producto;

@RestController
public class ProductoController {
	
	@Autowired
	private ProductoDao productoDao;
	
	@RequestMapping(value="api/productos")
	public List<Producto>getProductos(){
		List<Producto> product = productoDao.obtenerProductos();
		return product;
	}

}
