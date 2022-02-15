package com.web365.Vapartners.IncomingTours.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.VapartnersTourBaseTest;
import com.web365.vapartners.incoming.tours.VaAndPartnersIncomingCulturalTour;
import com.web365.vapartners.page.home.VaAndPartnersHomePage;

public class VaAndPartnersIncomingCulturalTourTest extends VapartnersTourBaseTest {
	
	@Test
	public void testVapartnersTours() throws InterruptedException {

		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
		home=home.logoClick();
		Assert.assertTrue(home.incomingTours.isDisplayed());
		
		VaAndPartnersIncomingCulturalTour incomingCulturalTour = home.goToIncomingCulturalTour();
		Thread.sleep(3000);
		Assert.assertTrue(incomingCulturalTour.incomingTour.isDisplayed());
		Thread.sleep(3000);
		Assert.assertTrue(incomingCulturalTour.more.isDisplayed());
		Thread.sleep(3000);
		incomingCulturalTour.more.click();
		Thread.sleep(3000);
		Assert.assertTrue(incomingCulturalTour.orderForm.isDisplayed());
		Thread.sleep(3000);
		incomingCulturalTour.name.click();
		incomingCulturalTour.name.sendKeys("Aliksandra Galstyan");
		Thread.sleep(2000);
	    incomingCulturalTour.phone.click();
	    incomingCulturalTour.phone.sendKeys("4404633690");
	    Thread.sleep(2000);
	    incomingCulturalTour.email.click();
	    incomingCulturalTour.email.sendKeys("aliksandra.galstyan1@gmial.com");
	    Thread.sleep(2000);
	    incomingCulturalTour.message.click();
	    incomingCulturalTour.message.sendKeys("Hello");
	    Thread.sleep(2000);
	    incomingCulturalTour.order.click();
	   // Assert.assertTrue(incomingCulturalTour.orderConfermatin.isDisplayed);
	    
		
		
		
		
		
		
}
}
