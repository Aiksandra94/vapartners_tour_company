package com.web365.vapartners.page.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class VaAndPartnersBasePage {
	
	protected WebDriver driver;
	
	public VaAndPartnersBasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

}
