package com.procedure.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cl_usuario",schema = "ccylsky-prod")
public class Usuario {

	@Id
	@Column(name = "id_usuario")
	private int usuarioIdU;
	
	@Column(name = "perfil")
	private String perfilU;
	
	@Column(name = "login")
	private String loginU;
	
	@Column(name = "passwd")
	private String passwordU;
	
	@Column(name = "nombre")
	private String nombreU;

	@Column(name = "codigo")
	private String codigoU;
	
	@Column(name = "rut")
	private int rutU;
	
	@Column(name = "email")
	private String emailU;
	
	@Column(name = "imagen")
	private String imagenU;
	
	@Column(name = "activo")
	private String activoU;
	
	@Column(name = "orderby")
	private int orderU;
	
	@Column(name = "created")
	private Date createdU;
	
	@Column(name = "updated")
	private Date updatedU;
	
	@Column(name = "id_perfilcdt")
	private int idPerfilcdtU;
	
	@Column(name = "ultima_conexion")
	private Date ultimaConexionU;
	
	@Column(name = "caducidad")
	private String caducidadU;
	
	@Column(name = "tiempo_caducidad")
	private int tiempoCaducidadU;
	
	@Column(name = "fecha_caducidad")
	private Date fechaCaducidadU;
	
	@Column(name = "super_usuario")
	private String superUsuarioU;
	
	@Column(name = "usuario")
	private String usuarioU;

	public Usuario(int usuarioIdU, String perfilU, String loginU, String passwordU, String nombreU, String codigoU,
			int rutU, String emailU, String imagenU, String activoU, int orderU, Date createdU, Date updatedU,
			int idPerfilcdtU, Date ultimaConexionU, String caducidadU, int tiempoCaducidadU, Date fechaCaducidadU,
			String superUsuarioU, String usuarioU) {
		super();
		this.usuarioIdU = usuarioIdU;
		this.perfilU = perfilU;
		this.loginU = loginU;
		this.passwordU = passwordU;
		this.nombreU = nombreU;
		this.codigoU = codigoU;
		this.rutU = rutU;
		this.emailU = emailU;
		this.imagenU = imagenU;
		this.activoU = activoU;
		this.orderU = orderU;
		this.createdU = createdU;
		this.updatedU = updatedU;
		this.idPerfilcdtU = idPerfilcdtU;
		this.ultimaConexionU = ultimaConexionU;
		this.caducidadU = caducidadU;
		this.tiempoCaducidadU = tiempoCaducidadU;
		this.fechaCaducidadU = fechaCaducidadU;
		this.superUsuarioU = superUsuarioU;
		this.usuarioU = usuarioU;
	}

	public Usuario() {
	}

	public int getUsuarioIdU() {
		return usuarioIdU;
	}

	public void setUsuarioIdU(int usuarioIdU) {
		this.usuarioIdU = usuarioIdU;
	}

	public String getPerfilU() {
		return perfilU;
	}

	public void setPerfilU(String perfilU) {
		this.perfilU = perfilU;
	}

	public String getLoginU() {
		return loginU;
	}

	public void setLoginU(String loginU) {
		this.loginU = loginU;
	}

	public String getPasswordU() {
		return passwordU;
	}

	public void setPasswordU(String passwordU) {
		this.passwordU = passwordU;
	}

	public String getNombreU() {
		return nombreU;
	}

	public void setNombreU(String nombreU) {
		this.nombreU = nombreU;
	}

	public String getCodigoU() {
		return codigoU;
	}

	public void setCodigoU(String codigoU) {
		this.codigoU = codigoU;
	}

	public int getRutU() {
		return rutU;
	}

	public void setRutU(int rutU) {
		this.rutU = rutU;
	}

	public String getEmailU() {
		return emailU;
	}

	public void setEmailU(String emailU) {
		this.emailU = emailU;
	}

	public String getImagenU() {
		return imagenU;
	}

	public void setImagenU(String imagenU) {
		this.imagenU = imagenU;
	}

	public String getActivoU() {
		return activoU;
	}

	public void setActivoU(String activoU) {
		this.activoU = activoU;
	}

	public int getOrderU() {
		return orderU;
	}

	public void setOrderU(int orderU) {
		this.orderU = orderU;
	}

	public Date getCreatedU() {
		return createdU;
	}

	public void setCreatedU(Date createdU) {
		this.createdU = createdU;
	}

	public Date getUpdatedU() {
		return updatedU;
	}

	public void setUpdatedU(Date updatedU) {
		this.updatedU = updatedU;
	}

	public int getIdPerfilcdtU() {
		return idPerfilcdtU;
	}

	public void setIdPerfilcdtU(int idPerfilcdtU) {
		this.idPerfilcdtU = idPerfilcdtU;
	}

	public Date getUltimaConexionU() {
		return ultimaConexionU;
	}

	public void setUltimaConexionU(Date ultimaConexionU) {
		this.ultimaConexionU = ultimaConexionU;
	}

	public String getCaducidadU() {
		return caducidadU;
	}

	public void setCaducidadU(String caducidadU) {
		this.caducidadU = caducidadU;
	}

	public int getTiempoCaducidadU() {
		return tiempoCaducidadU;
	}

	public void setTiempoCaducidadU(int tiempoCaducidadU) {
		this.tiempoCaducidadU = tiempoCaducidadU;
	}

	public Date getFechaCaducidadU() {
		return fechaCaducidadU;
	}

	public void setFechaCaducidadU(Date fechaCaducidadU) {
		this.fechaCaducidadU = fechaCaducidadU;
	}

	public String getSuperUsuarioU() {
		return superUsuarioU;
	}

	public void setSuperUsuarioU(String superUsuarioU) {
		this.superUsuarioU = superUsuarioU;
	}

	public String getUsuarioU() {
		return usuarioU;
	}

	public void setUsuarioU(String usuarioU) {
		this.usuarioU = usuarioU;
	}

	@Override
	public String toString() {
		return "Usuario [usuarioIdU=" + usuarioIdU + ", perfilU=" + perfilU + ", loginU=" + loginU + ", passwordU="
				+ passwordU + ", nombreU=" + nombreU + ", codigoU=" + codigoU + ", rutU=" + rutU + ", emailU=" + emailU
				+ ", imagenU=" + imagenU + ", activoU=" + activoU + ", orderU=" + orderU + ", createdU=" + createdU
				+ ", updatedU=" + updatedU + ", idPerfilcdtU=" + idPerfilcdtU + ", ultimaConexionU=" + ultimaConexionU
				+ ", caducidadU=" + caducidadU + ", tiempoCaducidadU=" + tiempoCaducidadU + ", fechaCaducidadU="
				+ fechaCaducidadU + ", superUsuarioU=" + superUsuarioU + ", usuarioU=" + usuarioU + "]";
	}
	
	
	
}
