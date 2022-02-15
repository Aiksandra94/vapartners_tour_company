package com.web365.Vapartners.IncomingTours.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.VapartnersTourBaseTest;
import com.web365.vapartners.incoming.tours.VaAndPartnersIncomingColorsOfArmeniaTour;
import com.web365.vapartners.page.home.VaAndPartnersHomePage;

public class VaAndPartnersIncomingColorsOfArmeniaTourTest  extends VapartnersTourBaseTest {
	
	@Test 
	public void testVapartnersTour() throws InterruptedException {
		
	
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
		home = home.logoClick();
		Assert.assertTrue(home.incomingTours.isDisplayed());
		
		VaAndPartnersIncomingColorsOfArmeniaTour incomingColorsOfArmeniaTour = home.goToIncomingColorsOfArmeniaTour();
		Thread.sleep(3000);
		Assert.assertTrue(incomingColorsOfArmeniaTour.incomingTours.isDisplayed());
		Thread.sleep(3000);
		Assert.assertTrue(incomingColorsOfArmeniaTour.more.isDisplayed());
		Thread.sleep(3000);
		incomingColorsOfArmeniaTour.more.click();
		Thread.sleep(3000);
		Assert.assertTrue(incomingColorsOfArmeniaTour.orderForm.isDisplayed());
		Thread.sleep(3000);
		Assert.assertTrue(incomingColorsOfArmeniaTour.name.isDisplayed());
		Thread.sleep(3000);
		incomingColorsOfArmeniaTour.name.click();
		incomingColorsOfArmeniaTour.name.sendKeys("Aliksandra Galstyan");
		Thread.sleep(2000);
		Assert.assertTrue(incomingColorsOfArmeniaTour.phone.isDisplayed());
		Thread.sleep(2000);
		incomingColorsOfArmeniaTour.phone.click();
		incomingColorsOfArmeniaTour.phone.sendKeys("4404633690");
		Thread.sleep(2000);
		Assert.assertTrue(incomingColorsOfArmeniaTour.email.isDisplayed());
		Thread.sleep(2000);
		incomingColorsOfArmeniaTour.email.click();
		incomingColorsOfArmeniaTour.email.sendKeys("Aliksandra.galstyan1@gmail.com");
		Thread.sleep(2000);
		Assert.assertTrue(incomingColorsOfArmeniaTour.message.isDisplayed());
		Thread.sleep(2000);
		incomingColorsOfArmeniaTour.message.click();
		incomingColorsOfArmeniaTour.message.sendKeys("Hello");
		Thread.sleep(2000);
		Assert.assertTrue(incomingColorsOfArmeniaTour.order.isDisplayed());
		Thread.sleep(2000);
		incomingColorsOfArmeniaTour.order.click();
		Thread.sleep(2000);
		// Assert.assertTrue(incomingCulturalTour.orderConfermatin.isDisplayed);
	}

	
	}


