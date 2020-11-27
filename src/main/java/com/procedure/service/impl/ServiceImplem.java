package com.procedure.service.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.procedure.entity.Contact;
import com.procedure.entity.Procedure;
import com.procedure.mapper.ConsultaSelect2;
import com.procedure.service.ServiceInterface;

@Service
public class ServiceImplem implements ServiceInterface{
	
	@Autowired
	private ConsultaSelect2 sel;

		
	@Override
	public List<Procedure> proce() {
		
		return sel.proce();
	}

	public void updateCuadratura(List<Procedure> listado) {
		sel.updateCuadratura(listado);
	}

	public void insertCuadratura2(List<Procedure> listado) {
		sel.insertCuadratura2(listado);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	@Override
//	public void updateCuadratura(String rendicion, String local, String fecha, String estado, String usuario) {
//		sel.updateCuadratura( rendicion,  local,  fecha,  estado,  usuario);
//		
//	}
	
//	@Override
//	public List<Contact> getContac(){
//		return sel.getContac();
//	}
	
	//@Override
//	public void updatecontac(String appe) {
//		sel.updatecontac(appe);
//	}
//
//	@Override
//	public void insertUsu(List<Contact> list) {
//		sel.insertUsu(list);
//		
//	}

}
