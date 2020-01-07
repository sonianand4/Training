package Selenium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyShoppingList {
	public static WebDriver driver;
	public static ChromeOptions op;
	public static WebElement sortBy;

	public static WebDriver initiateBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Anjali\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		op = new ChromeOptions();
		op.setExperimentalOption("prefs", prefs);
		driver = new ChromeDriver(op);
		// op.addArguments("--disable-notifications");
		driver.get("https://www.myntra.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}

	public static void searchProducts() {
		WebElement searchBox = driver.findElement(By.className("desktop-query"));
		WebElement inputElement = searchBox.findElement(By.tagName("input"));
		inputElement.click();
		inputElement.sendKeys("jeans for women");
		inputElement.sendKeys(Keys.ENTER);
	}

	public static void filterSortBy() {
		sortBy = driver.findElement(By.className("sort-sortBy"));
		Actions action = new Actions(driver);
		action.moveToElement(sortBy).perform();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		WebElement ulTag = sortBy.findElement(By.tagName("ul"));
		List<WebElement> liTags = ulTag.findElements(By.tagName("li"));
		for (WebElement eachLiTag : liTags) {
			WebElement labelTag = eachLiTag.findElement(By.tagName("label"));
			WebElement inputTag = labelTag.findElement(By.tagName("input"));
			String text = inputTag.getAttribute("value");
			if (text.equalsIgnoreCase("price_desc")) {
				// action.moveToElement(eachLiTag).perform();
				eachLiTag.click();
				driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
			}
		}

	}

	public static void addHighestPriceItem() {
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
		WebElement products = driver.findElement(By.className("results-base"));
		List<WebElement> liTags = products.findElements(By.tagName("li"));
		WebElement firstProd = liTags.get(0).findElement(By.tagName("a"));
		WebElement productContainer = firstProd.findElement(By.className("product-imageSliderContainer"));
		productContainer.click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> allwin=new ArrayList<String>();
		allwin.addAll(windowHandles);
		driver.switchTo().window(allwin.get(1));
		WebElement sizeContainer = driver.findElement(By.className("size-buttons-size-buttons"));
		List<WebElement> divTags = sizeContainer.findElements(By.tagName("div"));
		WebElement lowestSize = divTags.get(0);
		WebElement innerLowest = lowestSize.findElement(By.tagName("div"));
		innerLowest.click();
	}

	public static void main(String[] args) {
		initiateBrowser();
		searchProducts();
		filterSortBy();
		addHighestPriceItem();
	}

}
