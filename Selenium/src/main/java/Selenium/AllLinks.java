package Selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {

	public static List<String> allLinks(ChromeDriver driver)
	{
		List<WebElement> list=new ArrayList<WebElement>();
		list.addAll(driver.findElements(By.tagName("a")));
		list.addAll(driver.findElements(By.tagName("img")));
		//System.out.println(list);
//getting finallist of webelements having href
		List<String> finallist=new ArrayList<String>();
		for (WebElement li:list)
		{
			if(li.getAttribute("href")!= null)
			{
				finallist.add(li.getAttribute("href"));
				
				
			}
		}
		return finallist;
		
	}
	public static int linksWorking(URL url) throws IOException
	{
		
		HttpURLConnection connection =(HttpURLConnection) url.openConnection();
		 
		 try
		 
		 {
		 
		     connection.connect();
		 
		     int response = connection.getResponseCode();         
		 
		     connection.disconnect();
		 
		     return response;
		 
		 }
		 
		 catch(Exception exp)
		 
		 {
		 
		 return 0;
		 
		 } 
		 
	}

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anjali\\Downloads\\chromedriver_win32_copy1\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		List<String>  listOfUrls = allLinks(driver);
		List<String> badUrls=new ArrayList<String>();
		List<String> goodUrls=new ArrayList<String>();
		
		for (String url : listOfUrls) {
			int linkwork=linksWorking(new URL(url));	
			if(linkwork>=400)
			{
				badUrls.add(url);
				System.out.println(url);
				
				
			}
			else
			{
				goodUrls.add(url);
				System.out.println(url);
				
				
			}
			//System.out.println(url);
			//System.out.println(linkwork);
		}
		
		
	
		System.out.println(badUrls.size());
		System.out.println(goodUrls.size());
		
	}
	
	
	}

		
