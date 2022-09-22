package Com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchBroswer();
		navigate();
		login();
		minimiseflyout();
		CustomerCreate();
		DeleteCustomer();
		Logout();
		CloseApplication();

	}
	private static void launchBroswer()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    private static void navigate()
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
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
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
    private static void CustomerCreate()
    {
    	try {
    		oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a/div[1]")).click();
    	oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")).click();
    	oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
    	oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("IAS");
    	Thread.sleep(2000);
    	oBrowser.findElement(By.id("customerLightBox_descriptionField")).sendKeys("Determination, passion necessary");
    	Thread.sleep(2000);
    	oBrowser.findElement(By.xpath("//*[@id=\"customerLightBox_commitBtn\"]/div/span")).click();
    	Thread.sleep(5000);
    	}catch (Exception e) {
			e.printStackTrace();
		}
    }
    private static void DeleteCustomer()
    {
    	try {
    		oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div/div[2]")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")).click();
    		Thread.sleep(5000);
    		oBrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
			
		} catch (Exception e) {
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
