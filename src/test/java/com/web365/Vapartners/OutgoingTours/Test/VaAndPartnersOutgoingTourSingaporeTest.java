package com.web365.Vapartners.OutgoingTours.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.VapartnersTourBaseTest;
import com.web365.vapartners.outgoing.tours.VaAndPartnersOutgoingTourSingapore;
import com.web365.vapartners.page.home.VaAndPartnersHomePage;

public class VaAndPartnersOutgoingTourSingaporeTest extends VapartnersTourBaseTest {
	
	@Test
	public void testVapartnersTour() throws InterruptedException {
		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
	    home = home.logoClick();
		Assert.assertTrue(home.outgoingTours.isDisplayed());

		VaAndPartnersOutgoingTourSingapore outgoingTourSingapore = home.goToOutgoingTourSingapore();
		Thread.sleep(3000);
		Assert.assertTrue(outgoingTourSingapore.outgoingToures.isDisplayed());
		Thread.sleep(3000);
		Assert.assertTrue(outgoingTourSingapore.moreButton.isDisplayed());
		Thread.sleep(3000);
		outgoingTourSingapore.moreButton.click();
		Thread.sleep(3000);
		Assert.assertTrue(outgoingTourSingapore.spainForm.isDisplayed());
		Thread.sleep(3000);
		outgoingTourSingapore.name.click();
		outgoingTourSingapore.name.sendKeys("Aliksandra Galstyan");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourSingapore.phone.isDisplayed());
		Thread.sleep(2000);
		outgoingTourSingapore.phone.click();
		outgoingTourSingapore.phone.sendKeys("4404633690");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourSingapore.email.isDisplayed());
		Thread.sleep(2000);
		outgoingTourSingapore.email.click();
		outgoingTourSingapore.email.sendKeys("Aliksandra.galstyan1@gmail.com");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourSingapore.message.isDisplayed());
		Thread.sleep(2000);
		outgoingTourSingapore.message.click();
		outgoingTourSingapore.message.sendKeys("Hello");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourSingapore.toOrder.isDisplayed());
		Thread.sleep(2000);
		outgoingTourSingapore.toOrder.click();
		Thread.sleep(2000);
}
}