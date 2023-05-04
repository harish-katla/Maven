package UI;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.locators.RelativeLocator;
//import org.openqa.selenium.By.ByTagName;

public class Locators {
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

		// WebDriverManager.chromedriver().setup();
		// ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		// WebElement password = driver.findElement(By.id("password"));
		// driver.findElement(with(By.tagName("input")).above(password)).sendKeys("Shiv@Yadav");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input")).click();
		// driver.close();
	}

}
