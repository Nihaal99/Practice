import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {

	public ArrayList<String> getData(String testcaseName) throws IOException {
		ArrayList<String> a = new ArrayList<String>();
		// To read excel file
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\csp\\Desktop\\Practice\\Selenium\\Excel\\ExcelFramework.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheetCount = workbook.getNumberOfSheets();
		for (int i = 0; i < sheetCount; i++) {
			// Logic to get a particular sheet by its name
			if (workbook.getSheetName(i).equalsIgnoreCase("Sheet1")) {
				XSSFSheet sheet = workbook.getSheetAt(i);

				// Now we are at Sheet1

				// 1.Identify Testcases column by scanning the entire first row
				// sheet.iterator() when called will iterate row
				Iterator<Row> rows = sheet.iterator();// Sheet is collection of rows
				// rows.next() will iterate to next row
				Row firstrow = rows.next();// row is collection of cells
				// cellIterator() will iterate columns of that particular selected row
				Iterator<Cell> ce = firstrow.cellIterator();

				int k = 0;
				int column = 0;
				// hasNext() wll scan for non empty cells
				while (ce.hasNext()) {
					Cell value = ce.next();
					if (value.getStringCellValue().equalsIgnoreCase("Testcases")) {
						column = k;
					}
					k++;
				}
				System.out.println("Column number of Testcases is:" + column);
				// 2.once column is identified then scan entire testcase column to identify
				// purchase testcase row
				while (rows.hasNext()) {
					Row r = rows.next();
					// r.getCell(column) will go to values corresponding to column value ie.0 in
					// this case
					if (r.getCell(column).getStringCellValue().equalsIgnoreCase(testcaseName)) {
						// 3.after you grab purchase testcase row,pull all the data of that row and feed
						// into test
						Iterator<Cell> cv = r.cellIterator();
						while (cv.hasNext()) {
							// System.out.println(cv.next().getStringCellValue());
							
							Cell c=cv.next();
							//For checking cell type
							if(c.getCellTypeEnum()==CellType.STRING) {
							// Adding data to arraylist
							a.add(c.getStringCellValue());
							}else {
								//NumberToTextConverter.toText() will convert numeric value to string value
								a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
								
							}
						}
					}
				}
			}

		}
		return a;
	}

}