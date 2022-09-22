package Com.sgtesting.pagemodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitimedemo {
	public Actitimedemo(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getLogin()
	{
		return oLogin;
	}
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")
	private WebElement oUserLogin;
	public WebElement getUserLogin()
	{
		return oUserLogin;
	}
	@FindBy(xpath="//*[@id=\"createUserDiv\"]/div")
	private WebElement oCreateUser;
	public WebElement getCreateUser()
	{
		return oCreateUser;
	}
	private WebElement userDataLightBox_firstNameField;
	public WebElement WriteName()
	{
		return userDataLightBox_firstNameField;
	}
	private WebElement userDataLightBox_lastNameField;
	public WebElement WriteLast()
	{
		return userDataLightBox_lastNameField;
	}
	private WebElement userDataLightBox_emailField;
	public WebElement WriteEmail()
	{
		return userDataLightBox_emailField;
	}
	private WebElement userDataLightBox_usernameField;
	public WebElement LoginName()
	{
		return userDataLightBox_usernameField;
	}
	private WebElement userDataLightBox_passwordField;
	public WebElement PasswordLoginName()
	{
		return userDataLightBox_passwordField;
	}
	private WebElement passwordCopy;
	public WebElement RetypePasswordLoginName()
	{
		return passwordCopy;
	}
	
	@FindBy(xpath="//span[text()='Create User']")
	private WebElement createUserBtn;
	public WebElement createUserButton()
	{
		return createUserBtn;
	}
	@FindBy(xpath="//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement oselectUser;
	public WebElement selectUser()
	{
		return oselectUser;
	}
	
	private WebElement userDataLightBox_deleteBtn;
	public WebElement deleteUser()
	{
		return userDataLightBox_deleteBtn;
	}
	
	private WebElement logoutLink;
	public WebElement logout()
	{
		return logoutLink;
	}
	
}
