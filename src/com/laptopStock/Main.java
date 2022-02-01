package com.laptopStock;

import java.sql.SQLException;
import java.util.Scanner;

import com.functionalities.Create;
import com.functionalities.Deletedetails;
import com.functionalities.ShowDetails;
import com.functionalities.UpdatePrice;

public class Main {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		label:
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Press 1 for adding laptop");
			System.out.println("Press 2 for showing all laptop details");
			System.out.println("Press 3 for deleting laptop");
			System.out.println("Press 4 for updating details of laptop");
			System.out.println("Press 5 for exit");
			int option = sc.nextInt();
			switch(option) {
			case 1:
				Create cr = new Create();
				cr.create();
				System.out.println("\nAdded successfully\n");
				break;
			case 2:
				ShowDetails sd = new ShowDetails();
				sd.show();
				break;
			case 3:
				Deletedetails dd = new Deletedetails();
				dd.delete();
				System.out.println("\nDeleted successfully\n");
				break;
			case 4:
				UpdatePrice up = new UpdatePrice();
				up.update();
				System.out.println("\nUpdated successfully\n");
				break;
			case 5:break label;
				
				default: System.out.println("Wrong Input!!");
				
			}
		}
		System.out.println("Thanks for using it!!");
	}
}
