package Com.sgtesting.launchprocess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment3 {
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
	private static void CustomerCreate()
    {
    	try {
    		String expected ,actual;
    		expected="actiTIME -  User List ";
    		oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a/div[1]")).click();
    		actual=oBrowser.getTitle();
    		Assert.assertNotEquals(expected, actual);
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
	@Test(priority = 6)
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
	@Test(priority=7)
	 private static void Logout()
		{
			try {
				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	@Test(priority = 8)
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

}
