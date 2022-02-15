package com.web365.vapartners.page.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class VaAndPartnersBasePage {
	
	protected WebDriver driver;
	
	public VaAndPartnersBasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	public void moveToElement(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).click();
		action.build().perform();
	}

}
