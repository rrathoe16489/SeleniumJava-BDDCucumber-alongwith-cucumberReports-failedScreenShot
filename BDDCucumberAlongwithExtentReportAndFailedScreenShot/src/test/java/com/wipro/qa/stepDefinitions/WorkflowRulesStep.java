package com.wipro.qa.stepDefinitions;

import com.wipro.qa.base.TestBase;
import com.wipro.qa.util.WorkflowRulesOBJ;
import com.wipro.qa.util.ProjectInfoOBJ;
import com.wipro.qa.util.StepCommonMethod;
import com.wipro.qa.util.TestUtilDemo;
import com.wipro.qa.util.WBSInformationOBJ;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

/**
 * @authorID Rat105478
 * @authorName RameshRathod
 */

public class WorkflowRulesStep extends TestBase {

	@Then("validate Upon selecting FragnetStep boxes, I can view the default durations tied to each step")
	public void default_duration_display_by_selectingboxes() throws Throwable {
		TestUtilDemo.mouseHover(WorkflowRulesOBJ.InHouseReviewLabel);
		Thread.sleep(3000);
		TestUtilDemo.mouseHoverAndClick(WorkflowRulesOBJ.InHouseReviewLabelSelect);
		Thread.sleep(3000);
		TestUtilDemo.scrollDownTillBottum();
		TestUtilDemo.isElementPresent(WorkflowRulesOBJ.InHouseReviewLabeldurations, "InHouseReviewLabeldurations");
	}

	@Then("validate when a duration needs to be changed, I can edit the durations by selecting the duration field")
	public void editing_duration_manually() throws Throwable {
		TestUtilDemo.doSendKeys(WorkflowRulesOBJ.InHouseReviewLabeldurations, "7");
		Thread.sleep(3000);
	}

	@Then("validate PLI is displayed a generic workflow with Create, and Issue for Construction static; In-House Review, Client Review, Combined IHR & Client Review, and 3rd-Party Review are selectable")
	public void validate_PLI_is_displayed_a_generic_workflow_with_Create_and_Issue_for_Construction_static_In_House_Review_Client_Review_Combined_IHR_Client_Review_and_3rd_Party_Review_are_selectable() {
		TestUtilDemo.isElementPresent(WorkflowRulesOBJ.InHouseReviewLabel, "InHouseReviewLabel");
		TestUtilDemo.isElementPresent(WorkflowRulesOBJ.ClientReviewLabel, "ClientReviewLabel");
		TestUtilDemo.isElementPresent(WorkflowRulesOBJ.CombinedIHRClientReviewLabel, "CombinedIHRClientReviewLabel");
		TestUtilDemo.isElementPresent(WorkflowRulesOBJ.ThirdPartyReviewLabel, "ThirdPartyReviewLabel");
		
	}

	@Then("validate If the box is unselected, upon hovering over a box, a select button appears")
	public void validate_select_button_appear() throws Throwable {
		TestUtilDemo.mouseHover(WorkflowRulesOBJ.InHouseReviewLabel);
		Thread.sleep(3000);
		TestUtilDemo.isElementPresent(WorkflowRulesOBJ.InHouseReviewLabelSelect,"InHouseReviewLabelSelect");
		Thread.sleep(3000);
	}

	@Then("validate Selecting box displays a check in the upper left corner")
	public void validate_Selecting_box_displays_a_check_in_the_upper_left_corner() {

	}

	@Then("validate If In-House Review or Client Review is selected, Combined IHR & Client Review CANNOT be selected and vice versa")
	public void validate_combinedHR_is_clickable_or_not() throws Throwable {
		TestUtilDemo.mouseHover(WorkflowRulesOBJ.ClientReviewLabel);
		Thread.sleep(3000);
		TestUtilDemo.mouseHoverAndClick(WorkflowRulesOBJ.ClientReviewLabelSelect);
		Thread.sleep(3000);
		TestUtilDemo.mouseHover(WorkflowRulesOBJ.CombinedIHRClientReviewLabel);
		Thread.sleep(3000);
		TestUtilDemo.mouseHover(WorkflowRulesOBJ.ThirdPartyReviewLabel);
		Thread.sleep(3000);
		TestUtilDemo.mouseHoverAndClick(WorkflowRulesOBJ.ThirdPartyReviewLabelSelect);
		Thread.sleep(3000);
		
	}

	@Then("validate In-House Review \\(either alone or combined with Client Review) is a mandatory selection.")
	public void checking_mendatoty_box_selection() {

	}

	@Then("validate If the box is selected, upon hovering over a box, a deselect button appears")
	public void deSelect_button_appear() throws Throwable {
		TestUtilDemo.mouseHover(WorkflowRulesOBJ.InHouseReviewLabel);
		Thread.sleep(3000);
		TestUtilDemo.isElementPresent(WorkflowRulesOBJ.InHouseReviewLabelDeSelect,"InHouseReviewLabelDeSelect");
		Thread.sleep(3000);
	}

	@Then("validate Deselecting box removed check from upper left corner.")
	public void deSelecting_boxes() throws Throwable {
		TestUtilDemo.mouseHover(WorkflowRulesOBJ.InHouseReviewLabel);
		Thread.sleep(2000);
		TestUtilDemo.mouseHoverAndClick(WorkflowRulesOBJ.InHouseReviewLabelDeSelect);
		Thread.sleep(2000);
		TestUtilDemo.mouseHoverAndClick(WorkflowRulesOBJ.InHouseReviewLabelSelect);
		Thread.sleep(3000);
		
	}
	@Then("validate Top defineWorkFlow header is completed with cheked mark")
	public void validate_ProjectInfoHeader_check_is_display() {
		TestUtilDemo.isElementPresent(WorkflowRulesOBJ.completeHeaderIconWorkflowRules, "complete Header icon");
		
	}
}
