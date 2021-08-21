package CaliTwoHomePageAction;

import org.testng.Assert;

import CaliTwoHomePageLocator.CaliTwoHomePageLocator;
import CaliTwoUtill.CaliTwoTestBase;

public class CaliTwoHomePageAction extends CaliTwoTestBase{
	
	CaliTwoHomePageLocator caliTwoHomePageLocator = new CaliTwoHomePageLocator();
	
	public void NavigatetoAmazonhomepage() {
		caliTwoHomePageLocator.NavigatetoAmazon.sendKeys("Nike mens shoes");
	}
	
	public void SearchforNikemensshoes() {
		caliTwoHomePageLocator.Searchfor.click();
}
	public void Searchforspecificnikeshoes() {
		caliTwoHomePageLocator.Searchforspecific.click();
	}
	
	public void VerifyspecificnikeshoestitleMenFlexControlTR3Sneaker() {
		boolean resultzz=caliTwoHomePageLocator.Verifyspecific.isDisplayed();
		Assert.assertTrue(resultzz);
}
	public void Usercardd(String u, String p) {
		caliTwoHomePageLocator.Email.sendKeys(u);
		caliTwoHomePageLocator.Pass.sendKeys(p);
		caliTwoHomePageLocator.Login.click();
}
	public void VerifyUseronhisownpage() {
		boolean nn=caliTwoHomePageLocator.VerifyUserPage.isDisplayed();
		Assert.assertTrue(nn);
}
}