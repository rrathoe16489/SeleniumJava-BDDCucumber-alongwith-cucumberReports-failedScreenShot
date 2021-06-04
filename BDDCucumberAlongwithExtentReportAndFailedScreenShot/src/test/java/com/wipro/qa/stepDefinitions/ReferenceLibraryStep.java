/*
 * package com.wipro.qa.stepDefinitions;
 * 
 * import java.text.SimpleDateFormat; import java.util.Date; import
 * org.openqa.selenium.By; import org.openqa.selenium.JavascriptExecutor; import
 * com.wipro.qa.base.TestBase; import com.wipro.qa.util.ProjectInfoOBJ; import
 * com.wipro.qa.util.ReferenceLibraryOBJ; import
 * com.wipro.qa.util.StepCommonMethod; import com.wipro.qa.util.TestUtilDemo;
 * import com.wipro.qa.util.WBSInformationOBJ; import
 * com.wipro.qa.util.ManHourBudgetOBJ; import io.cucumber.java.en.Given; import
 * io.cucumber.java.en.Then; import io.cucumber.java.en.When;
 * 
 *//**
	 * @authorID Rat105478
	 * @authorName RameshRathod
	 */
/*
 * 
 * public class ReferenceLibraryStep extends TestBase {
 * 
 * public static String date = "ssmm"; static SimpleDateFormat sdf = new
 * SimpleDateFormat(date); public static String refID = sdf.format(new Date());
 * 
 *//**
	 * @role PLI
	 * @section projectSpecificDocument
	 */
