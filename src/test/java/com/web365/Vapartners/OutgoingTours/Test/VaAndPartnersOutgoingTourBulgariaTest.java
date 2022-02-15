package com.web365.Vapartners.OutgoingTours.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.VapartnersTourBaseTest;
import com.web365.vapartners.outgoing.tours.VaAndPartnersOutgoingTourBulgaria;
import com.web365.vapartners.page.home.VaAndPartnersHomePage;

public class VaAndPartnersOutgoingTourBulgariaTest extends VapartnersTourBaseTest {

	@Test
	public void testVapartnersTours()  throws InterruptedException {
		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
	    home = home.logoClick();
		Assert.assertTrue(home.outgoingTours.isDisplayed());
		
		VaAndPartnersOutgoingTourBulgaria outgoingTourBulgaria = home.goToOutgoingTourBulgaria();
		Assert.assertTrue(outgoingTourBulgaria.outgoingToures.isDisplayed());
		Thread.sleep(3000);
		Assert.assertTrue(outgoingTourBulgaria.moreButton.isDisplayed());
		Thread.sleep(3000);
		outgoingTourBulgaria.moreButton.click();
		Thread.sleep(3000);
		Assert.assertTrue(outgoingTourBulgaria.bulgariaForm.isDisplayed());
		Thread.sleep(3000);
		outgoingTourBulgaria.name.click();
		outgoingTourBulgaria.name.sendKeys("Aliksandra Galstyan");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourBulgaria.phone.isDisplayed());
		Thread.sleep(2000);
		outgoingTourBulgaria.phone.click();
		outgoingTourBulgaria.phone.sendKeys("4404633690");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourBulgaria.email.isDisplayed());
		Thread.sleep(2000);
		outgoingTourBulgaria.email.click();
		outgoingTourBulgaria.email.sendKeys("Aliksandra.galstyan1@gmail.com");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourBulgaria.message.isDisplayed());
		Thread.sleep(2000);
		outgoingTourBulgaria.message.click();
		outgoingTourBulgaria.message.sendKeys("Hello");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourBulgaria.toOrder.isDisplayed());
		Thread.sleep(2000);
		outgoingTourBulgaria.toOrder.click();
		Thread.sleep(2000);
	}
}
