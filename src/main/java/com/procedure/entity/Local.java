package com.procedure.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cl_local",schema = "ccylsky-prod")
public class Local {
	
	@Id
	@Column(name = "id_local")
	private int id;
	
	@Column(name = "id_empresa")
	private int empresaId;
	
	@Column(name = "id_pais")
	private int paisId;
	
	@Column(name = "id_canal")
	private int canalId;
	
	@Column(name = "id_subcanal")
	private int subcanalId;
	
	@Column(name = "id_sistema")
	private int sistemaId;
	
	@Column(name = "codigo")
	private String codigoL;
	
	@Column(name = "nombre")
	private String nombreL;
	
	@Column(name = "direccion")
	private String direccionD;
	
	@Column(name = "latitud")
	private double latitudL;
	
	@Column(name = "longitud")
	private double longitudL;
	
	@Column(name = "comuna")
	private String comunaL;
	
	@Column(name = "activo")
	private String activoL;
	
	@Column(name = "orderby")
	private int orderL;
	
	@Column(name = "created")
	private Date createdL;
	
	@Column(name = "updated")
	private Date updatedL;
	
	@Column(name = "login")
	private String loginL;
	
	@Column(name = "calcula")
	private String calculaL;
	
	@Column(name = "porcentaje_calcula")
	private double porcentajeCalculaL;
	
	@Column(name = "monto_minimo")
	private int montoMinimoL;
	
	@Column(name = "monto_calcula")
	private int montoCalculaL;
	
	@Column(name = "cierre_automatico")
	private String cierreAutomaticoL;
	
	@Column(name = "acumula_rendicion")
	private String acumulaRendicionL;

	public Local(int id, int empresaId, int paisId, int canalId, int subcanalId, int sistemaId, String codigoL,
			String nombreL, String direccionD, double latitudL, double longitudL, String comunaL, String activoL,
			int orderL, Date createdL, Date updatedL, String loginL, String calculaL, double porcentajeCalculaL,
			int montoMinimoL, int montoCalculaL, String cierreAutomaticoL, String acumulaRendicionL) {
		super();
		this.id = id;
		this.empresaId = empresaId;
		this.paisId = paisId;
		this.canalId = canalId;
		this.subcanalId = subcanalId;
		this.sistemaId = sistemaId;
		this.codigoL = codigoL;
		this.nombreL = nombreL;
		this.direccionD = direccionD;
		this.latitudL = latitudL;
		this.longitudL = longitudL;
		this.comunaL = comunaL;
		this.activoL = activoL;
		this.orderL = orderL;
		this.createdL = createdL;
		this.updatedL = updatedL;
		this.loginL = loginL;
		this.calculaL = calculaL;
		this.porcentajeCalculaL = porcentajeCalculaL;
		this.montoMinimoL = montoMinimoL;
		this.montoCalculaL = montoCalculaL;
		this.cierreAutomaticoL = cierreAutomaticoL;
		this.acumulaRendicionL = acumulaRendicionL;
	}

	public Local() {
			}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEmpresaId() {
		return empresaId;
	}

	public void setEmpresaId(int empresaId) {
		this.empresaId = empresaId;
	}

	public int getPaisId() {
		return paisId;
	}

	public void setPaisId(int paisId) {
		this.paisId = paisId;
	}

	public int getCanalId() {
		return canalId;
	}

	public void setCanalId(int canalId) {
		this.canalId = canalId;
	}

	public int getSubcanalId() {
		return subcanalId;
	}

	public void setSubcanalId(int subcanalId) {
		this.subcanalId = subcanalId;
	}

	public int getSistemaId() {
		return sistemaId;
	}

	public void setSistemaId(int sistemaId) {
		this.sistemaId = sistemaId;
	}

	public String getCodigoL() {
		return codigoL;
	}

	public void setCodigoL(String codigoL) {
		this.codigoL = codigoL;
	}

	public String getNombreL() {
		return nombreL;
	}

	public void setNombreL(String nombreL) {
		this.nombreL = nombreL;
	}

	public String getDireccionD() {
		return direccionD;
	}

	public void setDireccionD(String direccionD) {
		this.direccionD = direccionD;
	}

	public double getLatitudL() {
		return latitudL;
	}

	public void setLatitudL(double latitudL) {
		this.latitudL = latitudL;
	}

	public double getLongitudL() {
		return longitudL;
	}

	public void setLongitudL(double longitudL) {
		this.longitudL = longitudL;
	}

	public String getComunaL() {
		return comunaL;
	}

	public void setComunaL(String comunaL) {
		this.comunaL = comunaL;
	}

	public String getActivoL() {
		return activoL;
	}

	public void setActivoL(String activoL) {
		this.activoL = activoL;
	}

	public int getOrderL() {
		return orderL;
	}

	public void setOrderL(int orderL) {
		this.orderL = orderL;
	}

	public Date getCreatedL() {
		return createdL;
	}

	public void setCreatedL(Date createdL) {
		this.createdL = createdL;
	}

	public Date getUpdatedL() {
		return updatedL;
	}

	public void setUpdatedL(Date updatedL) {
		this.updatedL = updatedL;
	}

	public String getLoginL() {
		return loginL;
	}

	public void setLoginL(String loginL) {
		this.loginL = loginL;
	}

	public String getCalculaL() {
		return calculaL;
	}

	public void setCalculaL(String calculaL) {
		this.calculaL = calculaL;
	}

	public double getPorcentajeCalculaL() {
		return porcentajeCalculaL;
	}

	public void setPorcentajeCalculaL(double porcentajeCalculaL) {
		this.porcentajeCalculaL = porcentajeCalculaL;
	}

	public int getMontoMinimoL() {
		return montoMinimoL;
	}

	public void setMontoMinimoL(int montoMinimoL) {
		this.montoMinimoL = montoMinimoL;
	}

	public int getMontoCalculaL() {
		return montoCalculaL;
	}

	public void setMontoCalculaL(int montoCalculaL) {
		this.montoCalculaL = montoCalculaL;
	}

	public String getCierreAutomaticoL() {
		return cierreAutomaticoL;
	}

	public void setCierreAutomaticoL(String cierreAutomaticoL) {
		this.cierreAutomaticoL = cierreAutomaticoL;
	}

	public String getAcumulaRendicionL() {
		return acumulaRendicionL;
	}

	public void setAcumulaRendicionL(String acumulaRendicionL) {
		this.acumulaRendicionL = acumulaRendicionL;
	}

	@Override
	public String toString() {
		return "Local [id=" + id + ", empresaId=" + empresaId + ", paisId=" + paisId + ", canalId=" + canalId
				+ ", subcanalId=" + subcanalId + ", sistemaId=" + sistemaId + ", codigoL=" + codigoL + ", nombreL="
				+ nombreL + ", direccionD=" + direccionD + ", latitudL=" + latitudL + ", longitudL=" + longitudL
				+ ", comunaL=" + comunaL + ", activoL=" + activoL + ", orderL=" + orderL + ", createdL=" + createdL
				+ ", updatedL=" + updatedL + ", loginL=" + loginL + ", calculaL=" + calculaL + ", porcentajeCalculaL="
				+ porcentajeCalculaL + ", montoMinimoL=" + montoMinimoL + ", montoCalculaL=" + montoCalculaL
				+ ", cierreAutomaticoL=" + cierreAutomaticoL + ", acumulaRendicionL=" + acumulaRendicionL + "]";
	}
	
	
	
	
	
	
	
	
}
