package CaliStepDefinition;

import org.apache.log4j.Logger;

import CaliTwoHomePageAction.CaliTwoHomePageAction;
import CaliTwoUtill.CaliTwoTestBase;
import CaliTwoUtill.CaliTwoUtility;
import CaliTwoUtill.Looggs_Hellpper_Loog;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CaliStepDefinitionHomePage extends CaliTwoTestBase{
	
	CaliTwoHomePageAction caliTwoHomePageAction = new CaliTwoHomePageAction();
	Logger looggg=Looggs_Hellpper_Loog.getLogs(Looggs_Hellpper_Loog.class);
	
	@Given("^launch chrome browser \"([^\"]*)\"$")
	public void launch_chrome_browser(String URL) throws Throwable {
		LaunchApplication(URL);
		looggg.info("Opening Browser");
	}

	@Then("^navigate to Amazon home page$")
	public void navigate_to_Amazon_home_page() throws Throwable {
		caliTwoHomePageAction.NavigatetoAmazonhomepage();
		looggg.info("Amazon Home Page");
		CaliTwoUtility.takescreenshot(driver, "Amazon Home Page");
	}

	@Then("^search for \"([^\"]*)\"$")
	public void search_for(String arg1) throws Throwable {
		caliTwoHomePageAction.SearchforNikemensshoes();
	}

	@Then("^search for specific nike shoes$")
	public void search_for_specific_nike_shoes() throws Throwable {
		caliTwoHomePageAction.Searchforspecificnikeshoes();
		looggg.info("Search For Specific Nike Shoes");
		CaliTwoUtility.takescreenshot(driver, "Specific Nike Shoes");
	}

	@Then("^verify specific nike shoes title \"([^\"]*)\"$")
	public void verify_specific_nike_shoes_title(String arg1) throws Throwable {
		caliTwoHomePageAction.VerifyspecificnikeshoestitleMenFlexControlTR3Sneaker();
	}

	@Then("^open FaceBook home page$")
	public void open_FaceBook_home_page() throws Throwable {
		driver.navigate().to("https://www.facebook.com");
		looggg.info("Navigating To Facebook");
		CaliTwoUtility.takescreenshot(driver, "Facebook Home Page");
	}

	@Then("^enter username and password and click login button$")
	public void enter_username_and_password_and_click_login_button() throws Throwable {
		caliTwoHomePageAction.Usercardd(prop.getProperty("userCname"),prop.getProperty("userCpass"));
		looggg.info("Entering Username And Password");
	}
	
	@Then("^Verify User on his own page$")
	public void verify_User_on_his_own_page() throws Throwable {
		caliTwoHomePageAction.VerifyUseronhisownpage();
	}


	@Then("^close FaceBook and quit$")
	public void close_FaceBook_and_quit() throws Throwable {
		driver.close();
		driver.quit();
	   
	}

}
