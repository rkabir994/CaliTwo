package CaliTwoUtill;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class CaliTwoTestBase {
	
	public static Properties prop;
	public static WebDriver driver;
	
	public CaliTwoTestBase() {
	
	
	try {
		FileInputStream fls = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\CaliTwo\\config\\Config_Cali.properties");
		prop = new Properties();
		prop.load(fls);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

public void initialize() {
		
		String Browsername = prop.getProperty("browserCATO");
		if(Browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		    driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(CaliTwoUtility.implicitlyWait_wait , TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(CaliTwoUtility.pageLoadTimeout_wait, TimeUnit.SECONDS);
			driver.manage().window().maximize();
}
		else
			System.out.println("Browser not found");
}
public static void LaunchApplication(String URL) {
	driver.get(prop.getProperty("CAurl_QA"));
}
}