package com.procedure.entity;

public class Select {
	
	
	
	private String idEmpresa;
	
	private String idRendicion;

	private String fecha;
	
	private String idLocal;
	
	private String idUsuario;

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

	@Override
	public String toString() {
		return "Select [idEmpresa=" + idEmpresa + ", idRendicion=" + idRendicion + ", fecha=" + fecha + ", idLocal="
				+ idLocal + ", idUsuario=" + idUsuario + "]";
	}
	
	
}
