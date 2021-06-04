package com.wipro.qa.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import com.wipro.qa.base.TestBase;
import com.wipro.qa.util.WorkflowRulesOBJ;
import com.wipro.qa.util.ManHourBudgetOBJ;
import com.wipro.qa.util.ProjectActivityOBJ;
import com.wipro.qa.util.ProjectInfoOBJ;
import com.wipro.qa.util.StepCommonMethod;
import com.wipro.qa.util.TestUtilDemo;
import com.wipro.qa.util.WBSInformationOBJ;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @authorID Rat105478
 * @authorName RameshRathod
 */

public class ProjectActivityStep extends TestBase {

	@When("validate when user clicks on Project Activities header area")
	public void clicks_on_Project_Activities_Header_Area() throws Throwable {
		StepCommonMethod.validate_top_header_is_Display_and_click("projectActivities",
				ProjectActivityOBJ.projectActivityHeader, ProjectActivityOBJ.projectActivityLink, "projectActivities");
		TestUtilDemo.isElementPresent(ProjectActivityOBJ.defineActivitiesSection, "defineActivitiesSection Section");

	}

	@When("Verify when user enters Define Activities screen")
	public void user_enters_Define_Activities_screen() {
		String wbsInformationHeaderEX = prop.getProperty("generateProjectActivitiesMessage");
		String wbsInformationHeaderAC = TestUtilDemo.getTex(ProjectActivityOBJ.generateProjectActivitiesMessage);
		Assert.assertEquals(wbsInformationHeaderAC, wbsInformationHeaderEX);

	}

	@Then("select piping from dropDown")
	public void select_piping_from_dropDown() throws Throwable {
		boolean flag = TestUtilDemo.isElementPresent(ProjectActivityOBJ.selectDiscipline, "selectDiscipline");
		if (flag) {
			TestUtilDemo.clickElement(ProjectActivityOBJ.selectDisciplineDropDown, "dropdown select");
			TestUtilDemo.clickElement(ProjectActivityOBJ.selectDisciplineDropDownValue, "Piping value");
			Thread.sleep(4000);
		} else {

			TestUtilDemo.clickElement(ProjectActivityOBJ.selectDisciplineDropDown, "dropdown select");
			TestUtilDemo.clickElement(ProjectActivityOBJ.selectDisciplineDropDownValue, "Piping value");
			Thread.sleep(4000);
		}

	}

	@Then("Verify when user clicks on Generate Project Activities")
	public void clicks_on_Generate_Project_Activities() throws Throwable {
		TestUtilDemo.clickElement(ProjectActivityOBJ.generateProjectActivitiesLink, " generateProjectActivities Link");
		Thread.sleep(3000);

	}

