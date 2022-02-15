package com.web365.Vapartners.IncomingTours.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.VapartnersTourBaseTest;
import com.web365.vapartners.incoming.tours.VaAndPartnersIncomingAntiquarianTour;
import com.web365.vapartners.page.home.VaAndPartnersHomePage;

public class VaAndPartnersIncomingAntiquarianTourTest extends VapartnersTourBaseTest {

	
	@Test
	public void testVapartnersTours() throws InterruptedException {
		
		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
		home = home.logoClick();
		Assert.assertTrue(home.incomingTours.isDisplayed());
		
		VaAndPartnersIncomingAntiquarianTour incomingAntiquarianTour = home.goToIncomingAntiquarianTour();
		Thread.sleep(3000);
		Assert.assertTrue(incomingAntiquarianTour.incomingTours.isDisplayed());	
		Thread.sleep(3000);
		Assert.assertTrue(incomingAntiquarianTour.more.isDisplayed());
		Thread.sleep(3000);
		incomingAntiquarianTour.more.click();
		Thread.sleep(3000);
		Assert.assertTrue(incomingAntiquarianTour.name.isDisplayed());
		Thread.sleep(3000);
		incomingAntiquarianTour.name.click();
		incomingAntiquarianTour.name.sendKeys("Aliksandra Galstyan");
		Thread.sleep(2000);
		Assert.assertTrue(incomingAntiquarianTour.phone.isDisplayed());
		Thread.sleep(2000);
		incomingAntiquarianTour.phone.click();
		incomingAntiquarianTour.phone.sendKeys("4404633690");
		Thread.sleep(2000);
		Assert.assertTrue(incomingAntiquarianTour.email.isDisplayed());
		Thread.sleep(2000);
		incomingAntiquarianTour.email.click();
		incomingAntiquarianTour.email.sendKeys("Aliksandra.galstyan1@gmail.com");
		Thread.sleep(2000);
		Assert.assertTrue(incomingAntiquarianTour.message.isDisplayed());
		Thread.sleep(2000);
		incomingAntiquarianTour.message.click();
		incomingAntiquarianTour.message.sendKeys("Hello");
		Thread.sleep(2000);
		Assert.assertTrue(incomingAntiquarianTour.order.isDisplayed());
		Thread.sleep(2000);
		incomingAntiquarianTour.order.click();
		Thread.sleep(2000);
		// Assert.assertTrue(incomingCulturalTour.orderConfermatin.isDisplayed);
	}
}
