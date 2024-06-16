package Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttributes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" , "E:\\Selenium\\Browser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("chrome lunched successfully");
		driver.get("https://www.calculator.net/percent-calculator.html");
		 //use of Implicitwait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//enter value 
		driver.findElement(By.id("cpar1")).sendKeys("500");
		driver.findElement(By.id("cpar2")).sendKeys("200");
		driver.findElement(By.id("cpar3")).sendKeys("300");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value=\"Calculate\"]")).click();
		
		Thread.sleep(3000);
		//Get Text box values
		String result1=driver.findElement(By.id("cpar1")).getAttribute("value");
		String result2=driver.findElement(By.id("cpar2")).getAttribute("value");
		String result3=driver.findElement(By.id("cpar3")).getAttribute("value");
		
		//Print
		System.out.println("The result1 is :"+result1);
		System.out.println("The result2 is :"+result2);
		System.out.println("The result3 is :"+result3);
		



	}

}
