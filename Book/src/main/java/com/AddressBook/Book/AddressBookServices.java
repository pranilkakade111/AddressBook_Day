package com.AddressBook.Book;


import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;



public class AddressBookServices {
	Scanner sc = new Scanner(System.in);
	 static boolean exit = false;

	 
	 public void print() throws SQLException 
	 
	    {
			System.out.println(AddressBookDB.display().toString());
		}
	 
	public void add_new(AddressBookDB AddressBookDb) throws ClassNotFoundException, SQLException, IOException {
			System.out.println(AddressBookDB.insertValues());
			
		}
	
	public void delete() throws NumberFormatException, SQLException, IOException {
		AddressBookDB.DeleteContent();
	}
	
	
	public void update() throws SQLException, IOException {
		AddressBookDB.updateValues();
		
	}
	 
	 static void end()
     {
         	System.out.println("thank you");
			exit=true;
     }
	public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
		
		while (!exit) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1. for adding contact");
			System.out.println("2.displaying");
			System.out.println("3.updating the addrss book");
			System.out.println("4.for data removal");
			System.out.println("5.For Exit");
			System.out.println("choose your option");
			int userin = sc.nextInt();
			switch (userin) {
			case 1:
				new AddressBookServices().add_new(null);
				break;

			case 2:

				new AddressBookServices().print();
				break;

			case 3:
				new AddressBookServices().update();
				break;

			case 4:
				new AddressBookServices().delete();
				break;

			case 5:
				end();
				break;

			}


	}

}

}	