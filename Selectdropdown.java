package UI;

import org.openqa.selenium.By;
import java.util.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Selectdropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// System.setProperty("webdriver.chrome.driver","C:\\browsers\\chromedriver.exe");
		// System.setProperty("webdriver.chrome.driver","C:\\browsers\\geckodriver.exe");

		driver.get("https://www.seleniumeasy.com/");
		driver.manage().window().maximize();
		WebElement ddown = driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[11]/a/span"));
		Select select = new Select(ddown);
		
		select.selectByValue("firstleaf");
		select.selectByIndex(2);
		List<WebElement> allItems = select.getAllSelectedOptions();
		System.out.println(allItems.size());
		select.deselectAll();
		

		//select.selectByValue("level1");

		//select.selectByVisibleText(null);
		//select.selectByIndex(5);

	}

}