/*
 * 
 * @When("Validate user when moving the slider to on position") public void
 * validate_user_when_moving_the_slider_to_on_position() {
 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.toggle, "toggle on"); }
 * 
 * @When("Validate user when moving the slider to on position for procedure")
 * public void validate_user_when_moving_the_slider_to_on() {
 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.toggleforProcedure,
 * "toggle on");
 * 
 * }
 * 
 * @Then("validate moving the slider to on position only editing of name {string} and ID, deletingorpasting of Link {string} allowed"
 * ) public void
 * validate_moving_the_slider_to_on_position_only_editing_of_name_and_id_deleting_pasting_of_link_allowed(
 * String name, String link) throws Throwable { if
 * (TestUtilDemo.isElementsPresent(ReferenceLibraryOBJ.categoryTextLink)) {
 * 
 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.categoryTextLink,
 * "categoryTextLink"); Thread.sleep(1000); }
 * TestUtilDemo.clearAnddoSendKeys(ReferenceLibraryOBJ.nameTextBox, name);
 * Thread.sleep(1000);
 * TestUtilDemo.clearAnddoSendKeys(ReferenceLibraryOBJ.IDtextBox, refID);
 * Thread.sleep(1000);
 * TestUtilDemo.clearAnddoSendKeys(ReferenceLibraryOBJ.linkTextBox, link);
 * Thread.sleep(3000);
 * 
 * ((JavascriptExecutor) driver).executeScript(
 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
 * , driver.findElement(ReferenceLibraryOBJ.SAVE_BUTTON));
 * 
 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.SAVE_BUTTON, "Save Button ");
 * Thread.sleep(6000); }
 * 
 * @Then("Validate user can save the updated data and link will become a hyperlink to open the file or website"
 * ) public void
 * validate_user_can_save_the_updated_data_and_link_will_become_a_hyperlink_to_open_the_file_or_website
 * () throws Throwable {
 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.googleLink, "googleLink");
 * Thread.sleep(1000); // get current window String mainWindowHandle =
 * driver.getWindowHandles().iterator().next(); // switch back
 * driver.switchTo().window(mainWindowHandle); }
 * 
 * @Then("Validate Hovering over link cell will display entire link") public
 * void validate_hovering_over_link_cell_will_display_entire_link() throws
 * Throwable { ((JavascriptExecutor) driver).executeScript(
 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
 * , driver.findElement(ReferenceLibraryOBJ.googleLink));
 * TestUtilDemo.mouseHover(ReferenceLibraryOBJ.googleLink); Thread.sleep(4000);
 * 
 * }
 * 
 * @Then("Validate user can copy the existing row then Category copied and all other columns blank and Save Complete and Edit button click"
 * ) public void
 * validate_user_can_copy_the_existing_row_then_category_copied_and_all_other_columns_blank_and_Save_Complete_and_Edit_button_click
 * () throws Throwable { TestUtilDemo.clickElement(ReferenceLibraryOBJ.copyIcon,
 * "copyIcon Icon "); Thread.sleep(2000); }
 * 
 * @When("Validate clicking in the link cell for a given row that already has a link populated the PLI can choose to delete the link by selecting X icon"
 * ) public void deleting_existing_row() throws Throwable { Thread.sleep(1000);
 * 
 * if (TestUtilDemo.isElementsPresent(ReferenceLibraryOBJ.categoryTextLink)) {
 * 
 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.categoryTextLink,
 * "categoryTextLink"); Thread.sleep(1000);
 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.linkTextBox,
 * "linkTextBox only click");
 * TestUtilDemo.mouseHoverAndClick(ReferenceLibraryOBJ.crossIcon);
 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.crossDeleteButton,
 * "crossDeleteButton"); Thread.sleep(2000); }
 * 
 * }
 * 
 * @When("user click on AddReference button") public void
 * user_click_on_add_reference_button() throws Throwable {
 * 
 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.categoryTextLink,
 * "categoryTextLink"); Thread.sleep(1000); TestUtilDemo.scrollDownTillBottum();
 * 
 * ((JavascriptExecutor) driver).executeScript(
 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
 * , driver.findElement(ReferenceLibraryOBJ.addReferenceButton));
 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.addReferenceButton,
 * "addReference Button "); Thread.sleep(2000);
 * 
 * }
 * 
 * @Then("validate Newly added row can be saved with categoryName and without ID or link {string}"
 * ) public void
 * validate_newly_added_row_can_be_saved_without_id_or_link_populated(String
 * categoryTB) throws Throwable {
 * TestUtilDemo.doSendKeys(ReferenceLibraryOBJ.categoryTB, categoryTB);
 * Thread.sleep(1000); //
 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.SAVE_BUTTON, "SAVE_BUTTON"); //
 * Thread.sleep(1000);
 * 
 * }
 * 
 * @When("Validate user click on the save and complete button and then edit button and checked mark next to section is display"
 * ) public void
 * click_on_save_complete_button_and_edit_button_and_check_mark_display() throws
 * Throwable {
 * 
 * StepCommonMethod.save_complete_click_and_edit_display(ReferenceLibraryOBJ.
 * SAVE_BUTTON, ReferenceLibraryOBJ.COMPLETE_BUTTON,
 * ReferenceLibraryOBJ.EDIT_BUTTON,
 * ReferenceLibraryOBJ.ProjectSpecificDocumentsManagementCheckedMark,
 * "form completed"); }
 * 
 *//**
	 * @role PLI
	 * @section procedureManagement
	 */
/*
 * 
 * @Then("validate moving the slider to on position only deletingorpasting of link allowed in ProcedureManagement {string}"
 * ) public void editing_or_deleting_link_column(String link) throws Throwable {
 * Thread.sleep(2000);
 * 
 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.categoryTextLink,
 * "click on first Category"); Thread.sleep(2000);
 * TestUtilDemo.clearAnddoSendKeys(ReferenceLibraryOBJ.linkTextBox, link);
 * Thread.sleep(1000);
 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.SAVE_BUTTON, "SAVE_BUTTON");
 * Thread.sleep(1000); }
 * 
 * @Then("validate Newly added row can be saved with name {string} only and without ID or link"
 * ) public void
 * validate_newly_added_row_can_be_saved_without_id_or_link_populated_in_ProcedureManagement(
 * String nameTextbox) throws Throwable {
 * 
 * TestUtilDemo.doSendKeys(ReferenceLibraryOBJ.nameTextBoxdocument,
 * nameTextbox); Thread.sleep(2000);
 * 
 * }
 * 
 * @When("Validate user click on the save and complete button and then edit button and checked mark next to ProcedureManagementsection is display"
 * ) public void click_on_save_complete_button_and_edit_button_display() throws
 * Throwable {
 * 
 * StepCommonMethod.save_complete_click_and_edit_display(ReferenceLibraryOBJ.
 * SAVE_BUTTON, ReferenceLibraryOBJ.COMPLETE_BUTTON,
 * ReferenceLibraryOBJ.EDIT_BUTTON,
 * ReferenceLibraryOBJ.proceduresManagementCheckedMark, "form completed"); }
 * 
 *//**
	 * @role PLI
	 * @section clientDocumentsManagement
	 */
