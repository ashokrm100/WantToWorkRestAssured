import java.awt.Window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;

public class NewTab {

	static
	{
		System.setProperty("webdriver.chrome.driver", "E://CHROMEDRIVER//chromedriver.exe");
	}
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		//driver.switchTo().(WindowType.TAB);
		
	}
}
