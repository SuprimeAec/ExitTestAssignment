package StepDefinitions;

import org.testng.Assert;

import Base.base;
import Pages.HardwarePage;
import Utilities.ScreenShots;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HardwareStep extends base{

	HardwarePage obj5 = new HardwarePage();
	
	
	@Given("^User click on Hardware$")
	public void user_click_on_Hardware() throws Throwable {

		obj5.Hardware();
		logger.info("Click on Hardware");
	}

	@Given("^click on Customer_IR$")
	public void click_on_Customer_IR() throws Throwable {
	    
		obj5.Customer_IR();
		logger.info("Click on Customer IR");
	}

	@Then("^Click on Carrier_frequencies$")
	public void click_on_Carrier_frequencies() throws Throwable {
	    
		obj5.Carrier_Frequencies();
		logger.info("Click on Frequencies");
		Assert.assertEquals(obj5.i,"GET CARRIER FREQUENCIES");
		
	}
}
