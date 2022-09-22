package Com.sgtesting.pagemodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
	public static WebDriver oBrowser=null;
	public static Actitimedemo oPage=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		 login();
		 minimizeFlyOutWindow();
		 UserCreate();
		 CreateUser();
		 ModifiedUser();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivernew\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new Actitimedemo(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost:8082/login.do");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlyOutWindow()
	{
		try {
		oPage.getFlyOutWindow().click();
		Thread.sleep(2000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void UserCreate()
	{
		try {
			oPage.getUserLogin().click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void CreateUser()
	{
		try {
			oPage .getCreateUser().click();
			Thread.sleep(2000);
			oPage.WriteName().sendKeys("Ashok");
			oPage.WriteLast().sendKeys("Kumar N");
			oPage.WriteEmail().sendKeys("AKN.ashu96@gmail.com");
			oPage.LoginName().sendKeys("sagar");
			oPage.PasswordLoginName().sendKeys("Hulli");
			oPage.RetypePasswordLoginName().sendKeys("Hulli");
			oPage.createUserButton().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void ModifiedUser()
	{
		try {
			oPage.selectUser().click();
			Thread.sleep(2000);
			
			
		} catch (Exception e) {
			
		}
	}

}
