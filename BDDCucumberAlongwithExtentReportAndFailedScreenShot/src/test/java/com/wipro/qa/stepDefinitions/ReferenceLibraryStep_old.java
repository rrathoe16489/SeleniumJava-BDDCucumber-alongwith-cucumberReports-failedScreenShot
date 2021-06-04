package com.wipro.qa.stepDefinitions;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.JavascriptExecutor;
import com.wipro.qa.base.TestBase;
import com.wipro.qa.util.ReferenceLibraryOBJ;
import com.wipro.qa.util.TestUtilDemo;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @authorID Rat105478
 * @authorName RameshRathod
 */

public class ReferenceLibraryStep_old extends TestBase {

	public static String date = "ssmm";
	static SimpleDateFormat sdf = new SimpleDateFormat(date);
	public static String refID = sdf.format(new Date());

	/**
	 * @role PLI
	 * @header ReferenceLibrary
	 */
	@When("Validate user when moving the slider to on position")
	public void validate_user_when_moving_the_slider_to_on_position() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.toggle, "toggle on");
	}

	@Then("validate moving the slider to on position only editing of name {string} and ID, deletingorpasting of Link {string} allowed")
	public void validate_editing_after_moving_the_slider_to_on_position(String name, String link) throws Throwable {
		if (TestUtilDemo.isElementsPresent(ReferenceLibraryOBJ.categoryTextLink)) {
			TestUtilDemo.clickElement(ReferenceLibraryOBJ.categoryTextLink, "categoryTextLink");
			Thread.sleep(1000);
		}
		TestUtilDemo.clearAnddoSendKeys(ReferenceLibraryOBJ.nameTextBox, name);
		TestUtilDemo.clearAnddoSendKeys(ReferenceLibraryOBJ.IDtextBox, refID);
		TestUtilDemo.clearAnddoSendKeys(ReferenceLibraryOBJ.linkTextBox, link);
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.SAVE_BUTTON, "Save Button ");

	}

	@Then("Validate Hovering over link cell will display entire link")
	public void validate_hovering_over_link_cell_will_display_entire_link() throws Throwable {
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
				driver.findElement(ReferenceLibraryOBJ.googleLink));
		TestUtilDemo.mouseHover(ReferenceLibraryOBJ.googleLink);
		Thread.sleep(4000);

	}

	@Then("Validate user can save the updated data and link will become a hyperlink to open the file or website")
	public void validate_user_can_save_the_updated_data_and_link_will_become_a_hyperlink_to_open_the_file_or_website()
			throws Throwable {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.googleLink, "googleLink");
		Thread.sleep(1000);
		// get current window
		String mainWindowHandle = driver.getWindowHandles().iterator().next();
		// switch back
		driver.switchTo().window(mainWindowHandle);
	}

	@When("Validate clicking in the link cell for a given row that already has a link populated the PLI can choose to delete the link by selecting X icon")
	public void deleting_existing_row() throws Throwable {

		if (TestUtilDemo.isElementsPresent(ReferenceLibraryOBJ.categoryTextLink)) {
			TestUtilDemo.clickElement(ReferenceLibraryOBJ.categoryTextLink, "categoryTextLink");
			Thread.sleep(1000);
			TestUtilDemo.clickElement(ReferenceLibraryOBJ.linkTextBox, "linkTextBox only click");
			TestUtilDemo.mouseHoverAndClick(ReferenceLibraryOBJ.crossIcon);
			TestUtilDemo.clickElement(ReferenceLibraryOBJ.crossDeleteButton, "crossDeleteButton");
			Thread.sleep(2000);
		}

	}

	@When("validate user click on AddReference button")
	public void user_click_on_add_reference_button() throws Throwable {
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
				driver.findElement(ReferenceLibraryOBJ.addReferenceButton));
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.addReferenceButton, "addReference Button ");
		Thread.sleep(2000);
	}

	@Then("validate Newly added row can be saved with categoryName and without ID or link {string}")
	public void validate_newly_added_row_can_be_saved_without_id_or_link_populated(String categoryTB) throws Throwable {
		TestUtilDemo.doSendKeys(ReferenceLibraryOBJ.categoryTB, categoryTB);
	}

	@Then("validate moving the slider to on position only deletingorpasting of link allowed in ProcedureManagement {string}")
	public void editing_or_deleting_link_column(String link) throws Throwable {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.categoryTextLink, "click on first Category");
		TestUtilDemo.clearAnddoSendKeys(ReferenceLibraryOBJ.linkTextBox, link);
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.SAVE_BUTTON, "SAVE_BUTTON");
	}

	@Then("validate Newly added row can be saved with name {string} only and without ID or link")
	public void validate_newly_added_row_can_be_saved_without_id_or_link_populated_in_ProcedureManagement(
			String nameTextbox) throws Throwable {
		TestUtilDemo.doSendKeys(ReferenceLibraryOBJ.nameTextBoxdocument, nameTextbox);
	}

	@When("validate Top ReferenceLibrary header is completed with cheked mark")
	public void validate_header_is_completed() throws Throwable {
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.completeHeaderIconReferenceLib, "checked mark");
	}
	
	@Then("Validate user can copy the existing row then Category copied and all other columns blank and Save Complete and Edit button click")
	public void validate_user_can_copy_the_existing_row_then_category_copied_and_all_other_columns_blank_and_Save_Complete_and_Edit_button_click()
			throws Throwable {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.copyIcon, "copyIcon Icon ");
		Thread.sleep(2000);
	}

}
