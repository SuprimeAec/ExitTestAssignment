package StepDefinitions;

import org.testng.Assert;

import Base.base;
import Pages.MediaPage;
import Utilities.ScreenShots;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MediaStep extends base{

	MediaPage obj6 = new MediaPage();
	
	@Given("^User click on Media$")
	public void user_click_on_Media() throws Throwable {
	    
		obj6.Media();
		logger.info("Click on Media");
	}

	@Given("^click on the MediaPlayer$")
	public void click_on_the_MediaPlayer() throws Throwable {
	    
		obj6.MediaPlayer();
		logger.info("Click on MediaPlayer");
	}

	@Then("^Click on Play Video$")
	public void click_on_Play_Video() throws Throwable {

		obj6.PlayVideo();
		logger.info("Click on Play Video");
		Assert.assertEquals(obj6.i,"PLAY VIDEO FROM LOCAL FILE");
		
	}

}
