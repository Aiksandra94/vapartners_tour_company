package com.web365.Vapartners.IncomingTours.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.VapartnersTourBaseTest;
import com.web365.vapartners.incoming.tours.VaAndPartnersIncomingFamTripToArmenia;
import com.web365.vapartners.page.home.VaAndPartnersHomePage;

public class VaAndPartnersIncomingFamTripToArmeniaTest extends VapartnersTourBaseTest {

	@Test
	public void testVapartnersTours() throws InterruptedException {
		
		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
		home = home.logoClick();
		Assert.assertTrue(home.incomingTours.isDisplayed());
		
		
		VaAndPartnersIncomingFamTripToArmenia incomingFamTripToArmenia = home.goToIncomingFamTripToArmenia();
		Thread.sleep(3000);
		Assert.assertTrue(incomingFamTripToArmenia.incomingTour.isDisplayed());	
		Thread.sleep(3000);
		Assert.assertTrue(incomingFamTripToArmenia.more.isDisplayed());
		Thread.sleep(3000);
		incomingFamTripToArmenia.more.click();
		Thread.sleep(3000);
		Assert.assertTrue(incomingFamTripToArmenia.name.isDisplayed());
		Thread.sleep(3000);
		incomingFamTripToArmenia.name.click();
		incomingFamTripToArmenia.name.sendKeys("Aliksandra Galstyan");
		Thread.sleep(2000);
		Assert.assertTrue(incomingFamTripToArmenia.phone.isDisplayed());
		Thread.sleep(2000);
		incomingFamTripToArmenia.phone.click();
		incomingFamTripToArmenia.phone.sendKeys("4404633690");
		Thread.sleep(2000);
		Assert.assertTrue(incomingFamTripToArmenia.email.isDisplayed());
		Thread.sleep(2000);
		incomingFamTripToArmenia.email.click();
		incomingFamTripToArmenia.email.sendKeys("Aliksandra.galstyan1@gmail.com");
		Thread.sleep(2000);
		Assert.assertTrue(incomingFamTripToArmenia.message.isDisplayed());
		Thread.sleep(2000);
		incomingFamTripToArmenia.message.click();
		incomingFamTripToArmenia.message.sendKeys("Hello");
		Thread.sleep(2000);
		Assert.assertTrue(incomingFamTripToArmenia.order.isDisplayed());
		Thread.sleep(2000);
		incomingFamTripToArmenia.order.click();
		Thread.sleep(2000);
		// Assert.assertTrue(incomingCulturalTour.orderConfermatin.isDisplayed);
	}
	
}
