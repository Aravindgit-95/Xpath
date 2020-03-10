package ikoala;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	static WebDriver driver;
	
	public static void launch() {
		
		System.setProperty("webdriver.chrome.driver","I:\\Aravinsami\\sami codes\\MyProject\\driver\\chromedriver.exe");
		driver= new ChromeDriver();

	}
	
	public static void enter(WebElement e,String s) {
		
		e.sendKeys(s);
		
	}
	
	public static void click(WebElement e) {
		e.click();
	}
	
	
	
	

}
