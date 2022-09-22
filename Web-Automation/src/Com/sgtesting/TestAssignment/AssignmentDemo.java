package Com.sgtesting.TestAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentDemo {
	public static WebDriver oBrowser=null;
	public static ChromeDemo oPage=null;
	public static void main(String[] args) {
		launchbrowser();
		Navigate();
		login();

	}
	private static void launchbrowser()
	{
		try {
		System.setProperty("webdriver.chrome.driver", "C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivernew\\chromedriver.exe");
		oBrowser =new ChromeDriver();
		oPage=new ChromeDemo(oBrowser);
		Thread.sleep(2000);
		}
		catch(Exception e){ e.printStackTrace();
		}
	}
	private static void Navigate()
	{
		try {
			oBrowser.navigate().to("https://www.flipkart.com/");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try {
			oPage.getUserName().sendKeys("7411011954");
			oPage.getpassword().sendKeys("Ashok@123");
			oPage.getlogin().click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
