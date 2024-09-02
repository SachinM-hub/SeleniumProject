package SAMPLEProperties;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SampleExcelIbIndividualData {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("\"F:\\Selenium folder\\seleniumindividualdata.xlsx\"");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		DataFormatter format = new DataFormatter();
		String value = format.formatCellValue(sh.getRow(4).getCell(5));
		System.out.println(value);

	}

}
