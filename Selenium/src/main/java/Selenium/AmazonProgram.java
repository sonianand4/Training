package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anjali\\Downloads\\chromedriver_win32_copy1\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Hello, Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("sonianand12345@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Sonianjali");
		driver.findElement(By.id("signInSubmit")).click();
		WebElement ele = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		ele.sendKeys("TV");
		ele.sendKeys(Keys.DOWN);
		ele.sendKeys(Keys.ENTER);
		
		
	}

}
