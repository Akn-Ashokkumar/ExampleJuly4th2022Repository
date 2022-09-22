package Com.sgtesting.TestAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChromeDemo {
	public ChromeDemo(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	@FindBy(xpath="//*[@class='_2IX_2- VJZDxU']")
	private WebElement  oUser;
	public WebElement getUserName()
	{
		return oUser;
	}
	@FindBy(xpath="//*[@type='password']")
	private WebElement password;
	public WebElement getpassword()
	{
		return password;
	}
	@FindBy(xpath="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement login;
	public WebElement getlogin()
	{
		return login;
	}
}
