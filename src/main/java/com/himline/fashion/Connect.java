package com.himline.fashion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Connect {

	public static void main(String[] args) throws Exception {
		createTable();
		insert();
		get();
	}
	public static ArrayList<String> get() throws Exception{
		try{
	    	Connection co = getConnection();
	    	java.sql.PreparedStatement statement = co.prepareStatement("Select first,last FROM Employee");
	    	ResultSet result = statement.executeQuery();
	    	 ArrayList<String> array = new  ArrayList<String>();
	    	 while(result.next()){
	    			System.out.println(result.getString("first"));
	    			System.out.println("");
	    			System.out.println(result.getString("last"));
	    			array.add(result.getString("last"));
	    	 }
	    	 System.out.println("All Records have been selected");
	    	 return array;
	    }catch(Exception e){
	    	System.out.println(e);
		}
		return null;
	    }	
		
	
	public static void insert()throws Exception{
	final String var1 = "amar";
	final String var2 = "jot";
    try{
    	Connection co = getConnection();
    	java.sql.PreparedStatement posted = co.prepareStatement("Insert into Employee(First , last) VALUES('"+var1+"','"+var2+"')");
    	posted.executeUpdate();
    }catch(Exception e){
    	System.out.println(e);
	}finally{
		System.out.println("insert complete");
	}
    }
	
public static void createTable() throws Exception{
	try{
		Connection con = getConnection();
		java.sql.PreparedStatement create = con.prepareStatement("Create table if not exists Employee(id int NOT NULL AUTO_INCREMENT,first varchar(255), last varchar(255),PRIMARY KEY(id)) ");
		create.executeUpdate();
	}catch(Exception e){
		System.out.println(e);
	}finally{
		System.out.println("Function complete");
	}
}
	public static Connection getConnection() throws Exception {
		try {
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost/himline_fashion";
			String username = "root";
			String password = "VMware1!";
			Class.forName(driver);
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/himline_fashion", "root", "VMware1!");
			System.out.println("Connected");
			return conn;
		} catch (Exception e) {
			System.out.println(e);

		}
		return null;
	}
}
