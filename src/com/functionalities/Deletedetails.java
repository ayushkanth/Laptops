package com.functionalities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.Connection.SQLConnection;

public class Deletedetails {
	public void delete() throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id you want to delete: ");
		String id = sc.next();
		String q = "delete from laptop where L_ID=?";
		Connection con = SQLConnection.createCon();
		PreparedStatement ps1 = null;
		try {
		ps1 = con.prepareStatement(q);
		ps1.setString(1, id);
		ps1.execute();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
