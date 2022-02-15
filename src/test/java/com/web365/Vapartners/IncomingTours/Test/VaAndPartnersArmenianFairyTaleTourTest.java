package com.web365.Vapartners.IncomingTours.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.VapartnersTourBaseTest;
import com.web365.vapartners.incoming.tours.VaAndPartnersIncomingTourArmenianFairyTale;
import com.web365.vapartners.page.home.VaAndPartnersHomePage;

public class VaAndPartnersArmenianFairyTaleTourTest  extends VapartnersTourBaseTest {
	
	@Test
	public void testVapartnersTours() throws InterruptedException {
	
	VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
    home = home.logoClick();
	Assert.assertTrue(home.incomingTours.isDisplayed());
	
	
	VaAndPartnersIncomingTourArmenianFairyTale incomingTourArmenianFairyTale = home.goToIncomingTourArmenianFairyTale();
	Thread.sleep(3000);
	Assert.assertTrue(incomingTourArmenianFairyTale.incomingTours.isDisplayed());	
	Thread.sleep(3000);
	Assert.assertTrue(incomingTourArmenianFairyTale.more.isDisplayed());
	Thread.sleep(3000);
	incomingTourArmenianFairyTale.more.click();
	Thread.sleep(3000);
	Assert.assertTrue(incomingTourArmenianFairyTale.name.isDisplayed());
	Thread.sleep(3000);
	incomingTourArmenianFairyTale.name.click();
	incomingTourArmenianFairyTale.name.sendKeys("Aliksandra Galstyan");
	Thread.sleep(2000);
	Assert.assertTrue(incomingTourArmenianFairyTale.phone.isDisplayed());
	Thread.sleep(2000);
	incomingTourArmenianFairyTale.phone.click();
	incomingTourArmenianFairyTale.phone.sendKeys("4404633690");
	Thread.sleep(2000);
	Assert.assertTrue(incomingTourArmenianFairyTale.email.isDisplayed());
	Thread.sleep(2000);
	incomingTourArmenianFairyTale.email.click();
	incomingTourArmenianFairyTale.email.sendKeys("Aliksandra.galstyan1@gmail.com");
	Thread.sleep(2000);
	Assert.assertTrue(incomingTourArmenianFairyTale.message.isDisplayed());
	Thread.sleep(2000);
	incomingTourArmenianFairyTale.message.click();
	incomingTourArmenianFairyTale.message.sendKeys("Hello");
	Thread.sleep(2000);
	Assert.assertTrue(incomingTourArmenianFairyTale.toOrder.isDisplayed());
	Thread.sleep(2000);
	incomingTourArmenianFairyTale.toOrder.click();
	Thread.sleep(2000);
	// Assert.assertTrue(incomingCulturalTour.orderConfermatin.isDisplayed);
}

}