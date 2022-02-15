package com.web365.VapartnersFacebookTest;


import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.VapartnersTourBaseTest;
import com.web365.vapartners.page.home.VaAndPartnersHomePage;

public class VaAndPartnersFacebookPageTest extends VapartnersTourBaseTest {

	
	@Test
	public void VaAndPartnersFacebookPage() throws InterruptedException {
	    
		
		VaAndPartnersHomePage facebookPage = new VaAndPartnersHomePage(driver);
		facebookPage.facebook.click();
		Assert.assertTrue(facebookPage.facebook.isDisplayed());
		Thread.sleep(5000);
		
		 ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs2.get(1));
		    Thread.sleep(5000);
		    
		    facebookPage.facebookLogIn.click();
		Assert.assertTrue(facebookPage.facebookLogInPage.isDisplayed());
		Thread.sleep(5000);
		facebookPage.username.click();
		facebookPage.username.sendKeys("ruben_armenian@gamil.com");
		Thread.sleep(3000);
		facebookPage.password.click();
		facebookPage.password.sendKeys("Dingog176");
		Thread.sleep(3000);
		facebookPage.logIn.click();
		Assert.assertTrue(facebookPage.facebookWebPage.isDisplayed());
		Thread.sleep(3000);
		
		
		
}
}