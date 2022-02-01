package com.functionalities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.Connection.SQLConnection;

public class Create {
	public void create() throws SQLException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the laptop brand name: ");
		String brandName = sc.next();
		System.out.println("Provide the ram:");
		int ram = sc.nextInt();
		System.out.println("Enter the processor: ");
		String processor = sc.next();
		System.out.println("Enter the price: ");
		int price = sc.nextInt();
		
		Connection con = SQLConnection.createCon();
		String q = "insert into Laptop(L_brandName,L_ram,L_processor,L_price) values (?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(q);
//		ps.setString(1, brandName);
//		ps.setInt(2, ram);
//		ps.setString(3, processor);
//		ps.setInt(2, price);
//		ps.execute();
		try {
//			pstmt = con.prepareStatement(q);
			pstmt.setString(1,brandName);
	        pstmt.setInt(2, ram);
	        pstmt.setString(3, processor);
	        pstmt.setInt(4,price);
	        pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
