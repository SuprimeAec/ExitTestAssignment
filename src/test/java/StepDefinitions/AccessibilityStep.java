package StepDefinitions;




import org.testng.Assert;
import org.testng.annotations.Test;

import Base.base;
import Pages.AccessibilityPage;
import Utilities.ScreenShots;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;



public class AccessibilityStep extends base {


   AccessibilityPage obj2=new AccessibilityPage();
   

    
   @Given("^User click on Accessiblity$")
   public void user_click_on_Accessiblity() throws Throwable {

	   obj2.Assescibility();
	   logger.info("Click on Accessibility");
   }
   
   @Then("^Verify user is able to click on CustomViewer$")
   public void verify_user_is_able_to_click_on_CustomViewer() throws Throwable {

	   obj2.CustomView();
	   logger.info("Click on Custom View");
	   Assert.assertEquals(obj2.i,"Custom Views");

	   
   }

}