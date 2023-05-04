package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resize {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/slider//");
		driver.manage().window().maximize();

		WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(frame);

		WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		

		Actions action = new Actions(driver);
		action.dragAndDropBy(slider, 100, 125).perform();
//		For re-sizable
//		driver.get("https://jqueryui.com/resizable/");
//		driver.manage().window().maximize();
//		
//		WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
//		driver.switchTo().frame(frame);
//		
//		WebElement element = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
//
//		
//		Actions action = new Actions(driver);
//		action.dragAndDropBy(element, 220, 50).perform();

	}

}
