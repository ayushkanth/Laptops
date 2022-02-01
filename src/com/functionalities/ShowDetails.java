package com.functionalities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Connection.SQLConnection;

public class ShowDetails {
	public void show() throws SQLException {
		String q = "SELECT * FROM Laptop";
		Connection con = SQLConnection.createCon();
		PreparedStatement ps = con.prepareStatement(q);
		ResultSet set = ps.executeQuery();
		while(set.next()) {
			System.out.println("---------------------------------------");
			System.out.println("Laptop ID:"+ set.getString("L_ID"));
			System.out.println("Laptop Brand Name: "+ set.getString("L_brandName"));
			System.out.println("Laptop RAM: "+ set.getString("L_ram"));
			System.out.println("Laptop Processor: "+ set.getString("L_processor"));
			System.out.println("Laptop Price: "+ set.getString("L_price"));
			System.out.println("---------------------------------------\n");
		}
	}
}
