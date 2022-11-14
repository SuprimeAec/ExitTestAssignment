package StepDefinitions;

import org.testng.Assert;

import Base.base;
import Pages.ContentPage;
import Utilities.ScreenShots;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ContentStep extends base {

	ContentPage obj7 = new ContentPage();
	
	
	@Given("^User click on Content$")
	public void user_click_on_Content() throws Throwable {
	    
		obj7.Content();
		logger.info("Click on Content");
	}

	@Given("^click on Assets$")
	public void click_on_Assets() throws Throwable {
	    
		obj7.Assets();
		logger.info("Click on Assets");
	}

	@Then("^Click on Read Assets$")
	public void click_on_Read_Assets() throws Throwable {

		obj7.ReadAssets();
		logger.info("Click on Read Assets");
		Assert.assertEquals(obj7.i,"Read Asset");
		
	}

}
