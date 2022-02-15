package com.web365.Vapartners.IncomingTours.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.VapartnersTourBaseTest;
import com.web365.vapartners.incoming.tours.VaAndPartnersIncomingArmeniaShortTour;
import com.web365.vapartners.page.home.VaAndPartnersHomePage;

public class VaAndPartnersIncomingArmeniaShortTourTest  extends VapartnersTourBaseTest {
	
	@Test
	public void testVapartnersTours() throws InterruptedException {
		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
		home = home.logoClick();
		Assert.assertTrue(home.incomingTours.isDisplayed());
		
		VaAndPartnersIncomingArmeniaShortTour incomingArmeniaShortTour = home.goToIncomingArmeniaShortTour();
		Thread.sleep(3000);
		Assert.assertTrue(incomingArmeniaShortTour.incomingTour.isDisplayed());
		Thread.sleep(3000);
		Assert.assertTrue(incomingArmeniaShortTour.more.isDisplayed());
		Thread.sleep(3000);
		incomingArmeniaShortTour.more.click();
		Thread.sleep(3000);
		Assert.assertTrue(incomingArmeniaShortTour.orderForm.isDisplayed());
		Thread.sleep(3000);
		Assert.assertTrue(incomingArmeniaShortTour.name.isDisplayed());
		Thread.sleep(3000);
		incomingArmeniaShortTour.name.click();
		incomingArmeniaShortTour.name.sendKeys("Aliksandra Galstyan");
		Thread.sleep(2000);
		Assert.assertTrue(incomingArmeniaShortTour.phone.isDisplayed());
		Thread.sleep(2000);
		incomingArmeniaShortTour.phone.click();
		incomingArmeniaShortTour.phone.sendKeys("4404633690");
		Thread.sleep(2000);
		Assert.assertTrue(incomingArmeniaShortTour.email.isDisplayed());
		Thread.sleep(2000);
		incomingArmeniaShortTour.email.click();
		incomingArmeniaShortTour.email.sendKeys("Aliksandra.galstyan1@gmail.com");
		Thread.sleep(2000);
		Assert.assertTrue(incomingArmeniaShortTour.message.isDisplayed());
		Thread.sleep(2000);
		incomingArmeniaShortTour.message.click();
		incomingArmeniaShortTour.message.sendKeys("Hello");
		Thread.sleep(2000);
		Assert.assertTrue(incomingArmeniaShortTour.order.isDisplayed());
		Thread.sleep(2000);
		incomingArmeniaShortTour.order.click();
		Thread.sleep(2000);
		// Assert.assertTrue(incomingCulturalTour.orderConfermatin.isDisplayed);
	}

}
