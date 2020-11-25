package com.procedure.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.procedure.entity.Cuadratura;
import com.procedure.service.ServiceInterface;
import com.procedure.vo.ResultadoVO;


@RestController
@RequestMapping("/api")
public class Controlador {
	
	@Autowired
	private ServiceInterface serv;
	
	
	
	@GetMapping("/hola")
	public ResponseEntity<?> hola2() {
		ResultadoVO salida = new ResultadoVO();
		
		Cuadratura result = serv.getEmpresa(18);
		System.out.println(serv.getEmpresa(18)+"--------------");
		salida.setObject(result);
		return new ResponseEntity<ResultadoVO>(salida, HttpStatus.OK);
	}

}
