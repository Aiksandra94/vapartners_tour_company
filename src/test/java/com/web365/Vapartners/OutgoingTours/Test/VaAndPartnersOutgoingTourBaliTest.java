package com.web365.Vapartners.OutgoingTours.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.VapartnersTourBaseTest;
import com.web365.vapartners.outgoing.tours.VaAndPartnersOutgoingTourBali;
import com.web365.vapartners.page.home.VaAndPartnersHomePage;

public class VaAndPartnersOutgoingTourBaliTest extends VapartnersTourBaseTest {
	
	@Test
	public void testVapartnersTour() throws InterruptedException {
		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
	    home = home.logoClick();
		Assert.assertTrue(home.outgoingTours.isDisplayed());
		
		VaAndPartnersOutgoingTourBali outgoingTourBali = home.goToOutgoingTourBali();
		Thread.sleep(3000);
		Assert.assertTrue(outgoingTourBali.outgoingToures.isDisplayed());
		Thread.sleep(3000);
		Assert.assertTrue(outgoingTourBali.moreButton.isDisplayed());
		Thread.sleep(3000);
		outgoingTourBali.moreButton.click();
		Thread.sleep(3000);
		Assert.assertTrue(outgoingTourBali.baliForm.isDisplayed());
		Thread.sleep(3000);
		outgoingTourBali.name.click();
		outgoingTourBali.name.sendKeys("Aliksandra Galstyan");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourBali.phone.isDisplayed());
		Thread.sleep(2000);
		outgoingTourBali.phone.click();
		outgoingTourBali.phone.sendKeys("4404633690");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourBali.email.isDisplayed());
		Thread.sleep(2000);
		outgoingTourBali.email.click();
		outgoingTourBali.email.sendKeys("Aliksandra.galstyan1@gmail.com");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourBali.message.isDisplayed());
		Thread.sleep(2000);
		outgoingTourBali.message.click();
		outgoingTourBali.message.sendKeys("Hello");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourBali.toOrder.isDisplayed());
		Thread.sleep(2000);
		outgoingTourBali.toOrder.click();
		Thread.sleep(2000);

}

}
