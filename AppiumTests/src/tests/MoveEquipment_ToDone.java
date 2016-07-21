package tests;

import org.junit.Assert;
import org.testng.annotations.Test;

public class MoveEquipment_ToDone extends BaseAppiumTest{
	@Test
	  public void moveEquipmentToDone() {
		
		login.waitForLoadingActivity();
		  login.typeLogin("Admin Shop");
		  login.typePass("admin");
		  login.cickOnLoginButton();
		  dateEquipment.waitForLoadingActivity();
		  
		  dateEquipment.clickOnActionMenu();
		  dateEquipment.clickOnDoneMenuItem();
		  Assert.assertTrue(dateEquipment.checkEquipmentNotInTheList());
		  dateEquipment.clickOnDoneTab();
		  Assert.assertTrue(dateEquipment.checkEquipmentInTheList());
	  }
	  
}
