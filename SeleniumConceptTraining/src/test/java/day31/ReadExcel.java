package day31;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel {

	public static void main(String[] args)throws IOException{
		String Filepath=System.getProperty("D:\\od\\OneDrive\\Desktop\\Readdata.xlsx");
		System.out.println(Filepath);
		// Create an object for File class
		File file = new File(Filepath);
		//create an object of FileinputStream class to read excel file
		FileInputStream inputfile = new FileInputStream(file);
		XSSFWorkbook testfile = new XSSFWorkbook(inputfile);
		
		//Reads sheet inside workbook
		Sheet testfilesheet =testfile.getSheet("sheet1");
		int rowcount = testfilesheet.getLastRowNum()-testfilesheet.getFirstRowNum();
		//creat a loop to iterate all the rows in excel
				for(int i=0;i<rowcount;i++){
				Row row = testfilesheet.getRow(i);
				//creat a loop tonprint the cell value in the row
				
				for (int j = 0; j < row.getLastCellNum(); j++) {
					System.out.println(row.getCell(j).getStringCellValue());

				}

			}
			testfile.close();
		
	}	
	}
		
		
		
		

	


