package studentManagement.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

//Khai bao Dispatcher Servlet <==> front controller
public class DispatcherConfig implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		//Tao container spring
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		//
		context.register(WebMVCConfig.class);

		ServletRegistration.Dynamic registration = servletContext.addServlet("dispatcher",
				new DispatcherServlet(context));
		registration.setLoadOnStartup(1);//mac dinh de 1
		registration.addMapping("/");//toan bo request deu di qua dispatcher servlet
	}

}
