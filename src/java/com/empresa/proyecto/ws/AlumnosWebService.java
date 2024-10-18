/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.proyecto.ws;
import com.empresa.poyecto.bean.Alumnos;
import com.empresa.proyecto.service.AlumnoService;
import java.util.List;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author erick
 */
@WebService(serviceName = "AlumnosWebService")
public class AlumnosWebService {

	AlumnoService alumnoService = new AlumnoService();

	/**
	 * This is a sample web service operation
	 */
	@WebMethod(operationName = "hello")
	public String hello(@WebParam(name = "name") String txt) {
		return "Hello " + txt + " !";
	}

	@WebMethod(operationName = "crearAlumno")
	public String crearAlumno(@WebParam(name = "nombreAlumno") String nombreAlumno,
		@WebParam(name="Edad") int Edad, @WebParam(name="gradoEscolar") String gradoEscolar){
		return alumnoService.crearAlumno(nombreAlumno, Edad, gradoEscolar);
	}

	@WebMethod(operationName = "listarAlumno")
	public List<Alumnos> listarAlumno() {
		return alumnoService.listarAlumnos();
	}


}
