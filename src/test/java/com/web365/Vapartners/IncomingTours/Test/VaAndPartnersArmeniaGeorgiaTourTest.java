package com.web365.Vapartners.IncomingTours.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.VapartnersTourBaseTest;
import com.web365.vapartners.incoming.tours.VaAndPartnersIncomingTourArmeniaGeorgia;
import com.web365.vapartners.page.home.VaAndPartnersHomePage;

public class VaAndPartnersArmeniaGeorgiaTourTest extends VapartnersTourBaseTest {
	
	
	@Test
	public void testVapartnersTours() throws InterruptedException {
	
	VaAndPartnersHomePage home = new VaAndPartnersHomePage(driver);
    home = home.logoClick();
	Assert.assertTrue(home.outgoingTours.isDisplayed());
	
	
	
	VaAndPartnersIncomingTourArmeniaGeorgia incomingTourArmeniaGeorgia = home.goToIncomingTourArmeniaGeorgia();
	Thread.sleep(3000);
	Assert.assertTrue(incomingTourArmeniaGeorgia.incomingTours.isDisplayed());
	Thread.sleep(3000);
	Assert.assertTrue(incomingTourArmeniaGeorgia.more.isDisplayed());
	Thread.sleep(3000);
	incomingTourArmeniaGeorgia.more.click();
	Thread.sleep(3000);
	Assert.assertTrue(incomingTourArmeniaGeorgia.name.isDisplayed());
	Thread.sleep(3000);
	incomingTourArmeniaGeorgia.name.click();
	incomingTourArmeniaGeorgia.name.sendKeys("Aliksandra Galstyan");
	Thread.sleep(2000);
	Assert.assertTrue(incomingTourArmeniaGeorgia.phone.isDisplayed());
	Thread.sleep(2000);
	incomingTourArmeniaGeorgia.phone.click();
	incomingTourArmeniaGeorgia.phone.sendKeys("4404633690");
	Thread.sleep(2000);
	Assert.assertTrue(incomingTourArmeniaGeorgia.email.isDisplayed());
	Thread.sleep(2000);
	incomingTourArmeniaGeorgia.email.click();
	incomingTourArmeniaGeorgia.email.sendKeys("Aliksandra.galstyan1@gmail.com");
	Thread.sleep(2000);
	Assert.assertTrue(incomingTourArmeniaGeorgia.message.isDisplayed());
	Thread.sleep(2000);
	incomingTourArmeniaGeorgia.message.click();
	incomingTourArmeniaGeorgia.message.sendKeys("Hello");
	Thread.sleep(2000);
	Assert.assertTrue(incomingTourArmeniaGeorgia.toOrder.isDisplayed());
	Thread.sleep(2000);
	incomingTourArmeniaGeorgia.toOrder.click();
	Thread.sleep(2000);

}
	
	
}
