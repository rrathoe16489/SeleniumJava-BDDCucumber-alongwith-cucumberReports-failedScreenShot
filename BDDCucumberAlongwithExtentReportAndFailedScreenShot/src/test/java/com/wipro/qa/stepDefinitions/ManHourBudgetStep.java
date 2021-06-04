package com.wipro.qa.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import com.wipro.qa.base.TestBase;
import com.wipro.qa.util.ManHourBudgetOBJ;
import com.wipro.qa.util.TestUtilDemo;
import io.cucumber.java.en.Then;

/**
 * @authorID Rat105478
 * @authorName RameshRathod
 */

public class ManHourBudgetStep extends TestBase {

	@Then("validate user fill the data in {string},{string},{string},{string},{string}")
	public void validate_fill_the_data_in_tieInListAndDetails_activity(String activityName, String uSENGHours,
			String uSDSGNHours, String oUSENGHours, String oUSDSGNHours) throws Throwable {
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
				driver.findElement(By.xpath("//td[text()='" + activityName + "']")));
		TestUtilDemo.doSendKeys(By.xpath("//td[text()='" + activityName + "']//parent::tr//td[2]/div/div/input"),
				uSENGHours);
		Thread.sleep(3000);

	}

	@Then("validate manHourBudget header is completed with cheked mark")
	public void validate_topHeader_check_is_display_manHourBudget() {
		TestUtilDemo.isElementPresent(ManHourBudgetOBJ.completeHeaderManHour, "complete Header icon");

	}
}
