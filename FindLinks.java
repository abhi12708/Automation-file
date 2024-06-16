package Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinks {
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "E:\\Selenium\\Browser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("chrome lunched successfully");
		driver.get("https://www.calculator.net");
		 //use of Implicitwait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		java.util.List<WebElement>link=driver.findElements(By.tagName("a"));
		System.out.println("Number of link in the page is ="+link.size());
		System.out.println("--------------");
		
		for(int i=1; i<link.size(); i=i+1)
		{
			System.out.println("name of link#" +i+ ":" +link.get(i).getText());
			driver.manage().window().maximize();
		}

	}

}
