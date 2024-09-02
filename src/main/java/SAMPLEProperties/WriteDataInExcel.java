package SAMPLEProperties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataInExcel {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream(IConstantUtility.excelpath);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		sh.createRow(9).createCell(2).setCellValue("bird");
		FileOutputStream fos = new FileOutputStream(IConstantUtility.excelpath);
		book.write(fos);
		
		
	

	}

}
