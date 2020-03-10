package ikoala;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Launch {
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
		
		Actions a=new Actions(driver);
		
		WebElement f3 = driver.findElement(By.xpath("//a[text()='Electronics, TVs & Computers']"));
		a.moveToElement(f3).perform();
		Thread.sleep(2000);
		
		WebElement f4 = driver.findElement(By.xpath("//a[text()='TVs']"));
		f4.click();
		Thread.sleep(2000);
		
		WebElement f5 = driver.findElement(By.xpath("//select[@name='order_by']"));
		
		Select s= new Select(f5);
		s.selectByVisibleText("Newest");
		Thread.sleep(2000);
		
		WebElement f6 = driver.findElement(By.xpath("//select[@name='product_per_page']"));
		
		Select s1=new Select(f6);
		s1.selectByValue("48");
		Thread.sleep(2000);
		
		WebElement f7 = driver.findElement(By.xpath("//div[contains(text(),'SONIQ 48')]"));
		f7.click();
		
		WebElement f8 = driver.findElement(By.xpath("//select[@name='attribute[15]']"));
		
		Select s2=new Select(f8);
		s2.selectByValue("2869");
		
		WebElement f9 = driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
		f9.click();
		
		WebElement f10 = driver.findElement(By.xpath("(//a[text()='Checkout'])[2]"));
		f10.click();
		
		WebElement f11 = driver.findElement(By.xpath("(//div[@class='col-xs-6'])[8]"));
		String text = f11.getText();
		System.out.println(text);
		
		
		
		
	}
	

}


