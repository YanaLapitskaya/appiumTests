package tests;

import org.junit.Assert;
import org.testng.annotations.Test;

public class DateEquipmentTest extends BaseAppiumTest{
  @Test
  public void moveEquipmentToDone() {
	  dateEquipment.clickOnActionMenu();
	  dateEquipment.clickOnDoneMenuItem();
	  Assert.assertTrue(dateEquipment.checkEquipmentNotInTheList());
	  dateEquipment.clickOnDoneTab();
	  Assert.assertTrue(dateEquipment.checkEquipmentInTheList());
  }
  
  @Test 
  public void moveEquipmentToQueued(){
	  dateEquipment.clickOnActionMenu();
	  dateEquipment.clickOnQueuedMenuItem();
	  Assert.assertTrue(dateEquipment.checkEquipmentNotInTheList());
	  dateEquipment.clickOnQueuedTab();
	  Assert.assertTrue(dateEquipment.checkEquipmentInTheList());
  }
  
  @Test 
  public void deleteDateEquipment(){
	  dateEquipment.clickOnActionMenu();
	  dateEquipment.clickOnDeleteMenuItem();
	  Assert.assertTrue(dateEquipment.isAlertDisplayed());
	  dateEquipment.clickOnDeleteButton();
	  Assert.assertTrue(dateEquipment.checkEquipmentNotInTheList());
  }
}
