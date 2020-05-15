package com.jorgejy.beans;

import com.jorgejy.interfaces.Equipo;

public class Barcelona implements Equipo{

	@Override
	public String mostrar() {
		return "Barcelona FC";
	}

}
