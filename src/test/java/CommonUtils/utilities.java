package CommonUtils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class utilities {

	public static String getScreenshotPath(WebDriver driver) {
		TakesScreenshot screensht= (TakesScreenshot) driver;
		File src= screensht.getScreenshotAs(OutputType.FILE);
		String sourceFile= System.getProperty("user.dir")+"/Reports/Screenshots/"+System.currentTimeMillis()+".jpg";
		File destination= new File(sourceFile);
		
		try {
			FileUtils.copyFile(src, destination);	
		} catch(IOException e) {
			e.printStackTrace();
		} return sourceFile;
	}
}
