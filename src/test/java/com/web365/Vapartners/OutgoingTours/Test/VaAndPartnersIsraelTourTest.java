package com.web365.Vapartners.OutgoingTours.Test;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.VapartnersTourBaseTest;
import com.web365.vapartners.outgoing.tours.VaAndPartnersOutgoingTourIsrael;
import com.web365.vapartners.page.home.VaAndPartnersHomePage;

public class VaAndPartnersIsraelTourTest extends VapartnersTourBaseTest {


	@Test
	public void testVapartnersTours() throws InterruptedException {
	
	
	VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
    home = home.logoClick();
	Assert.assertTrue(home.outgoingTours.isDisplayed());
	

	VaAndPartnersOutgoingTourIsrael outgoingTourIsrael = home.goToOutgoingTourIsrael();
	Thread.sleep(3000);
	Assert.assertTrue(outgoingTourIsrael.outgoingToures.isDisplayed());
	Thread.sleep(3000);
	Assert.assertTrue(outgoingTourIsrael.moreButton.isDisplayed());
	Thread.sleep(3000);
	outgoingTourIsrael.moreButton.click();
	Thread.sleep(3000);
	Assert.assertTrue(outgoingTourIsrael.name.isDisplayed());
	Thread.sleep(3000);
	outgoingTourIsrael.name.click();
	outgoingTourIsrael.name.sendKeys("Aliksandra Galstyan");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourIsrael.phone.isDisplayed());
	Thread.sleep(2000);
	outgoingTourIsrael.phone.click();
	outgoingTourIsrael.phone.sendKeys("4404633690");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourIsrael.email.isDisplayed());
	Thread.sleep(2000);
	outgoingTourIsrael.email.click();
	outgoingTourIsrael.email.sendKeys("Aliksandra.galstyan1@gmail.com");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourIsrael.message.isDisplayed());
	Thread.sleep(2000);
	outgoingTourIsrael.message.click();
	outgoingTourIsrael.message.sendKeys("Hello");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourIsrael.toOrder.isDisplayed());
	Thread.sleep(2000);
	outgoingTourIsrael.toOrder.click();
	Thread.sleep(2000);
	
	}
	
}

