package py.edu.facitec.springtaller.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import py.edu.facitec.springtaller.controller.HomeController;
import py.edu.facitec.springtaller.dao.ClienteDAO;
//Active el componente MVC de Spring para trabajar con Sevlet
@EnableWebMvc
//Carga las classes necesarias para iniciar la aplicacion
@ComponentScan(basePackageClasses={HomeController.class, ClienteDAO.class})
public class AppWebConfiguration extends WebMvcConfigurerAdapter {
	//Gestiona coo un nuervo componente de la aplicacion
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
}



