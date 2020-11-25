package com.procedure.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cl_pais", schema = "ccylsky-prod")
public class Pais {
	@Id
	@Column(name = "id_pais")
	private int idPais;
	@Column(name = "codigo")
	private String codigo;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "activo")
	private String activo;
	@Column(name = "orderby")
	private int orderby;
	@Column(name = "created")
	private Date created;
	@Column(name = "updated")
	private Date updated;
	@Column(name = "login")
	private String login;

	public Pais() {
	}

	public int getIdPais() {
		return idPais;
	}

	public void setIdPais(int idPais) {
		this.idPais = idPais;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public int getOrderby() {
		return orderby;
	}

	public void setOrderby(int orderby) {
		this.orderby = orderby;
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Override
	public String toString() {
		return "Pais [codigo=" + codigo + ", nombre=" + nombre + ", activo=" + activo + ", orderby=" + orderby + ",created="+created+",updated="+updated+",login="+login+"]";
	}
	
}
