
package Com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireBrowserDemo {
	public static WebDriver oBroswer=null;

	public static void main(String[] args) {
		launchbrowser();
		navigate();
		closeApplication();
	}
	private static void launchbrowser()
	{
		try {
			System.setProperty("webdriver.gecko.driver", "C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\geckodriver.exe");
			oBroswer=new FirefoxDriver();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	private static void navigate()
	{
		try {
			oBroswer.get("http://sgtestinginstitute.com/");
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void closeApplication()
	{
		try {
			oBroswer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

