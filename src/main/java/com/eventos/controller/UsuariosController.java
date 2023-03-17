package com.eventos.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.eventos.entities.Usuarios;
import com.eventos.service.UsuariosService;

@Controller
@RequestMapping("/usuarios")
public class UsuariosController {
	
	@Autowired
	private UsuariosService usuariosService;
	
	@RequestMapping
	public String frmUsuarios(Model model) {
		
		List<Usuarios> usuarios = usuariosService.findAll();
		
		model.addAttribute("keyUsuarios", usuarios);
		
		return "usuarios";
	}
	
	
	@RequestMapping("/frmAdd")
	public String frmAgregarUsuario(Model model)  {
	
	Usuarios usuario = new Usuarios();
	
	model.addAttribute("usuarios", usuario);
	
	return "agregar-usuarios";
	
	}

	@GetMapping("/findAllBusqueda")
	public String findAllBusqueda(@RequestParam("busqueda") @Nullable String busqueda, Model model) {
		
		if(busqueda == null) busqueda ="";
	
		List<Usuarios> usuarios = usuariosService.findAll(busqueda);
		
		model.addAttribute("usuarios", usuarios);
		
		return "usuarios";
		
	}
	
	
	
	@PostMapping("/add")
	public String add(@ModelAttribute("usuarios") Usuarios usuario, BindingResult bindingresult) {
		
		if(bindingresult.hasErrors()) {
			
			return "agregar-usuarios";
		}else {
			usuariosService.add(usuario);
			return "redirect:/usuarios";
		}
		
	}

	@GetMapping("/findOne")
	public String findOne(@RequestParam("id") int id, @RequestParam("opcion") int opcion, Model model) {
		
		Usuarios usuario = usuariosService.findOne(id);
		model.addAttribute("usuarios", usuario);
		
		
		if(opcion == 1) {
			
			return "agregar-usuarios";
		}else {
			return "eliminar-usuarios";
		}
		
	}
	
	
	@GetMapping("/del")
	public String del(@ModelAttribute("usuarios") Usuarios usuario) {
		
		usuariosService.del(usuario.getId());
		
		return "redirect:/usuarios";
		
	}
	
	@InitBinder
	public void miBinder(WebDataBinder binder) {
		StringTrimmerEditor trimmerEditor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, trimmerEditor);
	}

}
