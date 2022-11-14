package Hook;


import Base.base;
import Utilities.ScreenShots;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends base {
	
	
	//Starting the Driver
	@Before
	public void StartServer() throws InterruptedException  {
		
		Setup();
		Permissions();
		ApiDemos();
	}
	
	//Closing the Driver
	@After(order=0)
	public void StopServer()
	{
		DriverClose();
	}
	
	//Capturing the screenshots
	@After(order=1)
	public void Screenshot(Scenario scenario)
	{
		ScreenShots ob = new ScreenShots();
		if(scenario.isFailed()) {
			
			ob.takeScreenShot(wd,scenario.getName());
		}
	}
	
}
