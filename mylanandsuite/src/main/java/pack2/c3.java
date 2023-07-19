package pack2;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c3 {

	@Test(groups="Two")
	public void t3()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://www.google.com");
		
		Set<Cookie> s = ob.manage().getCookies();
		System.out.println("Number of cookies "+ s.size());
		ob.quit();
	}

}
