package com.web365.Vapartners.IncomingTours.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.VapartnersTourBaseTest;
import com.web365.vapartners.incoming.tours.VaAndPartnersIncomingDiscoverArmeniaTour;
import com.web365.vapartners.page.home.VaAndPartnersHomePage;

public class VaAndPartnersIncomingDiscoverArmeniaTourTest extends VapartnersTourBaseTest {
	
	@Test
	public void testVapartnersTours() throws InterruptedException {

		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
		home=home.logoClick();
		Assert.assertTrue(home.incomingTours.isDisplayed());

		
		VaAndPartnersIncomingDiscoverArmeniaTour incomingDiscoverArmeniaTour = home.goToincomingDiscoverArmeniaTour();
		Thread.sleep(3000);
		Assert.assertTrue(incomingDiscoverArmeniaTour.incomingTour.isDisplayed());
		Thread.sleep(3000);
		Assert.assertTrue(incomingDiscoverArmeniaTour.more.isDisplayed());
		Thread.sleep(3000);
		incomingDiscoverArmeniaTour.more.click();
		Thread.sleep(3000);
		Assert.assertTrue(incomingDiscoverArmeniaTour.orderForm.isDisplayed());
		Thread.sleep(3000);
		incomingDiscoverArmeniaTour.name.click();
		incomingDiscoverArmeniaTour.name.sendKeys("Aliksandra Galstyan");
		Thread.sleep(2000);
		incomingDiscoverArmeniaTour.phone.click();
		incomingDiscoverArmeniaTour.phone.sendKeys("4404633690");
	    Thread.sleep(2000);
	    incomingDiscoverArmeniaTour.email.click();
	    incomingDiscoverArmeniaTour.email.sendKeys("aliksandra.galstyan1@gmial.com");
	    Thread.sleep(2000);
	    incomingDiscoverArmeniaTour.message.click();
	    incomingDiscoverArmeniaTour.message.sendKeys("Hello");
	    Thread.sleep(2000);
	    incomingDiscoverArmeniaTour.order.click();
	   // Assert.assertTrue(incomingCulturalTour.orderConfermatin.isDisplayed);
	    
} 
	}