/*
 * 
 * @Then("validate only editing of name {string} and ID {string}, deletingorpasting of Link {string} allowed"
 * ) public void
 * validate_only_editing_of_name_and_id_deleting_pasting_of_link_allowed(String
 * name, String id, String link) throws Throwable { Thread.sleep(3000);
 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.categoryTextLink,
 * "categoryTextLink"); Thread.sleep(1000);
 * TestUtilDemo.clearAnddoSendKeys(ReferenceLibraryOBJ.nameTextBox, name);
 * Thread.sleep(1000);
 * TestUtilDemo.clearAnddoSendKeys(ReferenceLibraryOBJ.IDtextBox, id);
 * Thread.sleep(1000);
 * TestUtilDemo.clearAnddoSendKeys(ReferenceLibraryOBJ.linkTextBox, link);
 * Thread.sleep(3000);
 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.SAVE_BUTTON, "Save Button ");
 * Thread.sleep(2000); }
 * 
 * @Then("validate only editing of deletingorpasting of Link {string} allowed")
 * public void validate_only_editing_of_link_allowed(String link) throws
 * Throwable { Thread.sleep(3000);
 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.categoryTextLink,
 * "categoryTextLink"); Thread.sleep(1000);
 * TestUtilDemo.clearAnddoSendKeys(ReferenceLibraryOBJ.linkTextBox, link);
 * Thread.sleep(3000);
 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.SAVE_BUTTON, "Save Button ");
 * Thread.sleep(2000);
 * 
 * }
 * 
 * @When("validate user click on AddReference Button") public void
 * user_click_on_addreference_button() throws Throwable {
 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.addReferenceButton,
 * "addReference Button "); Thread.sleep(2000);
 * 
 * }
 * 
 *//**
	 * @role PLI
	 * @section checklistsManagement
	 */
/*
 * 
 * @When("validate Top ReferenceLibrary header is completed with cheked mark")
 * public void validate_header_is_completed() throws Throwable {
 * TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.
 * completeHeaderIconReferenceLib, "checked mark"); }
 * 
 *//**
	 * @role Piping
	 * @section ProjectSpecificDocuments
	 */
/*
 * 
 * @Then("validate ProjectSpecificDocumentsPiping section is Display and click")
 * public void user_click_on_reference_library_header_link() throws Throwable {
 * ((JavascriptExecutor) driver).executeScript(
 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
 * , driver.findElement(ReferenceLibraryOBJ.projectSpecificDocumentsPiping));
 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.projectSpecificDocumentsPiping,
 * "projectSpecificDocumentsPiping link");
 * 
 * }
 * 
 * @When("Validate user click on the save and complete button and then edit button and checked mark next to ProjectSpecificDocumentsPipingsection is display"
 * ) public void
 * click_on_save_complete_button_and_edit_button_display_in_piping() throws
 * Throwable {
 * 
 * StepCommonMethod.save_complete_click_and_edit_display(ReferenceLibraryOBJ.
 * SAVE_BUTTON, ReferenceLibraryOBJ.COMPLETE_BUTTON,
 * ReferenceLibraryOBJ.EDIT_BUTTON,
 * ReferenceLibraryOBJ.projectSpecificDocumentsPipingCheckedMark,
 * "form completed"); }
 * 
 *//**
	 * @role Piping
	 * @section clientDocumentsPiping
	 */
/*
 * 
 * @When("validate user click on ClientDocumentsPiping SubSection") public void
 * user_click_on_clientDocumentsPiping_subsection() { ((JavascriptExecutor)
 * driver).executeScript(
 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
 * , driver.findElement(ReferenceLibraryOBJ.clientDocumentsPiping));
 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.clientDocumentsPiping,
 * "clientDocumentsPiping link"); }
 * 
 * @When("validate check mark next to ClientDocumentsPiping Section is display")
 * public void validate_checkedMark_display_nextTo_clientDocumentsPiping()
 * throws Throwable { TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.
 * clientDocumentsPipingCheckedMark, "checked mark"); }
 * 
 *//**
	 * @role Piping
	 * @section proceduresPiping
	 */
