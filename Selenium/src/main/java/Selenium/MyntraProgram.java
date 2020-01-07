package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyntraProgram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions op= new ChromeOptions();
		op.setHeadless(true);
		//op.addArguments("--incognito");
		op.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","C:/Users/Anjali/Downloads/chromedriver_win32_copy1/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver(op);
		driver.get("https://www.myntra.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Thread.sleep(10);
		WebElement ele = driver.findElement(By.xpath("(//a[@class='desktop-main'])[4]"));
		Actions builder=new Actions(driver);
		builder.moveToElement(ele).perform();
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Beach Towels"))));
		//WebElement subele = driver.findElement(By.linkText("Beach Towels"));
		builder.moveToElement(driver.findElement(By.linkText("Beach Towels"))).click().perform();
		driver.close();
		

	}

}
