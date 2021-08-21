package CaliTwoUtill;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaliTwoUtility {
	
	public static long implicitlyWait_wait=60;
	public static long pageLoadTimeout_wait=60;
	
	
public static void takescreenshot(WebDriver driver, String screenshot) {
		
		File Srcfile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String correntdir = System.getProperty("user.dir");
		
		
		{
			try {
				FileUtils.copyFile(Srcfile, new File(correntdir+"/screenshotzz/"+screenshot+".png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

}
}