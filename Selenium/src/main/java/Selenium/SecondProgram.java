package Selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondProgram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anjali\\Downloads\\chromedriver_win32_copy1\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement button = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		button.click();
		driver.findElement(By.linkText("Login & Signup")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@class='_2zrpKA']")).sendKeys("8939243130");
		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv']")).sendKeys("Sonianjali4");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		Thread.sleep(10000);
		String title = driver.getTitle();
		System.out.println(title);
		WebElement ele = driver.findElement(By.xpath("//input[@class='LM6RPg']"));
		ele.sendKeys("Shoes");
		ele.sendKeys(Keys.ENTER);
		//System.out.println("By.xpath(\"(//div[@class='_2LFGJH'])  -> " +By.xpath("(//div[@class='_2LFGJH']"));
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[3]/div/div[4]/div")).click();
		Set<String> allwin = driver.getWindowHandles();
		List<String> allopt=new ArrayList<String>();
		allopt.addAll(allwin);
		driver.switchTo().window(allopt.get(1));
		driver.findElement(By.xpath("//div[@class='_1mGkI4']")).click();
		driver.findElement(By.xpath("//span[text()='F2,Maruthi residency, 4th A...']")).click();
		if(retryingFindClick(By.xpath("//*[@id=\"swatch-1-size\"]/a"), driver)) {
			driver.findElement(By.xpath("(//li[@class='col col-6-12'])[1]")).click();
			driver.switchTo().window(allopt.get(0));	
		}

	}
	
	public static boolean retryingFindClick(By by, ChromeDriver driver) {
	    boolean result = false;
	    int attempts = 0;
	    while(attempts < 4) {
	        try {
	            driver.findElement(by).click();
	            result = true;
	            break;
	        } catch(StaleElementReferenceException e) {
	        }
	        attempts++;
	    }
	    return result;
	}

}
