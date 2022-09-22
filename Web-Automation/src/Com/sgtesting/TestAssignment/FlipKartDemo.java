package Com.sgtesting.TestAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchbroswer();
		nagivate();
		login();
		//Nooflink();
		//Displaylink();
		ClickLink();
		Image();

	}
	private static void launchbroswer()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivernew\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void nagivate()
	{
		try {
			oBrowser.get("https://www.flipkart.com/");
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
		oBrowser.findElement(By.xpath("//*[@class='_2IX_2- VJZDxU']")).sendKeys("7411011954");
		Thread.sleep(5000);
		oBrowser.findElement(By.xpath("//*[@type='password']")).sendKeys("Ashok@123");
		oBrowser.findElement(By.xpath("//*[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		Thread.sleep(5000);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Nooflink() {
		try {
			List<WebElement> oLinks=oBrowser.findElements(By.xpath("//a[@href]"));
			System.out.println("no of links"+oLinks.size());
		} catch (Exception e) {
			e.printStackTrace();	
		}
	}
	
	private static void Displaylink()
		{
			try {
				List<WebElement> oLinks=oBrowser.findElements(By.xpath("//a[@href]"));
				for(int i=0;i<= oLinks.size();i++)
				{
					String linkname =oLinks.get(i).getText();
					System.out.println(linkname);
				}
					
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	private static void ClickLink()
	{
		try {
			List<WebElement> oLinks=oBrowser.findElements(By.xpath("//a[@href]"));
			for(int i=0;i<oLinks.size();i++)
			{
				String linkname=oLinks.get(i).getText();
				if(linkname.contains("Help Center"))
				{
					oLinks.get(i).click();
					break;
				}
			}
			Thread.sleep(5000);
			oBrowser.navigate().back();
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	private static void Image()
	{
		try {
			oBrowser.findElement(By.xpath("//a[text()='Help Center']"));
			Thread.sleep(2000);
			oBrowser.navigate().back();
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
}
	
