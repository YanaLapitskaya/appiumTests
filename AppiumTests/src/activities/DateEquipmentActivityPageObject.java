package activities;


import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class DateEquipmentActivityPageObject {

	private final AppiumDriver<MobileElement> driver;
	
	public DateEquipmentActivityPageObject(AppiumDriver<MobileElement> driver){
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//app menu elements
	
	//date picker
	
	//date equipments elements
	@AndroidFindBy(id="com.ezra.shop.foreman:id/add_date_equipment_fbutton")
	@iOSFindBy(id="com.ezra.shop.foreman:id/add_date_equipment_fbutton")
	private MobileElement addDateEquipmentButton;
	
	@AndroidFindBy(id="com.ezra.shop.foreman:id/action_menu_anchor_view")
	@iOSFindBy(id="com.ezra.shop.foreman:id/action_menu_anchor_view")
	private MobileElement dateEquipmentActionMenu;
	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text,'Done']")
	@iOSFindBy(xpath="//android.widget.TextView[contains(@text,'Done']")
	private MobileElement doneMenuItem;
	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text,'Delete']")
	@iOSFindBy(xpath="//android.widget.TextView[contains(@text,'Delete']")
	private MobileElement deleteMenuItem;
	
	@AndroidFindBy(id="android:id/button1")
	@iOSFindBy(id="android:id/button1")
	private MobileElement deleteButton;
	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text,'Queued']")
	@iOSFindBy(xpath="//android.widget.TextView[contains(@text,'Queued']")
	private MobileElement queuedMenuItem;
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[contains(@resource-id,'tab_title_text_view') and @index='0'")
	@iOSFindBy(xpath="//android.widget.LinearLayout[contains(@resource-id,'tab_title_text_view') and @index='0'")
	private MobileElement queredEquipmentTab;
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[contains(@resource-id,'tab_title_text_view') and @index='1'")
	@iOSFindBy(xpath="//android.widget.LinearLayout[contains(@resource-id,'tab_title_text_view') and @index='1'")
	private MobileElement inProgressEquipmentTab;
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[contains(@resource-id,'tab_title_text_view') and @index='2'")
	@iOSFindBy(xpath="//android.widget.LinearLayout[contains(@resource-id,'tab_title_text_view') and @index='2'")
	private MobileElement doneEquipmentTab;
	
	@AndroidFindBy(id="android:id/alertTitle")
	@iOSFindBy(id="android:id/alertTitle")
	private MobileElement alertTitle;
	
	//date equipments methods
	public void clickOnActionMenu(){
		dateEquipmentActionMenu.click();
	}
	
	public void clickOnDoneMenuItem(){
		doneMenuItem.click();
	}
	
	public void clickOnDeleteMenuItem(){
		deleteMenuItem.click();
	}
	
	public void clickOnQueuedMenuItem(){
		queuedMenuItem.click();
	}

	public void clickOnAddEquipmentButton(){
		addDateEquipmentButton.click();
	}
	
	public void clickOnQueuedTab(){
		queredEquipmentTab.click();
	}
	
	public void clickOnInProgressTab(){
		inProgressEquipmentTab.click();
	}
	
	public void clickOnDoneTab(){
		doneEquipmentTab.click();
	}
	
	public void clickOnDeleteButton(){
		deleteButton.click();
	}
	
	public boolean checkEquipmentInTheList(){
		try {
			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.elementToBeClickable(dateEquipmentActionMenu));
  			return true;
  		} 
  		catch (TimeoutException e) {
  			return false;
  		}
	}
	
	public boolean checkEquipmentNotInTheList(){
		try {
			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.elementToBeClickable(dateEquipmentActionMenu));
  			return false;
  		} 
  		catch (TimeoutException e) {
  			return true;
  		}
	}
	
	public boolean isAlertDisplayed(){
		return alertTitle.isDisplayed();
	}

	public void waitForLoadingActivity(){
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(addDateEquipmentButton));
	}
}
