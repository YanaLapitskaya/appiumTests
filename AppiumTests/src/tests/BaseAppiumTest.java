package tests;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import activities.DateEquipmentActivityPageObject;
import activities.EquipmentsActivityPageObject;
import activities.LoginActivityPageObject;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseAppiumTest {
	
	protected AppiumDriver<MobileElement> driver;
	protected WebDriverWait wait ;
	
	protected LoginActivityPageObject login;
	protected DateEquipmentActivityPageObject dateEquipment;
	protected EquipmentsActivityPageObject equipments;
	  

	  @BeforeClass
	  public void Setup() throws MalformedURLException{
		  
		  File foremanDir = new File("D:\\HackSpace\\android-subsystem-foreman\\Foreman\\build\\outputs\\apk");
		  File foremanApk = new File(foremanDir,"Foreman-debug-unaligned.apk");
		  
		  DesiredCapabilities capabilities = new DesiredCapabilities();
		 
	        capabilities.setCapability("platformName", "Android");
	        capabilities.setCapability("deviceName", "Nexus 7");
	        capabilities.setCapability(MobileCapabilityType.APP,foremanApk.getAbsolutePath());
	        
		  driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		  wait = new WebDriverWait(driver, 30);
		  
		  //activities
		  login = new LoginActivityPageObject(driver);
		  dateEquipment = new DateEquipmentActivityPageObject(driver);
		  equipments = new EquipmentsActivityPageObject(driver);
		  
	  }
	  
	  @AfterClass 
	  public void tearDown() throws Exception {
	      //driver.quit();
	  }

}
