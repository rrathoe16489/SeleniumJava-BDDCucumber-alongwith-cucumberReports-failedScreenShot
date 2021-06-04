package com.wipro.qa.stepDefinitions;

import com.wipro.qa.base.TestBase;
import com.wipro.qa.util.WBSInformationOBJ;
import com.wipro.qa.util.TestUtilDemo;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @authorID Rat105478
 * @authorName RameshRathod
 */

public class WBSInformationStep extends TestBase {

	@Then("validate user click on add row button and user enter the CWA Number and CWA Name {string},{string}")
	public void validate_user_enter_the_cwa_number_and_cwa_name(String CWANumberTextBox, String CWANameTextBox)
			throws Throwable {

		TestUtilDemo.clickElement(WBSInformationOBJ.addRowButton, "addRowButton  Link");
		Thread.sleep(2000);
		TestUtilDemo.doSendKeys(WBSInformationOBJ.CWANumberTextBox, CWANumberTextBox);
		Thread.sleep(1000);
		TestUtilDemo.doSendKeys(WBSInformationOBJ.CWANameTextBox, CWANameTextBox);
		Thread.sleep(1000);
	}

	@Then("Validate save button is enabled")
	public void validate_save_button_is_enabled() throws Throwable {
		TestUtilDemo.isEnabled(WBSInformationOBJ.SAVE_BUTTON, "save button");
		Thread.sleep(2000);
	}

	@Then("validate user click on add row button and user enter the Modulenumber and modulename and CWA Numbername {string},{string},{string}")
	public void Validate_user_enter_the_Modulenumber_and_modulename_and_CWANumbername(String moduleNumberColumnTextBox,
			String moduleNameColumnTextBox, String cwaNumberName) throws Throwable {
		Thread.sleep(1000);
		/*
		 * Actions ac = new Actions(driver);
		 * ac.moveToElement(driver.findElement(WBSInformationOBJ.addRowButton)).click().
		 * build().perform();
		 */
		TestUtilDemo.clickElement(WBSInformationOBJ.addRowButton, "addRowButton  Link");
		Thread.sleep(2000);
		TestUtilDemo.doSendKeys(WBSInformationOBJ.moduleNumberColumnTextBox, moduleNumberColumnTextBox);
		Thread.sleep(2000);
		TestUtilDemo.doSendKeys(WBSInformationOBJ.moduleNameColumnTextBox, moduleNameColumnTextBox);
		Thread.sleep(2000);
		TestUtilDemo.selectValueAndEnter(WBSInformationOBJ.CWANumberNameColumnDD, cwaNumberName);
		Thread.sleep(3000);
	}

	@Then("validate user click on addRow button and user enter the value in PurchaseSpecificationNumber and PurchaseSpecificationName and Discipline column {string}")
	public void Validate_user_enter_the_value_in_PurchaseSpecificationNumber_and_PurchaseSpecificationName_and_Discipline(
			String value) throws Throwable {

		TestUtilDemo.clickElement(WBSInformationOBJ.addRowButton, "addRowButton  Link");
		Thread.sleep(2000);
		TestUtilDemo.selectValueAndEnter(WBSInformationOBJ.purchaseSpecificationNumberColumnDropDown, value);
		Thread.sleep(2000);

	}

	@Then("validate user click on addRow button and user enter the value in Process Area ID and Process Area Name {string},{string}")
	public void validate_user_add_new_row(String processAreaID, String processAreaName) throws Throwable {
		TestUtilDemo.clickElement(WBSInformationOBJ.addRowButton, "button clicked");
		Thread.sleep(1000);
		TestUtilDemo.doSendKeys(WBSInformationOBJ.processAreaId, processAreaID);
		TestUtilDemo.doSendKeys(WBSInformationOBJ.processAreaName, processAreaName);
	}

	@Then("The last section within the last header area with dependencies is being marked Complete, and it IS the LAST section of the LAST of two header areas to be marked complete, a popup will be displayed identifying the process that will be initiated if they continue")
	public void validate_confirmation_modal_is_display() throws Throwable {

		if (TestUtilDemo.isElementsPresent(WBSInformationOBJ.continueButton)) {
			TestUtilDemo.clickElement(WBSInformationOBJ.continueButton, "button clicked");
			Thread.sleep(3000);
		}
	}

