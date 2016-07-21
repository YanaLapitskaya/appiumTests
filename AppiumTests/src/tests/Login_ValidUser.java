package tests;

import org.testng.annotations.Test;

public class Login_ValidUser extends BaseAppiumTest{
	
  @Test
  public void login_ValidUser() throws InterruptedException {

	  login.waitForLoadingActivity();
	  login.typeLogin("Admin Shop");
	  login.typePass("admin");
	  login.cickOnLoginButton();
	  dateEquipment.waitForLoadingActivity();
	  
  }
  
  @Test
  public void login_InValidUser() {
	
	  login.waitForLoadingActivity();
	  login.typeLogin("Invalid Login");
	  login.typePass("password");
	  login.cickOnLoginButton();
	  //wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widjet.Toast")));
				//("User name or password, is incorrect")));
 }
}
