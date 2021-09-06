package webdriver;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Gettextsample {

		public static void main(String[] args) {
			// Create a referenceName for Webdriver interface.
			WebDriver driver;
			// Open Chrome browser
			System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
			driver = new ChromeDriver();
			// Type the URL
			driver.get("https://www.facebook.com/");
			//Maxmize the window
			driver.manage().window().maximize();
			
			
			//Get the text from application
			String abc = driver.findElement(By.className("_8eso")).getText();
			System.out.println(abc);
			
			
			driver.navigate().to("https://www.google.com/");
			//get the I'm Feeling Lucky lable name use getAttribute(AttributeName)
			String gText =  driver.findElement(By.name("btnI")).getAttribute("value");
			System.out.println(gText);
			
			
			
			driver.navigate().to("https://stqatools.com/demo/Calculator.php");	
			//getCssValue
			String gTextnew =  driver.findElement(By.id("calculator")).getCssValue("background-color");
			System.out.println(gTextnew);
	
	}

}