	@Then("validate Top header is completed with cheked mark")
	public void validate_topHeader_check_is_display() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.completeWBSHeader, "complete Header icon");

	}

	/**
	 * @role Equipment
	 * @section mechenicalEquipmentList
	 */
	@Then("validate viewing data that needs to be updated, I can click on addRow button to addORupdate the data and changes have been made on the screen the Save button enable {string},{string},{string},{string},{string},{string}")
	public void validate_cliking_on_addButton(String equipmentTag, String equipmentName, String equipment,
			String pSpecification, String processAreaID, String cwaNumberName) throws Throwable {
		TestUtilDemo.clickElement(WBSInformationOBJ.addRowButton, "button clicked");
		TestUtilDemo.doSendKeys(WBSInformationOBJ.EquipmentTagColumnTextBox, equipmentTag);
		TestUtilDemo.doSendKeys(WBSInformationOBJ.EquipmentNameColumnTextBox, equipmentName);
		TestUtilDemo.selectValueAndEnter(WBSInformationOBJ.equipmentTypedropDown, equipment);
		TestUtilDemo.selectValueAndEnter(WBSInformationOBJ.purchaseSpecificationNumberNamedropDown, pSpecification);
		TestUtilDemo.selectValueAndEnter(WBSInformationOBJ.processAreaIdNamedropDown, processAreaID);
		TestUtilDemo.selectValueAndEnter(WBSInformationOBJ.cwaNumberNameDropDown, cwaNumberName);

	}

	/**
	 * @role Process
	 * @section philosophyDocumentNumber
	 */
	@Then("validate viewing data that needs to be updated, I can click on addRow button to addOrupdate data and changes have been made on the screen the Save button enable {string},{string}")
	public void validate_user_add_information_in_philosophy_section(String philosophyDocumentNumber,
			String philosophyDocumentName) throws Throwable {
		
		TestUtilDemo.clickElement(WBSInformationOBJ.addRowButton, "addRowButton");
		TestUtilDemo.doSendKeys(WBSInformationOBJ.philosophyDocumentNumber, philosophyDocumentNumber);
		TestUtilDemo.doSendKeys(WBSInformationOBJ.philosophyDocumentName, philosophyDocumentName);
		Thread.sleep(1000);
	}

	@When("validate once complete button clicked then Reset, Save and Complete buttons will be replaced with an Edit button and validate Section is completed")
	public void validate_edit_button_display() throws Throwable {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.EDIT_BUTTON, "");

	}

	/**
	 * @role Process
	 * @section studyList
	 */
	@Then("validate viewing data that needs to be updated, i can click on addRow button to addOrupdate the data and change have been made on the screen the Save button enable {string},{string}")
	public void validate_user_add_information_in_studyList_section(String studyNumber, String studyName)
			throws Throwable {
		TestUtilDemo.clickElement(WBSInformationOBJ.addRowButton, "addRowButton");
		TestUtilDemo.doSendKeys(WBSInformationOBJ.studyNumber, studyNumber);
		TestUtilDemo.doSendKeys(WBSInformationOBJ.studyName, studyName);
		Thread.sleep(1000);
	}

	/**
	 * @role Piping
	 * @section pipeSpecificationList
	 */
	@Then("validate viewing data that needs to be updated, I can click on Pipe Specification List to addOrupdate the data and changes have been made on the screen by clicking on save {string},{string},{string}")
	public void validate_DataAdding_for_PipeSpecificationList(String pipeSpecificationNumber,String pipeSpecificationMaterial,
			String pipeSpecificationClass) throws Throwable {
		TestUtilDemo.clickElement(WBSInformationOBJ.PipeSpecificationList, "PipeSpecificationList Section");
		TestUtilDemo.clickElement(WBSInformationOBJ.addRowButton, "addRowButton");
		TestUtilDemo.doSendKeys(WBSInformationOBJ.pipeSpecificationNumber, pipeSpecificationNumber);
		TestUtilDemo.doSendKeys(WBSInformationOBJ.pipeSpecificationMaterial, pipeSpecificationMaterial);
		TestUtilDemo.doSendKeys(WBSInformationOBJ.pipeSpecificationClass, pipeSpecificationClass);
		Thread.sleep(2000);

	}

	
	/**
	 * @role Piping
	 * @section tieInPriority
	 */
	@Then("validate viewing data that needs to be updated, I can click on addROW button to addOrupdate the data and changes have been made on the screen the Save button enable {string},{string}")
	public void validate_DataAdding_for_tieInPriorityList(String tieInPriority, String tieInPriority1)
			throws Throwable {
		TestUtilDemo.clickElement(WBSInformationOBJ.addRowButton, "addRowButton");
		TestUtilDemo.doSendKeys(WBSInformationOBJ.tieInPriority, tieInPriority);
		Thread.sleep(2000);

	}

	
	/**
	 * @role Piping
	 * @section SystemFluidList
	 */
	@Then("validate viewing data that needs to be updated, i can click on addROW button to addOrupdate the data and changes have been made on the screen the Save button enable {string}")
	public void validate_user_add_information_in_systemFluidList_section(String studyNumber) throws Throwable {
		TestUtilDemo.clickElement(WBSInformationOBJ.addRowButton, "addRowButton");
		Thread.sleep(1000);
		TestUtilDemo.doSendKeys(WBSInformationOBJ.fluidName, studyNumber);
		Thread.sleep(1000);
	}

	
}
