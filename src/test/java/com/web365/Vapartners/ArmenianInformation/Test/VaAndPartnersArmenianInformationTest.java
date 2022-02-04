package com.web365.Vapartners.ArmenianInformation.Test;

import java.awt.Desktop.Action;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.web365.base.VapartnersTourBaseTest;
import com.web365.vapartners.Armenian.Information.VaAndPartnersGeneralInformation;
import com.web365.vapartners.outgoing.tours.VaAndPartnersOutgoingTourGeorgia;

public class VaAndPartnersArmenianInformationTest extends VapartnersTourBaseTest {
	
	Actions actions = new Actions(driver);
	WebElement armenia = driver.findElement(By.xpath("//a[text() ='Armenia']"));
	action.moveToElement(armenia).perform();
	armenia.click();
	
	

	
	

}
