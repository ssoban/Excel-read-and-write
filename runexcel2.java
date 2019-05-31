package com.excelreading;

import java.io.IOException;



public class runexcel2 {
	
	
	public String[][] getdata(String SheetName,String Excelname) throws IOException{

		String path=System.getProperty("user.dir")+"\\src\\com\\excelreading\\"+Excelname;
		
		Read2 	excel2 = new Read2(path);
		String[][] data = excel2.getDataFromSheet(SheetName, Excelname);
		
	
		
		return data;
		
	}
	
	@SuppressWarnings("unused")
	public static void main(String args[]) throws IOException{
		String[][]	ruexcel = new runexcel2().getdata("loginpage","Soban1.xlsx");
	}

}
