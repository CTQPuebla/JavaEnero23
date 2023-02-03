package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.Cliente;
import com.entity.Cuentas;
import com.general.Database;
import com.general.IOperaciones;

public class CuentasDAO implements IOperaciones {

	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	Database db = new Database();
	Cuentas c = null;
	String resultado;

	@Override
	public String guardar(Object ob) {
		c = (Cuentas) ob;
		String consulta = "INSERT INTO CUENTAS VALUES (?,?,?,?,?,?,?,?)";

		try {

			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			ps = con.prepareStatement(consulta);

			ps.setInt(1, 50);
			ps.setString(2, c.getClabe());
			ps.setInt(3, c.getSaldo());
			ps.setString(4, c.getTipo());
			ps.setInt(5, c.getSaldoMin());
			ps.setInt(6, c.getSaldoMax());
			ps.setInt(7, c.getTarjetaId());
			ps.setInt(8, c.getClienteId());
			
			int x = ps.executeUpdate();

			if (x < 0) {
				System.out.println("error");
				resultado = "0";
			} else {
				System.out.println("ok");
				resultado = "1";
			}
			

		} catch (Exception ex) {
			resultado = ex.getMessage();
			ex.printStackTrace();

		}

		return resultado;
	}

	@Override
	public String editar(Object ob) {
		c = (Cuentas) ob;

		String update = "UPDATE CUENTAS SET CUENTA_ID=?,CLABE=?,SALDO=?,TIPO=?,SALDO_MIN=?, "
				+ "SALDO_MAX = ?, TARJETA_ID=? WHERE CLIENTE_ID= "+ c.getClienteId();

		try {

			Class.forName(db.getDriver());// clase para abir la conexion
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());

			ps = con.prepareStatement(update); // ejecuta la sentencia con los valores cargados

			ps.setInt(1, 1);
			ps.setString(2, c.getClabe());
			ps.setInt(3, c.getSaldo());
			ps.setString(4, c.getTipo());
			ps.setInt(5, c.getSaldoMin());
			ps.setInt(6,c.getSaldoMax());
			ps.setInt(7,c.getTarjetaId());



			int x = ps.executeUpdate();

			if (x < 0) {
				System.out.println("error");
				resultado = "0";
			} else {
				System.out.println("ok");
				resultado = "1";
			}

		} catch (Exception ex) {
			resultado = ex.getMessage();
			ex.printStackTrace();

		}

		return resultado;
	}

	@Override
	public String eliminar(int id) {
		String delete = "DELETE FROM CUENTAS WHERE CLIENTE_ID = "+id;

		try {

			Class.forName(db.getDriver());// clase para abir la conexion
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());

			ps = con.prepareStatement(delete); // ejecuta la sentencia con los valores cargados

			int x = ps.executeUpdate();

			if(x<0) {
				System.out.println("error");
				resultado="0";
			}else {
				System.out.println("ok");
				resultado="1";
			}
		} catch (Exception ex) {
			resultado=ex.getMessage();

		}

		return resultado;
	}

	@Override
	public Object buscar(int id) {
		String query ="SELECT *FROM CUENTAS WHERE CLIENTE_ID= "+id;
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getPassword());
			ps= con.prepareStatement(query);
			rs=ps.executeQuery();
			
			while (rs.next()) {
				c= new Cuentas (rs.getInt("CUENTA_ID"), rs.getString("CLABE"), rs.getInt("SALDO"),rs.getString("TIPO"), rs.getInt("SALDO_MIN"), rs.getInt("SALDO_MAX"),rs.getInt("TARJETA_ID"),rs.getInt("CLIENTE_ID"));
			}	
		}catch(Exception ex) {
			resultado= ex.getMessage();
			ex.printStackTrace();
		}
		
		return c;
	}

	@Override
	public List mostrar() {
		String query= "SELECT * FROM CUENTAS";
		List <Cuentas> cuentas =new ArrayList<Cuentas>();
		try {
			Class.forName(db.getDriver());
			con= DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getPassword());
			ps= con.prepareStatement(query);
			rs=ps.executeQuery();
			
			while(rs.next()) {
				
			c=new Cuentas (rs.getInt("CUENTA_ID"), rs.getString("CLABE"), rs.getInt("SALDO"),rs.getString("TIPO"), rs.getInt("SALDO_MIN"), rs.getInt("SALDO_MAX"),rs.getInt("TARJETA_ID"),rs.getInt("CLIENTE_ID"));
			cuentas.add(c);
			}
			}catch(Exception ex) {
				resultado= ex.getMessage();
				ex.printStackTrace();
			}
		
		return cuentas;
		}
	}


