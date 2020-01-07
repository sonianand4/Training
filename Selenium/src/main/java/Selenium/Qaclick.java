package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Qaclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Anjali\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input[id='checkBoxOption2']")).click();
		String text = driver.findElement(By.id("checkBoxOption2")).getAttribute("value");
		WebElement dropdownElement = driver.findElement(By.id("dropdown-class-example"));
		Select src = new Select(dropdownElement);
		src.selectByValue(text);
		WebElement alertBox = driver.findElement(By.id("name"));
		alertBox.click();
		alertBox.sendKeys(text);
		

	}

}  
