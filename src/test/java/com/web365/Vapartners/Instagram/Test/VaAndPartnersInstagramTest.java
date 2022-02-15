package com.web365.Vapartners.Instagram.Test;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.base.VapartnersTourBaseTest;
import com.web365.vapartners.Instagram.page.VaAndPartnersInstagram;

public class VaAndPartnersInstagramTest extends VapartnersTourBaseTest {

	@Test
	public void VaAndPartnersInstagram() throws InterruptedException {
		
	VaAndPartnersInstagram instagramPage = new VaAndPartnersInstagram(driver);
	instagramPage.instagramPage.click();
	Assert.assertTrue(instagramPage.instagramPage.isDisplayed());
	Thread.sleep(5000);
	
	ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
    driver.switchTo().window(tabs2.get(1));
    Thread.sleep(5000);
    
    instagramPage.instagramSighUp.click();
    Thread.sleep(5000);
   
    
    instagramPage.mobileNumberOrEmail.click();
    instagramPage.mobileNumberOrEmail.sendKeys("4404633690");
    Thread.sleep(3000);
    instagramPage.fullName.click();
    instagramPage.fullName.sendKeys("Ruben Galstyan");
    Thread.sleep(3000);
    instagramPage.username.click();
    instagramPage.username.sendKeys("rubengalstyan1");
    Thread.sleep(3000);
    instagramPage.password.click();
    instagramPage.password.sendKeys("Dingog176");
    Thread.sleep(200000);
    
    
    
    
    
    
    
    
    
    
    
		
		
		
	}
}
