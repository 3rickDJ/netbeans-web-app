/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.proyecto.service;

import com.empresa.poyecto.bean.Alumnos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author erick
 */
public class AlumnoService {

	List<Alumnos> ListaAlumnos = new ArrayList<>();

	public AlumnoService() {}
	public String crearAlumno(String nombre, int edad, String gradoEscolar) {
		Alumnos a = new Alumnos();
		a.setId(ListaAlumnos.size() + 1);
		a.setNombre(nombre);
		a.setGradoEscolar(gradoEscolar);
		a.setEdad(edad);
		ListaAlumnos.add(a);
		return 	"Se agrego el alumno " + a.getNombre();
	}

	public List<Alumnos> listarAlumnos(){
		return ListaAlumnos;
	}
}
