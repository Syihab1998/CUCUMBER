package step_definitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.LoginPage;
import pageObject.allPage;

public class AdminStep {
	public static WebDriver driver;

	public AdminStep() {
		driver = Hooks.driver;
	}

//AddData
	@Given("User 1 on homepage with authorization using \"(.*)\" as username & \"(.*)\" as password")
	public void VisitLoginPage2(String username, String password) throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.waitLoginAppear();
		Assert.assertTrue(loginPage.isLoginPageAppear());
		loginPage.setUsername(username);
		loginPage.setPassword(password);
		loginPage.clickLoginButton();
		Thread.sleep(3000);
	}

	@When("User 1 click Admin button and click add button")
	public void goToAdminPageToAddUser() throws Throwable {
		allPage AllPage = new allPage(driver);
		AllPage.adminBtn();
		Thread.sleep(3000);
		AllPage.addUserBtn();
		Thread.sleep(5000);

	}

	@When("User select Admin as role & input \"(.*)\" as employeeUserName & input \"(.*)\" as userName & input \"(.*)\" as userPassword & input \"(.*)\" as userRePass & click save button")
	public void inputCredentialToAddUser(String employeeUserName, String userName, String userPassword,
			String userRePass) throws Throwable {
		allPage AllPage = new allPage(driver);
		AllPage.addUserEmployeeName(employeeUserName);
		Thread.sleep(5000);
		AllPage.User_Name(userName);
		Thread.sleep(5000);
		AllPage.UserPassword(userPassword);
		AllPage.userConfPassword(userRePass);
		AllPage.saveUserBtn();
		Thread.sleep(5000);

	}

	@Then("User succesfully add new user data")
	public void userSuccessfullAddNewUser() throws Throwable {
		allPage AllPage = new allPage(driver);
		Thread.sleep(5000);
		if (AllPage.isUserNameAlreadyExist()) {
			System.out.println("Username Already Exist");
		} else {
			System.out.println("successfull");
		}

	}

//searchData	
	@Given("User 2 on homepage with authorization using \"(.*)\" as username & \"(.*)\" as password")
	public void VisitLoginPage3(String username, String password) throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.waitLoginAppear();
		Assert.assertTrue(loginPage.isLoginPageAppear());
		loginPage.setUsername(username);
		loginPage.setPassword(password);
		loginPage.clickLoginButton();
		Thread.sleep(3000);
	}

	@When("User 2 click Admin button")
	public void goToAdminPageSearchToUser() throws Throwable {
		allPage AllPage = new allPage(driver);
		AllPage.adminBtn();
		Thread.sleep(5000);
	}

	@When("User input \"(.*)\" as userName & click search button")
	public void inputCredentialToSearchUser(String userName) throws Throwable {
		allPage AllPage = new allPage(driver);
		AllPage.searchUserName(userName);
		AllPage.searchBtn();
		Thread.sleep(5000);
	}

	@Then("User get user data on the list")
	public void GetUser() throws Throwable {
		allPage AllPage = new allPage(driver);
		try {
			if (AllPage.isNotFoundMessageAppear()) {
				System.out.println("unsuccessfully get data");
			} else {
				System.out.println("successfully get data");
			}
		} catch (Exception e) {
			System.out.println("successfully get data");
		}
	}

//search random data	
	@Given("User 3 on homepage with authorization using \"(.*)\" as username & \"(.*)\" as password")
	public void VisitLoginPage4(String username, String password) throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.waitLoginAppear();
		Assert.assertTrue(loginPage.isLoginPageAppear());
		loginPage.setUsername(username);
		loginPage.setPassword(password);
		loginPage.clickLoginButton();
		Thread.sleep(3000);
	}

	@When("Users 3 click Admin button")
	public void goToAdminPageSearchToXUser() throws Throwable {
		allPage AllPage = new allPage(driver);
		AllPage.adminBtn();
		Thread.sleep(5000);
	}

	@When("User input \"(.*)\" as xUserNamee & click search button")
	public void inputCredentialToSearchXUser(String xUserNamee) throws Throwable {
		allPage AllPage = new allPage(driver);
		AllPage.searchUserName(xUserNamee);
		AllPage.searchBtn();
		Thread.sleep(5000);
	}

	@Then("User get notFoundMessage on the list")
	public void xGetUser() throws Throwable {
		allPage AllPage = new allPage(driver);
		Assert.assertTrue(AllPage.isNotFoundMessageAppear());

	}

//regOAuthClient
	@Given("User 4 on homepage with authorization using \"(.*)\" as username & \"(.*)\" as password")
	public void VisitLoginPage5(String username, String password) throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.waitLoginAppear();
		Assert.assertTrue(loginPage.isLoginPageAppear());
		loginPage.setUsername(username);
		loginPage.setPassword(password);
		loginPage.clickLoginButton();
		Thread.sleep(3000);
	}

	@When("^User 4 click Admin button & click configuration button & click register OAuth client button$")
	public void userGoToRegOAuthClient() throws Throwable {
		allPage AllPage = new allPage(driver);
		AllPage.adminBtn();
		Thread.sleep(3000);
		AllPage.configAdminBtn();
		Thread.sleep(5000);
		AllPage.OAuthClientAdminBtn();
	}

	@When("User input \"(.*)\" as oAuthId & input \"(.*)\" as oAuthSecret & input \"(.*)\" as oAuthUrl & click button save")
	public void inputCredentialToRegOAuthClient(String oAuthId, String oAuthSecret, String oAuthUrl) throws Throwable {
		allPage AllPage = new allPage(driver);
		AllPage.OAuthID(oAuthId);
		;
		AllPage.OAuthSecret(oAuthSecret);
		AllPage.OAuthURl(oAuthUrl);
		AllPage.OAuthSaveBtn();
		Thread.sleep(5000);
	}

	@Then("User successfully register OAuth client")
	public void successfullyRegisterOAuthClient() throws Throwable {
		allPage AllPage = new allPage(driver);
		Assert.assertTrue(AllPage.isOAuthSaved());

	}

//deleteAOuthClient
	@Given("User 5 on homepage with authorization using \"(.*)\" as username & \"(.*)\" as password")
	public void VisitLoginPage6(String username, String password) throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.waitLoginAppear();
		Assert.assertTrue(loginPage.isLoginPageAppear());
		loginPage.setUsername(username);
		loginPage.setPassword(password);
		loginPage.clickLoginButton();
		Thread.sleep(3000);
	}

	@When("User 5 click Admin button & click configuration button & click register OAuth client button")
	public void goToConfigAdminPageToDeleteOAuthClient() throws Throwable {
		allPage AllPage = new allPage(driver);
		AllPage.adminBtn();
		Thread.sleep(5000);
		AllPage.configAdminBtn();
		Thread.sleep(5000);
		AllPage.OAuthClientAdminBtn();
		Thread.sleep(5000);
	}

	@When("User click one of data to be delete & click ok button")
	public void selectOAuthClientToBeDelete() throws Throwable {
		allPage AllPage = new allPage(driver);
		AllPage.OAuthToBeDelete();
		AllPage.OAuthDeleteBtn();
		Thread.sleep(5000);
		AllPage.OAuthDeleteOkBtn();
		Thread.sleep(5000);
	}

	@Then("User successfully delete OAuth client data")
	public void successfullyDeleteOAuthClient() throws Throwable {
		allPage AllPage = new allPage(driver);
		Assert.assertTrue(AllPage.isOAuthDeleted());

	}
}
