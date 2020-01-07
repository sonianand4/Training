package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anjali\\Downloads\\chromedriver_win32_copy1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://etrain.info/");
		driver.findElement(By.xpath("//input[@id='tbsfi1']")).sendKeys("TAT");
		List<WebElement> options = driver.findElements(By.tagName("li"));
		for(WebElement op:options)
		{
			System.out.println(op);
			if(op.getText().equalsIgnoreCase("TATANAGAR JN"))
			{
				op.click();
			}
		}
		driver.findElement(By.xpath("//input[@id='tbsfi3']")).sendKeys("bila");
		List<WebElement> srcoptions = driver.findElements(By.tagName("li"));
		for(WebElement opt:srcoptions)
		{
			System.out.println(opt);
			if(opt.getText().equalsIgnoreCase("BILASPUR JN"))
			{
				opt.click();
			}
		}
	}

}
