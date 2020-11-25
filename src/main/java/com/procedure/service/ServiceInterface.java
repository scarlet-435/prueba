package com.procedure.service;



import java.util.List;

import com.procedure.entity.Select;



public interface ServiceInterface {

	//public String proce(int token,String fecha_inicio, String fecha_fin);
	public List<Select> proce(String token,String fecha_inicio,String fecha_fin);
}
