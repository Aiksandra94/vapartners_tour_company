package com.web365.Vapartners.OutgoingTours.Test;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.VapartnersTourBaseTest;
import com.web365.vapartners.outgoing.tours.VaAndPartnersOutgoingTourThailand;
import com.web365.vapartners.page.home.VaAndPartnersHomePage;

public class VaAndPartnersThailandTourTest extends VapartnersTourBaseTest {
		
		@Test
		public void testVapartnersTours() throws InterruptedException {
		    
			
			VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
		    home = home.logoClick();
			Assert.assertTrue(home.outgoingTours.isDisplayed());
			
			VaAndPartnersOutgoingTourThailand outgoingTourThailand = home.goToOtgoingTourThailand();
			Thread.sleep(3000);
			Assert.assertTrue(outgoingTourThailand.outgoingTours.isDisplayed());
			Thread.sleep(3000);
			Assert.assertTrue(outgoingTourThailand.moreButton.isDisplayed());
			Thread.sleep(3000);
			outgoingTourThailand.moreButton.click();
			Thread.sleep(3000); 
			Assert.assertTrue(outgoingTourThailand.name.isDisplayed());
			Thread.sleep(3000);
			outgoingTourThailand.name.click();
			outgoingTourThailand.name.sendKeys("Aliksandra Galstyan");
			Thread.sleep(2000);
			Assert.assertTrue(outgoingTourThailand.phone.isDisplayed());
			Thread.sleep(2000);
			outgoingTourThailand.phone.click();
			outgoingTourThailand.phone.sendKeys("4404633690");
			Thread.sleep(2000);
			Assert.assertTrue(outgoingTourThailand.email.isDisplayed());
			Thread.sleep(2000);
			outgoingTourThailand.email.click();
			outgoingTourThailand.email.sendKeys("Aliksandra.galstyan1@gmail.com");
			Thread.sleep(2000);
			Assert.assertTrue(outgoingTourThailand.message.isDisplayed());
			Thread.sleep(2000);
			outgoingTourThailand.message.click();
			outgoingTourThailand.message.sendKeys("Hello");
			Thread.sleep(2000);
			Assert.assertTrue(outgoingTourThailand.toOrder.isDisplayed());
			Thread.sleep(2000);
			outgoingTourThailand.toOrder.click();
			Thread.sleep(2000);
			
	}
	
	

}