/*
 * 
 * @When("validate ProceduresPiping section is Display and click") public void
 * user_click_on_ProcedurePiping_sub_section() throws Throwable {
 * ((JavascriptExecutor) driver).executeScript(
 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
 * , driver.findElement(ReferenceLibraryOBJ.proceduresPiping));
 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.proceduresPiping,
 * "proceduresPiping Section link");
 * 
 * }
 * 
 * @When("Validate user click on the save and complete button and then edit button and checked mark next to ProcedurePipingsection is display"
 * ) public void
 * click_on_save_complete_button_and_edit_button_display_in_procedure() throws
 * Throwable {
 * StepCommonMethod.save_complete_click_and_edit_display(ReferenceLibraryOBJ.
 * SAVE_BUTTON, ReferenceLibraryOBJ.COMPLETE_BUTTON,
 * ReferenceLibraryOBJ.EDIT_BUTTON,
 * ReferenceLibraryOBJ.proceduresPipingCheckedMark, "form completed"); }
 * 
 *//**
	 * @role Piping
	 * @section calculationTemplates
	 */
/*
 * 
 * @When("validate user click on calculationTemplatesPiping SubSection") public
 * void user_click_on_calculationTemplatesPiping_subsection() {
 * ((JavascriptExecutor) driver).executeScript(
 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
 * , driver.findElement(ReferenceLibraryOBJ.calculationTemplatesPiping));
 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.calculationTemplatesPiping,
 * "clientDocumentsPiping link"); }
 * 
 * @When("validate check mark next to calculationTemplatesPiping Section is display"
 * ) public void
 * validate_checkedMark_display_nextTo_calculationTemplatesPiping() throws
 * Throwable { TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.
 * calculationTemplatesCheckedMark, "checked mark"); }
 * 
 *//**
	 * @role Piping
	 * @section typicalDetailsPiping
	 */
/*
 * 
 * @When("validate user click on typicalDetailsPiping SubSection") public void
 * user_click_on_typicalDetailsPiping_subsection() { ((JavascriptExecutor)
 * driver).executeScript(
 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
 * , driver.findElement(ReferenceLibraryOBJ.typicalDetailsPiping));
 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.typicalDetailsPiping,
 * "typicalDetailsPiping link"); }
 * 
 * @When("validate check mark next to typicalDetailsPiping Section is display")
 * public void validate_checkedMark_display_nextTo_typicalDetailsPiping() throws
 * Throwable { TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.
 * typicalDetailsPipingCheckedMark, "checked mark"); }
 * 
 *//**
	 * @role Piping
	 * @section ManualsHandbooksPiping
	 */
/*
 * 
 * @When("validate user click on ManualsHandbooksPiping SubSection") public void
 * user_click_on_manualsHandbooksPiping_subsection() { ((JavascriptExecutor)
 * driver).executeScript(
 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
 * , driver.findElement(ReferenceLibraryOBJ.manualsHandbooksPiping));
 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.manualsHandbooksPiping,
 * "manualsHandbooksPiping link"); }
 * 
 * @When("validate check mark next to ManualsHandbooksPiping Section is display"
 * ) public void validate_checkedMark_display_nextTo_manualsHandbooksPiping()
 * throws Throwable { TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.
 * manualsHandbooksPipingCheckedMark, "checked mark"); }
 * 
 *//**
	 * @role Piping
	 * @section trainingPiping
	 */
/*
 * 
 * @When("validate user click on trainingPiping SubSection") public void
 * user_click_on_trainingPiping_subsection() { ((JavascriptExecutor)
 * driver).executeScript(
 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
 * , driver.findElement(ReferenceLibraryOBJ.trainingPiping));
 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.trainingPiping,
 * "trainingPiping link"); }
 * 
 * @When("validate check mark next to trainingPiping Section is display") public
 * void validate_checkedMark_display_next_TotrainingPiping() throws Throwable {
 * TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.trainingPipingCheckedMark,
 * "checked mark"); }
 * 
 *//**
	 * @role Piping
	 * @section otherPiping
	 */
