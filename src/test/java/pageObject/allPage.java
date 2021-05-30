package pageObject;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import gherkin.lexer.Id;
import utilities.BaseClass;

public class allPage extends BaseClass {

	public allPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);

	}

//pim	

	public void PIMBtn() {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.elementToBeClickable(By.xpath("//b[.='PIM']"))).click();
		
	}

	@FindBy(xpath = "//a[@id='menu_pim_addEmployee']")
	private WebElement addEmployeeBtn;

	public void addEmployeeBtn() {
		addEmployeeBtn.click();
	}

	@FindBy(id = "firstName")
	private WebElement firstNameEmployee;

	public void firstNameEmployee(String firstName) {
		firstNameEmployee.sendKeys(firstName);
	}

	@FindBy(id = "middleName")
	private WebElement middleNameEmployee;

	public void middleNameEmployee(String middleName) {
		middleNameEmployee.sendKeys(middleName);
	}

	@FindBy(id = "lastName")
	private WebElement lastNameEmployee;

	public void lastNameEmployee(String lastName) {
		lastNameEmployee.sendKeys(lastName);
	}

	@FindBy(id = "employeeId")
	private WebElement idEmployee;

	public void idEmployee(String id_Employee) {
		idEmployee.clear();
		idEmployee.sendKeys(id_Employee);
	}

	@FindBy(id = "chkLogin")
	private WebElement chckBoxEmployee;

	public void chckBoxEmployee() {
		chckBoxEmployee.click();
	}

	@FindBy(id = "btnSave")
	private WebElement save1Btn;

	public void save1Btn() {
		save1Btn.click();
	}

	@FindBy(id = "user_name")
	private WebElement unameEmployee;

	public void unameEmployee(String unameEmploy) {
		unameEmployee.sendKeys(unameEmploy);
	}

	@FindBy(id = "user_password")
	private WebElement passEmployee;

	public void passEmployee(String passEmploy) {
		passEmployee.sendKeys(passEmploy);
	}

	@FindBy(id = "re_password")
	private WebElement rePassEmployee;

	public void rePassEmployee(String rePassEmploy) {
		rePassEmployee.sendKeys(rePassEmploy);
	}

	@FindBy(id = "btnSave")
	private WebElement editBtn;

	public void editBtn() {
		editBtn.click();
	}

	@FindBy(id = "btnSave")
	private WebElement save2Btn;

	public void save2Btn() {
		save2Btn.click();
	}

	@FindBy(id = "personal_txtLicenNo")
	private WebElement SIMNumber;

	public void SIMNumber(String SIMNumb) {
		SIMNumber.sendKeys(SIMNumb);
	}

	@FindBy(id = "personal_optGender_2")
	private WebElement genderChckBox;

	public void genderChckBox() {
		genderChckBox.click();
	}

	public void nationality() {
		Select nationality = new Select(webDriver.findElement(By.id("personal_cmbNation")));
		nationality.selectByVisibleText("Indonesian");
	}

	@FindBy(id = "personal_txtOtherID")
	private WebElement otherId;

	public void otherId(String otherID) {
		otherId.sendKeys(otherID);
	}

	@FindBy(id = "personal_txtLicExpDate")
	private WebElement licExpDate;

	public void licExpDate(String SIMExpDate) {
		licExpDate.sendKeys(SIMExpDate);
	}

	public void maritalStatus() {
		Select maritalStatus = new Select(webDriver.findElement(By.id("personal_cmbMarital")));
		maritalStatus.selectByValue("Single");

	}

	@FindBy(id = "personal_DOB")
	private WebElement birthDate;

	public void birthDate(String BirthDate) {
		birthDate.sendKeys(BirthDate);
	}

	@FindBy(id = "menu_pim_viewEmployeeList")
	private WebElement employeeListBtn;

	public void employeeListBtn() {
		employeeListBtn.click();
	}

	@FindBy(id = "empsearch_employee_name_empName")
	private WebElement fullNameToSearch;

	public void searchName(String fullName) {
		fullNameToSearch.sendKeys(fullName);
	}

	public void includeEmployee() {
		Select includeEmployee = new Select(webDriver.findElement(By.id("empsearch_termination")));
		includeEmployee.selectByValue("2");

	}
	

	@FindBy(id = "searchBtn")
	private WebElement searchBtn;

	public void searchBtn() {
		searchBtn.click();
	}

	@FindBy(xpath = "//a[.='tingky wingky']")
	private WebElement resultName;


	public Boolean getResultNameAct() {
		resultName.isDisplayed();
		return true;
	}

		


