package step_definitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.LoginPage;
import pageObject.allPage;

public class leaveStep {

	public static WebDriver driver;

	public leaveStep() {
		driver = Hooks.driver;
	}

	// Negative
	@Given("User 6 on homepage with authorization using \"(.*)\" as username & \"(.*)\" as password")
	public void VisitLoginPage4(String username, String password) throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.waitLoginAppear();
		Assert.assertTrue(loginPage.isLoginPageAppear());
		loginPage.setUsername(username);
		loginPage.setPassword(password);
		loginPage.clickLoginButton();
		Thread.sleep(3000);
	}

	@When("User 6 click leave button & assign leave button")
	public void goToAssignLeave1() throws Throwable {
		allPage AllPage = new allPage(driver);
		AllPage.leaveBtn();
		Thread.sleep(3000);
		AllPage.leaveAssignBtn();

	}

	@When("User input \"(.*)\" as xEmployeeNameToLeave & select leave type & input \"(.*)\" as leaveFromDate & select partialDays & input \"(.*)\" as leaveToDate & input \"(.*)\" as commentLeave & click assign button")
	public void inputFailedAssign(String xEmployeeNameToLeave, String leaveFromDate, String leaveToDate,
			String commentLeave) throws Throwable {
		allPage AllPage = new allPage(driver);
		AllPage.xleaveAssignName(xEmployeeNameToLeave);
		AllPage.leaveType();
		AllPage.leaveAssignFromDate(leaveFromDate);
		AllPage.leaveAssignToDate(leaveToDate);
		AllPage.textCommentLeave(commentLeave);
		AllPage.assignBtn();

		Thread.sleep(3000);
	}

	@Then("User cant assign leave and get error Message bellow employee name")
	public void UnsuccessfulAssignLeave() throws Throwable {
		allPage AllPage = new allPage(driver);
		Assert.assertEquals(AllPage.assignErrorExp(), AllPage.assignErrorAct());

	}

	// Positif
	@Given("User 7 on homepage with authorization using \"(.*)\" as username & \"(.*)\" as password")
	public void VisitLoginPage5(String username, String password) throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		Assert.assertTrue(loginPage.isLoginPageAppear());
		loginPage.setUsername(username);
		loginPage.setPassword(password);
		loginPage.clickLoginButton();
		Thread.sleep(3000);
	}

	@When("User 7 click leave button & assign leave button")
	public void goToAssignLeave2() throws Throwable {
		allPage AllPage = new allPage(driver);
		AllPage.leaveBtn();
		Thread.sleep(3000);
		AllPage.leaveAssignBtn();
		Thread.sleep(5000);

	}

	@When("User input \"(.*)\" as employeeNameToLeave & select leave type & input \"(.*)\" as leaveFromDate & input \"(.*)\" as leaveToDate & select partial days")
	public void inputAssignLeave(String employeeNameToLeave, String leaveFromDate, String leaveToDate) throws Throwable {
		allPage AllPage = new allPage(driver);
		AllPage.tleaveAssignName(employeeNameToLeave);
		AllPage.leaveType();
		Thread.sleep(5000);
		AllPage.leaveAssignFromDate(leaveFromDate);
		Thread.sleep(5000);
		AllPage.leaveAssignToDate(leaveToDate);
		Thread.sleep(5000);

	}

	@When("User User select duration days & select time from & select time to & input \"(.*)\" as commentLeave & click assign button")
	public void InputAssignLeaveSpecified(String commentLeave) throws Throwable {
		allPage AllPage = new allPage(driver);
		AllPage.textCommentLeave(commentLeave);
		Thread.sleep(5000);
		AllPage.assignBtn();
		Thread.sleep(3000);		
	}

	@Then("User successfully assign leave")
	public void successfulAssignLeave() throws Throwable {
		allPage AllPage = new allPage(driver);
		Assert.assertTrue(AllPage.isSuccessLeaveAppear());
		Thread.sleep(3000);

	}
	
	
//Search	
	@Given("User 8 on homepage with authorization using \"(.*)\" as username & \"(.*)\" as password")
	public void VisitLoginPage6(String username, String password) throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.waitLoginAppear();
		Assert.assertTrue(loginPage.isLoginPageAppear());
		loginPage.setUsername(username);
		loginPage.setPassword(password);
		loginPage.clickLoginButton();
		Thread.sleep(3000);
	}

	@When("User 8 click leave button")
	public void goToLeaveList() throws Throwable {
		allPage AllPage = new allPage(driver);
		AllPage.leaveBtn();
		Thread.sleep(3000);
		
	}

	@When("User click check all status leave & input \"(.*)\" as fullNameLeave & click search button")
	public void inputCredentialToFindDataLeave(String fullNameLeave) throws Throwable {
		allPage AllPage = new allPage(driver);
		AllPage.allCheckBtn();
		Thread.sleep(3000);
		AllPage.searchNameLeave(fullNameLeave);
		AllPage.searchLeaveBtn();

		Thread.sleep(3000);
	}

	@Then("User get the result on leave list")
	public void getSuitableResultLeave() throws Throwable {
		allPage AllPage = new allPage(driver);
		try {
			if (AllPage.isNotFoundMessageAppear()) {
				System.out.println("unsuccessfully get data");
			} else {
				System.out.println("successfully get data");
			}
		} catch (Exception e) {
			System.out.println("successfully get data");
			Assert.assertEquals(AllPage.actResultLeaveName(), AllPage.expResultLeaveName());
			Thread.sleep(5000);
		}
		

	}
	
}
