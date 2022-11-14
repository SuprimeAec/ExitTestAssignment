package StepDefinitions;

import org.testng.Assert;

import Base.base;
import Pages.AppPage;
import Utilities.ScreenShots;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AppStep extends base {
	
	AppPage obj3 = new AppPage();
	

	@Given("^User click on App$")
	public void user_click_on_App() throws Throwable {
	    
		obj3.App();
		logger.info("Click on App");

	}

	@Given("^click on Acitivity$")
	public void click_on_Acitivity() throws Throwable {
	    
		obj3.Acitivity();
		logger.info("Click on Activity");

	}

	@Given("^click on the Animation$")
	public void click_on_the_Animation() throws Throwable {
	    
		obj3.Animation();
		logger.info("Click on Animation");

	}

	@Then("^Click on Zoom in$")
	public void click_on_Zoom_in() throws Throwable {
	    
		obj3.Zoom_In();
		logger.info("Click on Zoom In");
		Assert.assertEquals(obj3.i,"ZOOM IN");

		
	}
	
}