//admin
	@FindBy(xpath = "//b[.='Admin']")
	private WebElement adminBtn;

	public void adminBtn() {
		adminBtn.click();
	}

	@FindBy(id = "btnAdd")
	private WebElement addUserBtn;

	public void addUserBtn() {
		addUserBtn.click();
	}

	public void userType() {
		Select userType = new Select(webDriver.findElement(By.id("systemUser_userType")));
		userType.selectByValue("2");

	}

	@FindBy(id = "systemUser_employeeName_empName")
	private WebElement addUserEmployeeName;

	public void addUserEmployeeName(String employeeUserName) {
		addUserEmployeeName.clear();
		addUserEmployeeName.sendKeys(employeeUserName);
	}

	@FindBy(id = "systemUser_userName")
	private WebElement User_Name;

	public void User_Name(String UserName) {
		User_Name.clear();
		User_Name.sendKeys(UserName);
	}

	@FindBy(xpath = "//input[@id='systemUser_password']")
	private WebElement UserPassword;

	public void UserPassword(String userPassword) {
		UserPassword.sendKeys(userPassword);
	}

	@FindBy(id = "systemUser_confirmPassword")
	private WebElement userConfPassword;

	public void userConfPassword(String userRePass) {
		userConfPassword.sendKeys(userRePass);
	}

	@FindBy(id = "btnSave")
	private WebElement saveUserBtn;

	public void saveUserBtn() {
		new WebDriverWait(webDriver, 20)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='btnSave']"))).click();

	}

	@FindBy(id = "searchSystemUser_userName")
	private WebElement searchUserName;

	public void searchUserName(String userName) {
		searchUserName.sendKeys(userName);
	}

	public void searchXUserName(String xUserNamee) {
		searchUserName.sendKeys(xUserNamee);
	}

	@FindBy(id = "searchBtn")
	private WebElement searchUserNameBtn;

	public void searchUserNameBtn() {
		searchUserName.click();
	}

	@FindBy(className = "validation-error")
	private WebElement resultUserName;

	public boolean isUserNameAlreadyExist() {
		resultUserName.isDisplayed();
		return true;
	}

	@FindBy(xpath = "//td[.='No Records Found']")
	private WebElement notFoundMessage;

	public boolean isNotFoundMessageAppear() {
		notFoundMessage.isDisplayed();
		return true;
	}

	@FindBy(id = "menu_admin_Configuration")
	private WebElement configAdminBtn;

	public void configAdminBtn() {
		configAdminBtn.click();
	}

	public void OAuthClientAdminBtn() {
		new WebDriverWait(webDriver, 20).until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='menu_admin_registerOAuthClient']")))
				.click();
	}

	@FindBy(id = "oauth_client_id")
	private WebElement OAuthID;

	public void OAuthID(String oAuthId) {
		OAuthID.sendKeys(oAuthId);
	}

	@FindBy(id = "oauth_client_secret")
	private WebElement OAuthSecret;

	public void OAuthSecret(String oAuthSecret) {
		OAuthSecret.sendKeys(oAuthSecret);
	}

	@FindBy(id = "oauth_redirect_uri")
	private WebElement OAuthURl;

	public void OAuthURl(String oAuthUrl) {
		OAuthURl.sendKeys(oAuthUrl);
	}

	@FindBy(id = "btnSave")
	private WebElement OAuthSaveBtn;

	public void OAuthSaveBtn() {
		OAuthSaveBtn.click();
	}

	@FindBy(xpath = "//a[.='syihabbb']")
	private WebElement OAuthNameSaved;

	public boolean isOAuthSaved() {
		OAuthNameSaved.isDisplayed();
		return true;
	}

	@FindBy(id = "ohrmList_chkSelectRecord_syihabbb")
	private WebElement OAuthToBeDelete;

	public void OAuthToBeDelete() {
		OAuthToBeDelete.click();
	}

	@FindBy(id = "btnDelete")
	private WebElement OAuthDeleteBtn;

	public void OAuthDeleteBtn() {
		OAuthDeleteBtn.click();
	}

	@FindBy(id = "dialogDeleteBtn")
	private WebElement OAuthDeleteOkBtn;

	public void OAuthDeleteOkBtn() {
		OAuthDeleteOkBtn.click();
	}

	@FindBy(xpath = "//div[@id='content']//div[@class='inner']/script[1]")
	private WebElement messageSuccessFadable;

	public boolean isOAuthDeleted() {
		messageSuccessFadable.isDisplayed();
		return true;
	}

	@FindBy(id = "ohrmList_chkSelectRecord_61")
	private WebElement userToDeleteSelected;

	public void unameAdminToDeleteSelected() {
		userToDeleteSelected.click();
	}

	@FindBy(id = "btnDelete")
	private WebElement userDeleteBtn;

	public void userDeleteBtn() {
		userDeleteBtn.click();
	}

	@FindBy(xpath = "//form[@id='frmList_ohrmListComponent']/script[1]")
	private WebElement messageSuccessDeleteUser;

	public boolean isUserDeleted() {
		messageSuccessDeleteUser.isDisplayed();
		return true;
	}

