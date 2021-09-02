package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TtdRadio {

	private static final int TimeUnit = 0;

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://tirupatibalaji.ap.gov.in/#/registration");
		
		Thread.sleep(2000);
		//driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@type = 'radio'])[2]")).click();
		driver.findElement(By.id("regi_continue")).click();
		driver.findElement(By.xpath("//*[@id=\"ErrorMessagePopUp\"]/div[1]/div/div/div[2]/button")).click();
		System.out.println(
				driver.findElement(By.xpath("//*[@id=\"container\"]/div[4]/div/div[1]/form/div[6]")).getText());
		driver.navigate().refresh();
		//Error with Explicit wait--Expected condition failed: waiting for visibility of element located by By.xpath: //input[@id='entity'] 
		//(tried for 20 second(s) with 500 milliseconds interval)
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement rd = driver.findElement(By.xpath("(//input[@type = 'radio'])[2]"));
		wait.until(ExpectedConditions.elementToBeClickable(rd));
		//wait.until(ExpectedConditions.visibilityOf(rd));
        //for implicit wait error messge is after TimeUnit. there are method suggestions
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SE);
		//driver.findElement(By.xpath("(//input[@type = 'radio'])[2]\"")).click();
		//driver.findElement(By.xpath("//input[@id='entity']")).click();
		//WebElement rd = driver.findElement(By.xpath("//input[@id='entity']"));
		//rd.click();
		
		rd.click();
		//driver.findElement(By.xpath("(//input[@type = 'radio'])[2]")).click();
		Select it = new Select(driver.findElement(By.name("entityType")));
		it.selectByVisibleText("Trust");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[4]/div/div[1]/form/div[1]/div[2]/div[2]/input"))
				.sendKeys("kkk");
		driver.findElement(By.name("regId")).sendKeys("123");
		driver.findElement(By.id("enttMobile")).sendKeys("123456789");
		driver.findElement(By.name("address1")).sendKeys("aaa");
		// driver.findElement(By.name("cityS")).sendKeys("sss");
		Select country = new Select(driver.findElement(By.name("countryS")));
		country.selectByVisibleText("Zimbabwe");
		driver.findElement(By.name("stateS")).sendKeys("ddd");

		driver.findElement(By.name("emailId")).sendKeys("zzz@gmail.com");
		driver.findElement(By.name("password")).sendKeys("ASDF!123");
		driver.findElement(By.name("repassword")).sendKeys("ASDF!123");
		driver.findElement(By.id("regi_continue")).click();

	}

}
