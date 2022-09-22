package Com.sgtesting.launchprocess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment6 {

	public static WebDriver oBrowser=null;
	@Test(priority = 1)
	public static void launchbroswer()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Test(priority = 2)
	private static void navigate()
	{
		try {
			String actual,expected;
			expected="actiTIME - Login";
			oBrowser.get("http://localhost:8082/login.do");
			Thread.sleep(3000);
			actual=oBrowser.getTitle();
			Assert.assertEquals(expected, actual);
			oBrowser.manage().window().maximize();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 3,dataProvider = "getcred")
	private static void login(String User,String password)
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys(User);
			oBrowser.findElement(By.name("pwd")).sendKeys(password);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 4)
	private static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 5,dataProvider = "getvalue")
	private static void CustomerCreate(String fname,String iname)
    {
    	try {
    		String expected ,actual;
    		expected="actiTIME -  User List ";
    		oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a/div[1]")).click();
    		actual=oBrowser.getTitle();
    		Assert.assertNotEquals(expected, actual);
    	oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")).click();
    	oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
    	Thread.sleep(2000);
    	oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys(fname);
    	Thread.sleep(2000);
    	oBrowser.findElement(By.id("customerLightBox_descriptionField")).sendKeys(iname);
    	oBrowser.findElement(By.xpath("//*[@id=\"customerLightBox_commitBtn\"]/div/span")).click();
    	Thread.sleep(5000);
    	}catch (Exception e) {
			e.printStackTrace();
		}
    }
	@Test(priority = 6,dataProvider = "getwords")
	 private static void ProjectCreate(String name,String fname)
	    {
	    	try {
	    		oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a/div[1]")).click();
	    	oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")).click();
	    	Thread.sleep(2000);
	    	oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
	    	Thread.sleep(2000);
	    	oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys(name);
	    	Thread.sleep(2000);
	    	oBrowser.findElement(By.xpath("//*[@id=\"projectPopup_projectDescriptionField\"]")).sendKeys(fname);
	    	Thread.sleep(2000);
	    	oBrowser.findElement(By.xpath("//*[@id=\"projectPopup_commitBtn\"]/div/span")).click();
	    	Thread.sleep(2000);
	    	}
	    	catch(Exception e)
	    	{
	    		e.printStackTrace();
	    	}
	    }
	@Test(priority = 7)
	private static void DeleteProject()
    {
    	try {
    		oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
        	Thread.sleep(2000);
        	oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
        	Thread.sleep(2000);
        	oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")).click();
        	oBrowser.findElement(By.xpath("//*[@id=\"projectPanel_deleteConfirm_submitTitle\"]")).click();
        	Thread.sleep(2000);	
		} catch (Exception e) {
			
		}
    }
	@Test(priority = 8)
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
    		Thread.sleep(5000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
	@Test(priority=9)
	 private static void Logout()
		{
			try {
				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	@Test(priority = 10)
		private static void CloseApplication()
		{
			try {
				oBrowser.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	@DataProvider 
	public Object[][] getcred()
	{
		return new Object[][] {{"admin","manager"}};
	}
	@DataProvider
	public Object[][] getvalue()
	{
		return new Object[][] {{"sagar","Determination, passion necessary"}};
	}
	@DataProvider
	public Object[][] getwords()
	{
		return new Object[][] {{"Ashok","Study hard"}};
	}


}
