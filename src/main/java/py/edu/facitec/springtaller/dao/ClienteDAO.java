package py.edu.facitec.springtaller.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import py.edu.facitec.springtaller.model.Cliente;
import py.edu.facitec.springtaller.model.Usuario;

@Repository
//Clase encargada de la manipulacion de datos, posibilita posteriormente utilizar la anotacion Awwired
public class ClienteDAO extends DAOGenerico<Cliente> {
	
	//Gestionar el entity manager
	@PersistenceContext
	private EntityManager em;
	
	public ClienteDAO(){
		// paso de la clase usuario al dao generico
		super (Cliente.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}
}
