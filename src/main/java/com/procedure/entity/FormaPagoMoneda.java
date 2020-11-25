package com.procedure.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cl_formapago_moneda", schema = "ccylsky-prod")
public class FormaPagoMoneda {
	
	@Id
	@Column(name = "id_fpm")
	private int idFpm;
	@Column(name = "id_sistema")
	private int idSistema;
	@Column(name = "id_pais")
	private int idPais;
	@Column(name = "id_canal")
	private int idCanal;
	@Column(name = "id_subcanal")
	private int idSubcanal;
	@Column(name = "id_emisor")
	private int idEmisor;
	@Column(name = "id_moneda")
	private int idMoneda;
	@Column(name = "id_forma_pago")
	private int idFormaPago;
	@Column(name = "redondeo")
	private String redondeo;
	@Column(name = "integrado")
	private String integrado;
	@Column(name = "tarjeta")
	private String tarjeta;
	@Column(name = "depositable")
	private String depositable;
	@Column(name = "deposito_posterior")
	private String depositoPosterior;
	@Column(name = "codautor")
	private String codAautor;
	@Column(name = "numrero_unico")
	private String numeroUnico;
	@Column(name = "cuotas")
	private String cuotas;
	@Column(name = "activo")
	private String activo;
	@Column(name = "orderby")
	private int orderby;
	@Column(name = "created")
	private Date created;
	@Column(name = "updated")
	private Date updated;
	@Column(name = "login")
	private Date login;
	
	public FormaPagoMoneda() {
	}

	public int getIdFpm() {
		return idFpm;
	}

	public void setIdFpm(int idFpm) {
		this.idFpm = idFpm;
	}

	public int getIdSistema() {
		return idSistema;
	}

	public void setIdSistema(int idSistema) {
		this.idSistema = idSistema;
	}

	public int getIdPais() {
		return idPais;
	}

	public void setIdPais(int idPais) {
		this.idPais = idPais;
	}

	public int getIdCanal() {
		return idCanal;
	}

	public void setIdCanal(int idCanal) {
		this.idCanal = idCanal;
	}

	public int getIdSubcanal() {
		return idSubcanal;
	}

	public void setIdSubcanal(int idSubcanal) {
		this.idSubcanal = idSubcanal;
	}

	public int getIdEmisor() {
		return idEmisor;
	}

	public void setIdEmisor(int idEmisor) {
		this.idEmisor = idEmisor;
	}

	public int getIdMoneda() {
		return idMoneda;
	}

	public void setIdMoneda(int idMoneda) {
		this.idMoneda = idMoneda;
	}

	public int getIdFormaPago() {
		return idFormaPago;
	}

	public void setIdFormaPago(int idFormaPago) {
		this.idFormaPago = idFormaPago;
	}

	public String getRedondeo() {
		return redondeo;
	}

	public void setRedondeo(String redondeo) {
		this.redondeo = redondeo;
	}

	public String getIntegrado() {
		return integrado;
	}

	public void setIntegrado(String integrado) {
		this.integrado = integrado;
	}

	public String getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(String tarjeta) {
		this.tarjeta = tarjeta;
	}

	public String getDepositable() {
		return depositable;
	}

	public void setDepositable(String depositable) {
		this.depositable = depositable;
	}

	public String getDepositoPosterior() {
		return depositoPosterior;
	}

	public void setDepositoPosterior(String depositoPosterior) {
		this.depositoPosterior = depositoPosterior;
	}

	public String getCodAautor() {
		return codAautor;
	}

	public void setCodAautor(String codAautor) {
		this.codAautor = codAautor;
	}

	public String getNumeroUnico() {
		return numeroUnico;
	}

	public void setNumeroUnico(String numeroUnico) {
		this.numeroUnico = numeroUnico;
	}

	public String getCuotas() {
		return cuotas;
	}

	public void setCuotas(String cuotas) {
		this.cuotas = cuotas;
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

	public Date getLogin() {
		return login;
	}

	public void setLogin(Date login) {
		this.login = login;
	}
	
	

}
