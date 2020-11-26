package com.procedure.service.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.procedure.entity.Select;
import com.procedure.mapper.ConsultaSelect;
import com.procedure.mapper.ConsultaSelect2;
import com.procedure.service.ServiceInterface;

@Service
public class ServiceImplem implements ServiceInterface{
	
	@Autowired
	private ConsultaSelect2 sel;

		
	@Override
	public List<Select> proce() {
		
		return sel.proce();
	}

}
