package py.edu.facitec.springtaller.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import py.edu.facitec.springtaller.dao.ClienteDAO;
import py.edu.facitec.springtaller.model.Cliente;

@Controller
//Gestionar transaciones
@Transactional

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	private ClienteDAO clienteDAO;
	
	@RequestMapping(method=RequestMethod.POST)

					//Viene los datos del formulario
					//y se pasa al objeto
	public String save(@RequestBody Cliente cliente){

		System.out.println("Registrando el cliente: "+cliente);
		
		clienteDAO.guardar(cliente, cliente.getId());
		
		System.out.println("Registrado con éxito!!");
							//Crear la pagina ok.jsp
		return "/clientes/ok";
	}
	//Crear el metodo
	@RequestMapping(value="/formulario", method=RequestMethod.GET)
	public ModelAndView formulario(){
		ModelAndView model = new ModelAndView("/clientes/formulario");
		return model;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView lista(){
											//Crear el archivo lista
											//para visualizar los datos en jsp
		ModelAndView model = new ModelAndView("/clientes/lista");
		
		//Agregamos la lista de clientes al objeto que contendra la vista
		model.addObject("clientes", clienteDAO.buscarTodos());
		
		return model;
	}

}

