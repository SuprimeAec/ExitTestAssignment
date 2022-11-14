package StepDefinitions;

import org.testng.Assert;

import Base.base;
import Pages.GraphicsPage;
import Utilities.ScreenShots;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class GraphicsStep extends base {
	

	GraphicsPage obj4 = new GraphicsPage();
	
	@Given("^User click on Graphics$")
	public void user_click_on_Graphics() throws Throwable {
	    
		obj4.Graphics();
		logger.info("Click on Graphics");
	}

	@Then("^Click on AnimateDrawables$")
	public void click_on_AnimateDrawables() throws Throwable {
	    
		obj4.AnimateDrawables();
		logger.info("Click on AnimateDrawables");
		Assert.assertEquals(obj4.i,"AnimateDrawables");
		
		
	}
	
}
