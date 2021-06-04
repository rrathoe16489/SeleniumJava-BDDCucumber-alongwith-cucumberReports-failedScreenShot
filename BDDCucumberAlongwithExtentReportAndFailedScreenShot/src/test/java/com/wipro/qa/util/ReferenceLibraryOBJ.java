package com.wipro.qa.util;

import org.openqa.selenium.By;
import com.wipro.qa.base.TestBase;

/**
 * @authorID Rat105478
 * @authorName RameshRathod
 */

public class ReferenceLibraryOBJ extends TestBase {

	
	public static By laminarLogo1 = By.xpath ("//div[@class='sidebar-image']/img[1]");
	public static By laminarLogo2 = By.xpath ("//div[@class='sidebar-image']/img[2]");
	public static By IncludeColumn = By.xpath ("//th[text()='Name']//parent::tr//th[text()='Include']");
	public static By CategoryColumn = By.xpath ("//th[text()='Include']//parent::tr//th[text()='Category']");
	public static By NameColumn = By.xpath ("//th[text()='Include']//parent::tr//th[text()='Name']");
	public static By IDColumn = By.xpath ("//th[text()='Include']//parent::tr//th[text()='ID']");
	public static By LinkColumn = By.xpath ("//th[text()='Include']//parent::tr//th[text()='Link']");
	public static By toggle = By.xpath("//tbody/tr[1]/td[1]/label/span");
	public static By toggleforProcedure = By.xpath("//tbody/tr[2]/td[1]/label/span");
	public static By categoryTextLink = By.xpath("//table[@class='table referenceLibraryTable table-hover']/tbody/tr[1]/td[2]");
	public static By secondRowText = By.xpath("//tbody/tr[2]/td[2]");
	public static By nameTextBox = By.name ("name");
	public static By IDtextBox = By.name ("documentId");
	public static By linkTextBox = By.name ("link");
	public static By addReferenceButton = By.xpath ("//img[@src='/static/media/add.b23f718f.svg']");
	public static By copyIcon = By.xpath ("//tbody/tr[1]/td[6]/img[@src='/static/media/copyClipboard.e9522ab0.svg']");
	public static By categoryTB = By.name("categoryName");
	public static By googleLink = By.xpath("//*[@class='linkAnchor'][@href='https://www.google.com/']");

	public static By nameTextBoxdocument = By.xpath("//*[@name='name'][@value='']");
	public static By RESET_BUTTON= By.xpath("//button[text()='Save']//parent::div//button[text()='Reset']");
	public static By SAVE_BUTTON = By.xpath("//button[text()='Save']");
	public static By COMPLETE_BUTTON= By.xpath("//button[text()='Reset']//parent::div//button[text()='Complete']");
	public static By EDIT_BUTTON= By.xpath ("//button[text()='Edit']");
	
	public static By linkDeleteIcon= By.xpath ("//img[@src='/static/media/xCircleFill.fab3e1a4.svg']");
	public static By link= By.xpath ("//a[@href='https://www.google.com/']");
	public static By crossIcon= By.xpath ("//img[@src='/static/media/xCircleFill.fab3e1a4.svg']");
	public static By crossDeleteButton= By.xpath ("//button[text()='Cancel']//parent::div//button[text()='Delete']");
	public static By completeHeaderIconReferenceLib  = By.xpath ("//div[text()='Reference Library']//parent::a//img[@src='/static/media/completed.0bc5e4c8.svg']");
}
