package com.procedure.entity;

public class Select {

	private String idEmpresa;
	
	private String idRendicion;

	private String fecha;
	
	private String idLocal;
	
	private String idUsuario;
	
	private String estado;
	
	

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(String idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getIdRendicion() {
		return idRendicion;
	}

	public void setIdRendicion(String idRendicion) {
		this.idRendicion = idRendicion;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getIdLocal() {
		return idLocal;
	}

	public void setIdLocal(String idLocal) {
		this.idLocal = idLocal;
	}

	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Select(String idEmpresa, String idRendicion, String fecha, String idLocal, String idUsuario, String estado) {
		super();
		this.idEmpresa = idEmpresa;
		this.idRendicion = idRendicion;
		this.fecha = fecha;
		this.idLocal = idLocal;
		this.idUsuario = idUsuario;
		this.estado = estado;
	}

	
	
	
}
