package com.web365.Vapartners.ArmenianInformation.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.VapartnersTourBaseTest;
import com.web365.vapartners.Armenia.History.And.Culture.VaAndPartnersEarlyModernEra;
import com.web365.vapartners.page.home.VaAndPartnersHomePage;

public class VaAndPartnersEarlyModernEraTest extends VapartnersTourBaseTest {
	
	@Test
	public void testVapartnersTour() throws InterruptedException {
		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
	    home = home.logoClick();
		Assert.assertTrue(home.armeniaBtn.isDisplayed());
		
		VaAndPartnersEarlyModernEra earlyModernEra = home.goToEarlyModernEra();
		Thread.sleep(3000);
		Assert.assertTrue(earlyModernEra.armeniaButton.isDisplayed());
		Thread.sleep(3000);
		earlyModernEra.armeniaButton.click();
		Thread.sleep(3000);
		earlyModernEra.historyCulture.click();
		Assert.assertTrue(earlyModernEra.earlyModernEra.isDisplayed());
		Thread.sleep(3000);
		earlyModernEra.earlyModernEra.click();
		Thread.sleep(3000);
		Assert.assertTrue(earlyModernEra.earlyEraImg.isDisplayed());
		Thread.sleep(3000);
		
		

}
}
