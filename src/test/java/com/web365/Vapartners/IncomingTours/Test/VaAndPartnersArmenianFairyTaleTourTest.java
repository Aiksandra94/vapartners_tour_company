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
	
	
	VaAndPartnersIncomingTourArmenianFairyTale IncomingTourArmenianFairyTale = home.goToIncomingTourArmenianFairyTale();
	Thread.sleep(3000);
	Assert.assertTrue(IncomingTourArmenianFairyTale.incomingTours.isDisplayed());	
	Thread.sleep(3000);
	Assert.assertTrue(IncomingTourArmenianFairyTale.more.isDisplayed());
	Thread.sleep(3000);
	IncomingTourArmenianFairyTale.more.click();
	Thread.sleep(3000);
	Assert.assertTrue(IncomingTourArmenianFairyTale.name.isDisplayed());
	Thread.sleep(3000);
	IncomingTourArmenianFairyTale.name.click();
	IncomingTourArmenianFairyTale.name.sendKeys("Aliksandra Galstyan");
	Thread.sleep(2000);
	Assert.assertTrue(IncomingTourArmenianFairyTale.phone.isDisplayed());
	Thread.sleep(2000);
	IncomingTourArmenianFairyTale.phone.click();
	IncomingTourArmenianFairyTale.phone.sendKeys("4404633690");
	Thread.sleep(2000);
	Assert.assertTrue(IncomingTourArmenianFairyTale.email.isDisplayed());
	Thread.sleep(2000);
	IncomingTourArmenianFairyTale.email.click();
	IncomingTourArmenianFairyTale.email.sendKeys("Aliksandra.galstyan1@gmail.com");
	Thread.sleep(2000);
	Assert.assertTrue(IncomingTourArmenianFairyTale.message.isDisplayed());
	Thread.sleep(2000);
	IncomingTourArmenianFairyTale.message.click();
	IncomingTourArmenianFairyTale.message.sendKeys("Hello");
	Thread.sleep(2000);
	Assert.assertTrue(IncomingTourArmenianFairyTale.toOrder.isDisplayed());
	Thread.sleep(2000);
	IncomingTourArmenianFairyTale.toOrder.click();
	Thread.sleep(2000);

}

}