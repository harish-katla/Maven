package UI;

import org.openqa.selenium.By;

import java.util.Iterator;
import java.util.Set;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.*;
//import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindows {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/au/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[1]/section/div[1]/article/div[2]/div/pbc-button[1]"))
				.click();
		Thread.sleep(4000);
		Set<String> windowhandles = driver.getWindowHandles();
		Iterator<String> iterator = windowhandles.iterator();
		String parentwindow = iterator.next();
		System.out.println(parentwindow);
		String childwindow = iterator.next();
		System.out.println(childwindow);

		driver.switchTo().window(childwindow);
		System.out.println(windowhandles);
		driver.findElement(By.name("UserFirstName")).sendKeys("Harish");
		driver.findElement(By.name("UserLastName")).sendKeys("K");
		driver.switchTo().window(parentwindow);
		
	}

}
