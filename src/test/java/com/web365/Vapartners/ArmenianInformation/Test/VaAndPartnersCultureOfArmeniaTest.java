package com.web365.Vapartners.ArmenianInformation.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.VapartnersTourBaseTest;
import com.web365.vapartners.Armenia.History.And.Culture.VaAndPartnersCultureOfArmenia;
import com.web365.vapartners.page.home.VaAndPartnersHomePage;

public class VaAndPartnersCultureOfArmeniaTest extends VapartnersTourBaseTest {
	
	@Test
	public void testVapartnersTour() throws InterruptedException {
		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
	    home = home.logoClick();
		Assert.assertTrue(home.armeniaBtn.isDisplayed());
		
		VaAndPartnersCultureOfArmenia cultureArmenia = home.goToCultureArmenia();
		Thread.sleep(3000);
		Assert.assertTrue(cultureArmenia.historyCulture.isDisplayed());
		Thread.sleep(3000);
		cultureArmenia.historyCulture.click();
		Thread.sleep(3000);
		Assert.assertTrue(cultureArmenia.antiqImg.isDisplayed());
		Thread.sleep(3000);
		cultureArmenia.cultureArm.click();
		Thread.sleep(3000);
		Assert.assertTrue(cultureArmenia.cultureArmImg.isDisplayed());

}
}
