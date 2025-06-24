package Amazon_pacakge.Amazon_project;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.WebDriver;

public class Commonfiles

{
	WebDriver driver;

	public static String FetchingStringdata(String filelocation, String Sheetname, int rowindex, int cellindex)
			throws EncryptedDocumentException, IOException {

		FileInputStream s1 = new FileInputStream(filelocation);
		Workbook wb = WorkbookFactory.create(s1);

		String cellvalue = wb.getSheet(Sheetname).getRow(rowindex).getCell(cellindex).getStringCellValue();

		return cellvalue;

	}

	public static String fetchingnumericdeta(String filelocation, String Sheetname, int rowindex, int cellindex)
			throws EncryptedDocumentException, IOException {

		FileInputStream s1 = new FileInputStream(filelocation);
		Workbook wb = WorkbookFactory.create(s1);

		String cellvalue = NumberToTextConverter
				.toText(wb.getSheet(Sheetname).getRow(rowindex).getCell(cellindex).getNumericCellValue());

		return cellvalue;

	}

}
