package Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "E:\\Selenium\\Browser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("chrome lunched successfully");
		driver.get("https://www.google.com");
		 //use of Implicitwait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//stroing title name in the string variable
		String title= driver.getTitle();
		System.out.println("Title of the page is: "+title);
		
		//Storing URL in string variable
		String currentUrl= driver.getCurrentUrl();
		System.out.println("Actual URl is: "+currentUrl);
		
		//Stoning Page Source in String variable 
		String pageSource= driver.getPageSource();
		
		//Stoning Page Source length in Int variable 
		int pageSourceLength=pageSource.length();
		
		//Printing length of the page source on console
		System.out.println("Total lenght of the page source is: "+pageSourceLength);
		
		//closing browse
        driver.close(); 

	}

}
