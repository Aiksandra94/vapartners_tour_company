package com.web365.Vapartners.OutgoingTours.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.VapartnersTourBaseTest;
import com.web365.vapartners.outgoing.tours.VaAndPartnersOutgoingTourFrance;
import com.web365.vapartners.page.home.VaAndPartnersHomePage;

public class VaAndPartnersOutgoingTourFranceTest extends VapartnersTourBaseTest {

	@Test
	public void testVapartnersTours() throws InterruptedException {
	
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
	    home = home.logoClick();
		Assert.assertTrue(home.outgoingTours.isDisplayed());
		
		VaAndPartnersOutgoingTourFrance outgoingTourFrance = home.goToOutgoingTourFrance();
		Thread.sleep(3000);
		Assert.assertTrue(outgoingTourFrance.outgoingToures.isDisplayed());
		Thread.sleep(3000);
		Assert.assertTrue(outgoingTourFrance.moreButton.isDisplayed());
		Thread.sleep(3000);
		outgoingTourFrance.moreButton.click();
		Thread.sleep(3000);
		Assert.assertTrue(outgoingTourFrance.franceForm.isDisplayed());
		Thread.sleep(3000);
		outgoingTourFrance.name.click();
		outgoingTourFrance.name.sendKeys("Aliksandra Galstyan");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourFrance.phone.isDisplayed());
		Thread.sleep(2000);
		outgoingTourFrance.phone.click();
		outgoingTourFrance.phone.sendKeys("4404633690");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourFrance.email.isDisplayed());
		Thread.sleep(2000);
		outgoingTourFrance.email.click();
		outgoingTourFrance.email.sendKeys("Aliksandra.galstyan1@gmail.com");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourFrance.message.isDisplayed());
		Thread.sleep(2000);
		outgoingTourFrance.message.click();
		outgoingTourFrance.message.sendKeys("Hello");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourFrance.toOrder.isDisplayed());
		Thread.sleep(2000);
		outgoingTourFrance.toOrder.click();
		Thread.sleep(2000);
	}
}
