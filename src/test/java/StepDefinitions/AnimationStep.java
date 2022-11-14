package StepDefinitions;

import org.testng.Assert;

import Base.base;
import Pages.AnimationPage;
import Utilities.ScreenShots;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AnimationStep extends base {

	AnimationPage obj2 = new AnimationPage();
	
	
	@Given("^User click on Animation$")
	public void user_click_on_Animation() throws Throwable {
	    
		obj2.Animation();
		logger.info("Click on Animation");
	}

	@Given("^click on Events$")
	public void click_on_Events() throws Throwable {
	    
		obj2.Events();
		logger.info("Click on Events");

	}

	@Then("^click on the Play$")
	public void click_on_the_Play() throws Throwable {
	    
		obj2.CheckEvents();
		logger.info("Click on Play");
		Assert.assertEquals(obj2.j,"Animation");

	}

}
