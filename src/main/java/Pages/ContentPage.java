package Pages;

import org.openqa.selenium.By;

import Base.base;

public class ContentPage extends base {
	
	public String i;

	public void Content() throws InterruptedException
	{
		wd.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[4]")).click();
		Thread.sleep(2000);

	}
	public void Assets() throws InterruptedException
	{
		wd.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[1]\r\n"
				+ "")).click();
		Thread.sleep(2000);
	}
	public void ReadAssets() throws InterruptedException
	{
		i=wd.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView\r\n"
				+ "")).getText();
        Thread.sleep(2000);
		wd.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView\r\n"
				+ "")).click();
		Thread.sleep(2000);
		System.out.println(i);
	}

}
