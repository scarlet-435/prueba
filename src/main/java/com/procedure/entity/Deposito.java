package com.procedure.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cdt_deposito", schema = "ccylsky-prod")
public class Deposito {
	
	@Id
	@Column(name = "id_deposito")
	private int idDeposito;
	@Column(name = "id_empresa")
	private int idEmpresa;
	@Column(name = "id_cuadratura")
	private int idCcuadratura;
	@Column(name = "id_ccl")
	private int idCcl;
	@Column(name = "id_fpm")
	private int idFpm;
	@Column(name = "id_usuario")
	private int idUsuario;
	@Column(name = "dpt_comprobante")
	private double dptComprobante;
	@Column(name = "dpt_fecha_con")
	private Date dptFechaCon;
	@Column(name = "dpt_fecha_dep")
	private Date dptFechaDep;
	@Column(name = "dpt_monto")
	private double dptMonto;
	@Column(name = "dpt_redondeo")
	private double dptRedondeo;
	@Column(name = "dpt_estado")
	private String dptEstado;
	@Column(name = "created")
	private Date created;
	@Column(name = "updated")
	private Date updated;
	
	public Deposito() {
	}

	public int getIdDeposito() {
		return idDeposito;
	}

	public void setIdDeposito(int idDeposito) {
		this.idDeposito = idDeposito;
	}

	public int getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public int getIdCcuadratura() {
		return idCcuadratura;
	}

	public void setIdCcuadratura(int idCcuadratura) {
		this.idCcuadratura = idCcuadratura;
	}

	public int getIdCcl() {
		return idCcl;
	}

	public void setIdCcl(int idCcl) {
		this.idCcl = idCcl;
	}

	public int getIdFpm() {
		return idFpm;
	}

	public void setIdFpm(int idFpm) {
		this.idFpm = idFpm;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public double getDptComprobante() {
		return dptComprobante;
	}

	public void setDptComprobante(double dptComprobante) {
		this.dptComprobante = dptComprobante;
	}

	public Date getDptFechaCon() {
		return dptFechaCon;
	}

	public void setDptFechaCon(Date dptFechaCon) {
		this.dptFechaCon = dptFechaCon;
	}

	public Date getDptFechaDep() {
		return dptFechaDep;
	}

	public void setDptFechaDep(Date dptFechaDep) {
		this.dptFechaDep = dptFechaDep;
	}

	public Double getDptMonto() {
		return dptMonto;
	}

	public void setDptMonto(Double dptMonto) {
		this.dptMonto = dptMonto;
	}

	public Double getDptRedondeo() {
		return dptRedondeo;
	}

	public void setDptRedondeo(Double dptRedondeo) {
		this.dptRedondeo = dptRedondeo;
	}

	public String getDptEstado() {
		return dptEstado;
	}

	public void setDptEstado(String dptEstado) {
		this.dptEstado = dptEstado;
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

	@Override
	public String toString() {
		return "Deposito [idDeposito=" + idDeposito + ", idEmpresa=" + idEmpresa + ", idCcuadratura=" + idCcuadratura
				+ ", idCcl=" + idCcl + ", idFpm=" + idFpm + ", idUsuario=" + idUsuario + ", dptComprobante="
				+ dptComprobante + ", dptFechaCon=" + dptFechaCon + ", dptFechaDep=" + dptFechaDep + ", dptMonto="
				+ dptMonto + ", dptRedondeo=" + dptRedondeo + ", dptEstado=" + dptEstado + ", created=" + created
				+ ", updated=" + updated + "]";
	}
	
	
	

}