/*
 * 
 * @When("validate user click on otherPiping SubSection") public void
 * user_click_on_otherPiping_subsection() { ((JavascriptExecutor)
 * driver).executeScript(
 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
 * , driver.findElement(ReferenceLibraryOBJ.otherPiping));
 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.otherPiping,
 * "otherPiping link"); }
 * 
 * @When("validate check mark next to otherPiping Section is display") public
 * void validate_checkedMark_display_nextTo_otherPiping() throws Throwable {
 * TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.otherPipingCheckedMark,
 * "checked mark"); }
 * 
 *//**
	 * @role Piping
	 * @section checklistsPiping
	 */
/*
 * 
 * @When("validate user click on checklistsPiping SubSection") public void
 * user_click_on_checklistsPiping_subsection() { ((JavascriptExecutor)
 * driver).executeScript(
 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
 * , driver.findElement(ReferenceLibraryOBJ.checklistsPiping));
 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.checklistsPiping,
 * "checklistsPiping link"); }
 * 
 * @When("validate check mark next to checklistsPiping Section is display")
 * public void validate_checkedMark_display_nextTo_checklistsPiping() throws
 * Throwable { TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.
 * checklistsPipingCheckedMark, "checked mark"); }
 * 
 *//**
	 * @role Process
	 * @section ProjectSpecificDocumentsProcess
	 */
/*
 * 
 * @Then("validate ProjectSpecificDocumentsProcess section is Display and click"
 * ) public void user_click_on_ProjectSpecificDocumentsProcess_link() throws
 * Throwable {
 * 
 * ((JavascriptExecutor) driver).executeScript(
 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
 * , driver.findElement(ReferenceLibraryOBJ.projectSpecificDocumentsProcess));
 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.
 * projectSpecificDocumentsProcess, "projectSpecificDocumentsProcess"); }
 * 
 * @When("Validate user click on the save and complete button and then edit button and checked mark next to ProjectSpecificDocumentsProcesssection is display"
 * ) public void
 * click_on_save_complete_button_and_edit_button_display_in_process() throws
 * Throwable {
 * 
 * StepCommonMethod.save_complete_click_and_edit_display(ReferenceLibraryOBJ.
 * SAVE_BUTTON, ReferenceLibraryOBJ.COMPLETE_BUTTON,
 * ReferenceLibraryOBJ.EDIT_BUTTON,
 * ReferenceLibraryOBJ.projectSpecificDocumentsProcessCheckedMark,
 * "form completed"); }
 * 
 *//**
	 * @throws Throwable
	 * @role Process
	 * @section clientDocumentsProcess
	 */
/*
 * 
 * @When("validate user click on clientDocumentsProcess SubSection") public void
 * user_click_on_clientDocumentsProcess_subsection() throws Throwable {
 * 
 * ((JavascriptExecutor) driver).executeScript(
 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
 * , driver.findElement(ReferenceLibraryOBJ.clientDocumentsProcess));
 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.clientDocumentsProcess,
 * "clientDocumentsProcess link"); Thread.sleep(3000); }
 * 
 * @When("validate check mark next to clientDocumentsProcess Section is display"
 * ) public void validate_checkedMark_display_nextTo_clientDocumentsProcess()
 * throws Throwable { TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.
 * clientDocumentsProcessCheckedMark, "checked mark"); }
 * 
 *//**
	 * @role Process
	 * @section ProceduresProcess
	 */
/*
 * 
 * @When("validate ProceduresProcess section is Display and click") public void
 * user_click_on_ProcedureProcess_sub_section() throws Throwable {
 * ((JavascriptExecutor) driver).executeScript(
 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
 * , driver.findElement(ReferenceLibraryOBJ.proceduresProcess));
 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.proceduresProcess,
 * "proceduresProcess Section link");
 * 
 * }
 * 
 * @When("Validate user click on the save and complete button and then edit button and checked mark next to ProcedureProcesssection is display"
 * ) public void
 * click_on_save_complete_button_and_edit_button_display_in_procedureProcess()
 * throws Throwable {
 * StepCommonMethod.save_complete_click_and_edit_display(ReferenceLibraryOBJ.
 * SAVE_BUTTON, ReferenceLibraryOBJ.COMPLETE_BUTTON,
 * ReferenceLibraryOBJ.EDIT_BUTTON,
 * ReferenceLibraryOBJ.proceduresProcessCheckedMark, "form completed"); }
 * 
 *//**
	 * @role Process
	 * @section calculationTemplatesProcess
	 */
