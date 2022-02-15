package com.web365.Vapartners.ArmenianInformation.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.VapartnersTourBaseTest;
import com.web365.vapartners.Armenia.History.And.Culture.VaAndPartnersWorldWar1AndTheArmenianGenocide;
import com.web365.vapartners.page.home.VaAndPartnersHomePage;

public class VaAndPartnersWorldWar1AndTheArmenianGenocideTest extends VapartnersTourBaseTest {
	
	@Test
	public void testVapartnersTour() throws InterruptedException {
		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
	    home = home.logoClick();
		Assert.assertTrue(home.armeniaBtn.isDisplayed());
		
		VaAndPartnersWorldWar1AndTheArmenianGenocide wordWar1AndTheArmenianGenocide = home.goToWordWar1AndTheArmenianGenocide();
		Thread.sleep(3000);
		Assert.assertTrue(wordWar1AndTheArmenianGenocide.historyCulture.isDisplayed());
		Thread.sleep(3000);
		wordWar1AndTheArmenianGenocide.historyCulture.click();
		Thread.sleep(3000);
		wordWar1AndTheArmenianGenocide.wordWarGenocide.click();
		Thread.sleep(3000);
		Assert.assertTrue(wordWar1AndTheArmenianGenocide.warGenocideImg.isDisplayed());
		Thread.sleep(3000);
	}

}
