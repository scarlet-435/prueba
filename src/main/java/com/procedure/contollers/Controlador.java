package com.procedure.contollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.procedure.entity.Cuadratura;
import com.procedure.service.ServiceInterface;
import com.procedure.vo.ResultadoVO;


@RestController
@RequestMapping("/api")
public class Controlador {
	
	@Autowired
	private ServiceInterface serv;
	ObjectMapper mapper = new ObjectMapper();
	@GetMapping("/hola")
	public ResponseEntity<?> hola2() throws JsonProcessingException {
		ResultadoVO salida = new ResultadoVO();
		List<Cuadratura> result = serv.getEmpresa("18");
//		muestra el objeto como json
//		System.out.println(mapper.writeValueAsString(result));
//		System.out.println(serv.getEmpresa(18)+"---d-----------");
		salida.setPeticion("asdasd", "12/12/2020", "BIEN", "01");
		salida.setObject(result);
		return new ResponseEntity<ResultadoVO>(salida, HttpStatus.OK);
	}

}
