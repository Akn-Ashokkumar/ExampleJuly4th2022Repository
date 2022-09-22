package Com.sgtesting.Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		//absolutepath();
		//relativeXPathUsingTagName();
		//relativeXPathUsingTagNameWithIndex();
		//relativeXPathUsingTagNameWithAttributeNameValue();
		//relativeXPathUsingAttributeNameValue();
		//relativeXPathUsingAttributeValue();
		//relativeXPathUsingTagNameWithMultipleAttributeNameValue();
		//relativeXPathUsingTagNameWithMultipleAttributeNameValueUsingAndOperator();
		//relativeXPathUsingTagNameWithMultipleAttributeNameValueUsingOROperator();
		//relativeXPathUsingPartialMatchingOfAttributeValue();
		//relativeXPathUsingTagNameWithAttributeName();
		//relativeXPathUsingTagNameWithAttributeName_1();
		//relativeXPathUsingTagNameWithAttributeName_2();
		//relativeXPathUsingTagNameWithAttributeName_3();
		//relativeXPathUsingTextContent();
		//relativeXPathUsingPartialMatchingOfTextContent();

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
			oBrowser.get("file://D:/Files/xpathdemo_3_sept_2022%20(1)/Sample.html");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void absolutepath()
	{
		try {
			oBrowser.findElement(By.xpath("html/body/div/form/input")).sendKeys("DemoUser1");
			oBrowser.findElement(By.xpath("//HTML/BODY/DIV/FORM/INPUT[2]")).sendKeys("Ashok");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Case 1: Using tagName to identify the Element
	 * Syntax: //<tagName>
	 */
	private static void relativeXPathUsingTagName()
	{
		oBrowser.findElement(By.xpath("//input")).sendKeys("DemoUser1");
	}
	/**
	 * Case 2: Using tagName with index to identify the Element
	 * Syntax: //<tagName>[index]
	 */
	private static void relativeXPathUsingTagNameWithIndex()
	{
		try {
			oBrowser.findElement(By.xpath("//input[1]")).sendKeys("demouser1");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Case 3: Using tagName with AtributeName and Value combination
	 * Syntax: //<tagName>[@Attribute='attributevalue']
	 */
	private static void relativeXPathUsingTagNameWithAttributeNameValue()
	{
		oBrowser.findElement(By.xpath("//input[@value='Submit']")).click();
	}
	/**
	 * Case 4: Irrespective of tagName with AtributeName and Value combination
	 * Syntax: //*[@Attribute='attributevalue']
	 */
	private static void relativeXPathUsingAttributeNameValue()
	{
		oBrowser.findElement(By.xpath("//*[@value='Submit']")).click();	}
	/**
	 * Case 5: Irrespective of tagName and AtributeName using Value Alone
	 * Syntax: //*[@*='attributevalue']
	 */
	
	private static void relativeXPathUsingAttributeValue()
	{
		oBrowser.findElement(By.xpath("//*[@*='Submit']")).click();	
	}
/**
 * Case 6: Using tagName with Multiple AtributeName and Value combination
 * Syntax: //<tagName>[@Attribute='attributevalue'][@Attribute='attributevalue']
 */
	private static void relativeXPathUsingTagNameWithMultipleAttributeNameValue()
	{
		oBrowser.findElement(By.xpath("//input[@class='submit1btn1'][@value='Submit']")).click();	
	}
	/**
	 * Case 7: Using tagName with Multiple AtributeName and Value combination using and operator
	 * Syntax: //<tagName>[@Attribute='attributevalue' and @Attribute='attributevalue']
	 */
	private static void relativeXPathUsingTagNameWithMultipleAttributeNameValueUsingAndOperator()
	{
		oBrowser.findElement(By.xpath("//input[@class='submit1btn1'and @value='Submit']")).click();
	}
	/**
	 * Case 8: Using tagName with Multiple AtributeName and Value combination using OR operator
	 * Syntax: //<tagName>[@Attribute='attributevalue' and @Attribute='attributevalue']
	 */
	private static void relativeXPathUsingTagNameWithMultipleAttributeNameValueUsingOROperator()
	{
		oBrowser.findElement(By.xpath("//input[@class='submit1btn1'or @value='Submit']")).click();
	}
	/**
	 * Case 9: Based on Partial MAtching of Attribute Value 
	 *  starts-with(@attributename,'attributevalue')
	 *  ends-with(@attributename,'attributevalue')
	 *  contains(@attributename,'attributevalue')
	 * Syntax: //<tagName>[starts-with(@attributename,'attributevalue')]
	 * Syntax: //<tagName>[ends-with(@attributename,'attributevalue')]
	 * Syntax: //<tagName>[contains(@attributename,'attributevalue')]
	 */
	private static void relativeXPathUsingPartialMatchingOfAttributeValue()
	{
		//oBrowser.findElement(By.xpath("//input[starts-with(@id,'btn1')]")).click();
		oBrowser.findElement(By.xpath("//input[contains(@name,'mit1')]")).click();
	}
	/**
	 * Case 10: Using tagName with AtributeName combination
	 * Syntax: //<tagName>[@Attribute]
	 */
	private static void relativeXPathUsingTagNameWithAttributeName()
	{
		//Find out number of links in a web Page
				List<WebElement> oLinks=oBrowser.findElements(By.xpath("//a[@href]"));
				System.out.println("# of Links in a Web Page :"+oLinks.size());
	}
	private static void relativeXPathUsingTagNameWithAttributeName_1()
	{
		//Display All the links in a web Page
				List<WebElement> oLinks=oBrowser.findElements(By.xpath("//a[@href]"));
				for(int i=0;i<oLinks.size();i++)
				{
					String linkName=oLinks.get(i).getText();
					System.out.println(linkName);
				}
	}
	private static void relativeXPathUsingTagNameWithAttributeName_2()
	{
		//Perform click operation on a Specific Link
		try {
			List<WebElement> oLinks=oBrowser.findElements(By.xpath("//a[@href]"));
			for(int i=0;i<oLinks.size();i++)
			{
				String linkName=oLinks.get(i).getText();
				if(linkName.endsWith("HQ"))
				{
					oLinks.get(i).click();
					break;
				}
			}
			Thread.sleep(3000);
			oBrowser.navigate().back();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void relativeXPathUsingTagNameWithAttributeName_3()
	{
		//org.openqa.selenium.StaleElementReferenceException: 
				//stale element reference: element is not attached to the page document
				try
				{
					List<WebElement> oLinks=oBrowser.findElements(By.xpath("//a[@href]"));
					for(int i=0;i<oLinks.size();i++)
					{
						String linkName=oLinks.get(i).getText();
						if(linkName.endsWith("HQ"))
						{
							oLinks.get(i).click();
						}
					}
					Thread.sleep(3000);
					oBrowser.navigate().back();
				}catch (Exception e) {
					e.printStackTrace();
				}
	}
	/**
	 * Case 11: Using Text Content identify the Element
	 * Syntax: //<tagName>[text()='content']
	 */
	private static void relativeXPathUsingTextContent()
	{
		oBrowser.findElement(By.xpath("//a[text()='POI Apache']")).click();
	}
	/**
	 * Case 12: Using Partial Matching of Text Content identify the Element
	 *   starts-with(text(),'partial text content')
	 *   ends-with(text(),'partial text content')
	 *   contains(text(),'partial text content')
	 * Syntax: //<tagName>[starts-with(text(),'partial text content')]
	 * Syntax: //<tagName>[ends-with(text(),'partial text content')]
	 * Syntax: //<tagName>[contains(text(),'partial text content')]
	 */
	private static void relativeXPathUsingPartialMatchingOfTextContent()
	{
		//oBrowser.findElement(By.xpath("//a[starts-with(text(),'POI')]")).click();
		oBrowser.findElement(By.xpath("//type[starts-with(text(),'checkbox')]")).click();
	}
}
