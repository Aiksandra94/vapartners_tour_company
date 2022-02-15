package com.web365.Vapartners.ArmenianInformation.Test;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.VapartnersTourBaseTest;
import com.web365.vapartners.Armenian.General.Information.VaAndPartnersGeneralInformation;
import com.web365.vapartners.page.home.VaAndPartnersHomePage;
public class VaAndPartnersArmenianInformationTest extends VapartnersTourBaseTest {
	
	@Test
	public void testVapartnersTour() throws InterruptedException {
		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
	    home = home.logoClick();
		Assert.assertTrue(home.armeniaBtn.isDisplayed());

		
		VaAndPartnersGeneralInformation generalInformation = new VaAndPartnersGeneralInformation(driver);
		
		Assert.assertTrue(generalInformation.armeniaBtn.isDisplayed());
		generalInformation.armeniaBtn.click();
	    //Assert.assertTrue(generalInformation.armeniaBtn.isDisplayed());
	    Thread.sleep(4000);
	    generalInformation.genInform.click();
		Thread.sleep(4000);
		
		
		
		
		}
	
	
	
	
	
	

	
	

	}

	

