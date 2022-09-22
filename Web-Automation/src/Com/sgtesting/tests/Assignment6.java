package Com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchBroswer();
		navigate();
		login();
		minimiseflyout();
		CustomerCreate();
		ProjectCreate();
		ModifiyProject();
		DeleteProject();
		Logout();
		CloseApplication();

	}
	private static void launchBroswer()
	{
		try {
			System.setProperty("webdriver.ch"
					+ "rome.driver", "C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
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
    	oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Coolestt");
    	Thread.sleep(2000);
    	oBrowser.findElement(By.id("customerLightBox_descriptionField")).sendKeys("Determination, passion necessary");
    	Thread.sleep(2000);
    	oBrowser.findElement(By.xpath("//*[@id=\"customerLightBox_commitBtn\"]/div/span")).click();
    	Thread.sleep(5000);
    	}catch (Exception e) {
			e.printStackTrace();
		}
    }
    private static void ProjectCreate()
    {
    	try {
    		oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a/div[1]")).click();
    	oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")).click();
    	Thread.sleep(2000);
    	oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
    	Thread.sleep(2000);
    	oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("Study123");
    	Thread.sleep(2000);
    	oBrowser.findElement(By.xpath("//*[@id=\"projectPopup_projectDescriptionField\"]")).sendKeys("Study hard");
    	Thread.sleep(2000);
    	oBrowser.findElement(By.xpath("//*[@id=\"projectPopup_commitBtn\"]/div/span")).click();
    	Thread.sleep(2000);
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void ModifiyProject()
    {
    	try {
    	oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
    	Thread.sleep(2000);
    	oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")).clear();
    	Thread.sleep(2000);
    	oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")).sendKeys("superb");
    	Thread.sleep(2000);	
    	oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[1]")).click();
    	Thread.sleep(2000);
    	}catch (Exception e) {
			e.printStackTrace();
		}
    }
    private static void DeleteProject()
    {
    	try {
    		oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
        	Thread.sleep(2000);
        	oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
        	Thread.sleep(2000);
        	oBrowser.findElement(By.xpath("//*[@id=\"projectPanel_deleteConfirm_submitTitle\"]")).click();
        	Thread.sleep(2000);	
		} catch (Exception e) {
			
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


