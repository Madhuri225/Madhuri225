package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestAnnotations {
  @Test
  public void f() {
	  System.out.println("@test f");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("@BeforeClass f");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("@AfterClass f");
  }
  
  @Test
  public void a() {
	  System.out.println("@test a");
  }
}
