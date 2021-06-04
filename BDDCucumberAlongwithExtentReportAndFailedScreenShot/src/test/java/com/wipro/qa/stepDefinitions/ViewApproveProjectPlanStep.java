package com.wipro.qa.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import com.wipro.qa.base.TestBase;
import com.wipro.qa.util.TestUtilDemo;
import com.wipro.qa.util.ViewApproveFullProjectPlanOBJ;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @authorID Rat105478
 * @authorName RameshRathod
 */

public class ViewApproveProjectPlanStep extends TestBase {

	@Then("verify the Day Scale in Preliminary Discipline Plan {string},{string},{string}")
	public void click_and_select_dayScale_value(String day, String week, String month) throws Throwable {
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
				driver.findElement(ViewApproveFullProjectPlanOBJ.dayScaleDD));
		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.dayScaleDD, "");
		TestUtilDemo.clickElement(By.xpath("//ul[@class='dropdown-menu p-2']/li[text()='" + day + "']"), "day select");
		Thread.sleep(4000);

		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.dayScaleDD, "");
		TestUtilDemo.clickElement(By.xpath("//ul[@class='dropdown-menu p-2']/li[text()='" + week + "']"), "day select");
		Thread.sleep(4000);

		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.dayScaleDD, "");
		TestUtilDemo.clickElement(By.xpath("//ul[@class='dropdown-menu p-2']/li[text()='" + month + "']"),
				"day select");
		Thread.sleep(4000);
	}

	@When("verify user apply the filter by clicking on the filter icon {string}")
	public void validate_filter(String gdUser) throws Throwable {
		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.filterIcon, "");
		if (gdUser.equals("piping@bv.com")) {
			((JavascriptExecutor) driver).executeScript(
					"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
					driver.findElement(ViewApproveFullProjectPlanOBJ.pipingcheckbox));
			TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.pipingcheckbox, "checkbox click");
			Thread.sleep(2000);
		}

		if (gdUser.equals("process@bv.com")) {
			((JavascriptExecutor) driver).executeScript(
					"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
					driver.findElement(ViewApproveFullProjectPlanOBJ.processcheckbox));
			TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.processcheckbox, "checkbox click");
			Thread.sleep(2000);
		}

		if (gdUser.equals("equipment@bv.com")) {
			((JavascriptExecutor) driver).executeScript(
					"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
					driver.findElement(ViewApproveFullProjectPlanOBJ.equipmentcheckbox));
			TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.equipmentcheckbox, "checkbox click");
			Thread.sleep(2000);
		}

		if (TestUtilDemo.isElementsPresent(ViewApproveFullProjectPlanOBJ.pipingCheckBox)) {
			((JavascriptExecutor) driver).executeScript(
					"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
					driver.findElement(ViewApproveFullProjectPlanOBJ.pipingCheckBox));
			TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.pipingCheckBox, "pipingcheckbox click");
			Thread.sleep(2000);
		}

		if (TestUtilDemo.isElementsPresent(ViewApproveFullProjectPlanOBJ.filterApplyButtonReferenceLib)) {
			TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.filterApplyButtonReferenceLib, " click");
			Thread.sleep(4000);
		}

		if (TestUtilDemo.isElementsPresent(ViewApproveFullProjectPlanOBJ.filterApplyButton)) {
			TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.filterApplyButton, "");
			Thread.sleep(3000);
		}

	}

	@Then("validate DPS user will select Project Activity gantt view full page form {string}")
	public void validate_permission_for_projectActivity(String value) throws Throwable {

		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
				driver.findElement(By.xpath(
						"//div[@class='gantt_row gantt_row_task'][1]/div[3]/div[3]/span[text()='" + value + "']")));
		TestUtilDemo.clickElement(
				By.xpath("//div[@class='gantt_row gantt_row_task'][1]/div[3]/div[3]/span[text()='" + value + "']"),
				"Project Activity select");
		Thread.sleep(4000);
	}

	@Then("verify the Project Activity details when clicking on ViewEdit Full Information Link")
	public void validate_clicking_on_ViewEditFullInformation() throws Throwable {
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
				driver.findElement(ViewApproveFullProjectPlanOBJ.viewEditFullInformationLink));
		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.viewEditFullInformationLink, "");
		Thread.sleep(2000);

	}

	@SuppressWarnings("deprecation")
	@Then("validate DPS user will check editing permissions from the {string} gantt view full page form")
	public void validate_edit_permission(String value) throws Throwable {
		boolean flag = TestUtilDemo.isElementsPresent(ViewApproveFullProjectPlanOBJ.editFormLink);
		Assert.assertFalse("Edit Button not available", flag);

	}

	@Then("verify when projectUser clicks on Back")
	public void validate_clickOn_backBtn() throws Throwable {
		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.backButton, "overviewSection link");
		Thread.sleep(5000);
	}

	@Then("validate DPS user will select FragnetStep gantt view full page form {string}")
	public void validate_permission_for_fragnetStep(String value) throws Throwable {

		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
				driver.findElement(By.xpath(
						"//div[@class='gantt_row odd gantt_row_task'][1]/div[3]/div[4]/span[text()='" + value + "']")));
		TestUtilDemo.clickElement(
				By.xpath("//div[@class='gantt_row odd gantt_row_task'][1]/div[3]/div[4]/span[text()='" + value + "']"),
				"FragnetStep select");
		Thread.sleep(4000);
	}

	@Then("validate DPS user will select Gig gantt view full page form {string}")
	public void validate_permission_for_gig(String value) throws Throwable {

		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
				driver.findElement(By.xpath(
						"//div[@class='gantt_row gantt_row_task'][2]/div[3]/div[5]/span[text()='" + value + "']")));
		TestUtilDemo.clickElement(
				By.xpath("//div[@class='gantt_row gantt_row_task'][2]/div[3]/div[5]/span[text()='" + value + "']"),
				"Gig select");
		Thread.sleep(4000);
	}

}
