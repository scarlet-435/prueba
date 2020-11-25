package com.procedure.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.procedure.entity.Select;
import com.procedure.mapper.ConsultaSelect;

@Service
public class ServiceImplem implements ServiceInterface{
	
	@Autowired
	private ConsultaSelect sel;

		
	@Override
	public List<Select> proce(String token, String fecha_inicio, String fecha_fin) {
		
		return sel.proce(token,fecha_inicio,fecha_fin);
	}

}
