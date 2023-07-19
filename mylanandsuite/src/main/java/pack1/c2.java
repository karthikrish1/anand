package pack1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c2 {

	@Test(groups="One")
	public void t2() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver d= new ChromeDriver();
	    d.get("http://www.seleniumeasy.com");
	    
	    //method1: page down, page up
	    
	    /*d.executeScript("window.scrollBy(0,document.body.scrollHeight)"); //page down
	    Thread.sleep(3000);
	    d.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	    Thread.sleep(3000);*/
	    
	    d.executeScript("window.scrollBy(0,1000)"); //scroll down
	    Thread.sleep(3000);
	    d.executeScript("window.scrollBy(0,-1000)");
	    File f = d.getScreenshotAs(OutputType.FILE);
	    
	    //fileutils:  apache dir stdio 
	    FileUtils.copyFile(f, new File("C:\\Users\\hp\\eclipse-workspace\\mylanandsuite\\src\\main\\java\\pack1\\m.png"));
	    Thread.sleep(3000);
	    d.quit();
	}

}
