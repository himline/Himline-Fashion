package com.himline.fashion;
import java.sql.*;

import org.junit.runner.Result;
public class Jdbcconnection {

	public static void main(String[] args) {
	try{
	Class.forName("oracle.jdbc.driver.OracleDriver");	
	Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:3306:xe","root","{VMware1!}");
	Statement st = con.createStatement();
	String sql = "Select * from linux.hello";
	ResultSet rs = st.executeQuery(sql);
	while(rs.next()){
		System.out.println(rs.getInt(1)+"        "+rs.getString(2));
		con.close();
	}
	}
	catch(Exception ex){
		System.out.println("not found");
	}
	}

}
