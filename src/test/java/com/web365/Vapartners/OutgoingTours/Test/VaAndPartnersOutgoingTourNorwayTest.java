package com.web365.Vapartners.OutgoingTours.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.VapartnersTourBaseTest;
import com.web365.vapartners.outgoing.tours.VaAndPartnersOutgoingTourNorway;
import com.web365.vapartners.page.home.VaAndPartnersHomePage;

public class VaAndPartnersOutgoingTourNorwayTest extends VapartnersTourBaseTest {

	@Test
	public void testVapartnersTours() throws InterruptedException {
		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
	    home = home.logoClick();
		Assert.assertTrue(home.outgoingTours.isDisplayed());
		
		VaAndPartnersOutgoingTourNorway outgoingTourNorway = home.goToOutgoingTourNorway(); 
		Thread.sleep(3000);
		Assert.assertTrue(outgoingTourNorway.outgoingToures.isDisplayed());
		Thread.sleep(3000);
		Assert.assertTrue(outgoingTourNorway.moreButton.isDisplayed());
		Thread.sleep(3000);
		outgoingTourNorway.moreButton.click();
		Thread.sleep(3000);
		Assert.assertTrue(outgoingTourNorway.name.isDisplayed());
		Thread.sleep(3000);
		outgoingTourNorway.name.click();
		outgoingTourNorway.name.sendKeys("Aliksandra Galstyan");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourNorway.phone.isDisplayed());
		Thread.sleep(2000);
		outgoingTourNorway.phone.click();
		outgoingTourNorway.phone.sendKeys("4404633690");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourNorway.email.isDisplayed());
		Thread.sleep(2000);
		outgoingTourNorway.email.click();
		outgoingTourNorway.email.sendKeys("Aliksandra.galstyan1@gmail.com");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourNorway.message.isDisplayed());
		Thread.sleep(2000);
		outgoingTourNorway.message.click();
		outgoingTourNorway.message.sendKeys("Hello");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourNorway.toOrder.isDisplayed());
		Thread.sleep(2000);
		outgoingTourNorway.toOrder.click();
		Thread.sleep(2000);
	}
	}
	
	
	
	

