package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anjali\\Downloads\\chromedriver_win32_copy1\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='aajZCb']")));
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class=\"aajZCb\"]"));
		
		for(int i=0;i<list.size();i++)
		{
			List<WebElement> findElement = list.get(i).findElements(By.tagName("li"));
			for (WebElement webElement : findElement) {
				if(webElement.getText().equalsIgnoreCase("selenium interview questions")) {
					webElement.click();
				}
			}
			
		}

	}

}
