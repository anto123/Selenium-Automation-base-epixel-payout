package practicee;


import org.testng.annotations.Test;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.Select;


public class Durzzo {

	@Test(priority = 1)
	
		public void durz() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/home/eps46-epixel/chromedriver/chromedriver-linux64/chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://drz.epixel.link/es/register/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//li[@class='nav-item nav-language dropdown']")).click();
		driver.findElement(By.xpath("//a[text()='English']")).click();
		WebElement sponser=driver.findElement(By.xpath("//input[@id='id_sponsor']"));
		sponser.click();
		sponser.sendKeys("durzzo");
		
	//	driver.findElement(By.xpath("//input[@id='dont_know_any_sponsor']")).click();
		driver.findElement(By.id("id_first_name")).sendKeys("antony");
		driver.findElement(By.id("id_last_name")).sendKeys("lastname");
		
		
		driver.findElement(By.xpath("//span[@id='select2-id_country-container']")).click();
		driver.findElement(By.xpath("//li[text()='Mexico']")).click();
		Thread.sleep(3000);
		WebElement email=driver.findElement(By.xpath("//input[@id='id_email']"));
		email.sendKeys("abc123"+Integer.toString(new Random().nextInt(4000)+1)+"@gmail.com");
		WebElement conemail=driver.findElement(By.xpath("//input[@id='confirm_email']"));
		conemail.sendKeys(email.getAttribute("value"));
		String emailvalue=email.getAttribute("value");
		String conemailvalue=conemail.getAttribute("value");
		if(!emailvalue.equals(conemailvalue))
		{
			System.out.println("Confirmed email does not match. ");
		}
		
		WebElement phone=driver.findElement(By.xpath("//input[@id='id_phone_number']"));
		phone.sendKeys("2468147701");
		String number=phone.getAttribute("value");
		if(!(number.length()==10))
		{
			System.out.println("lease enter 10 digit Phone Number");
		}
		
	   WebElement pass=driver.findElement(By.id("id_password1"));
	   pass.sendKeys("As@12345");
	   String password=pass.getAttribute("value");
	   WebElement conpass=driver.findElement(By.xpath("//input[@id='id_password2']"));
	   conpass.sendKeys(pass.getAttribute("value"));
	   String conpassword=conpass.getAttribute("value");
	   
	   if(!password.equals(conpassword))
	   {
		  System.out.println("password are not same"); 
	   }
	
	   driver.findElement(By.xpath("//input[@id='agree-terms-conditions']")).click();
	   driver.findElement(By.xpath("//button[@id='addnew-member']")).click();
	   
	  //package page
	   JavascriptExecutor jsbill = (JavascriptExecutor) driver;
	   jsbill.executeScript("window.scrollBy(0,250)", "");
	   Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@value='Select Jewelry']")).click();
	  
	  //order
	  Thread.sleep(6500);
	  WebElement move=driver.findElement(By.xpath("//a[text()='Hillary Pruitt']"));
	  Actions action = new Actions(driver);
      action.moveToElement(move).click().perform();
      
      //add to cart
      Thread.sleep(4000);
      JavascriptExecutor cart = (JavascriptExecutor) driver;
	   jsbill.executeScript("window.scrollBy(0,250)", "");
	   
	   //WebDriverWait wait = new WebDriverWait(driver,10);
	  // wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.spinner01")));
	   System.out.println("sucessfull");
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//a[@data-sku='hillary-pruitt']//i")).click();
	   
	   Thread.sleep(3000);
	   driver.findElement(By.linkText("View Cart")).click();
	   
	   
	   //cart summary
	   JavascriptExecutor cartsummary = (JavascriptExecutor) driver;
	   jsbill.executeScript("window.scrollBy(0,250)", "");
	 driver.findElement(By.xpath("//div[@class='card-footer-actions']//input[@type='submit']")).click();
	   
	   
	   //delivery address
	   
	   driver.findElement(By.xpath("//input[@name='billing-customer_address_phone_number']")).sendKeys("6767763781");
	   driver.findElement(By.xpath("//input[@name='billing-customer_address_mail_id']")).sendKeys("abcgd@gmail.com");
	   driver.findElement(By.xpath("//input[@name='billing-customer_address_name_line']")).sendKeys("15");
	   driver.findElement(By.name("billing-customer_address_premise")).sendKeys("abhi");
	   driver.findElement(By.name("billing-customer_address_streets_in_between")).sendKeys("kani");
	   driver.findElement(By.name("billing-customer_address_references")).sendKeys("payur");
	   driver.findElement(By.name("billing-customer_address_locality")).sendKeys("email");
	   driver.findElement(By.name("billing-customer_address_postal_code")).sendKeys("67565");
	   driver.findElement(By.id("select2-id_billing-customer_address_state-container")).click();
	   driver.findElement(By.xpath("//li[text()='Campeche']")).click();
	   
	   //checkout
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@value='Proceed to Payment']")).click();
	   
	   //payment
	   driver.findElement(By.id("drz-payment-submit-default")).click();
	   
	  WebElement element= driver.findElement(By.xpath("//select[@id='id_status']"));
	   Select waitcon=new Select(element);
     	waitcon.selectByVisibleText("Confirmed");
	   
     	//confirm
     	driver.findElement(By.xpath("//button[text()='Submit']")).click();
	  
	}

}

