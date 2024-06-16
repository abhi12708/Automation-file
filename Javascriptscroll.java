package Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptscroll {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "E:\\Selenium\\Browser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("chrome lunched successfully");
		driver.get("https://business.twitter.com/en/basics/create-a-twitter-business-profile.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Start a campaign")).click();
		
		System.out.println("Title2: " +driver.getTitle());
		
		
        //scroll
		JavascriptExecutor jse;
		jse=(JavascriptExecutor)driver;
		jse.executeScript("scroll(0,900)");

	}

}
