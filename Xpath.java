package Project;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Xpath {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" , "E:\\Selenium\\Browser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("chrome lunched successfully");
		driver.get("https://www.google.com/");
		 //use of Implicitwait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Xpath
		driver.findElement(By.xpath("//input[@name='q']")).clear();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Lallantop");
		driver.findElement(By.xpath("//input[@name='btnK']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//*[@class=\"LC20lb MBeuO DKV0Md\"])[1]")).click();
		System.out.println("Lallantop site properly run");
	}

}
