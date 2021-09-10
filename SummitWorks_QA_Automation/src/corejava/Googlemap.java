package corejava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlemap {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/maps/@29.9302912,-95.7612032,15z");
				Thread.sleep(3000);
		        driver.findElement(By.id("searchboxinput")).sendKeys("Kora");		
		        Thread.sleep(3000);
		        List<WebElement> autoSuggestions=driver.findElement(By.className("sbsb_b")).findElements(By.tagName("li"));
		        System.out.println(autoSuggestions);
		        for (WebElement suggestions : autoSuggestions) {
		            if (suggestions.getText().contains("Koramangala Police Station")) {
		                suggestions.click();
		                Thread.sleep(3000);
		               
		            }
		        }
		        
	}

}
