package com.procedure.vo;

import java.io.Serializable;



public class ResultadoVO implements Serializable{

	private static final long serialVersionUID = 5239785946322403062L;

	private MensajeVO peticion;
	private Object object;
	
	
	public ResultadoVO(){

	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public MensajeVO getPeticion() {
		return peticion;
	}

	public void setPeticion(String fechaRsp, String horaRsp, String mensaje, String codigo) {
		MensajeVO peticion = new MensajeVO(fechaRsp, horaRsp, mensaje, codigo);
		this.peticion = peticion;
	}
	
	public void setPeticion(MensajeVO mensajeVO) {
		this.peticion = mensajeVO;
	}

	@Override
	public String toString() {
		return "ResultadoVO [peticion=" + peticion + ", object=" + object + "]";
	}
}
