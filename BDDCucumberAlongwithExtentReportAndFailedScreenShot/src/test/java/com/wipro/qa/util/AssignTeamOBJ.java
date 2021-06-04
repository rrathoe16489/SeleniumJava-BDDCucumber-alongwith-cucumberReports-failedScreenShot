package com.wipro.qa.util;
import org.openqa.selenium.By;
import com.wipro.qa.base.TestBase;

/**
 * @authorID Rat105478
 * @authorName RameshRathod
 */

public class AssignTeamOBJ extends TestBase {

	public static By assigneeNameInput = By.xpath("//div[@class='assign-content']/div[1]/div[2]/div/div/div/div/div[1]/div[2]/div/input");
	public static By defineUserPermissions = By.xpath("//span[text()='Edit User Permissions']");
	public static By iIconForGigcompleter = By.xpath("//span[text()='Gig completer']//parent::div//img[@src='/static/media/icon-info.d60fb09f.svg']");
	public static By hoverInformation = By.xpath("//div[text()='Person responsible for performing Gigs in Laminar (typically ALL USERs are Gig Completers)']");
	public static By saveForDefineUser = By.xpath("//button[text()='Cancel']//parent::div//button[text()='Save']");
	public static By addProfesstional = By.xpath("//label[text()='Add Professional']");
	
	public static By addRoleButton = By.xpath("//img[@src='/static/media/add.b23f718f.svg']");
	public static By modalBodyText = By.xpath("//span[text()='The following role will be added to the Project']");
	public static By roleTitle = By.xpath("//*[@placeholder='input text'][@id='roleTitle']");
	public static By roleDescription = By.xpath("//*[@placeholder='Write your message here'][@id='roleDescription']");
	public static By saveButtonAddRole = By.xpath("//button[text()='Cancel']//parent::div//button[text()='Save']");
	public static By cancelButtonAddRole = By.xpath("//button[text()='Save']//parent::div//button[text()='Cancel']");
	public static By addRoleAlertMessage = By.xpath("//div[@class='alert alert-danger'][@role='alert']");

	public static By RESET_BUTTON = By.xpath("//button[text()='Reset']");
	public static By SAVE_BUTTON = By.xpath("//button[text()='Save']");
	public static By COMPLETE_BUTTON = By.xpath("//button[text()='Complete']");
	public static By EDIT_BUTTON = By.xpath("//button[text()='Edit']");
}
