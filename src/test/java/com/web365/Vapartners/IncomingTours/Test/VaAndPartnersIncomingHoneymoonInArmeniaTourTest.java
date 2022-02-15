package com.web365.Vapartners.IncomingTours.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.VapartnersTourBaseTest;
import com.web365.vapartners.incoming.tours.VaAndPartnersIncomingHoneymoonInArmeniaTour;
import com.web365.vapartners.page.home.VaAndPartnersHomePage;

public class VaAndPartnersIncomingHoneymoonInArmeniaTourTest extends VapartnersTourBaseTest {
	
	@Test
	public void testVapartnersTours() throws InterruptedException {
		
		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
		home = home.logoClick();
		Assert.assertTrue(home.incomingTours.isDisplayed());
	
		VaAndPartnersIncomingHoneymoonInArmeniaTour incomingHoneymoonInArmenia = home.goToIncomingHoneymoonInArmenia();
		Thread.sleep(3000);
		Assert.assertTrue(incomingHoneymoonInArmenia.incomingTour.isDisplayed());	
		Thread.sleep(3000);
		Assert.assertTrue(incomingHoneymoonInArmenia.more.isDisplayed());
		Thread.sleep(3000);
		incomingHoneymoonInArmenia.more.click();
		Thread.sleep(3000);
		Assert.assertTrue(incomingHoneymoonInArmenia.name.isDisplayed());
		Thread.sleep(3000);
		incomingHoneymoonInArmenia.name.click();
		incomingHoneymoonInArmenia.name.sendKeys("Aliksandra Galstyan");
		Thread.sleep(2000);
		Assert.assertTrue(incomingHoneymoonInArmenia.phone.isDisplayed());
		Thread.sleep(2000);
		incomingHoneymoonInArmenia.phone.click();
		incomingHoneymoonInArmenia.phone.sendKeys("4404633690");
		Thread.sleep(2000);
		Assert.assertTrue(incomingHoneymoonInArmenia.email.isDisplayed());
		Thread.sleep(2000);
		incomingHoneymoonInArmenia.email.click();
		incomingHoneymoonInArmenia.email.sendKeys("Aliksandra.galstyan1@gmail.com");
		Thread.sleep(2000);
		Assert.assertTrue(incomingHoneymoonInArmenia.message.isDisplayed());
		Thread.sleep(2000);
		incomingHoneymoonInArmenia.message.click();
		incomingHoneymoonInArmenia.message.sendKeys("Hello");
		Thread.sleep(2000);
		Assert.assertTrue(incomingHoneymoonInArmenia.order.isDisplayed());
		Thread.sleep(2000);
		incomingHoneymoonInArmenia.order.click();
		Thread.sleep(2000);
		// Assert.assertTrue(incomingCulturalTour.orderConfermatin.isDisplayed);
	}
	
}
