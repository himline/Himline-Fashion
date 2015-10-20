package com.himline.fashion;

import java.sql.*;

import org.junit.runner.Result;

public class Jdbcconnection {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/linux", "root", "VMware1!");
			Statement st = con.createStatement();
			String sql = "SELECT * from hello";
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				// System.out.println(rs.getString("NAME") +"
				// "+rs.getString("lastname "));
				// System.out.println(rs.getString(2) );
				System.out.println(rs.getNString("NAME") + "   " + rs.getObject("lastname") + "" + rs.getObject("NAME"));
				con.close();
			}
		} catch (Exception ex) {

		}
	}

}
