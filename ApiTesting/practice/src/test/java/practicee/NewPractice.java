package practicee;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class NewPractice {
	
	@Test(enabled = true)
	public void areg() {
	
		System.out.println("first");
	}
	@Test(invocationCount = 10)
	public void breg() {
		System.out.println("second");
		
		}
	@Test
	public void creg() {
		System.out.println("third");
		}
	
	@Test
	public void dreg() {
		System.out.println("fourth");
		}
}


