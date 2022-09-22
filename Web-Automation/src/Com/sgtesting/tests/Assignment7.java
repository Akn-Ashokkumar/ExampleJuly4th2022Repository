package Com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
			launchBroswer();
			navigate();
			login();
			minimiseflyout();
			CustomerCreate();
			ProjectCreate();
			NewTask();
			DeleteTask();
			//DeleteProject();
			//DeleteCustomer();
			//Logout();
			//CloseApplication();

	}
		private static void launchBroswer()
		{
			try {
				System.setProperty("webdriver.ch"
						+ "rome.driver", "C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
				oBrowser=new ChromeDriver();
				oBrowser.manage().window().maximize();
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
	    	oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a/div[1]")).click();
	    	Thread.sleep(2000);
	    	oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
	    	Thread.sleep(3000);
	    	oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
	    	Thread.sleep(2000);
	    	oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Coolesttt");
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
	    	oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("Study1234");
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
	    private static void NewTask()
	    {
	    	try {
	    		oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[1]/div[3]/div/div[2]")).click();
	    		Thread.sleep(2000);
	    		oBrowser.findElement(By.xpath("/html/body/div[13]/div[1]")).click();
	    		Thread.sleep(2000);
	    		oBrowser.findElement(By.xpath("//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")).sendKeys("Ashok");
	    		oBrowser.findElement(By.xpath("//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[2]/td[1]/input")).sendKeys("Monika");
	    		oBrowser.findElement(By.xpath("//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[3]/td[1]/input")).sendKeys("Kiran");
	    		oBrowser.findElement(By.xpath("//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[4]/td[1]/input")).sendKeys("Sagar");
	    		oBrowser.findElement(By.xpath("//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[5]/td[1]/input")).sendKeys("Yash");
	    		oBrowser.findElement(By.xpath("//*[@id=\"createTasksPopup_commitBtn\"]/div/span")).click();
	    		Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
	    	
	    }
	    private static void DeleteTask()
	    {
	    	try
	    	{
	    	oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/table/tbody/tr/td[1]/div")).click();
	    	Thread.sleep(2000);
	    	oBrowser.findElement(By.xpath("//div[@class='deleteButton']")).click();
	    	Thread.sleep(2000);
	    	oBrowser.findElement(By.cssSelector("#taskListBlock > div.tasksTable.allTasksLoaded.hasSelectedCustomer.hasSelectedProject.selectAll > div.groupOperationsContainer > div > div > div.deleteButton")).click();
	    	Thread.sleep(2000);
	    	}
	    	catch (Exception e) {
				e.printStackTrace();
			}
	    }
	    private static void DeleteProject()
	    {
	    	try {
	    		oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
	        	Thread.sleep(2000);
	        	oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[3]/div/div/div[4]/span")).click();
	        	Thread.sleep(2000);
	        	oBrowser.findElement(By.xpath("//*[@id=\"projectPanel_deleteConfirm_submitTitle\"]")).click();
	        	Thread.sleep(2000);	
			} catch (Exception e) {
				
			}
	    }
	    private static void DeleteCustomer()
	    {
	    	try {
	    		oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
	    		Thread.sleep(2000);
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
