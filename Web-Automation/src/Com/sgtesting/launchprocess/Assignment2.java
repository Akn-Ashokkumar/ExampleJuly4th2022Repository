package Com.sgtesting.launchprocess;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment2 {
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
	@Test(priority = 5)
	private static void CreateUsername()
    {
    	
    	try {
    		String expected ,actual;
    		expected="actiTIME -  User List ";
    		oBrowser.findElement(By.xpath("//*[@*='content users']")).click();
			Thread.sleep(2000);
			actual=oBrowser.getTitle();
			Assert.assertNotEquals(expected, actual);
			oBrowser.findElement(By.xpath("//*[@*='addUserButton beigeButton useNativeActive']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Ashok");
			oBrowser.findElement(By.name("lastName")).sendKeys("kumar.N");
			oBrowser.findElement(By.name("email")).sendKeys("akn.ashu96@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("Sagar");
			oBrowser.findElement(By.name("password")).sendKeys("Welcome1");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome1");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
	@Test(priority = 6,dataProvider = "getcreate")
	private static void ModifiyUsername(String fname,String lname ,String ename,String uname,String pwd ,String pcpassword)
    {
    	try {
    		oBrowser.findElement(By.xpath("//*[@*='userNameContainer']")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.name("firstName")).clear();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.name("lastName")).clear();
    		Thread.sleep(2000);
			oBrowser.findElement(By.name("email")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("username")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys(fname);
			oBrowser.findElement(By.name("lastName")).sendKeys(lname);
			oBrowser.findElement(By.name("email")).sendKeys(ename);
			oBrowser.findElement(By.name("username")).sendKeys(uname);
			oBrowser.findElement(By.name("password")).sendKeys(pwd);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys(pcpassword);
			oBrowser.findElement(By.xpath("//*[@*='innerContent ']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@*='userDataLightBox_commitBtn']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
	@Test(priority = 7)
	private static void DeleteUser()
    {
    	try {
    		oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
    		Thread.sleep(2000);
    		Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
	@Test(priority =8)
	private static void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 9)
	private static void closeApplication()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@DataProvider 
	public Object[][] getcred()
	{
		return new Object[][] {{"admin","manager"}};
	}
	
	@DataProvider
	public Object[][] getcreate()
	{
		return new Object[][] {{"Asho","Kumar","akn.ashu96@gmail.com","Sagar","Welcome1","Welcome1"}};
	}
}
