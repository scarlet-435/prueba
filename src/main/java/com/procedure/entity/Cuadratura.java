package com.procedure.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cdt_cuadratura",schema = "ccylsky-prod")
public class Cuadratura {
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "id_local")
	private int idLocal;
	
	@Column(name = "id_usuario")
	private int idUsuario;
	
	@Column(name = "fecha_contable")
	private Date fechaContable;
	
	@Column(name = "estado")
	private int estado;
	
	@Column(name = "created")
	private Date created;
	
	@Column(name = "updated")
	private Date updated;
	
	@Column(name = "comentario")
	private String comentario;
	
	public Cuadratura(int id, int idLocal, int idUsuario, Date fechaContable, int estado, Date created, Date updated,
			String comentario) {
		super();
		this.id = id;
		this.idLocal = idLocal;
		this.idUsuario = idUsuario;
		this.fechaContable = fechaContable;
		this.estado = estado;
		this.created = created;
		this.updated = updated;
		this.comentario = comentario;
	}

	public Cuadratura() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdLocal() {
		return idLocal;
	}

	public void setIdLocal(int idLocal) {
		this.idLocal = idLocal;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Date getFechaContable() {
		return fechaContable;
	}

	public void setFechaContable(Date fechaContable) {
		this.fechaContable = fechaContable;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	@Override
	public String toString() {
		return "Cuadratura [id=" + id + ", idLocal=" + idLocal + ", idUsuario=" + idUsuario + ", fechaContable="
				+ fechaContable + ", estado=" + estado + ", created=" + created + ", updated=" + updated
				+ ", comentario=" + comentario + "]";
	}
	
	
	
	
	
	

}
