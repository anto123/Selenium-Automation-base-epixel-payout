package basicpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class projectbasic {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/eps46-epixel/chromedriver/chromedriver-linux64/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://userguide.epixelcommerce.com/en/admin-login/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.id("id_user_consent_submit")).click();
		Thread.sleep(1000);
		//driver.findElement(By.name("username")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("userguide-business-admin");
		driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys("Bu@Admin123");
		//driver.findElement(By.id("id_username")).sendKeys("antony");
		//driver.get("https://mwr.epixel.link/en/admin-login/");
		//driver.findElement(By.id("id_username")).sendKeys("antony");
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Administration']//span")).click();
		System.out.println("success");
		driver.findElement(By.xpath("//span[text()='Manage Members']")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//span[text()='Manage members']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@data-toggle='dropdown'])[3]")).click();
	    Thread.sleep(1500);
		WebElement web=driver.findElement(By.xpath("//select[@id='is-eligible']"));
		
	   Select drop=new Select(web);
		drop.selectByVisibleText("Active");

	}

}
///home/eps46-epixel/chromedriver/chromedriver-linux64/chromedriver.exe