//leave
	@FindBy(xpath = "//b[.='Leave']")
	private WebElement leaveBtn;

	public void leaveBtn() {
		leaveBtn.click();
	}

	@FindBy(id = "menu_leave_assignLeave")
	private WebElement leaveAssignBtn;

	public void leaveAssignBtn() {
		leaveAssignBtn.click();
	}

	@FindBy(id = "assignleave_txtEmployee_empName")
	private WebElement xLeaveAssignName;

	public void xleaveAssignName(String xEmployeeNameToLeave) {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("assignleave_txtEmployee_empName")));
		xLeaveAssignName.clear();
		xLeaveAssignName.sendKeys(xEmployeeNameToLeave);
	}

	@FindBy(xpath = "//input[@id='assignleave_txtEmployee_empName']")
	private WebElement leaveAssignName;

	public void tleaveAssignName(String employeeNameToLeave) {
		leaveAssignName.clear();
		leaveAssignName.sendKeys(employeeNameToLeave);
	}

	public void leaveType() {
		Select leaveType = new Select(webDriver.findElement(By.id("assignleave_txtLeaveType")));
		leaveType.selectByVisibleText("Emergency Leave");

	}

	@FindBy(id = "assignleave_txtFromDate")
	private WebElement leaveAssignFromDate;

	public void leaveAssignFromDate(String leaveFromDate) {
		leaveAssignFromDate.clear();
		leaveAssignFromDate.sendKeys(leaveFromDate);
		leaveAssignFromDate.sendKeys(Keys.ENTER);
	}

	@FindBy(id = "assignleave_txtToDate")
	private WebElement leaveAssignToDate;

	public void leaveAssignToDate(String leaveToDate) {
		leaveAssignToDate.clear();
		leaveAssignToDate.sendKeys(leaveToDate);
		leaveAssignToDate.sendKeys(Keys.ENTER);
	}

	public void partialDays() {
		Select leaveType = new Select(webDriver.findElement(By.id("assignleave_partialDays")));
		leaveType.selectByValue("all");

	}

	public void durationDays() {
		new WebDriverWait(webDriver, 20)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@id='frmLeaveApply']//li[8]")));
		new WebDriverWait(webDriver, 20).until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//select[@id='assignleave_firstDuration_duration']")));
		Select durationDays = new Select(webDriver.findElement(By.id("assignleave_duration_duration")));
		durationDays.selectByVisibleText("Specify Time");

	}

	public void durationTimeFrom() {
		Select durationTimeFrom = new Select(webDriver.findElement(By.id("assignleave_firstDuration_time_from")));
		durationTimeFrom.selectByVisibleText("08:00");

	}

	public void durationTimeTo() {
		Select durationTimeTo = new Select(webDriver.findElement(By.id("assignleave_firstDuration_time_to")));
		durationTimeTo.selectByVisibleText("16:00");

	}

	@FindBy(id = "assignleave_txtComment")
	private WebElement textCommentLeave;

	public void textCommentLeave(String commentLeave) {
		new WebDriverWait(webDriver, 20).until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='assignleave_txtComment']")));
		textCommentLeave.sendKeys(commentLeave);
	}

	@FindBy(id = "assignBtn")
	private WebElement assignBtn;

	@FindBy(id = "confirmOkButton")
	private WebElement OkBtn;

	public void assignBtn() {
		assignBtn.click();

		if (OkBtn.isDisplayed()) {
			OkBtn.click();
		}

	}

	@FindBy(css = "[for='assignleave_txtEmployee_empName']")
	private WebElement isAssignErrorAppear;

	public String assignErrorExp() {
		return "Invalid";
	}

	public String assignErrorAct() {
		return isAssignErrorAppear.getText();
	}

	@FindBy(id = "leaveList_chkSearchFilter_checkboxgroup_allcheck")
	private WebElement allCheckBtn;

	public void allCheckBtn() {
		allCheckBtn.click();
	}

	@FindBy(id = "leaveList_txtEmployee_empName")
	private WebElement searchNameLeave;

	public void searchNameLeave(String fullNameLeave) {
		searchNameLeave.clear();
		searchNameLeave.sendKeys(fullNameLeave);

	}

	@FindBy(id = "btnSearch")
	private WebElement searchLeaveBtn;

	public void searchLeaveBtn() {
		searchLeaveBtn.click();
	}

	@FindBy(xpath = "//a[.='ting wing dip']")
	private WebElement isResultLeaveName;

	public String expResultLeaveName() {
		return "ting wing dip";
	}

	public String actResultLeaveName() {
		return isResultLeaveName.getText();
	}
	
	@FindBy(xpath = "//div[@class='inner']/script[1]")
	private WebElement isSuccessLeaveAppear;

	public boolean isSuccessLeaveAppear() {
		isSuccessLeaveAppear.isDisplayed();
		return true;
	}
	

