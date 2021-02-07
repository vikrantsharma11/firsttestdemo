package com.utility.dataprovider;

import java.util.ArrayList;

public class Testutility {

	static Xls_Reader reader;
	
	public static ArrayList<Object[]> getdatafromexcelfile() {
		
		
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		
			
	reader = new Xls_Reader("C:\\Users\\vikra\\eclipse-workspace\\ppp\\src\\test\\java\\exceldata\\excel workbook.xlsx");
		
	
		 int rowcount = reader.getRowCount("regtestdata");
		   
		   int rownum;
		for(rownum = 2; rownum<=rowcount; rownum++) {

//get excel data
			
		   String firstname = reader.getCellData("regtestdata", "firstName",rownum);	  
	       String LastName = reader.getCellData("regtestdata", "LastName", rownum);        	     
	       String Emailaddress = reader.getCellData("regtestdata", "Emailaddress", rownum);	        
		   String password = reader.getCellData("regtestdata", "password", rownum);    
		   
		   Object ob[] = {firstname,LastName,Emailaddress,password };	      
			
		myData.add(ob);
		
		}
		return myData;
	}
}
