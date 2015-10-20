package com.himline.fashion;

import java.sql.*;

import org.junit.runner.Result;

public class Jdbcconnection {

	public static void main(String[] args) {
		try {
			// Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/linux", "root", "VMware1!");
			Statement st = con.createStatement();
			String sql = "SELECT * from hello";
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				System.out.println("----------------Method 1---------------" );
				System.out.println("NAME:  " + rs.getString(1) + "    LASTNAME:  " + rs.getString(2));
				
				System.out.println("----------------Method 2---------------" );
				String name = rs.getString("NAME");
				String lastname = rs.getString("lastname");
				String other = rs.getString("amarjot");
				System.out.println("NAME:  " + name + "    LASTNAME:  " + lastname + "   other :" + other);
			}
			con.close();
		} catch (Exception ex) {

		}
	}

}
