package testNGAnnotation;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationStudy {
  @Test
  public void validateUserID() {
	  
	  Reporter.log("UserID is validated", true);
	  }
  
  @BeforeMethod
  public void login() {
	  
	  Reporter.log("Login done", true);
  }
  
 @AfterMethod
 public void logout() {
	 
	 Reporter.log("logout is done", true);
 }
 
 @Test
 public void testme() {
	 Reporter.log("Hi", true);
 }
  
}
