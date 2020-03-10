package test.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class XpathCombinations {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","I:\\Aravinsami\\sami codes\\MyProject\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.ikoala.com.au/");
	Thread.sleep(5000);
	driver.manage().window().maximize();
	WebElement f = driver.findElement(By.xpath("(//img//following-sibling::span)[1]"));
	f.click();
	
	WebElement f1 = driver.findElement(By.xpath("(//*[@name='email'])[3]"));
	f1.click();
	f1.sendKeys("aravindswaami@gmail.com");
	Thread.sleep(2000);
	
	WebElement f2 = driver.findElement(By.xpath("(//input[@name='password'and @type='password'])[3]"));
	f2.sendKeys("Aravind@123");
	Thread.sleep(2000);
	
	
	WebElement pass = driver.findElement(By.xpath("//input[@value='Login'or @type='sub']"));
	pass.click();
	
	WebElement f3 = driver.findElement(By.xpath("(//i//preceding-sibling::a)[1]"));
	
	Actions a= new Actions(driver);
	a.moveToElement(f3).perform();
	
	WebElement f4 = driver.findElement(By.xpath("//*[text()='Lamps']"));
	f4.click();
	
	WebElement f5 = driver.findElement(By.xpath("(//div//following-sibling::img)[7]"));
	f5.click();
	
	driver.navigate().back();
	
	WebElement f6 = driver.findElement(By.xpath("(//img//following-sibling::div)[6]"));
	f6.click();
	
	driver.navigate().back();
	
	WebElement f7 = driver.findElement(By.xpath("(//div//following-sibling::img)[17]"));
	f7.click();
	
	

}
}
