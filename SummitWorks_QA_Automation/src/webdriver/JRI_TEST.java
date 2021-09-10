package webdriver;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JRI_TEST {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.justrechargeit.com/SignIn.aspx ");
		// driver.manage().window().maximize();
		/*
		 * Create New Account
		 * driver.findElement(By.linkText("Create New Account")).click();
		 * driver.findElement(By.id("signup_name")).sendKeys("Asha");
		 * driver.findElement(By.id("signup_mobileno")).sendKeys("8888992222");
		 * driver.findElement(By.id("signup_email")).sendKeys("ashalatha19@gmail.com");
		 * 
		 * 
		 * driver.findElement(By.id("signup_password")).sendKeys("123456");
		 * driver.findElement(By.id("checkbox")).click();
		 * driver.findElement(By.id("imgbtnSubmit")).click();
		 */

		/*
		 * Signin driver.findElement(By.xpath("(//a[text()=\"Sign In\"])[1]")).click();
		 * driver.findElement(By.name("txtUserName")).sendKeys("Testing");
		 * driver.findElement(By.id("txtPasswd")).sendKeys("asdfghj"); Scanner sc = new
		 * Scanner(System.in); String captcha = sc.next();
		 * System.out.println("Enter captcha");
		 * driver.findElement(By.name("txtCaptcha")).sendKeys(captcha);
		 * driver.findElement(By.id("imgbtnSignin")).click();
		 */

		// Verify forgot your password without email id
		/*
		 * driver.findElement(By.id("forgotpassword")).click(); Thread.sleep(3000);
		 * driver.findElement(By.id("forgotpass_imgbtnSubmit")).click();
		 */

		// Verify forgot your password with invalid email id
		/*
		 * driver.findElement(By.id("forgotpassword")).click();
		 * driver.findElement(By.id("forgotpass_txtEmailId")).sendKeys(
		 * "ashalatha123@gmail.com"); Thread.sleep(3000);
		 * driver.findElement(By.id("forgotpass_imgbtnSubmit")).click();
		 */

		/*
		 * with valid email id driver.findElement(By.id("forgotpassword")).click();
		 * driver.findElement(By.id("forgotpass_txtEmailId")).sendKeys(
		 * "madhuri.s.reddy@gmail.com"); Thread.sleep(3000);
		 * driver.findElement(By.id("forgotpass_imgbtnSubmit")).click();
		 */

		/*
		 * logout driver.findElement(By.xpath("(//a[text()=\"Sign In\"])[1]")).click();
		 * driver.findElement(By.name("txtUserName")).sendKeys("ashalatha19@gmail.com");
		 * driver.findElement(By.id("txtPasswd")).sendKeys("123456"); Scanner sc = new
		 * Scanner(System.in); String captcha = sc.next();
		 * System.out.println("Enter captcha");
		 * driver.findElement(By.name("txtCaptcha")).sendKeys(captcha);
		 * driver.findElement(By.id("imgbtnSignin")).click();
		 * 
		 * driver.findElement(By.id("jriTop_signOut")).click();
		 */

		/*driver.findElement(By.xpath("(//a[text()=\"Sign In\"])[1]")).click();
		driver.findElement(By.name("txtUserName")).sendKeys("ashalatha19@gmail.com");
		driver.findElement(By.id("txtPasswd")).sendKeys("123456");
		Scanner sc = new Scanner(System.in);
		String captcha = sc.next();
		System.out.println("Enter captcha");
		driver.findElement(By.name("txtCaptcha")).sendKeys(captcha);
		driver.findElement(By.id("imgbtnSignin")).click();
		*//*
		 * driver.findElement(By.xpath("//*[@title='Add Mobile Number']")).click();
		 * Thread.sleep(3000);
		 * driver.findElement(By.id("txtpopMobileNo")).sendKeys("8888999922"); Select
		 * sp1 = new Select(driver.findElement(By.name("ddlpopMobileSP")));
		 * sp1.selectByVisibleText("BSNL"); Thread.sleep(3000);
		 * driver.findElement(By.id("txtpopMobileNickname")).sendKeys("ash"); Select loc
		 * = new Select(driver.findElement(By.id("ddlpopMobileLocation")));
		 * loc.selectByVisibleText("Andhra Pradesh");
		 * driver.findElement(By.id("btnPopupAddMobile")).click();
		 */

		// 3rd mob
		/*
		 * driver.findElement(By.xpath("//*[@title='Add Mobile Number']")).click();
		 * Thread.sleep(3000);
		 * driver.findElement(By.id("txtpopMobileNo")).sendKeys("8888999921"); Select
		 * sp3 = new Select(driver.findElement(By.name("ddlpopMobileSP")));
		 * sp3.selectByVisibleText("BSNL"); Thread.sleep(3000);
		 * driver.findElement(By.id("txtpopMobileNickname")).sendKeys("ash");
		 * Thread.sleep(3000); Select loc3 = new
		 * Select(driver.findElement(By.id("ddlpopMobileLocation")));
		 * loc3.selectByVisibleText("Andhra Pradesh");
		 * driver.findElement(By.id("btnPopupAddMobile")).click();
		 */
		// 4th
		//Thread.sleep(3000);
		/*
		 * driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 * driver.findElement(By.xpath("//*[@title='Add Mobile Number']")).click();
		 * Thread.sleep(3000);
		 * driver.findElement(By.id("txtpopMobileNo")).sendKeys("8888999924"); Select
		 * sp4 = new Select(driver.findElement(By.name("ddlpopMobileSP")));
		 * sp4.selectByVisibleText("BSNL"); Thread.sleep(3000);
		 * driver.findElement(By.id("txtpopMobileNickname")).sendKeys("ash");
		 * Thread.sleep(3000); Select loc4 = new
		 * Select(driver.findElement(By.id("ddlpopMobileLocation")));
		 * loc4.selectByVisibleText("Andhra Pradesh");
		 * driver.findElement(By.id("btnPopupAddMobile")).click();
		 */

		// 5th
		/*
		 * driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 * driver.findElement(By.xpath("//*[@title='Add Mobile Number']")).click();
		 * Thread.sleep(3000);
		 * driver.findElement(By.id("txtpopMobileNo")).sendKeys("8888999925"); Select
		 * sp5 = new Select(driver.findElement(By.name("ddlpopMobileSP")));
		 * sp5.selectByVisibleText("BSNL");
		 * driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 * driver.findElement(By.id("txtpopMobileNickname")).sendKeys("ash"); Select
		 * loc5 = new Select(driver.findElement(By.id("ddlpopMobileLocation")));
		 * loc5.selectByVisibleText("Andhra Pradesh");
		 * driver.findElement(By.id("btnPopupAddMobile")).click();
		 */

		// 6th
		/*
		 * driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 * 
		 * driver.findElement(By.xpath("//*[@title='Add Mobile Number']")).click();
		 * Thread.sleep(3000);
		 * driver.findElement(By.id("txtpopMobileNo")).sendKeys("8888999926"); Select
		 * sp6 = new Select(driver.findElement(By.name("ddlpopMobileSP")));
		 * sp6.selectByVisibleText("BSNL");
		 * //driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 * driver.findElement(By.id("txtpopMobileNickname")).sendKeys("ash"); Select
		 * loc6 = new Select(driver.findElement(By.id("ddlpopMobileLocation")));
		 * loc6.selectByVisibleText("Andhra Pradesh");
		 * driver.findElement(By.id("btnPopupAddMobile")).click();
		 * 
		 * // 7th driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 * driver.findElement(By.xpath("//*[@title='Add Mobile Number']")).click();
		 * Thread.sleep(3000);
		 * driver.findElement(By.id("txtpopMobileNo")).sendKeys("8888999927"); Select
		 * sp7 = new Select(driver.findElement(By.name("ddlpopMobileSP")));
		 * sp7.selectByVisibleText("BSNL");
		 * driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 * driver.findElement(By.id("txtpopMobileNickname")).sendKeys("ash"); Select
		 * loc7 = new Select(driver.findElement(By.id("ddlpopMobileLocation")));
		 * loc7.selectByVisibleText("Andhra Pradesh");
		 * driver.findElement(By.id("btnPopupAddMobile")).click();
		 * 
		 * // 8th driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 * driver.findElement(By.xpath("//*[@title='Add Mobile Number']")).click();
		 * Thread.sleep(3000);
		 * driver.findElement(By.id("txtpopMobileNo")).sendKeys("8888999928"); Select
		 * sp8 = new Select(driver.findElement(By.name("ddlpopMobileSP")));
		 * sp8.selectByVisibleText("BSNL"); Thread.sleep(3000);
		 * driver.findElement(By.id("txtpopMobileNickname")).sendKeys("ash"); Select
		 * loc8 = new Select(driver.findElement(By.id("ddlpopMobileLocation")));
		 * loc8.selectByVisibleText("Andhra Pradesh");
		 * driver.findElement(By.id("btnPopupAddMobile")).click();
		 * 
		 * // 9th driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 * driver.findElement(By.xpath("//*[@title='Add Mobile Number']")).click();
		 * 
		 * driver.findElement(By.id("txtpopMobileNo")).sendKeys("8888999929"); Select
		 * sp9 = new Select(driver.findElement(By.name("ddlpopMobileSP")));
		 * sp9.selectByVisibleText("BSNL");
		 * driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 * driver.findElement(By.id("txtpopMobileNickname")).sendKeys("ash"); Select
		 * loc9 = new Select(driver.findElement(By.id("ddlpopMobileLocation")));
		 * loc9.selectByVisibleText("Andhra Pradesh");
		 * driver.findElement(By.id("btnPopupAddMobile")).click();
		 * 
		 * // 10th driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 * driver.findElement(By.xpath("//*[@title='Add Mobile Number']")).click();
		 * Thread.sleep(3000);
		 * driver.findElement(By.id("txtpopMobileNo")).sendKeys("8888999920"); Select
		 * sp10 = new Select(driver.findElement(By.name("ddlpopMobileSP")));
		 * sp10.selectByVisibleText("BSNL");
		 * driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 * driver.findElement(By.id("txtpopMobileNickname")).sendKeys("ash"); Select
		 * loc10 = new Select(driver.findElement(By.id("ddlpopMobileLocation")));
		 * loc10.selectByVisibleText("Andhra Pradesh");
		 * driver.findElement(By.id("btnPopupAddMobile")).click();
		 */	
		
		driver.findElement(By.xpath("(//a[text()=\"Sign In\"])[1]")).click();
		driver.findElement(By.name("txtUserName")).sendKeys("ashalatha19@gmail.com");
		driver.findElement(By.id("txtPasswd")).sendKeys("123456");
		Scanner sc = new Scanner(System.in);
		String captcha = sc.next();
		System.out.println("Enter captcha");
		driver.findElement(By.name("txtCaptcha")).sendKeys(captcha);
		driver.findElement(By.id("imgbtnSignin")).click();
		driver.findElement(By.id("listingtable_LinkButton3_0")).click();
		driver.switchTo().alert();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("listingtable_ImgRecharge_0")).click();
	
		driver.findElement(By.xpath("//*[@id='btnProceedtoPay']")).click();
/*EDIT 
 * driver.findElement(By.id("listingtable_btnGridEdit_1")).click(); Select ssp =
 * new Select(driver.findElement(By.xpath(
 * "//*[@id='listingtable_ddlMobileDTHProvider_1']")));
 * ssp.deselectByVisibleText("MTNL"); Thread.sleep(3000); Select ssl = new
 * Select(driver.findElement(By.id("listingtable_ddlMobileDTHProviderLocation_1"
 * ))); ssl.deselectByVisibleText("Assam");
 * 
 * driver.findElement(By.id("listingtable_btnGridSave_1")).click();
 * 
 * 
 * 
 */	}

}
