package com.integrador.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.integrador.bo.AlumnoBO;
import com.integrador.bo.AlumnoBOImpl;
import com.integrador.model.Alumno;

@Controller
public class HomeController {

	@Autowired
	private AlumnoBOImpl alumnoBo;
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		
		System.out.println("Entro a /Welcome");
		/*
		@SuppressWarnings("resource")
		ApplicationContext appContext = 
		    	  new ClassPathXmlApplicationContext("config/BeanLocations.xml");
			
		    	AlumnoBO alumnoBo = (AlumnoBO)appContext.getBean("AlumnoBOImpl");
		    	
		    	*/
		    
				List<Alumno> todos = alumnoBo.listAll();
		    	Alumno alumno = alumnoBo.findAlumnoById(1);
		    	System.out.println(alumno.getApellido());
		    	
	
		
		System.out.println("Entro a /Welcome");
		
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}
}

