    package GenericUtility;
    import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;

import SAMPLEProperties.IConstantUtility;

	public class ExcelUtility {
		public String getIndividualTestDate(String SheetName, int rowNum, int cellNum) throws Exception {

			FileInputStream fis = new FileInputStream(IConstantUtility.excelpath);
			Workbook book = WorkbookFactory.create(fis);

			Sheet sh = book.getSheet(SheetName);

			DataFormatter format = new DataFormatter();
			String value = format.formatCellValue(sh.getRow(rowNum).getCell(cellNum));

			return value;

		}
		
		public String writeDataInExcel(String sheetName,int rowNum,int cellNum,String value) throws Exception {
			
			FileInputStream fis =new FileInputStream(IConstantUtility.excelpath);
			Workbook book=WorkbookFactory.create(fis);
			Sheet sh =book.getSheet(sheetName);
			sh.createRow(rowNum).createCell(cellNum).setCellValue(value);
			FileOutputStream fos=new FileOutputStream(IConstantUtility.excelpath);
			book.write(fos);
			return value;
		}
		public String readDataFromEXcel(String sheetname, int rowNum , int cellNum) throws Exception  {
			
//			FileInputStream fis =new FileInputStream(IConstantUtility.excelpath);
//			Workbook book=WorkbookFactory.create(fis);
//			Sheet sh =book.getSheet(sheetname);
//			DataFormatter format=new DataFormatter();
//			String value =format.formatCellValue(sh.getRow(rowNum).getCell(cellNum));
			return null ;
		}
}
