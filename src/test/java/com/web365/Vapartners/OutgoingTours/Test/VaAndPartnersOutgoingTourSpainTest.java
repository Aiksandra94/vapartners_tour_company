package com.web365.Vapartners.OutgoingTours.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.VapartnersTourBaseTest;
import com.web365.vapartners.outgoing.tours.VaAndPartnersOutgoingTourSpain;
import com.web365.vapartners.page.home.VaAndPartnersHomePage;

public class VaAndPartnersOutgoingTourSpainTest extends VapartnersTourBaseTest {
	
	@Test
	public void testVapartnersTour() throws InterruptedException {
		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
	    home = home.logoClick();
		Assert.assertTrue(home.outgoingTours.isDisplayed());
		
		VaAndPartnersOutgoingTourSpain outgoingTourSpain = home.goToOutgoingTourSpain();
		Thread.sleep(3000);
		Assert.assertTrue(outgoingTourSpain.outgoingToures.isDisplayed());
		Thread.sleep(3000);
		Assert.assertTrue(outgoingTourSpain.moreButton.isDisplayed());
		Thread.sleep(3000);
		outgoingTourSpain.moreButton.click();
		Thread.sleep(3000);
		Assert.assertTrue(outgoingTourSpain.spainForm.isDisplayed());
		Thread.sleep(3000);
		outgoingTourSpain.name.click();
		outgoingTourSpain.name.sendKeys("Aliksandra Galstyan");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourSpain.phone.isDisplayed());
		Thread.sleep(2000);
		outgoingTourSpain.phone.click();
		outgoingTourSpain.phone.sendKeys("4404633690");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourSpain.email.isDisplayed());
		Thread.sleep(2000);
		outgoingTourSpain.email.click();
		outgoingTourSpain.email.sendKeys("Aliksandra.galstyan1@gmail.com");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourSpain.message.isDisplayed());
		Thread.sleep(2000);
		outgoingTourSpain.message.click();
		outgoingTourSpain.message.sendKeys("Hello");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourSpain.toOrder.isDisplayed());
		Thread.sleep(2000);
		outgoingTourSpain.toOrder.click();
		Thread.sleep(2000);
	}
	}
	
	


