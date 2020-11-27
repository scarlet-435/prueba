package com.procedure.contollers;

import java.lang.reflect.Array;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.procedure.entity.Contact;
import com.procedure.entity.Cuadratura;
import com.procedure.entity.Procedure;
import com.procedure.service.ServiceInterface;
import com.procedure.vo.ResultadoVO;


@RestController
@RequestMapping("/api")
public class Controlador {
	
	private static final Log LOGGER = LogFactory.getLog(Controlador.class);
	@Autowired
	private ServiceInterface serv;
	
	
	ObjectMapper mapper = new ObjectMapper();
	@GetMapping("/hola")
	public ResponseEntity<?> hola2() throws JsonProcessingException {
		ResultadoVO salida = new ResultadoVO();
		Procedure result = serv.proce().get(0);
		Procedure result2 = serv.proce().get(1);
		
		ArrayList<Procedure> c=new ArrayList();
		
		c.add(result);
		c.add(result2);	 
		System.out.println(c);
		
		serv.updateCuadratura(c);
		LOGGER.info("Result Company => "+new ObjectMapper().writeValueAsString(result));
//serv.insertCuadratura2(c);

		
//		muestra el objeto como json
//		System.out.println(mapper.writeValueAsString(result));
//		System.out.println(serv.getEmpresa(18)+"---d-----------");
		//mensaje pa q s di quieres
//		salida.setPeticion("asdasd", "12/12/2020", "BIEN", "01");
//		salida.setObject(c);
		return new ResponseEntity<ResultadoVO>(salida, HttpStatus.OK);
	}

//	public void hola2() {
//		
//		List<Contact> r=serv.getContac();
//		System.out.println("list-----"+r.toString());
//		System.out.println("servicio----"+serv.getContac());
//		//serv.updatecontac("Santiago");		
//		serv.insertUsu(r);
//	}
}
