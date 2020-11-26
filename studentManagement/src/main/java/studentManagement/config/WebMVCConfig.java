package studentManagement.config;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import studentManagement.model.Student;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "studentManagement.*" })
public class WebMVCConfig {
	@Bean
	public InternalResourceViewResolver getResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
//		resolver.setViewClass(viewClass);
		return resolver;
	}
//	 <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
//     <property name="viewClass" value="org.springframework.web.servlet.view.JstlView"/>
//     <property name="prefix" value="/WEB-INF/views/" />
//     <property name="suffix" value=".jsp" />
// </bean>

	@Bean
	public static List<Student> getStudents() {
		List<Student> students = new ArrayList();
		Student student1 = new Student("ST01", "Name 01", true, new Date(System.currentTimeMillis()), "TP HCM", "HCM",
				"depName1");
		Student student2 = new Student("ST02", "Name 02", false, new Date(System.currentTimeMillis()), "TP HCM", "HCM",
				"depName2");
		Student student3 = new Student("ST03", "Name 03", true, new Date(System.currentTimeMillis()), "TP HCM", "HCM",
				"depName3");
		Student student4 = new Student("ST04", "Name 04", false, new Date(System.currentTimeMillis()), "TP HCM", "HCM",
				"depName4");
		Student student5 = new Student("ST05", "Name 05", true, new Date(System.currentTimeMillis()), "TP HCM", "HCM",
				"depName5");
		Student student6 = new Student("ST06", "Name 06", false, new Date(System.currentTimeMillis()), "TP HCM", "HCM",
				"depName6");
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		students.add(student6);
		return students;
	}
}
