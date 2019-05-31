package com.excelreading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Readexcel {
	
	@SuppressWarnings({ "unused", "resource", "static-access" })
	public static void main(String[] args) throws InvalidFormatException, IOException{
	String filepath="C:\\Users\\soban\\workspace\\Readinexcelandwriting\\src\\com\\excelreading";
	String fileName="soban1.xlsx";
	File file =new File(filepath+"\\"+fileName);
	
	 FileInputStream inputStream = new FileInputStream(file);
	 
	 XSSFWorkbook workbook = new XSSFWorkbook(file);
	 //Get first/desired sheet from the workbook
     XSSFSheet sheet = workbook.getSheetAt(0);
     
     Iterator<Row> rowIterator = sheet.iterator();
     while (rowIterator.hasNext())
     {
         Row row = rowIterator.next();
         //For each row, iterate through all the columns
         Iterator<Cell> cellIterator = row.cellIterator();
          
         while (cellIterator.hasNext())
         {
             Cell cell = cellIterator.next();
           //  System.out.print("cell");
             if (cell.getCellType()== cell.getCellType().STRING)
            	 System.out.println(cell.getStringCellValue() + "t");
             else if (cell.getCellType() == cell.getCellType().STRING){
 				String cellText=String.valueOf(cell.getNumericCellValue());
 				 System.out.println(cell.getNumericCellValue() + "t");
 				
 				}else 
 					System.out.println(String.valueOf(cell.getBooleanCellValue()));;
 			}
       // org.apache.poi.ss.usermodel.CellType NUMERIC;
		//	cell.setCellType(NUMERIC);
             //Check the cell type and format accordingly
             /*switch (cell.getCellType())
             {
            
                 case   cell.getCellType().NUMERIC:
                     System.out.print(cell.getNumericCellValue() + "t");
                     break;
                 case cell.getCellType().STRING:
                     System.out.print(cell.getStringCellValue() + "t");
                     break;
             }*/
         }
         System.out.println("");
     }
	 
	}


