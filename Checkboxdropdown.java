package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboxdropdown {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		WebElement radio = driver.findElement(By.id("d0i0"));
		Actions actions = new Actions(driver);
		actions.moveToElement(radio);
		actions.perform();
		driver.findElement(By.name("interest")).click();
		driver.findElement(By.name("interest")).isSelected();
		Thread.sleep(2000);

	}

}
