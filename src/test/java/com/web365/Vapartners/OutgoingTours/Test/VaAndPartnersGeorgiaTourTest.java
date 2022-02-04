package com.web365.Vapartners.OutgoingTours.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.VapartnersTourBaseTest;
import com.web365.vapartners.outgoing.tours.VaAndPartnersOutgoingTourGeorgia;
import com.web365.vapartners.page.home.VaAndPartnersHomePage;

public class VaAndPartnersGeorgiaTourTest  extends VapartnersTourBaseTest {

	@Test
	public void testVapartnersTours() throws InterruptedException {
	
	
	VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
    home = home.logoClick();
	Assert.assertTrue(home.outgoingTours.isDisplayed());
	

	VaAndPartnersOutgoingTourGeorgia outgoingTourGeorgia = home.goToOutgoingTourGeorgia();
	Thread.sleep(3000);
	Assert.assertTrue(outgoingTourGeorgia.outgoingTours.isDisplayed());
	Thread.sleep(3000);
	Assert.assertTrue(outgoingTourGeorgia.moreButton.isDisplayed());
	Thread.sleep(3000);
	outgoingTourGeorgia.moreButton.click();
	Thread.sleep(3000);
	Assert.assertTrue(outgoingTourGeorgia.name.isDisplayed());
	Thread.sleep(3000);
	outgoingTourGeorgia.name.click();
	outgoingTourGeorgia.name.sendKeys("Aliksandra Galstyan");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourGeorgia.phone.isDisplayed());
	Thread.sleep(2000);
	outgoingTourGeorgia.phone.click();
	outgoingTourGeorgia.phone.sendKeys("4404633690");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourGeorgia.email.isDisplayed());
	Thread.sleep(2000);
	outgoingTourGeorgia.email.click();
	outgoingTourGeorgia.email.sendKeys("Aliksandra.galstyan1@gmail.com");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourGeorgia.message.isDisplayed());
	Thread.sleep(2000);
	outgoingTourGeorgia.message.click();
	outgoingTourGeorgia.message.sendKeys("Hello");
	Thread.sleep(2000);
	Assert.assertTrue(outgoingTourGeorgia.toOrder.isDisplayed());
	Thread.sleep(2000);
	outgoingTourGeorgia.toOrder.click();
	Thread.sleep(2000);
	
	}
	
}

   