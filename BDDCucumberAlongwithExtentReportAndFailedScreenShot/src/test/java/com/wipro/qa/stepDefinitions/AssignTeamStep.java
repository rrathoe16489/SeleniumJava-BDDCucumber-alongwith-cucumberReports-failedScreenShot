
package com.wipro.qa.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import com.wipro.qa.base.TestBase;
import com.wipro.qa.util.AssignTeamOBJ;
import com.wipro.qa.util.TestUtilDemo;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @authorID Rat105478
 * @authorName RameshRathod
 */

public class AssignTeamStep extends TestBase {

	@Then("validate user click on {string}")
	public void validate_pipingEngineeringTeam_is_click(String sectionName) throws Throwable {
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
				driver.findElement(By.xpath("//p[text()='" + sectionName + "']")));
		TestUtilDemo.clickElement(By.xpath("//p[text()='" + sectionName + "']"), "");
		Thread.sleep(3000);
	}

	@When("validate {string} section is NOT completed, an empty circle next to the Section label will display in left panel")
	public void validate_empty_circle_nextTo_the_Section_label_will_display_in_left_panel(String sectionName)
			throws Throwable {
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
				driver.findElement(By.xpath(
						"//p[text()='" + sectionName + "']//parent::li//span[@class='sideMenuIcon circle-white']")));
		boolean flag = TestUtilDemo.isElementsPresent(
				By.xpath("//p[text()='" + sectionName + "']//parent::li//span[@class='sideMenuIcon circle-white']"));
		org.junit.Assert.assertTrue(flag);

	}

	@When("validate toggle is ON and the name field will enable")
	public void validate_toggleON() throws Throwable {
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
				driver.findElement(By.xpath("// div[@class=' field-group row'][1]/div[1]/div/label")));
		TestUtilDemo.clickElement(By.xpath("// div[@class=' field-group row'][1]/div[1]/div/label"), "toggle click");
	}

	@When("validate entering the assignee name, it will search for matching names and display NameJobFamilyOffice {string}")
	public void autoSearchName_in_dropdown_and_select(String assigneeNmae) throws Throwable {

		TestUtilDemo.clickElement(AssignTeamOBJ.assigneeNameInput, "");
		TestUtilDemo.selectValueAndEnter(AssignTeamOBJ.assigneeNameInput, assigneeNmae);
		Thread.sleep(5000);
	}

	@When("validate upon making an edit, the Save button will be enabled and the Complete button will be disable {string}")
	public void save_button_will_enable(String assigneeNameEdit) throws Throwable {

		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
				driver.findElement(AssignTeamOBJ.assigneeNameInput));
		TestUtilDemo.selectValueAndEnter(AssignTeamOBJ.assigneeNameInput, assigneeNameEdit);
		Thread.sleep(3000);
	}

	@When("validate System will prompt user to save record if user is moving away from sectionscreen to {string} without saving data")
	public void leaving_page_without_saving(String section) throws Throwable {
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
				driver.findElement(By.xpath("//p[text()='" + section + "']")));
		TestUtilDemo.clickElement(By.xpath("//p[text()='" + section + "']"), "leaving page without save");
		Thread.sleep(3000);
	}

	@When("validate the section information has been saved and the Complete button will be enabled")
	public void saving_data_and_complete_button_enable_in_pipingSection() throws Throwable {
		TestUtilDemo.clickElement(AssignTeamOBJ.SAVE_BUTTON, "save click");
		Thread.sleep(5000);
		boolean flag = TestUtilDemo.isEnabled(AssignTeamOBJ.COMPLETE_BUTTON, "button enabled");
		Assert.assertTrue(flag);

	}

	@When("validate toggling off a role with a name populated the name will clear and field will disable")
	public void toggling_off() throws Throwable {
		validate_toggleON();
		TestUtilDemo.clickElement(AssignTeamOBJ.SAVE_BUTTON, "");
		Thread.sleep(4000);
		validate_toggleON();
	}

	@When("validate For select roles, user can select +Add Professional which will create a new blank field to populate an additional professional for a given role {string},{string}")
	public void add_new_role_in_pipingSection(String assigneeName, String addProfessional) throws Throwable {
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
				driver.findElement(By.xpath("//div[text()='Add Role']")));
		//validate_toggleON();
		driver.findElement(AssignTeamOBJ.assigneeNameInput).click();
		TestUtilDemo.selectValueAndEnter(AssignTeamOBJ.assigneeNameInput, assigneeName);
		Thread.sleep(1000);

		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
				driver.findElement(AssignTeamOBJ.addProfesstional));
		TestUtilDemo.clickElement(AssignTeamOBJ.addProfesstional, "button click");
		TestUtilDemo.clickElement(
				By.xpath("//div[@class='assign-content']/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div/input"),
				"dropDown click");
		Thread.sleep(3000);
		TestUtilDemo.selectValueAndEnter(
				By.xpath("//div[@class='assign-content']/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div/input"),
				addProfessional);

	}

	@When("validate a section within a header area that does not have dependencies (Project Information, Project Reference Library, Assign Project Lead) has been marked complete, the Reset, Save and Complete buttons will be replaced with an Edit button")
	public void edit_button_is_display_in_pipingSection() throws Throwable {
		TestUtilDemo.clickElement(AssignTeamOBJ.COMPLETE_BUTTON, "button click");
		Thread.sleep(5000);
		boolean flag = TestUtilDemo.isElementsPresent(AssignTeamOBJ.EDIT_BUTTON);
		org.junit.Assert.assertTrue(flag);
	}

	@When("validate Section is completed, a check next to the {string} label will display in left panel")
	public void checkMark_is_display_next_to_pipingSection(String SectionName) throws Throwable {
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
				driver.findElement(
						By.xpath("//p[text()='" + SectionName + "']//parent::li//img[@class='sideMenuIcon']")));
		boolean flag = TestUtilDemo.isElementsPresent(
				By.xpath("//p[text()='" + SectionName + "']//parent::li//img[@class='sideMenuIcon']"));
		org.junit.Assert.assertTrue(flag);
	}

	@When("validate clicking on Define User Permissions displays a list of user permissions so that I can assign an individual in Discipline {string}")
	public void clicking_on_defineUserPermissions(String assigneeName) throws Throwable {
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
				driver.findElement(By.xpath("//div[text()='Add Role']")));
		driver.findElement(AssignTeamOBJ.assigneeNameInput).click();
		TestUtilDemo.selectValueAndEnter(AssignTeamOBJ.assigneeNameInput, assigneeName);
		Thread.sleep(1000);
		TestUtilDemo.clickElement(AssignTeamOBJ.defineUserPermissions, "click");
		Thread.sleep(4000);

	}

	@Then("validate hovering over i icon next to user permissions provides additional informationORdescription of permissions")
	public void validate_hovering_over_i_Icon() throws Throwable {
		TestUtilDemo.mouseHover(AssignTeamOBJ.iIconForGigcompleter);
		Thread.sleep(5000);
		boolean flag = TestUtilDemo.isElementsPresent(AssignTeamOBJ.hoverInformation);
		org.junit.Assert.assertTrue(flag);
		Thread.sleep(3000);
	}

	@Then("validate user can select Save to save the selections")
	public void validate_user_can_save_selection() throws Throwable {
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
				driver.findElement(By.xpath("//button[text()='Cancel']//parent::div//button[text()='Save']")));
		TestUtilDemo.clickElement(By.xpath("//button[text()='Cancel']//parent::div//button[text()='Save']"), "button click");
		Thread.sleep(5000);
		TestUtilDemo.clickElement(By.xpath("//button[text()='Save']"), "button click");
		Thread.sleep(5000);
		TestUtilDemo.clickElement(By.xpath("//button[text()='Complete']"), "button click");
		Thread.sleep(5000);
				
	}
	
	@When("valiate user click on the Edit button")
	public void clicking_on_editbutton() throws Throwable {
		TestUtilDemo.clickElement(AssignTeamOBJ.EDIT_BUTTON, "");
		Thread.sleep(5000);
	}
	
	@When("verify that user is able add new role and view added Role {string},{string}")
	public void verify_user_add_newRole(String roleTitle, String roleDiscription) throws Throwable {
		TestUtilDemo.clickElement(AssignTeamOBJ.addRoleButton, "addRoleButton");
		Thread.sleep(1000);
		TestUtilDemo.doSendKeys(AssignTeamOBJ.roleTitle, roleTitle);
		Thread.sleep(1000);
		TestUtilDemo.doSendKeys(AssignTeamOBJ.roleDescription, roleDiscription);
		TestUtilDemo.clickElement(AssignTeamOBJ.saveButtonAddRole, "click on save ");
		Thread.sleep(2000);
	}

}
