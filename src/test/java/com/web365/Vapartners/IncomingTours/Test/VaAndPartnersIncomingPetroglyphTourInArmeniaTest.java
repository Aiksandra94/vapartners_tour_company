package com.web365.Vapartners.IncomingTours.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.VapartnersTourBaseTest;
import com.web365.vapartners.incoming.tours.VaAndPartnersIncomingPetroglyphTourInArmenia;
import com.web365.vapartners.page.home.VaAndPartnersHomePage;

public class VaAndPartnersIncomingPetroglyphTourInArmeniaTest  extends VapartnersTourBaseTest {

	@Test
	public void testVapartnersTours() throws InterruptedException {
		
		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
		home = home.logoClick();
		Assert.assertTrue(home.incomingTours.isDisplayed());
		
		VaAndPartnersIncomingPetroglyphTourInArmenia incomingPetroglyphTourInArmenia = home.goToIncomingPetroglyphTourInArmenia(); 
		Thread.sleep(3000);
		Assert.assertTrue(incomingPetroglyphTourInArmenia.incomingTour.isDisplayed());	
		Thread.sleep(3000);
		Assert.assertTrue(incomingPetroglyphTourInArmenia.more.isDisplayed());
		Thread.sleep(3000);
		incomingPetroglyphTourInArmenia.more.click();
		Thread.sleep(3000);
		Assert.assertTrue(incomingPetroglyphTourInArmenia.name.isDisplayed());
		Thread.sleep(3000);
		incomingPetroglyphTourInArmenia.name.click();
		incomingPetroglyphTourInArmenia.name.sendKeys("Aliksandra Galstyan");
		Thread.sleep(2000);
		Assert.assertTrue(incomingPetroglyphTourInArmenia.phone.isDisplayed());
		Thread.sleep(2000);
		incomingPetroglyphTourInArmenia.phone.click();
		incomingPetroglyphTourInArmenia.phone.sendKeys("4404633690");
		Thread.sleep(2000);
		Assert.assertTrue(incomingPetroglyphTourInArmenia.email.isDisplayed());
		Thread.sleep(2000);
		incomingPetroglyphTourInArmenia.email.click();
		incomingPetroglyphTourInArmenia.email.sendKeys("Aliksandra.galstyan1@gmail.com");
		Thread.sleep(2000);
		Assert.assertTrue(incomingPetroglyphTourInArmenia.message.isDisplayed());
		Thread.sleep(2000);
		incomingPetroglyphTourInArmenia.message.click();
		incomingPetroglyphTourInArmenia.message.sendKeys("Hello");
		Thread.sleep(2000);
		Assert.assertTrue(incomingPetroglyphTourInArmenia.order.isDisplayed());
		Thread.sleep(2000);
		incomingPetroglyphTourInArmenia.order.click();
		Thread.sleep(2000);
		// Assert.assertTrue(incomingCulturalTour.orderConfermatin.isDisplayed);
	}
	
}

	
	
