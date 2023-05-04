package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// System.setProperty("webdriver.chrome.driver","C:\\browsers\\chromedriver.exe");
		// System.setProperty("webdriver.chrome.driver","C:\\browsers\\geckodriver.exe");

		driver.get("http://www.ebay.com");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));

		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}

}
