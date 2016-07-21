package activities;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class LoginActivityPageObject {
	
	private AppiumDriver<MobileElement> driver;
	
	public LoginActivityPageObject(AppiumDriver<MobileElement> driver){
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id="com.ezra.shop.foreman:id/login_name_edit_text")
	@iOSFindBy(id="com.ezra.shop.foreman:id/login_name_edit_text")
	private MobileElement loginEditText;
	
	@AndroidFindBy(id="com.ezra.shop.foreman:id/password_edit_text")
	@iOSFindBy(id="com.ezra.shop.foreman:id/password_edit_text")
	private MobileElement passEditText;
	
	@AndroidFindBy(id="com.ezra.shop.foreman:id/login_button")
	@iOSFindBy(id="com.ezra.shop.foreman:id/login_button")
	private MobileElement loginButton;
	
	public void typeLogin(String login){
		loginEditText.sendKeys(login);
	}
	
	public void typePass(String pass){
		passEditText.sendKeys(pass);
	}
	
	public void cickOnLoginButton(){
		loginButton.click();
	}
	
	public void waitForLoadingActivity(){
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(loginButton));
	}

}
