package day31;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws IOException {
		System.out.println("Reading Excel File");
		String Filepath = System.getProperty("user.dir")+"\\src\\main\\resources\\test.xlsx";
		System.out.println("Printint the File path: "+Filepath);
		// Create an object for File class
		File file = new File(Filepath);
		// create an object of FileinputStream class to read excel file
		FileInputStream inputfile = new FileInputStream(file);
		XSSFWorkbook testfile = new XSSFWorkbook(inputfile);

		// Reads sheet inside workbook
		Sheet testfilesheet = testfile.getSheet("sheet1");
		int rowcount = testfilesheet.getLastRowNum() - testfilesheet.getFirstRowNum();
		// creat a loop to iterate all the rows in excel
		System.out.println("Total num of rows: "+rowcount);
		for (int i = 1; i < rowcount; i++) {
			Row row = testfilesheet.getRow(i);
			// creat a loop tonprint the cell value in the row
				
			for (int j = 0; j < row.getLastCellNum(); j++) {
				
				System.out.println(row.getCell(j).getStringCellValue());
			

			}

		}
		testfile.close();
	}
}
