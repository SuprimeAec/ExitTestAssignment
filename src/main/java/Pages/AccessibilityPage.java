package Pages;

import org.openqa.selenium.By;

import Base.base;

public class AccessibilityPage extends base { 
	
		public String i;
		
		//Assesscibility method
	    public void Assescibility() throws InterruptedException {

	        wd.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[1]\r\n"
	                + "")).click();
	        Thread.sleep(2000);
	        
	    }
	    
	    //Customveiw method 
	    public void CustomView() throws InterruptedException
	    {
	    	i=wd.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[3]")).getText();
	    	//Thread.sleep(2000);
	    	wd.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[3]")).click();
	        Thread.sleep(2000);
	        System.out.println();
	        System.out.println(i);

	        
	    }
}
