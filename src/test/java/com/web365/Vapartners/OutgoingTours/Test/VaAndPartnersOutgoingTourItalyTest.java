package com.web365.Vapartners.OutgoingTours.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.VapartnersTourBaseTest;
import com.web365.vapartners.outgoing.tours.VaAndPartnersOutgoingTourItaly;
import com.web365.vapartners.page.home.VaAndPartnersHomePage;

public class VaAndPartnersOutgoingTourItalyTest extends VapartnersTourBaseTest {
	
	@Test
	public void testVapartnersTours()  throws InterruptedException {
		
		VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
	    home = home.logoClick();
		Assert.assertTrue(home.outgoingTours.isDisplayed());
		
		VaAndPartnersOutgoingTourItaly outgoingTourItaly = home.goToOutgoingTourItaly();	
		Thread.sleep(3000);
		Assert.assertTrue(outgoingTourItaly.italyOutgoingToures.isDisplayed());
		Thread.sleep(3000);
		Assert.assertTrue(outgoingTourItaly.moreButton.isDisplayed());
		Thread.sleep(3000);
		outgoingTourItaly.moreButton.click();
		Thread.sleep(3000);
		Assert.assertTrue(outgoingTourItaly.italiForm.isDisplayed());
		Thread.sleep(3000);
		outgoingTourItaly.name.click();
		outgoingTourItaly.name.sendKeys("Aliksandra Galstyan");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourItaly.phone.isDisplayed());
		Thread.sleep(2000);
		outgoingTourItaly.phone.click();
		outgoingTourItaly.phone.sendKeys("4404633690");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourItaly.email.isDisplayed());
		Thread.sleep(2000);
		outgoingTourItaly.email.click();
		outgoingTourItaly.email.sendKeys("Aliksandra.galstyan1@gmail.com");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourItaly.message.isDisplayed());
		Thread.sleep(2000);
		outgoingTourItaly.message.click();
		outgoingTourItaly.message.sendKeys("Hello");
		Thread.sleep(2000);
		Assert.assertTrue(outgoingTourItaly.toOrder.isDisplayed());
		Thread.sleep(2000);
		outgoingTourItaly.toOrder.click();
		Thread.sleep(2000);
}
}
