package Com.sgtesting.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAccess {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		//enterSalaryForPersonSachinTendulkar();
		//enterSalaryForPersonWhoIsNextToRahulDravid();
		//markthestatusasActiveforIndiaFredomFighter();
		//fromSachinTendulakrHisPrevious2ndRecordMarkAsActive();
		//basedOnTextFieldGetTheTableIDAttributeValue();
		basedOnTableEnterSalaryFor6thRecord();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
			oBrowser.get("file://D:/Files/xpathaxes_04_sept_2022/WebTableHTML.html");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * Case 1: following-sibling
	 * Enter the salary for the Person Sachin Tendulkar
	 */
	private static void enterSalaryForPersonSachinTendulkar()
	{
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td[4]/input")).sendKeys("22000");
	}
	/**
	 * Case 2: following
	 * Enter the salary for the Person Who is Next to Rahul Dravid
	 */
	private static void enterSalaryForPersonWhoIsNextToRahulDravid()
	{
		oBrowser.findElement(By.xpath("//td[text()='Rahul Dravid']/following::tr[1]/td[6]/input")).sendKeys("2000");
	}
	/**
	 * Case 3: preceding-sibling
	 *  Mark the status as Active for India Fredom Fighter
	 */
	private static void markthestatusasActiveforIndiaFredomFighter()
	{
		oBrowser.findElement(By.xpath("//td[text()='Indian Freedom Fighter']/preceding-sibling::td[1]/preceding-sibling::td[1]/input")).click();
	}
	/**
	 * Case 4: preceding
	 *  From the Person Sachin Tendulkar,His Previous 2ndRecord ,Mark the status as Active 
	 */
	private static void fromSachinTendulakrHisPrevious2ndRecordMarkAsActive()
	{
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/preceding::tr[1]/preceding::tr[1]/td[1]/inpu")).click();
	}
	/**
	 * Case 5: ancestor
	 *  Based on the TextFiled of the Sachin Tendulkar Record, get the table id attribute value
	 */
	private static void basedOnTextFieldGetTheTableIDAttributeValue()
	{
		WebElement oEle=oBrowser.findElement(By.xpath("//input[@id='edit4']/ancestor::td/ancestor::tr/ancestor::table"));
		String val=oEle.getAttribute("id");
		System.out.println(val);
	}
	/**
	 * Case 6: descendant
	 *  Based on the Table Enter The Salary for 6th Record
	 */
	 private static void basedOnTableEnterSalaryFor6thRecord()
		{
		 oBrowser.findElement(By.xpath("//table/descendant::tr[6]/td[6]/input")).sendKeys("1200");
		}
	 
}
