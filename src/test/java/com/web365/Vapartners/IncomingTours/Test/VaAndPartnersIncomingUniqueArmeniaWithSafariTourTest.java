package com.web365.Vapartners.IncomingTours.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.VapartnersTourBaseTest;
import com.web365.vapartners.incoming.tours.VaAndPartnersIncomingUniqueArmeniaWithSafariTour;
import com.web365.vapartners.page.home.VaAndPartnersHomePage;

public class VaAndPartnersIncomingUniqueArmeniaWithSafariTourTest extends VapartnersTourBaseTest {

	
	@Test
	public void testVapartnersTours() throws InterruptedException {

		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
		home=home.logoClick();
		Assert.assertTrue(home.incomingTours.isDisplayed());

		
		VaAndPartnersIncomingUniqueArmeniaWithSafariTour incomingUniqueArmeniaWithSafariTours = home.goToIncomingUniqueArmeniaWithSafariTours();
		Thread.sleep(3000);
		Assert.assertTrue(incomingUniqueArmeniaWithSafariTours.incomingTour.isDisplayed());
		Thread.sleep(3000);
		Assert.assertTrue(incomingUniqueArmeniaWithSafariTours.more.isDisplayed());
		Thread.sleep(3000);
		incomingUniqueArmeniaWithSafariTours.more.click();
		Thread.sleep(3000);
		Assert.assertTrue(incomingUniqueArmeniaWithSafariTours.toOrder.isDisplayed());
		Thread.sleep(3000);
		incomingUniqueArmeniaWithSafariTours.name.click();
		incomingUniqueArmeniaWithSafariTours.name.sendKeys("Aliksandra Galstyan");
		Thread.sleep(2000);
		incomingUniqueArmeniaWithSafariTours.phone.click();
		incomingUniqueArmeniaWithSafariTours.phone.sendKeys("4404633690");
	    Thread.sleep(2000);
	    incomingUniqueArmeniaWithSafariTours.email.click();
	    incomingUniqueArmeniaWithSafariTours.email.sendKeys("aliksandra.galstyan1@gmial.com");
	    Thread.sleep(2000);
	    incomingUniqueArmeniaWithSafariTours.message.click();
	    incomingUniqueArmeniaWithSafariTours.message.sendKeys("Hello");
	    Thread.sleep(2000);
	    incomingUniqueArmeniaWithSafariTours.toOrder.click();
	   // Assert.assertTrue(incomingCulturalTour.orderConfermatin.isDisplayed);
	    
}
}
