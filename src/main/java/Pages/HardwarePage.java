package Pages;

import org.openqa.selenium.By;

import Base.base;

public class HardwarePage extends base{
	
	public String i;

	public void Hardware() throws InterruptedException
	{
		wd.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[6]")).click();
		Thread.sleep(2000);

	}
	public void Customer_IR() throws InterruptedException
	{
		wd.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView")).click();
		Thread.sleep(2000);
	}
	public void Carrier_Frequencies() throws InterruptedException
	{
		i=wd.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button[2]")).getText();
        Thread.sleep(2000);
		wd.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button[2]")).click();
		Thread.sleep(2000);
		System.out.println(i);
	}

}
