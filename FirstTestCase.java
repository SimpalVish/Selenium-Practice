/*
 Test case
 ---------------
 1. Launch the browser
 2. Open url https://demo.opencart.com/
 3. Validate title should be "Your Store"
 4. close browser
 */


package day21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;

public class FirstTestCase 
{

	public static void main(String[] args) 
	{
//		 1. Launch the browser
//	ChromeDriver driver = new ChromeDriver();
//		WebDriver
//		driver = new ChromeDriver();
		WebDriver driver = new EdgeDriver();
		
//		Open url https://demo.opencart.com/
		driver.get("https://demo.opencart.com/");
		
//		Validate title should be "Your Store"
		String act_title = driver.getTitle();
		if(act_title.equals("Your Store"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
//		Close browser
//		driver.close();
		driver.quit();
		}

}
