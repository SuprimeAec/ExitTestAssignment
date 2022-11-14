package Pages;

import org.openqa.selenium.By;

import Base.base;

public class AnimationPage extends base{
	
	public String j;

	public  void Animation() throws InterruptedException
	{
		
		
		wd.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[2]")).click();
		Thread.sleep(2000);
	} 
	
		public void Events() throws InterruptedException
		{
			wd.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[6]")).click();

			Thread.sleep(2000);	
		}
		public void CheckEvents() throws InterruptedException
		{
			j=wd.findElement(By.id("com.touchboarder.android.api.demos:id/startButton")).getText();
	        Thread.sleep(2000);
			wd.findElement(By.id("com.touchboarder.android.api.demos:id/startButton")).click();
	        System.out.println(j);
		Thread.sleep(2000);
		}
	

}
