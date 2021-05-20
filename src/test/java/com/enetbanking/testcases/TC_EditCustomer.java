package com.enetbanking.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.enetbanking.pageObjects.AddCustomerPage;
import com.enetbanking.pageObjects.EditCustomer;
import com.enetbanking.pageObjects.LoginPage;

public class TC_EditCustomer  extends BaseClass {
	
	@Test
	public void editcustomer() throws InterruptedException, IOException
	{
	LoginPage lp=new LoginPage(driver);
	lp.setUserName(username);
	logger.info("User name is provided");
	lp.setPassword(password);
	logger.info("Passsword is provided");
	lp.clickSubmit();
	
	Thread.sleep(3000);
	
	EditCustomer edt= new EditCustomer(driver);
	
	edt.editCustomerclick();
	edt.accNo("77521");
	edt.editaccSubmit();
	
	AddCustomerPage addcust=new AddCustomerPage(driver);
	
	boolean editcust= driver.getPageSource().contains("Edit Customer");
	
	if(editcust==true)
	{
		Assert.assertTrue(true);
		
		
		addcust.custaddress("America");
		addcust.custcity("Texas");
		addcust.custstate("WallStreet");
		addcust.custpinno("500890");
		addcust.custtelephoneno("6229981867");
		edt.editSubmit();
		
		boolean succedit=driver.getPageSource().contains("Customer details updated Successfully!!!");
		if(succedit==true)
		{
		logger.info("Successfully edited");
		logger.info("test case passed....");
		
		}
		else
		{
			logger.info("test case failed....");
			captureScreen(driver,"EditCustomer");
		}	
		
	}
	else
	{
		logger.info("test case failed....");
		captureScreen(driver,"EditCustomer");
		Assert.assertTrue(false);
	
	}
}
}