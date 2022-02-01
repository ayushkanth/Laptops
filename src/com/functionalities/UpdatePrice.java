package com.functionalities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.Connection.SQLConnection;

public class UpdatePrice {
	public void update() throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id for which you want to update the price: ");
		String id = sc.next();
		System.out.println("Enter the new updated price: ");
		String updatedPrice = sc.next();
		String q = "update Laptop SET L_price = ? WHERE L_ID = ?";
		Connection con = SQLConnection.createCon();
		PreparedStatement pstmt2 = null;
		try {
			pstmt2 = con.prepareStatement(q);
			pstmt2.setString(1,updatedPrice);
			pstmt2.setString(2, id);
			pstmt2.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
