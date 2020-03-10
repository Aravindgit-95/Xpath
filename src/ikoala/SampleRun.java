package ikoala;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleRun {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","I:\\Aravinsami\\sami codes\\MyProject\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.ikoala.com.au/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		WebElement f = driver.findElement(By.xpath("//a[@href='https://www.ikoala.com.au/login']"));
		f.click();
		
		WebElement f1 = driver.findElement(By.xpath("(//input[@name='email'])[3]"));
		f1.click();
		f1.sendKeys("aravindswaami@gmail.com");
		Thread.sleep(2000);
		
		WebElement f2 = driver.findElement(By.xpath("(//input[@name='password'])[3]"));
		f2.sendKeys("Aravind@123");
		Thread.sleep(2000);
		
		
		WebElement pass = driver.findElement(By.xpath("//input[@value='Login']"));
		pass.click();
		
		WebElement f3 = driver.findElement(By.xpath("//img[@src='https://www.ikoala.com.au/img/general/DOTW.JPG']"));
		f3.click();
		
		WebElement f4 = driver.findElement(By.xpath("(//a[@rel='next'])[1]"));
		f4.click();
		
		WebElement f5 = driver.findElement(By.xpath("//div[contains(text(),'Microwave')]"));
		f5.click();
		
		WebElement f6 = driver.findElement(By.xpath("(//div[@class='logo'])[1]"));
		f6.click();
		
		WebElement f7 = driver.findElement(By.xpath("//input[@class='form-control ']"));
		f7.sendKeys("love");
		WebElement f8 = driver.findElement(By.xpath("//div[@class='input-group-addon btn  srchbtn']"));
		f8.click();
		f7.sendKeys("sports");
		f8.click();
		f7.sendKeys("fashion");
		f8.click();
		
		

}
}