package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "E:\\Selenium\\Browser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("chrome lunched successfully");
		driver.get("https://www.google.com");
		
		//Finding web element by xpath
		
		if(driver.findElement(By.xpath("//input[@name='q']")).isDisplayed())
		{
			System.out.println("Google search text box is Displayed");
		}
		else
		{
			System.out.println("Google search text box is not Displayed");
		}
		
		System.out.println("The output of the IsDisplayed: "+driver.findElement(By.xpath("//input[@name='q']")).isDisplayed());
		
		
		if(driver.findElement(By.xpath("(//*[@name='btnK'])[2]")).isEnabled())
		{
			System.out.println("Google search button is enabled");
		}
		else
		{
			System.out.println("Google search button is not enabled");
		}
		
		System.out.println("The output of the IsEnabled:"+driver.findElement(By.xpath("(//*[@name='btnK'])[2]")).isEnabled());
		
		//close browser
		driver.close();
		System.out.println("Chrome browser closed successfuly");

	}

}
