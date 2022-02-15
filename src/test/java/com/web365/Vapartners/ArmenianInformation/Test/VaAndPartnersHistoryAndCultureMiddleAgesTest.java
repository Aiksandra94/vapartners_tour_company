package com.web365.Vapartners.ArmenianInformation.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.VapartnersTourBaseTest;
import com.web365.vapartners.Armenia.History.And.Culture.VaAndPartnersHistoryAndCultureMiddleAges;
import com.web365.vapartners.page.home.VaAndPartnersHomePage;

public class VaAndPartnersHistoryAndCultureMiddleAgesTest extends VapartnersTourBaseTest {
	
	@Test
	public void testVapartnersTour() throws InterruptedException {
		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
	    home = home.logoClick();
		Assert.assertTrue(home.armeniaBtn.isDisplayed());
		
		VaAndPartnersHistoryAndCultureMiddleAges historyAndCulture = home.goToHistoryAndCulture();
		Thread.sleep(3000);
		Assert.assertTrue(historyAndCulture.armeniaButton.isDisplayed());
		historyAndCulture.armeniaButton.click();
		Thread.sleep(5000);
		Assert.assertTrue(historyAndCulture.historyAndCulture.isDisplayed());
		historyAndCulture.historyAndCulture.click();
		Thread.sleep(3000);
		historyAndCulture.middleAges.click();
		Thread.sleep(3000);
		Assert.assertTrue(historyAndCulture.middleAgesText.isDisplayed());
		Thread.sleep(3000);
		
		
		
	}

}
