package CaliTwoHomePageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import CaliTwoUtill.CaliTwoTestBase;

public class CaliTwoHomePageLocator extends CaliTwoTestBase {
	
	public CaliTwoHomePageLocator() {
		
		PageFactory.initElements(driver, this);

	}
		@FindBy(how=How.ID, using="twotabsearchtextbox")
		public WebElement NavigatetoAmazon;
		
		@FindBy(how=How.ID, using="nav-search-submit-button")
		public WebElement Searchfor;
		
		@FindBy(how=How.LINK_TEXT, using="Men's Flex Control TR3 Sneaker")
		public WebElement Searchforspecific;
		
		@FindBy(how=How.ID, using="productTitle")
		public WebElement Verifyspecific;
		
		@FindBy(how=How.ID, using="email")
		public WebElement Email;
		
		@FindBy(how=How.ID, using="pass")
		public WebElement Pass;
		
		@FindBy(how=How.XPATH, using="//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")
		public WebElement Login;
		
		@FindBy(how=How.XPATH, using="//span[text()='Rakib Kabir']")
		public WebElement VerifyUserPage;
		
		
	}


