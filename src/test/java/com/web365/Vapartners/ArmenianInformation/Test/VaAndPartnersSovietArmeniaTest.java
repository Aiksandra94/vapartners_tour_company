package com.web365.Vapartners.ArmenianInformation.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.VapartnersTourBaseTest;
import com.web365.vapartners.Armenia.History.And.Culture.VaAndPartnersSovietArmenia;
import com.web365.vapartners.page.home.VaAndPartnersHomePage;

public class VaAndPartnersSovietArmeniaTest extends VapartnersTourBaseTest {
	
	@Test void testVapartnersTour() throws InterruptedException {
		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
	    home = home.logoClick();
		Assert.assertTrue(home.armeniaBtn.isDisplayed());
		
		VaAndPartnersSovietArmenia sovietArmenia  = home.goToSovietArmenia();
		Thread.sleep(3000);
		Assert.assertTrue(sovietArmenia.historyCulture.isDisplayed());
		Thread.sleep(3000);
		sovietArmenia.historyCulture.click();
		Thread.sleep(3000);
		Assert.assertTrue(sovietArmenia.antiqImg.isDisplayed());
		Thread.sleep(3000);
		sovietArmenia.sovietArm.click();
		Thread.sleep(3000);
		Assert.assertTrue(sovietArmenia.sovetArmImg.isDisplayed());
		Thread.sleep(3000);
		
		
		
	}

}
