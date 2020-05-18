package com.jorgejy.beans;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.jorgejy.interfaces.Equipo;

// Stereotypes
// @Component general
// @Repository 
// @Controller 
// @Service 

@Component
public class Barcelona implements Equipo{

	@Override
	public String mostrar() {
		return "Barcelona FC";
	}

}
