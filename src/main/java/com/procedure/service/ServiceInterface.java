package com.procedure.service;



import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.procedure.entity.Contact;
import com.procedure.entity.Procedure;



public interface ServiceInterface {

	public List<Procedure> proce();
	public void updateCuadratura(List<Procedure> listado);
	public void insertCuadratura2(List<Procedure> listado);
	
	
	
	
	
	
	
	
	
	
	
	
//	public List<Contact> getContac();
//	public void updatecontac(String appe);
//	public void insertUsu(List<Contact> list);

}
