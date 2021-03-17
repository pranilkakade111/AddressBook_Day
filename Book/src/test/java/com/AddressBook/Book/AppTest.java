package com.AddressBook.Book;

import java.io.IOException;
import java.sql.SQLException;

import org.junit.Test;

public class AppTest {

	
	@Test
	public void printRecordsFromDBtest() throws SQLException
	{
         AddressBookServices services = new AddressBookServices();
         services.print();
    }
	
	@Test
	public void InsertRecordsFromDBtest() throws SQLException, ClassNotFoundException, IOException
	{
         AddressBookServices services = new AddressBookServices();
         services.add_new(null);
    }
	
	@Test
	public void DeleteRecordsFromDBtest() throws SQLException, ClassNotFoundException, IOException
	{
         AddressBookServices services = new AddressBookServices();
         services.delete();
    }
	
	@Test
	public void UpdateRecordsFromDBtest() throws SQLException, ClassNotFoundException, IOException
	{
         AddressBookServices services = new AddressBookServices();
         services.update();
    }
	
}
