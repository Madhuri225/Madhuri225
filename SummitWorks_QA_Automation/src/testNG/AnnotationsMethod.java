package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class AnnotationsMethod {
  @Test(priority = 3)
  public void f() {
	  System.out.println("@Test f");
  }
  @Test(priority = 2)
  public void a() {
	  System.out.println("@Test a");
  }
  @Test(priority = 1)
  public void p() {
	  System.out.println("@Test p");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("@BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("@AfterMethod");
  }

}
