/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.proyecto.service;
import java.sql.*;
import java.util.List;
import com.empresa.poyecto.bean.Alumnos;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author erick
 */
public class DBConn {


	DBConn(){ }
	
	public Connection getConn() {
		Connection conn = null;
		try {
		    // Register MariaDB JDBC Driver
		    Class.forName("org.mariadb.jdbc.Driver");
		    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/web_services", "root", "");
		    System.out.println("Connected with the database successfully");
		} catch (ClassNotFoundException e) {
		    // Catch the ClassNotFoundException
		    System.out.println("MariaDB JDBC Driver not found: " + e.getMessage());
		} catch (SQLException e) {
		    System.out.println("Error while connecting to the database: " + e.getMessage());
		}
		return conn;
	}
	
	public Boolean checkIfExists(String name, String password) {
		try {
			Connection conn = getConn();
			String sql = "select username, password FROM users WHERE username=? AND password=?";
			PreparedStatement stm = conn.prepareStatement(sql);
			stm.setString(1, name);
			stm.setString(2, password);
			ResultSet rs = stm.executeQuery();
			if (rs.next()) {
				String user = rs.getString("username");
				String pass = rs.getString("password");
				return user.equals(name) && pass.equals(password);
			}
		} catch (SQLException ex) {
			Logger.getLogger(DBConn.class.getName()).log(Level.SEVERE, null, ex);
		}
		return false;
	}

}
