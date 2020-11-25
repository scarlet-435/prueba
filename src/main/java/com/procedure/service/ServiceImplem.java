package com.procedure.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.procedure.entity.Cuadratura;
import com.procedure.mapper.ConsultaSelect;

@Service
public class ServiceImplem implements ServiceInterface{
	
	@Autowired
	private ConsultaSelect sel;

		
	@Override
	public Cuadratura getEmpresa( int token) {
		
		return sel.getEmpresa(token);
	}

}
