package com.web365.Vapartners.OutgoingTours.Test;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.VapartnersTourBaseTest;
import com.web365.vapartners.outgoing.tours.VaAndPartnersOutgoingTourJordan;
import com.web365.vapartners.page.home.VaAndPartnersHomePage;

public class VaAndPartnersJordanTourTest extends VapartnersTourBaseTest {

	
	@Test
	public void testVapartnersTours() throws InterruptedException {
	    
		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
	    home = home.logoClick();
		Assert.assertTrue(home.outgoingTours.isDisplayed());

		VaAndPartnersOutgoingTourJordan outgoingTourJordan = home.goToOtgoingTourJordan();
		Thread.sleep(3000);
		Assert.assertTrue(outgoingTourJordan.outgoingToures.isDisplayed());
		Thread.sleep(3000);
		Assert.assertTrue(outgoingTourJordan.moreButton.isDisplayed());
		Thread.sleep(3000);
		outgoingTourJordan.moreButton.click();
		Thread.sleep(3000);
		Assert.assertTrue(outgoingTourJordan.name.isDisplayed());
		Thread.sleep(3000);
		outgoingTourJordan.name.click();
		outgoingTourJordan.name.sendKeys("Aliksandra Galstyan");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourJordan.phone.isDisplayed());
		Thread.sleep(2000);
		outgoingTourJordan.phone.click();
		outgoingTourJordan.phone.sendKeys("4404633690");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourJordan.email.isDisplayed());
		Thread.sleep(2000);
		outgoingTourJordan.email.click();
		outgoingTourJordan.email.sendKeys("Aliksandra.galstyan1@gmail.com");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourJordan.message.isDisplayed());
		Thread.sleep(2000);
		outgoingTourJordan.message.click();
		outgoingTourJordan.message.sendKeys("Hello");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourJordan.toOrder.isDisplayed());
		Thread.sleep(2000);
		outgoingTourJordan.toOrder.click();
		Thread.sleep(2000);
}
}
