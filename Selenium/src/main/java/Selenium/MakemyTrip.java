package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakemyTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Anjali\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		// WebDriverWait wait=new WebDriverWait(driver,20);
		// wait.until(ExpectedConditions.visibilityOf(By.id("fromCity")));
		WebElement fromcity = driver.findElement(By.id("fromCity"));
		fromcity.click();
		WebElement autoComplete = driver.findElement(By.className("hsw_autocomplePopup"));
		autoComplete.findElement(By.tagName("input")).sendKeys("ban");
		Thread.sleep(6000);
		autoComplete.findElement(By.tagName("input")).sendKeys(Keys.ARROW_DOWN);
		autoComplete.findElement(By.tagName("input")).sendKeys(Keys.ENTER);
		WebElement tocity = driver.findElement(By.id("toCity"));
		tocity.click();
		WebElement autosuggestion = driver.findElement(By.className("hsw_autocomplePopup"));
		autosuggestion.findElement(By.tagName("input")).sendKeys("che");
		Thread.sleep(3000);
		autosuggestion.findElement(By.tagName("input")).sendKeys(Keys.ARROW_DOWN);
		autosuggestion.findElement(By.tagName("input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//span[@class=\"lbl_input latoBold appendBottom10\"][1]")).click();
		for (int i = 0; i < 13; i++) {
			driver.findElement(By.className("DayPicker-NavButton DayPicker-NavButton--next")).click();
			if (i == 3)
				break;

		}

	}

}
