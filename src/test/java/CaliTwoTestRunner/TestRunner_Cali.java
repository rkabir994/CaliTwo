package CaliTwoTestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import CaliTwoUtill.CaliTwoTestBase;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/Features"} , 
plugin = {"json:target/cucumber.json"},
glue = "CaliStepDefinition",tags= {"@CaliTwoAm"})

public class TestRunner_Cali extends  AbstractTestNGCucumberTests {

	@BeforeTest
	public void OpenBrowser() {
		CaliTwoTestBase openn = new CaliTwoTestBase();
		openn.initialize();
	} 


	@AfterTest
	public void Closeebrowser() {
		CaliTwoTestBase closee = new CaliTwoTestBase();
		closee.driver.quit();

	}
}
