package Base_Utility_Class;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility_class {

	
	public static String ReadDatafile(String key) throws IOException
	{
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\KiteMavenProjectWithTeam\\prop.properties");
		prop.load(file);
		String value = prop.getProperty(key);
		return value;
	}
	
	public static String getTestdatafile(int rowIndex, int colIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("");
		Sheet sh = WorkbookFactory.create(file).getSheet("");
		String value = sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();
		return value;
	}
	
	public static void Capturescrrenshot(WebDriver driver, int TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\acer\\git\\KiteZerodhaWithTeam\\Browser\\scrrenshot"+TCID+".jpg");
		FileHandler.copy(src, dest);	
		
	}

	
	
		
}
