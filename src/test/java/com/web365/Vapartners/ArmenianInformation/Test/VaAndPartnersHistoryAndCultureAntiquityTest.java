package com.web365.Vapartners.ArmenianInformation.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.VapartnersTourBaseTest;
import com.web365.vapartners.Armenia.History.And.Culture.VaAndPartnersHistoryAndCultureAntiquity;
import com.web365.vapartners.page.home.VaAndPartnersHomePage;

public class VaAndPartnersHistoryAndCultureAntiquityTest extends VapartnersTourBaseTest {
	
	@Test
	public void testVapartnersTour() throws InterruptedException {

		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
	    home = home.logoClick();
		Assert.assertTrue(home.armeniaBtn.isDisplayed());
		
		    VaAndPartnersHistoryAndCultureAntiquity historyAndCulture = home.goToHistoryAndCulture1();
		    Thread.sleep(3000);
			Assert.assertTrue(historyAndCulture.historyAndCulture.isDisplayed());
			Thread.sleep(3000);
			historyAndCulture.historyAndCulture.click();
			Thread.sleep(3000);
			Assert.assertTrue(historyAndCulture.antiqImage.isDisplayed());
			Thread.sleep(3000);
			
}
}
