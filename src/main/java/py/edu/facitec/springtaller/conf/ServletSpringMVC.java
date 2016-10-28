package py.edu.facitec.springtaller.conf;

import javax.servlet.Filter;

import org.springframework.orm.jpa.support.OpenEntityManagerInViewFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletSpringMVC extends AbstractAnnotationConfigDispatcherServletInitializer { 
	   
	@Override 
	protected Class<?>[] getRootConfigClasses() {  
		return new Class[]{AppWebConfiguration.class, JPAConfiguration.class};
	}
	 
	  
	 
	 @Override  
	 protected Class<?>[] getServletConfigClasses() { 
		 
		 return new Class[] {};  
	 }
	 
	 //ServletMappings utilizado anteriormente en el web.xml 
	 @Override 
	 protected String[] getServletMappings() {   
		 return new String[] {"/"};  
		 } 
	// Tener habilitado en el EntityManager durante las requisiciones.
	 //durante las sub-consultas
	 @Override
	 protected Filter[] getServletFilters() {
	 return new Filter[]{
	 new OpenEntityManagerInViewFilter()};
	 }
	 
	 

	 }
	 