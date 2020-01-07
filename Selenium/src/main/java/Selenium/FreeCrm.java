package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FreeCrm {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjali\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.freecrm.com/contacts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sonianand4@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Sonianjali4");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		driver.findElement(By.xpath("//span[text()='Contacts']")).click();
		// //*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[2]
		// //*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[2]/td[2]
		String before_xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[";
		String after_xpath="]/td[2]";
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//for(int i=1;i<=3;i++) {
			//String name = driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
			
			//System.out.println(name);
		//}
		driver.findElement(By.xpath("//td[text()='test a b']/preceding-sibling::td/div")).click();
		
	}

}