/*
 * 
 * @When("validate user click on calculationTemplatesProcess SubSection") public
 * void user_click_on_calculationTemplatesProcess_subsection() {
 * ((JavascriptExecutor) driver).executeScript(
 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
 * , driver.findElement(ReferenceLibraryOBJ.calculationTemplatesProcess));
 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.calculationTemplatesProcess,
 * "calculationTemplatesProcess link"); }
 * 
 * @When("validate check mark next to calculationTemplatesProcess Section is display"
 * ) public void
 * validate_checkedMark_display_nextTo_calculationTemplatesProcess() throws
 * Throwable { TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.
 * calculationTemplatesProcessCheckedMark, "checked mark"); }
 * 
 *//**
	 * @role Process
	 * @section typicalDetailsProcess
	 */
/*
 * 
 * @When("validate user click on typicalDetailsProcess SubSection") public void
 * user_click_on_typicalDetailsProcess_subsection() { ((JavascriptExecutor)
 * driver).executeScript(
 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
 * , driver.findElement(ReferenceLibraryOBJ.typicalDetailsProcess));
 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.typicalDetailsProcess,
 * "typicalDetailsProcess link"); }
 * 
 * @When("validate check mark next to typicalDetailsProcess Section is display")
 * public void validate_checkedMark_display_nextTo_typicalDetailsProcess()
 * throws Throwable { TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.
 * typicalDetailsProcessCheckedMark, "checked mark"); }
 * 
 *//**
	 * @role Process
	 * @section manualsHandbooksProcess
	 */
/*
 * 
 * @When("validate user click on manualsHandbooksProcess SubSection") public
 * void user_click_on_manualsHandbooksProcess_subsection() {
 * ((JavascriptExecutor) driver).executeScript(
 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
 * , driver.findElement(ReferenceLibraryOBJ.manualsHandbooksProcess));
 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.manualsHandbooksProcess,
 * "manualsHandbooksProcess link"); }
 * 
 * @When("validate check mark next to manualsHandbooksProcess Section is display"
 * ) public void validate_checkedMark_display_nextTo_ManualsHandbooksProcess()
 * throws Throwable { TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.
 * manualsHandbooksProcessCheckedMark, "checked mark"); }
 * 
 *//**
	 * @role Process
	 * @section trainingProcess
	 */
/*
 * 
 * @When("validate user click on trainingProcess SubSection") public void
 * user_click_on_trainingProcess_subsection() { ((JavascriptExecutor)
 * driver).executeScript(
 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
 * , driver.findElement(ReferenceLibraryOBJ.trainingProcess));
 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.trainingProcess,
 * "trainingProcess link"); }
 * 
 * @When("validate check mark next to trainingProcess Section is display")
 * public void validate_checkedMark_display_nextTo_trainingProcess() throws
 * Throwable {
 * TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.trainingProcessCheckedMark,
 * "checked mark"); }
 * 
 *//**
	 * @role Process
	 * @section otherProcess
	 */
/*
 * 
 * @When("validate user click on otherProcess SubSection") public void
 * user_click_on_otherProcess_subsection() { ((JavascriptExecutor)
 * driver).executeScript(
 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
 * , driver.findElement(ReferenceLibraryOBJ.otherProcess));
 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.otherProcess,
 * "otherProcess link"); }
 * 
 * @When("validate check mark next to otherProcess Section is display") public
 * void validate_checkedMark_display_nextTo_otherProcess() throws Throwable {
 * TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.otherProcessCheckedMark,
 * "checked mark"); }
 * 
 *//**
	 * @role Process
	 * @section checklistsProcess
	 */
