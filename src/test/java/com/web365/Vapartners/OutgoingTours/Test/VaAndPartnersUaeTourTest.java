package com.web365.Vapartners.OutgoingTours.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.VapartnersTourBaseTest;
import com.web365.vapartners.outgoing.tours.VaAndPartnersOutgoingTourUae;
import com.web365.vapartners.page.home.VaAndPartnersHomePage;

public class VaAndPartnersUaeTourTest extends VapartnersTourBaseTest {
	
	@Test
	public void testVapartnersTours() throws InterruptedException {

		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
	    home = home.logoClick();
		Assert.assertTrue(home.outgoingTours.isDisplayed());
		
		VaAndPartnersOutgoingTourUae outgoingTourUae = home.goToOutgoingTourUae();
		Thread.sleep(3000);
		Assert.assertTrue(outgoingTourUae.outgoingToures.isDisplayed());
		Thread.sleep(3000);
		Assert.assertTrue(outgoingTourUae.moreButton.isDisplayed());
		Thread.sleep(3000);
		outgoingTourUae.moreButton.click();
		Thread.sleep(3000);
		Assert.assertTrue(outgoingTourUae.name.isDisplayed());
		Thread.sleep(3000);
		outgoingTourUae.name.click();
		outgoingTourUae.name.sendKeys("Aliksandra Galstyan");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourUae.phone.isDisplayed());
		Thread.sleep(2000);
		outgoingTourUae.phone.click();
		outgoingTourUae.phone.sendKeys("4404633690");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourUae.email.isDisplayed());
		Thread.sleep(2000);
		outgoingTourUae.email.click();
		outgoingTourUae.email.sendKeys("Aliksandra.galstyan1@gmail.com");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourUae.message.isDisplayed());
		Thread.sleep(2000);
		outgoingTourUae.message.click();
		outgoingTourUae.message.sendKeys("Hello");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourUae.toOrder.isDisplayed());
		Thread.sleep(2000);
		outgoingTourUae.toOrder.click();
		Thread.sleep(2000);
}
}