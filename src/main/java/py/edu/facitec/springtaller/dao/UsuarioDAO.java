package py.edu.facitec.springtaller.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import py.edu.facitec.springtaller.model.Usuario;
                                //Paso de la clase Usuario que se convierte en objeto
@Repository // Indicamos que manipulara los datos
public class UsuarioDAO extends DAOGenerico<Usuario>{
	
	//Contexto de persistencia // Manipulador de entidades
	@PersistenceContext
	private EntityManager em;
	
	public UsuarioDAO(){
		// paso de la clase usuario al dao generico
		super (Usuario.class);
		
		
	}

	@Override // sobre - escritura
	protected EntityManager getEntityManager() {
		return em;
	}	
	
	


}
