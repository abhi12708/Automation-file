package Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" , "E:\\\\Selenium\\\\Browser\\\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("chrome lunched successfully");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 //use of Implicitwait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Preksha");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //xpath
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();
		
		//Logout
		driver.findElement(By.xpath("//span[@class=\"oxd-userdropdown-tab\"]")).click();
		//driver.findElement(By.xpath("//a[@href=\"/web/index.php/auth/logout\"]")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[text()="Logout"]")).click();


		
		

	}

}
