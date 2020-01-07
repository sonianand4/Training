/**
 * 
 */
package Selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Anjali
 *
 */
public class FirstProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anjali\\Downloads\\chromedriver_win32_copy1\\chromedriver.exe");
		
List<String> allwin=new ArrayList<String>();
allwin.add("https://www.google.com");
allwin.add("https://www.makemytrip.com");
allwin.add("https://www.cleartrip.com");

for(String eachSite : allwin) {
	ChromeDriver driver= new ChromeDriver();
	driver.get(eachSite);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
}
//driver.close();

	}

}
