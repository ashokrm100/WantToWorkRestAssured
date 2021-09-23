import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {
	static
	{
		System.setProperty("webdriver.chrome.driver","E://CHROMEDRIVER//chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","E://FIREFOX//geckodriver.exe");
		}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.out.println("Enter the Username:\t");
		//Scanner sc = new Scanner (System.in);
		//String name = sc.nextLine();
		//System.out.println("Enter the Password:\t");
		//String pwd = sc.nextLine();
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin/signinchooser?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("ashokrm100@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.='Next']")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.id("btnLogin")).click();
		
		
		

	}

}
