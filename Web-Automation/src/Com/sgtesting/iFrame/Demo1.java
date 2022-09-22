package Com.sgtesting.iFrame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	public static WebDriver oBrowser =null;
	public static void main(String[] args) {
		LaunchBroswer();

	}
	private static void LaunchBroswer()
	{
		try
		{
			System.getProperty("webdriver.chrome.driver","C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivernew\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
