package com.himline.fashion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionMySql {
	public static void main(String args[]) {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/himline_fashion", "root", "VMware1!");
			// System.out.println("Connection Success");
			String query = "Select * FROM customers ";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				System.out.println("Customer ID " + rs.getString("cus_id") + "  LastName " + rs.getString("lastname")
						+ "  FirstName " + rs.getString("firstname") + "  Address " + rs.getString("address")
						+ "  Bill " + rs.getString("bill"));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

