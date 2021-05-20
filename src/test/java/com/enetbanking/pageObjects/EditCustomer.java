package com.enetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCustomer 
{
WebDriver ldriver;
	
	public EditCustomer(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@CacheLookup
	@FindBy(xpath="//a[contains(text(),'Edit Customer')]")
	WebElement lnkeditcustomer;
	
	@CacheLookup
	@FindBy(xpath="//input[@name='cusid']")
	WebElement accno;
	
	
	
	@CacheLookup
	@FindBy(xpath="//input[@name='AccSubmit']")
	WebElement AccSubmit;
	
	

	@CacheLookup
	@FindBy(xpath="//input[@name='sub']")
	WebElement editsubmit;
	
	
	
	
	public void editCustomerclick()
	{
		lnkeditcustomer.click();
	}
	public void accNo(String AccNo)
	{
		accno.clear();
		accno.sendKeys(AccNo);
	}
	public void editaccSubmit()
	{
		
		AccSubmit.click();
	}
	
	public void editSubmit()
	{
		editsubmit.click();
	}
	
	
}