	@Then("After including required activities and DPS clicks on Save button")
	public void clicks_on_save_button() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.addfieldSaveButton, " save button");
		Thread.sleep(1000);

	}

	@Then("validate user select another dropdownValue from define activity")
	public void selectDropDownValue_from_defineActiviy() throws Throwable {
		TestUtilDemo.clickElement(ProjectActivityOBJ.defineActivityDropDown, " click on dropDown");
		Thread.sleep(1000);
		if (TestUtilDemo.clickElements(ProjectActivityOBJ.defineActivityDDValue, " selecting value from dropDown")) {
			TestUtilDemo.clickElement(ProjectActivityOBJ.defineActivityDDValue, " selecting value from dropDown");
			Thread.sleep(2000);
		}
	}

	@Then("validate DPS can Add a Project Activity to DOS Activity section by selecting a plus Add Row button at the bottom of the table and by saving the activity, New row should be added below all the Activities {string}")
	public void adding_new_row_for_project_activity(String activityName) throws Throwable {
		
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
				driver.findElement(ProjectActivityOBJ.addRowButton));
		TestUtilDemo.clickElement(ProjectActivityOBJ.addRowButton, "button click");
		Thread.sleep(3000);
		TestUtilDemo.doSendKeys(ProjectActivityOBJ.activityTextBox, activityName);
		Thread.sleep(2000);
		TestUtilDemo.clickElement(ProjectInfoOBJ.SAVE_BUTTON, "SAVE_BUTTON");
		Thread.sleep(2000);

	}

	@Then("Verify DPS is able to edit the Activity name in the Activities list {string}")
	public void clicks_on_Generate_Project_Activities(String editedActivityName) throws Throwable {
		TestUtilDemo.clearAnddoSendKeys(ProjectActivityOBJ.activityTextBoxEdit, editedActivityName);
		Thread.sleep(2000);
		TestUtilDemo.clickElement(ProjectInfoOBJ.SAVE_BUTTON, "SAVE_BUTTON");
		Thread.sleep(2000);
	}

	@Then("Verify when DPS selects multiple values from dropdown in WBS related fields")
	public void selects_multiple_values() throws Throwable {
		TestUtilDemo.clickElement(ProjectActivityOBJ.cwaNumberNameDropDown1, " cwaNumberNameDropDown");
		Thread.sleep(2000);
		TestUtilDemo.clickElement(ProjectActivityOBJ.cwaNumberNameDropDownValue1, " cwaNumberNameDropDownV1");
		Thread.sleep(2000);
		/*
		 * TestUtilDemo.clickElement(ProjectActivityOBJ.cwaNumberNameDropDown2,
		 * " cwaNumberNameDropDown"); Thread.sleep(2000);
		 * TestUtilDemo.clickElement(ProjectActivityOBJ.cwaNumberNameDropDownValue1,
		 * " cwaNumberNameDropDown2"); Thread.sleep(2000);
		 */
		TestUtilDemo.clickElement(ProjectInfoOBJ.SAVE_BUTTON, "SAVE_BUTTON");
		Thread.sleep(2000);

	}

	@Then("Verify DPS is able to delete an Activity from Activity list")
	public void delete_activity() throws Throwable {
		TestUtilDemo.clickElement(ProjectActivityOBJ.ActivityDeleteIcon, " deleted Activity ");
		Thread.sleep(3000);
		TestUtilDemo.clickElement(ProjectInfoOBJ.SAVE_BUTTON, "SAVE_BUTTON");
		Thread.sleep(2000);

	}

	@Then("To verify Mark DOS activity complete")
	public void validate_complete_activity() throws Throwable {
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
				driver.findElement(ProjectActivityOBJ.markAsCompleteIcon));
		TestUtilDemo.clickElement(ProjectActivityOBJ.markAsCompleteIcon, " markAsCompleteIcon click ");
		Thread.sleep(1000);
	}

	@Then("validate edit Project Activity after DOS activity marked complete and again complete the DOS activity")
	public void validate_edit_activity() throws Throwable {
		TestUtilDemo.clickElement(ProjectActivityOBJ.editIcon, "edit activity");
		Thread.sleep(1000);
		TestUtilDemo.clickElement(ProjectActivityOBJ.markAsCompleteIcon, " markAsCompleteIcon click ");
		Thread.sleep(1000);
	}

	@Then("To verify All DOS activities complete")
	public void validate_complete_all_activity() throws Throwable {
		TestUtilDemo.clickElement(ProjectActivityOBJ.formClick, "");
		TestUtilDemo.scrollUpTop();
		TestUtilDemo.clickElement(ProjectActivityOBJ.markAsCompleteIcon, " markAsCompleteIcon click ");
		Thread.sleep(1000);
	}
	
	@Then("validate user clicks on ManHour Budgets section")
	public void validate_user_click_on_manHourBudgetSection() throws Throwable {
		TestUtilDemo.clickElement(ProjectActivityOBJ.manhourBudgetsSection, " manhourBudgetsSection click ");
		Thread.sleep(3000);
	}
	
	@Then("validate field validation by passing the maxLength value into field compare to length {string}")
	public void validate_maxLengthValidation(String maxLengthVal) throws Throwable {
		TestUtilDemo.clickElement(ProjectActivityOBJ.formClick, "");
		TestUtilDemo.scrollDownTillBottum();
		TestUtilDemo.doSendKeys(ProjectActivityOBJ.usEngHours, maxLengthVal);
		Thread.sleep(2000);
		TestUtilDemo.isElementPresent(ProjectActivityOBJ.maxvalidationMessage, "validation message display");
	}
	
	@Then("validate field validation by passing the decimal value into field {string}")
	public void validate_decimalVal_validation(String decimalVal) throws Throwable {
		TestUtilDemo.clearAnddoSendKeys(ProjectActivityOBJ.usEngHours, decimalVal);
		Thread.sleep(2000);
		//TestUtilDemo.isElementPresent(ProjectActivityOBJ.decimalvalidationMessage, "validation message display");
	}
	
	@Then("validate user fill the equal data into each field of DOS Activity and then check the total of hours {string},{string},{string},{string}")
	public void validate_user_fill_the_equal_data(String usEngHours,String usDsgnHours,String ousEngHours,String ousDsgnHours) throws Throwable {
		TestUtilDemo.clearAnddoSendKeys(ProjectActivityOBJ.usEngHours, usEngHours);
		TestUtilDemo.clearAnddoSendKeys(ProjectActivityOBJ.usDsgnHours, usDsgnHours);
		TestUtilDemo.clearAnddoSendKeys(ProjectActivityOBJ.ousEngHours, ousEngHours);
		TestUtilDemo.clearAnddoSendKeys(ProjectActivityOBJ.ousDsgnHours, ousDsgnHours);
		Thread.sleep(1000);
		
		/*
		 * String totalENGHoursValue =
		 * TestUtilDemo.getTex(ProjectActivityOBJ.totalENGHours1);
		 * System.out.println("total 1st :" +totalENGHoursValue); String
		 * totalDSGNHoursValue =
		 * TestUtilDemo.getTex(ProjectActivityOBJ.totalDSGNHours1);
		 */
		}
	
	
	//process
	@Then("To verify Mark DOS activity complete for process")
	public void validate_complete_activity_process() throws Throwable {
		
		TestUtilDemo.clickElement(ProjectActivityOBJ.markAsCompleteIcon, " markAsCompleteIcon click ");
		Thread.sleep(1000);
	}

	@Then("To verify All DOS activities complete for process")
	public void validate_complete_all_activity_process() throws Throwable {
		
		TestUtilDemo.clickElement(ProjectActivityOBJ.markAsCompleteIcon, " markAsCompleteIcon click ");
		Thread.sleep(1000);
	}
	
	@Then("Verify when DPS selects multiple values from dropdown in WBS related fields in process")
	public void selects_multiple_values_process() throws Throwable {
		TestUtilDemo.clickElement(ProjectActivityOBJ.cwaNumberNameDropDown1, " cwaNumberNameDropDown");
		Thread.sleep(2000);
		TestUtilDemo.clickElement(ProjectActivityOBJ.cwaNumberNameDropDownValue1, " cwaNumberNameDropDownV1");
		Thread.sleep(2000);
		TestUtilDemo.clickElement(ProjectInfoOBJ.SAVE_BUTTON, "SAVE_BUTTON");
		Thread.sleep(2000);

	}
}
