package pack1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c1 {
	
	@Test(groups="One")
	public void t1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver d= new ChromeDriver();
	    // visit the site 
	    d.get("https://www.letskodeit.com/practice");
	    //checkbox: multiple options can be selected at a time 
	    d.findElementById("bmwcheck").click();
	    Thread.sleep(2000);
	    d.findElementById("benzcheck").click();
	    Thread.sleep(2000);
	    d.findElementById("hondacheck").click();
	    Thread.sleep(2000);
	    d.quit();
	}

}
