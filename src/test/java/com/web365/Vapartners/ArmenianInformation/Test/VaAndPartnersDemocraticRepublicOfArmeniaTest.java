package com.web365.Vapartners.ArmenianInformation.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.VapartnersTourBaseTest;
import com.web365.vapartners.Armenia.History.And.Culture.VaAndPartnersDemocraticRepublicOfArmenia;
import com.web365.vapartners.page.home.VaAndPartnersHomePage;

public class VaAndPartnersDemocraticRepublicOfArmeniaTest extends VapartnersTourBaseTest {
	
	@Test
	public void testVapartnersTour() throws InterruptedException {
		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
	    home = home.logoClick();
		Assert.assertTrue(home.armeniaBtn.isDisplayed());
		
		VaAndPartnersDemocraticRepublicOfArmenia democraticRepublicOfArmenia = home.goToDemocraticRepublicOfArmenia();
		Thread.sleep(3000);
		Assert.assertTrue(democraticRepublicOfArmenia.historyCulture.isDisplayed());
		Thread.sleep(3000);
		democraticRepublicOfArmenia.historyCulture.click();
		Thread.sleep(3000);
		Assert.assertTrue(democraticRepublicOfArmenia.antiqImg.isDisplayed());
		Thread.sleep(3000);
		democraticRepublicOfArmenia.dra.click();
		Thread.sleep(3000);
		Assert.assertTrue(democraticRepublicOfArmenia.republicImg.isDisplayed());
		
	}

}
