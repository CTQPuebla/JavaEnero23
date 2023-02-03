package com.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.dto.ClienteCuentaDTO;
import com.dto.MovimientosDTO;
import com.entity.Cliente;
import com.general.Database;
import com.general.IOperaciones;

//esta clase agrupa las aperaciones hacia la base de datos 
//solo esta clase se encarga e saber a detalle como se resuelven 
//las consultas y cualquier nueva consulta debe agruparse aqui
public class ClienteDAO implements IOperaciones {

	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	Database db = new Database();
	Cliente c = null;
	String resultado;
	ClienteCuentaDTO dto=null;
	MovimientosDTO mdto=null;

	@Override
	public String guardar(Object ob) {
		c = (Cliente) ob;

		String consulta = "INSERT INTO CLIENTES VALUES (?,?,?,?,?,?)";

		try {

			Class.forName(db.getDriver());// clase para abir la conexion
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());

			ps = con.prepareStatement(consulta); // ejecuta la sentencia con los valores cargados

			ps.setInt(1, 50);// seteo de valores en el lugar correcto 1 es el numero de columnas, 50 es el
								// valor que en este caso es el id generado por el trigger pero hay que poner
								// algo. executeUpdate es un contador
			ps.setNString(2, c.getNombre());
			ps.setString(3, c.getApellidos());
			ps.setString(4, c.getRfc());
			ps.setDate(5, c.getFechaNac());
			ps.setInt(6, 1);

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

		c = (Cliente) ob;

		String update = "UPDATE CLIENTES SET NOMBRE=?,APELLIDOS=?,RFC=?,FECHA_NAC=?, "
				+ "STATUS = ? WHERE CLIENTE_ID= "+ c.getClienteId();

		try {

			Class.forName(db.getDriver());// clase para abir la conexion
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());

			ps = con.prepareStatement(update); // ejecuta la sentencia con los valores cargados

			ps.setNString(1, c.getNombre());
			ps.setString(2, c.getApellidos());
			ps.setString(3, c.getRfc());
			ps.setDate(4, c.getFechaNac());// CONSTRUCTOR OBSOLETO
			ps.setInt(5, 1);
		

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

		String delete = "DELETE FROM CLIENTES WHERE CLIENTE_ID = "+id;

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

		
		String query ="SELECT *FROM CLIENTES WHERE CLIENTE_ID= "+id;
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getPassword());
			ps= con.prepareStatement(query);
			rs=ps.executeQuery();
			
			while (rs.next()) {
				c= new Cliente (rs.getInt("CLIENTE_ID"), rs.getString("NOMBRE"), rs.getString("APELLIDOS"),rs.getString("RFC"), rs.getDate("FECHA_NAC"), rs.getInt("STATUS"));
			}	
		}catch(Exception ex) {
			resultado= ex.getMessage();
			ex.printStackTrace();
		}
		
		
		
		
		
		return c;
	}

	@Override
	public List mostrar() {
		
		
		String query= "SELECT * FROM CLIENTES";
		List <Cliente> clientes =new ArrayList<Cliente>();
		try {
			Class.forName(db.getDriver());
			con= DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getPassword());
			ps= con.prepareStatement(query);
			rs=ps.executeQuery();
			
			while(rs.next()) {
				
			c=new Cliente (rs.getInt("CLIENTE_ID"), rs.getString("NOMBRE"),rs.getString("APELLIDOS"),rs.getString("RFC"), rs.getDate("FECHA_NAC"),rs.getInt("STATUS"));
			clientes.add(c);
			}
			}catch(Exception ex) {
				resultado= ex.getMessage();
				ex.printStackTrace();
			}
		
		return clientes;
		}

	
	
	//este es un metodo nativo porque no proviene de la interfaz de IOperaciones
	public List<ClienteCuentaDTO> ClientesCuentas() {
		
		
		String query= "SELECT CL.NOMBRE, CL.RFC, CU.SALDO, MO.FECHA,MO.MONTO,MO.TIPO  FROM " + 
				"CLIENTES CL INNER JOIN CUENTAS CU " + 
				"ON CL.CLIENTE_ID = CU.CLIENTE_ID " + 
				"INNER JOIN MOVIMIENTOS MO " + 
				"ON CU.CUENTA_ID = MO.CUENTA_ID WHERE CL.NOMBRE ='PABLO';";
		List <ClienteCuentaDTO> cc =new ArrayList<ClienteCuentaDTO>();
		try {
			Class.forName(db.getDriver());
			con= DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getPassword());
			ps= con.prepareStatement(query);
			rs=ps.executeQuery();
			
			while(rs.next()) {
				
				dto = new ClienteCuentaDTO(rs.getString("NOMBRE"),rs.getString("RFC"),rs.getString("TIPO"),rs.getDouble("SALDO"));
			cc.add(dto);
			}
			}catch(Exception ex) {
				resultado= ex.getMessage();
				ex.printStackTrace();
			}
		
		return cc;
	}
	
	
	//crear metodo de movimientos
	
public List<MovimientosDTO> Movimientos() {
		
		
		String query= "SELECT CU.NOMBRE, CU.RFC, CU.SALDO,MO.FECHA, MO.MONTO, MO.TIPO FROM " + 
				"CUENTAS CU INNER JOIN MOVIMIENTOS MO " + 
				"ON CU.CUENTA_ID = MO.CUENTA_ID WHERE CL.NOMBRE ='PABLO'";
		
		
		List <MovimientosDTO> mv1 =new ArrayList<MovimientosDTO>();
		try {
			Class.forName(db.getDriver());
			con= DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getPassword());
			ps= con.prepareStatement(query);
			rs=ps.executeQuery();
			
			while(rs.next()) {
				
				
				String cliente= rs.getString("Nombre");
				String rfc = rs.getString("RFC");
				double saldo = rs.getDouble("SALDO");
				
				mdto = new MovimientosDTO(rs.getDate("FECHA"),rs.getInt("MONTO"),rs.getString("TIPO"));
				
				
				mv1.add(mdto);
			}
			}catch(Exception ex) {
				resultado= ex.getMessage();
				ex.printStackTrace();
			}
		
		return mv1;
	
	}
	
	
}

