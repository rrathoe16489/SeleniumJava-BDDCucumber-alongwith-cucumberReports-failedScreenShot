package com.wipro.qa.util;

import org.openqa.selenium.By;
import com.wipro.qa.base.TestBase;

/**
 * @authorID Rat105478
 * @authorName RameshRathod
 */

public class WorkflowRulesOBJ extends TestBase {
	
	public static By workFlowRuleHeader = By.xpath ("//div[text()='Workflow Rules']");
	public static By workFlowRuleHeaderLink = By.xpath ("//a[@href='/projectSetup/workflowRules']");
	public static By CreateLabel = By.xpath ("//label[text()='Create']");
	public static By InHouseReviewLabel = By.xpath ("//label[text()='In-House Review']");
	public static By ClientReviewLabel = By.xpath ("//label[text()='Client Review']");
	public static By CombinedIHRClientReviewLabel = By.xpath ("//label[text()='Combined IHR & Client Review']");
	public static By ThirdPartyReviewLabel = By.xpath ("//label[text()='3rd Party Review']");
	public static By IssueforConstructionLabel = By.xpath("//label[text()='Issue for Construction']");
	
	public static By InHouseReviewLabelSelect = By.xpath ("//label[text()='In-House Review']//parent::div//button[text()='Select']");
	public static By ClientReviewLabelSelect = By.xpath ("//label[text()='Client Review']//parent::div//button[text()='Select']");
	public static By CombinedIHRClientReviewLabelSelect = By.xpath ("//label[text()='Combined IHR & Client Review']//parent::div//button[text()='Select']");
	public static By ThirdPartyReviewLabelSelect = By.xpath ("//label[text()='3rd Party Review']//parent::div//button[text()='Select']");
	
	public static By InHouseReviewLabelDeSelect = By.xpath ("//label[text()='In-House Review']//parent::div//button[text()='Deselect']");
		
	public static By InHouseReviewLabeldurations = By.xpath ("//label[text()='In-House Review']//parent::div//input[@type='number']");
	public static By ClientReviewLabeldurations = By.xpath ("//label[text()='Client Review']//parent::div//input[@type='number']");
	public static By CombinedIHRClientReviewLabeldurations = By.xpath ("//label[text()='Combined IHR & Client Review']//parent::div//input[@type='number']");
	public static By ThirdPartyReviewLabeldurations = By.xpath ("//label[text()='3rd-Party Review']//parent::div//input[@type='number']");
	
	public static By RESET_BUTTON= By.xpath("//button[text()='Save']//parent::div//button[text()='Reset']");
	public static By SAVE_BUTTON = By.xpath("//button[text()='Reset']//parent::div//button[text()='Save']");
	public static By COMPLETE_BUTTON= By.xpath("//button[text()='Reset']//parent::div//button[text()='Complete']");
	public static By EDIT_BUTTON= By.xpath ("//button[text()='Edit']");

	public static By completeHeaderIconWorkflowRules  = By.xpath ("//div[text()='Workflow Rules']//parent::a//img[@src='/static/media/completed.0bc5e4c8.svg']");
	
}
