package UI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutomation {
	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\browsers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
 
        //System.setProperty("webdriver.chrome.driver","C:\\browsers\\chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver","C:\\browsers\\geckodriver.exe");
        
        driver.get("http://www.ebay.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("mobile");
        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).click();
        driver.close();
        //driver.quit();
	}

}
