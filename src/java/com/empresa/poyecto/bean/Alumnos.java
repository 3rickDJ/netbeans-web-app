/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.poyecto.bean;

/**
 *
 * @author erick
 */
public class Alumnos {
   private int id;

   private String nombre;
   private int edad;
   private String gradoEscolar;

   public Alumnos(int id, String nombre, int edad, String gradoEscolar) {
	this.id = id;
	this.nombre = nombre;
	this.edad = edad;
	this.gradoEscolar = gradoEscolar;
   }

   public Alumnos(){}
   public int getId() { return id;}
   public void setId(int id) {this.id = id;}
   public String getNombre() { return nombre;}
   public void setNombre(String nombre) {this.nombre = nombre;}
   public int getEdad() { return edad;}
   public void setEdad(int edad) {this.edad = edad;}
   public String getGradoEscolar() { return gradoEscolar;}
   public void setGradoEscolar(String gradoEscolar) {this.gradoEscolar = gradoEscolar;}
}