//Time	
	@FindBy(xpath = "//b[.='Time']")
	private WebElement timeBtn;

	public void timeBtn() {
		timeBtn.click();
	}

	@FindBy(id = "employee")
	private WebElement timeEmployeeName;

	public void timeEmployeeName(String employeeName) {
		timeEmployeeName.sendKeys(employeeName);
	}

	@FindBy(id = "btnView")
	private WebElement timeViewBtn;

	public void timeViewBtn() {
		timeViewBtn.click();
	}

	@FindBy(id = "btnAddTimesheet")
	private WebElement AddTimesheetBtn;

	public void AddTimesheetBtn() {
		AddTimesheetBtn.click();
	}

	@FindBy(id = "menu_attendance_Attendance")
	private WebElement attendanTimeBtn;

	public void attendanTimeBtn() {
		attendanTimeBtn.click();
	}

	public void punchInOutBtn() {
		new WebDriverWait(webDriver, 20)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='menu_attendance_punchIn']")))
				.click();
	}

	@FindBy(id = "btnPunch")
	private WebElement punchBtn;

	public void punchBtn() {
		punchBtn.click();
	}

	@FindBy(id = "note")
	private WebElement notePunch;

	public void notePunchIn(String punchInNote) {
		notePunch.sendKeys(punchInNote);
	}

	public void notePunchOut(String punchOutNote) {
		notePunch.sendKeys(punchOutNote);
	}

	@FindBy(xpath = "//div[@class='inner']/script[1]")
	private WebElement succesPunchOut;

	public String succesPunchOutAct() {
		return succesPunchOut.getText();
	}

	public String succesPunchOutExp() {
		return "Successfully Saved";
	}

	@FindBy(css = "#punchTimeForm li:nth-of-type(2) > label:nth-of-type(2)")
	private WebElement punchInNotes;

	public String punchInNotesAct() {
		return punchInNotes.getText();
	}

	public String punchInNotesExp() {
		return "on time";
	}

	public boolean isPunchOutSuccess() {
		succesPunchOut.isDisplayed();
		return true;
	}
	

	public boolean isPunchInTitleAppear() {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[.='Punch In']")))
		.isDisplayed();
		return true;
	}
	

	public boolean isPunchOutTitleAppear() {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("\"//h1[.='Punch Out']")))
		.isDisplayed();
		return true;
	}
	
	
	

	@FindBy(xpath = "//b[.='Recruitment']")
	private WebElement recruitmentBtn;

	@FindBy(xpath = "//b[.='My Info']")
	private WebElement myInfoBtn;

	@FindBy(xpath = "//b[.='Performance']")
	private WebElement performanceBtn;

	@FindBy(xpath = "//b[.='Dashboard']")
	private WebElement dashboardBtn;

	@FindBy(xpath = "//b[.='Directory']")
	private WebElement directoryBtn;

	@FindBy(xpath = "//b[.='Maintenance']")
	private WebElement mtcBtn;

	@FindBy(xpath = "//b[.='Buzz']")
	private WebElement buzzBtn;

}
