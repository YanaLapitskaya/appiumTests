package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Login_InvalidUser extends BaseAppiumTest{
	 @Test
	  public void login_InValidUser() {
		
		  login.waitForLoadingActivity();
		  login.typeLogin("Invalid Login");
		  login.typePass("password");
		  login.cickOnLoginButton();
		  WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widjet.Toast")));
					//("User name or password, is incorrect")));
	 }
}
