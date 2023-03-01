package genericlibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * THIS CLASS CONTAINS REUSABLE METHODS TO PERFORM ACTIONS ON EXCEL FILE
 * @author MOHAN
 *
 */
public class excelUtility {
	
	private Workbook wb;
	/**
	 * THIS METHOD IS USED TO INITIALIZE THE EXCEL FILE
	 * @param excelPath
	 */
	
	public void excelIntialization(String excelPath)
	{
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(excelPath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			
		
		wb=WorkbookFactory.create(fis);
		}
		catch(EncryptedDocumentException | IOException e)
		{
			e.printStackTrace();
			
		}
	}
	/**
	 * THIS METHOD IS USED TO READ SINGLE DATA FROM EXCEL
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return
	 */
	public String readDataFromExcel(String sheetName,int rowNum,int cellNum)
	{
	return wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
}
	/**
	 * THIS METHOD IS USED TO READ MULTIPLE DATA FROM EXCEL
	 * @param sheetName
	 * @return
	 */
	public List<String> readDataFromExcel(String sheetName)
	{
		Sheet sh=wb.getSheet(sheetName);
  List<String>dataList=new ArrayList<>();
      
      for(int i=0;i<=sh.getLastRowNum();i++)
      {
    	  dataList.add(sh.getRow(i).getCell(1).getStringCellValue());
      }
   return dataList;
	}
	/**
	 * THIS METHOD IS USED TO CLOSE THE EXCEL FILE WORKBOOK
	 */
	public void closeExcel()
	{
		try {
			wb.close();
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
	}

}
