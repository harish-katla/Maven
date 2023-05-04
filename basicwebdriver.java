package UI;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class basicwebdriver {
	public static String browser = "firefox";
	public static WebDriver driver;
	// public static FirefoxDriver driver;

	public static void main(String[] args) {
		if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input")).click();
		List<WebElement> webelements = driver.findElements(By.xpath("//div[@class=\"inventory_list\"]/div"));
		System.out.println(webelements);
		
		driver.get("http://sugarcrm.com");
		String windowhandle = driver.getWindowHandle();
		System.out.println(windowhandle);
		driver.findElement(By.xpath("//*[@id=\"slide-6441094e84513\"]/div/div/div[1]/div/div/div[1]/div/a"));
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);
		
		//driver.navigate().to("http://www.google.com");
		//driver.quit();
		
		// driver.close();
	}

}
