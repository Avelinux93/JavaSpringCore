package com.mdf.ioc;

public class Jefe implements IEmpleado 
{
	private ICreacionInforme informeNuevo;

	
	public void setInformeNuevo(ICreacionInforme _informeNuevo) {
		this.informeNuevo = _informeNuevo;
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Gestionar la agenda de los secretarios";
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return this.informeNuevo.getInforme();
	}

}
