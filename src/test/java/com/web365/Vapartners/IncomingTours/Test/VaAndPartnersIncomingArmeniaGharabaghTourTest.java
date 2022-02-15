package com.web365.Vapartners.IncomingTours.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.VapartnersTourBaseTest;
import com.web365.vapartners.incoming.tours.VaAndPartnersIncomingArmeniaGharabaghTour;
import com.web365.vapartners.page.home.VaAndPartnersHomePage;

public class VaAndPartnersIncomingArmeniaGharabaghTourTest extends VapartnersTourBaseTest {

	
	@Test
	public void testVapartnersTours() throws InterruptedException {
	
	VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
    home = home.logoClick();
	Assert.assertTrue(home.incomingTours.isDisplayed());
	
	
	VaAndPartnersIncomingArmeniaGharabaghTour incomingArmeniaGharabaghTour = home.goToIncomingArmeniaGharabaghTour();
	Thread.sleep(3000);
	Assert.assertTrue(incomingArmeniaGharabaghTour.incomingTour.isDisplayed());	
	Thread.sleep(3000);
	Assert.assertTrue(incomingArmeniaGharabaghTour.more.isDisplayed());
	Thread.sleep(3000);
	incomingArmeniaGharabaghTour.more.click();
	Thread.sleep(3000);
	Assert.assertTrue(incomingArmeniaGharabaghTour.name.isDisplayed());
	Thread.sleep(3000);
	incomingArmeniaGharabaghTour.name.click();
	incomingArmeniaGharabaghTour.name.sendKeys("Aliksandra Galstyan");
	Thread.sleep(2000);
	Assert.assertTrue(incomingArmeniaGharabaghTour.phone.isDisplayed());
	Thread.sleep(2000);
	incomingArmeniaGharabaghTour.phone.click();
	incomingArmeniaGharabaghTour.phone.sendKeys("4404633690");
	Thread.sleep(2000);
	Assert.assertTrue(incomingArmeniaGharabaghTour.email.isDisplayed());
	Thread.sleep(2000);
	incomingArmeniaGharabaghTour.email.click();
	incomingArmeniaGharabaghTour.email.sendKeys("Aliksandra.galstyan1@gmail.com");
	Thread.sleep(2000);
	Assert.assertTrue(incomingArmeniaGharabaghTour.message.isDisplayed());
	Thread.sleep(2000);
	incomingArmeniaGharabaghTour.message.click();
	incomingArmeniaGharabaghTour.message.sendKeys("Hello");
	Thread.sleep(2000);
	Assert.assertTrue(incomingArmeniaGharabaghTour.order.isDisplayed());
	Thread.sleep(2000);
	incomingArmeniaGharabaghTour.order.click();
	Thread.sleep(2000);
	// Assert.assertTrue(incomingCulturalTour.orderConfermatin.isDisplayed);
}
}
	
