package com.jorgejy.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jorgejy.beans.AppConfig;
import com.jorgejy.beans.AppConfig2;
import com.jorgejy.beans.Mundo;

public class App {

	private static ApplicationContext appContext;

	public static void main(String[] args) {
		// Use XML
		// appContext = new ClassPathXmlApplicationContext("com/jorgejy/xml/beans.xml");
		
		
	//	appContext = new AnnotationConfigApplicationContext
		//		(AppConfig.class, AppConfig2.class); // use two class
		
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
		appContext.register(AppConfig.class);
		appContext.register(AppConfig2.class);  
		// rebuild file configuration whit news add.
		appContext.refresh();
		// Pattern design factory
		// get instance of id method. 
		Mundo m  =(Mundo) appContext.getBean("marte");
		System.out.println(m.getSaludo());
		
		((ConfigurableApplicationContext) appContext).close();
	}	
	
}
