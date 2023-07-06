package com.ecg.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PO_Login {

	public WebDriver ldriver = null;
	
	public PO_Login(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	
	@FindBy(xpath = "//button[@type='button']")
	@CacheLookup
	WebElement btnlogin;
	
	@FindBy( xpath = "(//input[@id='signInFormUsername'])[1]")
	@CacheLookup
	WebElement textemail;
	
	@FindBy(xpath = "(//input[@id='signInFormPassword'])[1]")
	@CacheLookup
	WebElement textpassword;
	
	@FindBy(xpath = "(//input[@name='signInSubmitButton'])[1]")
	@CacheLookup
	WebElement btnloginsubmit;

	public void clickBtnlogin() {
		btnlogin.click();
	}

	public void setTextemail(String email) {
		textemail.sendKeys(email);
	}

	public void setTextpassword(String pwd) {
		textpassword.sendKeys(pwd);
	}

	public void clickBtnloginsubmit() {
		btnloginsubmit.click();
	}
	
	
}
