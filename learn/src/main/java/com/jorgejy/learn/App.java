package com.jorgejy.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jorgejy.beans.AppConfig;
import com.jorgejy.beans.AppConfig2;
import com.jorgejy.beans.Ciudad;
import com.jorgejy.beans.Mundo;
import com.jorgejy.beans.Persona;

public class App {

	

	public static void main(String[] args) {
//		// Use XML
//		// appContext = new ClassPathXmlApplicationContext("com/jorgejy/xml/beans.xml");
//		
//		
//		//	appContext = new AnnotationConfigApplicationContext
//		//		(AppConfig.class, AppConfig2.class); // use two class
//		
//		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
//		appContext.register(AppConfig.class);
//		appContext.register(AppConfig2.class);  
//		// rebuild file configuration whit news add.
//		appContext.refresh();
//		// Pattern design factory
//		// get instance of id method. 
//		Mundo m  =(Mundo) appContext.getBean("marte");
//		System.out.println(m.getSaludo());
//		
//		((ConfigurableApplicationContext) appContext).close();
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/jorgejy/xml/beans.xml");
		// Persona persona  = (Persona) appContext.getBean(Persona.class); // Get by nameClass
		Persona persona  = (Persona) appContext.getBean("personaName"); // Get by name or alias
		
		String nombresCiudades = "";
		
		for(Ciudad ciudad: persona.getPais().getCiudades()) {
			nombresCiudades += ","+ ciudad.getNombre();
		}
		
		System.out.println(persona.getId()+" "+persona.getNombre()+ " "+persona.getApodo() + "/ "+persona.getPais().getNombre() +"-"+nombresCiudades);
		
	}	
	
}
