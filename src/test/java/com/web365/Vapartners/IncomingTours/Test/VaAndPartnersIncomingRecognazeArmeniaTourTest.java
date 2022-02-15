package com.web365.Vapartners.IncomingTours.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.VapartnersTourBaseTest;
import com.web365.vapartners.incoming.tours.VaAndPartnersIncomingRecognazeArmeniaTour;
import com.web365.vapartners.page.home.VaAndPartnersHomePage;

public class VaAndPartnersIncomingRecognazeArmeniaTourTest extends VapartnersTourBaseTest{
	
	@Test
	public void testVapartnersTours() throws InterruptedException {

		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
		home=home.logoClick();
		Assert.assertTrue(home.incomingTours.isDisplayed());

		
		VaAndPartnersIncomingRecognazeArmeniaTour incomingRecognazeArmeniaTour = home.goToIncomingRecognazeArmeniaTour();
		Thread.sleep(3000);
		Assert.assertTrue(incomingRecognazeArmeniaTour.incomingTours.isDisplayed());
		Thread.sleep(3000);
		Assert.assertTrue(incomingRecognazeArmeniaTour.more.isDisplayed());
		Thread.sleep(3000);
		incomingRecognazeArmeniaTour.more.click();
		Thread.sleep(3000);
		Assert.assertTrue(incomingRecognazeArmeniaTour.order.isDisplayed());
		Thread.sleep(3000);
		incomingRecognazeArmeniaTour.name.click();
		incomingRecognazeArmeniaTour.name.sendKeys("Aliksandra Galstyan");
		Thread.sleep(2000);
		incomingRecognazeArmeniaTour.phone.click();
		incomingRecognazeArmeniaTour.phone.sendKeys("4404633690");
	    Thread.sleep(2000);
	    incomingRecognazeArmeniaTour.email.click();
	    incomingRecognazeArmeniaTour.email.sendKeys("aliksandra.galstyan1@gmial.com");
	    Thread.sleep(2000);
	    incomingRecognazeArmeniaTour.message.click();
	    incomingRecognazeArmeniaTour.message.sendKeys("Hello");
	    Thread.sleep(2000);
	    incomingRecognazeArmeniaTour.order.click();
	   // Assert.assertTrue(incomingCulturalTour.orderConfermatin.isDisplayed);
	    
	}
}
