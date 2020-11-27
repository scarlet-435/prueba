package com.procedure.entity;

public class Contact {
	
	private int idContac;
	private String apellidoContact;
	private String ciudadContact;
	private String nombreContact;
	private String telefonoContact;
	public int getIdContac() {
		return idContac;
	}
	public void setIdContac(int idContac) {
		this.idContac = idContac;
	}
	public String getApellidoContact() {
		return apellidoContact;
	}
	public void setApellidoContact(String apellidoContact) {
		this.apellidoContact = apellidoContact;
	}
	public String getCiudadContact() {
		return ciudadContact;
	}
	public void setCiudadContact(String ciudadContact) {
		this.ciudadContact = ciudadContact;
	}
	public String getNombreContact() {
		return nombreContact;
	}
	public void setNombreContact(String nombreContact) {
		this.nombreContact = nombreContact;
	}
	public String getTelefonoContact() {
		return telefonoContact;
	}
	public void setTelefonoContact(String telefonoContact) {
		this.telefonoContact = telefonoContact;
	}
	public Contact(int idContac, String apellidoContact, String ciudadContact, String nombreContact,
			String telefonoContact) {
		super();
		this.idContac = idContac;
		this.apellidoContact = apellidoContact;
		this.ciudadContact = ciudadContact;
		this.nombreContact = nombreContact;
		this.telefonoContact = telefonoContact;
	}
	@Override
	public String toString() {
		return "Contact [idContac=" + idContac + ", apellidoContact=" + apellidoContact + ", ciudadContact="
				+ ciudadContact + ", nombreContact=" + nombreContact + ", telefonoContact=" + telefonoContact + "]";
	}
	
	
	
}
