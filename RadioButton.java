package UI;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.*;
//import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.singaporeair.com/en_UK/au/home#/book/bookflight");
		driver.manage().window().maximize();
		
		//WebElement radio2 = driver.findElement(By.id("redeemFlights"));
		//radio2.click();
		WebElement radio1 = driver.findElement(By.xpath("//*[@name='book-flight-radio']"));
		radio1.click();
		System.out.println(radio1.isSelected());
		//System.out.println(radio2.isSelected());

		driver.close();

	}

}
