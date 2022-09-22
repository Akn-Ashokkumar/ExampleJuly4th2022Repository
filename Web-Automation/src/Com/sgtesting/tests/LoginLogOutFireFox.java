package Com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginLogOutFireFox {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchbrowser();
		nativgate();
		login();
		minimiseflyout();
		Logout();
		CloseApplication();
	}
		private static void launchbrowser()
		{
			try{
				System.setProperty("webdriver.gecko.driver", "C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\geckodriver.exe");
				oBrowser=new FirefoxDriver();
			} catch(Exception e) 
			{
				e.printStackTrace();
			} 
		}
		private static void nativgate()
		{
		try {
			oBrowser.get("http://localhost:8082/login.do");
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}	
		}
		private static void login()
		{
			try {
				oBrowser.findElement(By.id("username")).sendKeys("admin");
				oBrowser.findElement(By.name("pwd")).sendKeys("manager");
				oBrowser.findElement(By.cssSelector("#loginButton > div:nth-child(1)")).click();
				Thread.sleep(5000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		private static void minimiseflyout()
		{
			try {
				oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void Logout()
		{
			try {
				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		private static void CloseApplication()
		{
			try {
				oBrowser.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}


