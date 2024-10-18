/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.proyecto.service;

import com.empresa.poyecto.bean.Alumnos;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author erick
 */
public class AlumnoService {

	List<Alumnos> ListaAlumnos = new ArrayList<>();
	DBConn db = new DBConn();

	public AlumnoService() {
	}
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

	public Boolean findUser(String name, String password) {
		return db.checkIfExists(name, password);
	}
}
