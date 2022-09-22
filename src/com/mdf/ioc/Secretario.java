package com.mdf.ioc;

public class Secretario implements IEmpleado{
	
	public String getTareas() 
	{
		return "Gestionar la agenda de los jefes";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return null;
	}

}
