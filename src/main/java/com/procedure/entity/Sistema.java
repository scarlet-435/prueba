package com.procedure.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cl_sistema", schema = "ccylsky-prod")
public class Sistema {

	@Id
	@Column(name = "id_sistema")
	private int idSistema;
	@Column(name = "id_empresa")
	private int id_empresa;
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

	public Sistema() {
	}

	public int getIdSistema() {
		return idSistema;
	}

	public void setIdSistema(int idSistema) {
		this.idSistema = idSistema;
	}

	public int getId_empresa() {
		return id_empresa;
	}

	public void setId_empresa(int id_empresa) {
		this.id_empresa = id_empresa;
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
		return "Sistema [idSistema=" + idSistema + ", id_empresa=" + id_empresa + ", codigo=" + codigo + ", nombre="
				+ nombre + ", activo=" + activo + ", orderby=" + orderby + ", created=" + created + ", updated="
				+ updated + ", login=" + login + "]";
	}

	
}
