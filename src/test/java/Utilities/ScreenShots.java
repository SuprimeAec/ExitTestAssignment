package Utilities;

import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ScreenShots {

	//Method for the Screenshot Capturing
	public static void takeScreenShot(AppiumDriver<MobileElement> driver, String filename) {
		String  screenshotFileName = System.getProperty("user.dir")+"/Screenshots/"+ filename +".jpg";

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
		FileUtils.copyFile(scrFile, new File(screenshotFileName));
		} catch (IOException e) {
		e.printStackTrace();
		}

}
}