/*
 * 
 * @When("validate user click on checklistsProcess SubSection") public void
 * user_click_on_checklistsProcess_subsection() { ((JavascriptExecutor)
 * driver).executeScript(
 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
 * , driver.findElement(ReferenceLibraryOBJ.checklistsProcess));
 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.checklistsProcess,
 * "checklistsProcess link"); }
 * 
 * @When("validate check mark next to checklistsProcess Section is display")
 * public void validate_checkedMark_display_nextTo_checklistsProcess() throws
 * Throwable { TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.
 * checklistsProcessCheckedMark, "checked mark"); }
 * 
 *//**
	 * @role Equipment
	 * @section projectSpecificDocumentsEquipment
	 */
/*
 * 
 * @Then("validate ProjectSpecificDocumentsEquipment section is Display and click"
 * ) public void user_click_on_ProjectSpecificDocumentsEquipment() throws
 * Throwable { ((JavascriptExecutor) driver).executeScript(
 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
 * , driver.findElement(ReferenceLibraryOBJ.projectSpecificDocumentsEquipment));
 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.
 * projectSpecificDocumentsEquipment, "projectSpecificDocumentsEquipment");
 * 
 * }
 * 
 * @When("Validate user click on the save and complete button and then edit button and checked mark next to ProjectSpecificDocumentsEquipmentsection is display"
 * ) public void
 * click_on_save_complete_button_and_edit_button_display_in_Equipment() throws
 * Throwable {
 * 
 * StepCommonMethod.save_complete_click_and_edit_display(ReferenceLibraryOBJ.
 * SAVE_BUTTON, ReferenceLibraryOBJ.COMPLETE_BUTTON,
 * ReferenceLibraryOBJ.EDIT_BUTTON,
 * ReferenceLibraryOBJ.projectSpecificDocumentsEquipmentCheckedMark,
 * "form completed"); Thread.sleep(4000); }
 * 
 *//**
	 * @throws InterruptedException
	 * @role Equipment
	 * @section clientDocumentsEquipment
	 */
/*
 * 
 * @When("validate user click on ClientDocumentsEquipment SubSection") public
 * void user_click_on_clientDocumentsEquipment_subsection() throws
 * InterruptedException { ((JavascriptExecutor) driver).executeScript(
 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
 * , driver.findElement(ReferenceLibraryOBJ.clientDocumentsEquipment));
 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.clientDocumentsEquipment,
 * "clientDocumentsEquipment link"); Thread.sleep(4000); }
 * 
 * @When("validate check mark next to ClientDocumentsEquipment Section is display"
 * ) public void validate_checkedMark_display_nextTo_clientDocumentsEquipment()
 * throws Throwable { TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.
 * clientDocumentsEquipmentCheckedMark, "checked mark"); }
 * 
 *//**
	 * @role Equipment
	 * @section clientDocumentsEquipment
	 */
/*
 * 
 * @When("validate ProceduresEquipment section is Display and click") public
 * void user_click_on_ProcedureEquipment_sub_section() throws Throwable {
 * ((JavascriptExecutor) driver).executeScript(
 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
 * , driver.findElement(ReferenceLibraryOBJ.proceduresEquipment));
 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.proceduresEquipment,
 * "proceduresEquipment Section link");
 * 
 * }
 * 
 * @When("Validate user click on the save and complete button and then edit button and checked mark next to ProcedureEquipmentsection is display"
 * ) public void
 * click_on_save_complete_button_and_edit_button_display_in_Equipment1() throws
 * Throwable {
 * StepCommonMethod.save_complete_click_and_edit_display(ReferenceLibraryOBJ.
 * SAVE_BUTTON, ReferenceLibraryOBJ.COMPLETE_BUTTON,
 * ReferenceLibraryOBJ.EDIT_BUTTON,
 * ReferenceLibraryOBJ.proceduresEquipmentCheckedMark, "form completed"); }
 * 
 *//**
	 * @role Equipment
	 * @section calculationTemplatesEquipment
	 */
