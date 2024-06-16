package Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "E:\\Selenium\\Browser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("chrome lunched successfully");
		driver.get("https://www.google.com/");
		 //use of Implicitwait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Explicitwait driver object
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		//use of Explicitwait
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='q']")));
		System.out.println("Google search button is visible");
		
		driver.findElement(By.xpath("//input[@name='q']")).clear();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Lallantop");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='btnK']")));
		driver.findElement(By.xpath("//input[@name='btnK']")).click();



	}

}
