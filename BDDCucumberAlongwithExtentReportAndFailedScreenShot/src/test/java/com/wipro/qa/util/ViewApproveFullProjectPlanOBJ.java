package com.wipro.qa.util;

import org.openqa.selenium.By;
import com.wipro.qa.base.TestBase;

/**
 * @authorID Rat105478
 * @authorName RameshRathod
 */

public class ViewApproveFullProjectPlanOBJ extends TestBase {

	public static By pipingDisciplineCH = By.xpath("//span[text()='Piping']");
	public static By pipingcheckbox = By.xpath("//span[text()='Piping']//parent::div//input");
	public static By processcheckbox = By.xpath("//span[text()='Process']//parent::div//input");
	public static By structuralcheckbox = By.xpath("//span[text()='Structural']//parent::div//input");
	public static By electricalcheckbox = By.xpath("//span[text()='Electrical']//parent::div//input");
	public static By InCcheckbox = By.xpath("//span[text()='I&C']//parent::div//input");
	public static By equipmentcheckbox = By.xpath("//span[text()='Equipment']//parent::div//input");

	public static By dayScaleDD = By.xpath("//div[@class='d-flex align-items-center call-to-action']/img");
	public static By dayScaleDay = By.xpath("//ul[@class='dropdown-menu p-2']/li[1]");
	public static By dayScaleWeek = By.xpath("//ul[@class='dropdown-menu p-2']/li[2]");
	public static By dayScaleMonth = By.xpath("//ul[@class='dropdown-menu p-2']/li[3]");
	public static By pipingCheckBox = By.xpath("//span[text()='Piping']//parent::li//input[@type='checkbox']");

	public static By filterApplyButtonReferenceLib = By.xpath(" //button[@class='btn btn-primary'][text()='Apply']");
	public static By filterIcon = By.xpath("//img[@src='/static/media/icon-filter.68e1d1d4.svg']");
	public static By viewEditFullInformationLink = By.xpath("//div[text()='View/Edit Full Information']");
	public static By editFormLink = By.xpath("//span[text()='Edit Form']");
	public static By backButton = By.xpath("//span[text()='Back']");
	public static By filterApplyButton = By.xpath("//button[@class='btn btn-primary text-center'][text()='Apply']");
	public static By completeButton = By.xpath("//button[text()='Complete']");

}