/*
 * 
 * @When("validate user click on calculationTemplatesEquipment SubSection")
 * public void user_click_on_calculationTemplatesEquipment_subsection() {
 * ((JavascriptExecutor) driver).executeScript(
 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
 * , driver.findElement(ReferenceLibraryOBJ.calculationTemplatesEquipment));
 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.calculationTemplatesEquipment,
 * "clientDocumentsEquipment link"); }
 * 
 * @When("validate check mark next to calculationTemplatesEquipment Section is display"
 * ) public void
 * validate_checkedMark_display_nextTo_calculationTemplatesEquipment() throws
 * Throwable { TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.
 * calculationTemplatesEquipmentCheckedMark, "checked mark"); }
 * 
 *//**
	 * @role Equipment
	 * @section typicalDetailsEquipment
	 */
/*
 * 
 * @When("validate user click on typicalDetailsEquipment SubSection") public
 * void user_click_on_typicalDetailsEquipment_subsection() {
 * ((JavascriptExecutor) driver).executeScript(
 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
 * , driver.findElement(ReferenceLibraryOBJ.typicalDetailsEquipment));
 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.typicalDetailsEquipment,
 * "typicalDetailsEquipment link"); }
 * 
 * @When("validate check mark next to typicalDetailsEquipment Section is display"
 * ) public void validate_checkedMark_display_nextTo_typicalDetailsEquipment()
 * throws Throwable { TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.
 * typicalDetailsEquipmentCheckedMark, "checked mark"); }
 * 
 *//**
	 * @role Equipment
	 * @section manualsHandbooksEquipment
	 */
/*
 * 
 * @When("validate user click on ManualsHandbooksEquipment SubSection") public
 * void user_click_on_manualsHandbooksEquipment_subsection() {
 * ((JavascriptExecutor) driver).executeScript(
 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
 * , driver.findElement(ReferenceLibraryOBJ.manualsHandbooksEquipment));
 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.manualsHandbooksEquipment,
 * "manualsHandbooksEquipment link"); }
 * 
 * @When("validate check mark next to ManualsHandbooksEquipment Section is display"
 * ) public void validate_checkedMark_display_nextTo_manualsHandbooksEquipment()
 * throws Throwable { TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.
 * manualsHandbooksEquipmentCheckedMark, "checked mark"); }
 * 
 *//**
	 * @role Equipment
	 * @section trainingEquipment
	 */
/*
 * 
 * @When("validate user click on trainingEquipment SubSection") public void
 * user_click_on_trainingEquipment_subsection() { ((JavascriptExecutor)
 * driver).executeScript(
 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
 * , driver.findElement(ReferenceLibraryOBJ.trainingEquipment));
 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.trainingEquipment,
 * "trainingEquipment link"); }
 * 
 * @When("validate check mark next to trainingEquipment Section is display")
 * public void validate_checkedMark_display_next_TotrainingEquipment() throws
 * Throwable { TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.
 * trainingEquipmentCheckedMark, "checked mark"); }
 * 
 *//**
	 * @role Equipment
	 * @section otherEquipment
	 */
/*
 * 
 * @When("validate user click on otherEquipment SubSection") public void
 * user_click_on_otherEquipment_subsection() { ((JavascriptExecutor)
 * driver).executeScript(
 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
 * , driver.findElement(ReferenceLibraryOBJ.otherEquipment));
 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.otherEquipment,
 * "otherEquipment link"); }
 * 
 * @When("validate check mark next to otherEquipment Section is display") public
 * void validate_checkedMark_display_nextTo_otherEquipment() throws Throwable {
 * TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.otherEquipmentCheckedMark,
 * "checked mark"); }
 * 
 *//**
	 * @role Equipment
	 * @section checklistsEquipment
	 *//*
		 * @When("validate user click on checklistsEquipment SubSection") public void
		 * user_click_on_checklistsEquipment_subsection() { ((JavascriptExecutor)
		 * driver).executeScript(
		 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
		 * , driver.findElement(ReferenceLibraryOBJ.checklistsEquipment));
		 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.checklistsEquipment,
		 * "checklistsEquipment link"); }
		 * 
		 * @When("validate check mark next to checklistsEquipment Section is display")
		 * public void validate_checkedMark_display_nextTo_checklistsEquipment() throws
		 * Throwable { TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.
		 * checklistsEquipmentCheckedMark, "checked mark"); } }
		 */