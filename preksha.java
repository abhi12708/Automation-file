package Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class preksha {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" , "E:\\Selenium\\Browser\\chromedriver_win32\\chromedriver.exe");


		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();

		System.out.println("Sucess...");
		
		driver.manage().window().maximize();
		System.out.println("maximize");
		
		driver.get("http://www.google.com");
		
		
		System.out.println("google open successfully...");
		
		// use of implicitlyWait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Thread.sleep("3000");
		
		driver.findElement(By.name("q"));
		System.out.println("google search completed");
		
		
		driver.get("https://www.goibibo.com/");
		
		
		driver.findElement(By.xpath(("(//*[text()='Enter city or airport'] [1])"))).click();
		
		driver.findElement(By.xpath(("//input[@type='text']"))).sendKeys("Pune");

		driver.findElement(By.xpath(("(//*[text()='Pune Airport'])"))).click();
		
//driver.findElement(By.xpath(("(//*[text()='Enter city or airport'])"))).click();
		
		driver.findElement(By.xpath(("//input[@type='text']"))).sendKeys("Bengaluru");
		
				driver.findElement(By.xpath(("(//*[text()='Bengaluru International Airport'])"))).click();
				
				driver.findElement(By.xpath(("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']"))).click();
				driver.findElement(By.xpath(("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']"))).click();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.findElement(By.xpath(("//div[@aria-label='Wed Dec 07 2022']"))).click();
				driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
				driver.findElement(By.xpath(("//span[@class='fswTrvl__done']"))).click();
				
				driver.findElement(By.xpath(("//*[text()='business'] "))).click();
				driver.findElement(By.xpath(("//a[@class='sc-dtMgUX daltrV']"))).click();
				driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath(("//*[text()='SEARCH FLIGHTS'] "))).click();
				//Thread.sleep(3000);
				driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
				


	}

}
