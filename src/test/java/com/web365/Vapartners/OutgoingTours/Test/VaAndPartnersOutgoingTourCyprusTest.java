package com.web365.Vapartners.OutgoingTours.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.VapartnersTourBaseTest;
import com.web365.vapartners.outgoing.tours.VaAndPartnersOutgoingTourCyprus;
import com.web365.vapartners.page.home.VaAndPartnersHomePage;

public class VaAndPartnersOutgoingTourCyprusTest extends VapartnersTourBaseTest  {
	
	@Test
	public void testVapartnersTours()  throws InterruptedException {
		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
	    home = home.logoClick();
		Assert.assertTrue(home.outgoingTours.isDisplayed());
		
		VaAndPartnersOutgoingTourCyprus outgoingTourCyprus = home.goToOutgoingTourCyprus();	
		Thread.sleep(3000);
		Assert.assertTrue(outgoingTourCyprus.outgoingToures.isDisplayed());
		Thread.sleep(3000);
		Assert.assertTrue(outgoingTourCyprus.moreButton.isDisplayed());
		Thread.sleep(3000);
		outgoingTourCyprus.moreButton.click();
		Thread.sleep(3000);
		Assert.assertTrue(outgoingTourCyprus.cyprusForm.isDisplayed());
		Thread.sleep(3000);
		outgoingTourCyprus.name.click();
		outgoingTourCyprus.name.sendKeys("Aliksandra Galstyan");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourCyprus.phone.isDisplayed());
		Thread.sleep(2000);
		outgoingTourCyprus.phone.click();
		outgoingTourCyprus.phone.sendKeys("4404633690");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourCyprus.email.isDisplayed());
		Thread.sleep(2000);
		outgoingTourCyprus.email.click();
		outgoingTourCyprus.email.sendKeys("Aliksandra.galstyan1@gmail.com");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourCyprus.message.isDisplayed());
		Thread.sleep(2000);
		outgoingTourCyprus.message.click();
		outgoingTourCyprus.message.sendKeys("Hello");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourCyprus.toOrder.isDisplayed());
		Thread.sleep(2000);
		outgoingTourCyprus.toOrder.click();
		Thread.sleep(2000);
	}

}
