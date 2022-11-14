package Pages;

import org.openqa.selenium.By;

import Base.base;

public class AppPage extends base {
	
	public String i;

	public void App() throws InterruptedException
	{
		wd.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[3]\r\n"
				+ "")).click();
		Thread.sleep(2000);

	}
	public void Acitivity() throws InterruptedException
	{
		wd.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[2]\r\n"
				+ "")).click();
		Thread.sleep(2000);
	}
	public void Animation() throws InterruptedException
	{
		wd.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[1]")).click();
		Thread.sleep(2000);
	}

	public void Zoom_In() throws InterruptedException {
		
		i=wd.findElement(By.id("com.touchboarder.android.api.demos:id/zoom_animation")).getText();
        //Thread.sleep(2000);
		wd.findElement(By.id("com.touchboarder.android.api.demos:id/zoom_animation")).click();
		Thread.sleep(2000);
		//System.out.println(i);
		

	}

}
