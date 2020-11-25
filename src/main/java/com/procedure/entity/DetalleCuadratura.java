package com.procedure.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cdt_detalle_cuadratura",schema = "ccylsky-prod")
public class DetalleCuadratura {

	@Id
	@Column(name = "id")
	private int idDC;
	
	@Column(name = "id_cuadratura")
	private int idCuadraturaDC;
	
	@Column(name = "id_fpm")
	private int idFpmDC;
	
	@Column(name = "cantidad_trx")
	private int cantidadTrxDC;
	
	@Column(name = "monto_pos")
	private double montoPosDC;
	
	@Column(name = "monto_recaudado")
	private double montoRecaudadoDC;
	
	@Column(name = "cantidad_trx_informada")
	private int cantidadTrxInformadaDC;
	
	@Column(name = "created")
	private Date createdDC;
	
	@Column(name = "updated")
	private Date updatedDC;

	public DetalleCuadratura(int idDC, int idCuadraturaDC, int idFpmDC, int cantidadTrxDC, double montoPosDC,
			double montoRecaudadoDC, int cantidadTrxInformadaDC, Date createdDC, Date updatedDC) {
		super();
		this.idDC = idDC;
		this.idCuadraturaDC = idCuadraturaDC;
		this.idFpmDC = idFpmDC;
		this.cantidadTrxDC = cantidadTrxDC;
		this.montoPosDC = montoPosDC;
		this.montoRecaudadoDC = montoRecaudadoDC;
		this.cantidadTrxInformadaDC = cantidadTrxInformadaDC;
		this.createdDC = createdDC;
		this.updatedDC = updatedDC;
	}

	public DetalleCuadratura() {
	
	}

	public int getIdDC() {
		return idDC;
	}

	public void setIdDC(int idDC) {
		this.idDC = idDC;
	}

	public int getIdCuadraturaDC() {
		return idCuadraturaDC;
	}

	public void setIdCuadraturaDC(int idCuadraturaDC) {
		this.idCuadraturaDC = idCuadraturaDC;
	}

	public int getIdFpmDC() {
		return idFpmDC;
	}

	public void setIdFpmDC(int idFpmDC) {
		this.idFpmDC = idFpmDC;
	}

	public int getCantidadTrxDC() {
		return cantidadTrxDC;
	}

	public void setCantidadTrxDC(int cantidadTrxDC) {
		this.cantidadTrxDC = cantidadTrxDC;
	}

	public double getMontoPosDC() {
		return montoPosDC;
	}

	public void setMontoPosDC(double montoPosDC) {
		this.montoPosDC = montoPosDC;
	}

	public double getMontoRecaudadoDC() {
		return montoRecaudadoDC;
	}

	public void setMontoRecaudadoDC(double montoRecaudadoDC) {
		this.montoRecaudadoDC = montoRecaudadoDC;
	}

	public int getCantidadTrxInformadaDC() {
		return cantidadTrxInformadaDC;
	}

	public void setCantidadTrxInformadaDC(int cantidadTrxInformadaDC) {
		this.cantidadTrxInformadaDC = cantidadTrxInformadaDC;
	}

	public Date getCreatedDC() {
		return createdDC;
	}

	public void setCreatedDC(Date createdDC) {
		this.createdDC = createdDC;
	}

	public Date getUpdatedDC() {
		return updatedDC;
	}

	public void setUpdatedDC(Date updatedDC) {
		this.updatedDC = updatedDC;
	}

	@Override
	public String toString() {
		return "DetalleCuadratura [idDC=" + idDC + ", idCuadraturaDC=" + idCuadraturaDC + ", idFpmDC=" + idFpmDC
				+ ", cantidadTrxDC=" + cantidadTrxDC + ", montoPosDC=" + montoPosDC + ", montoRecaudadoDC="
				+ montoRecaudadoDC + ", cantidadTrxInformadaDC=" + cantidadTrxInformadaDC + ", createdDC=" + createdDC
				+ ", updatedDC=" + updatedDC + "]";
	}
	
	
}
