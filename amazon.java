package UI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon {
	public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver","C:\\browsers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
 
        //System.setProperty("webdriver.chrome.driver","C:\\browsers\\chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver","C:\\browsers\\geckodriver.exe");
        
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile");
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
        driver.close();
        //driver.quit();
	}

}
