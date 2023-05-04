package UI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.*;

public class PrintAllLink {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// System.setProperty("webdriver.chrome.driver","C:\\browsers\\chromedriver.exe");
		// System.setProperty("webdriver.chrome.driver","C:\\browsers\\geckodriver.exe");

		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		driver.findElements().ByTagName("a");
		System.out.println("tota tags are" + alltags.size());
		driver.close();
		// driver.quit();
	}

}
