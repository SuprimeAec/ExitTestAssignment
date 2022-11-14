package Base;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class base {

	public static Logger logger;
	public static AppiumDriver<MobileElement> wd=null;
	public static AppiumDriverLocalService service;
	
	//Initializing the logger
	static {logger = Logger.getLogger("ExitTestAssignment");}
	
	public void Setup()  {
		
		//Setup DesiredCapabilities
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformVersion", "8.1");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", "com.touchboarder.android.api.demos");
		capabilities.setCapability("appActivity", "com.touchboarder.androidapidemos.MainActivity");
		capabilities.setCapability("deviceName", "Android");
		capabilities.setCapability("isHeadless", true);
		capabilities.setCapability("app", System.getProperty("user.dir") +"/Resources/API Demos for Android_1.9.0_Apkpure.apk");
		try {
			wd = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	//Close Driver
	public void DriverClose()
	{
		wd.quit();
	}
	
	//Permission Method
	public void Permissions() throws InterruptedException {
      
	  wd.findElement(By.id("com.touchboarder.android.api.demos:id/buttonDefaultPositive")).click();
      Thread.sleep(2000);
    }
	
	//ApiDemos Methods
	public void ApiDemos() throws InterruptedException
    {
        wd.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[2]")).click();
        Thread.sleep(2000);
    }
}
