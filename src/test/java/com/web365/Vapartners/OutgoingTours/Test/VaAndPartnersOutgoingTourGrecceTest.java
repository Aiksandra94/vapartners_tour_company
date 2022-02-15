package com.web365.Vapartners.OutgoingTours.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.VapartnersTourBaseTest;
import com.web365.vapartners.outgoing.tours.VaAndPartnersOutgoingTourGrecce;
import com.web365.vapartners.page.home.VaAndPartnersHomePage;

public class VaAndPartnersOutgoingTourGrecceTest extends VapartnersTourBaseTest {
	

	@Test
	public void testVapartnersTours()  throws InterruptedException {
		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
	    home = home.logoClick();
		Assert.assertTrue(home.outgoingTours.isDisplayed());
		
		VaAndPartnersOutgoingTourGrecce outgoingTourGrecce = home.goToOutgoingTourGrecce();	
		Thread.sleep(3000);
		Assert.assertTrue(outgoingTourGrecce.outgoingToures.isDisplayed());
		Thread.sleep(3000);
		Assert.assertTrue(outgoingTourGrecce.moreButton.isDisplayed());
		Thread.sleep(3000);
		outgoingTourGrecce.moreButton.click();
		Thread.sleep(3000);
		Assert.assertTrue(outgoingTourGrecce.grecceForm.isDisplayed());
		Thread.sleep(3000);
		outgoingTourGrecce.name.click();
		outgoingTourGrecce.name.sendKeys("Aliksandra Galstyan");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourGrecce.phone.isDisplayed());
		Thread.sleep(2000);
		outgoingTourGrecce.phone.click();
		outgoingTourGrecce.phone.sendKeys("4404633690");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourGrecce.email.isDisplayed());
		Thread.sleep(2000);
		outgoingTourGrecce.email.click();
		outgoingTourGrecce.email.sendKeys("Aliksandra.galstyan1@gmail.com");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourGrecce.message.isDisplayed());
		Thread.sleep(2000);
		outgoingTourGrecce.message.click();
		outgoingTourGrecce.message.sendKeys("Hello");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourGrecce.toOrder.isDisplayed());
		Thread.sleep(2000);
		outgoingTourGrecce.toOrder.click();
		Thread.sleep(2000);
	}
}

