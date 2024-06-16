package Project;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" , "E:\\Selenium\\Browser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("chrome lunched successfully");
		
		String URL=("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.get(URL);
		 //use of Implicitwait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement Usernametxtbox=driver.findElement(By.xpath("//input[@name='username']"));
		WebElement Passwordtxtbox=driver.findElement(By.xpath("//input[@name='password']"));
		WebElement login=driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]"));

		
		//Instantiate Action
		Actions action=new Actions(driver);
		
		//use action  class to mouse hover
		action.moveToElement(Usernametxtbox).perform();
		action.sendKeys(Usernametxtbox,"Admin").perform();
		
		//using
	//	action.click(Passwordtxtbox).perform();
	//	action.sendKeys(Passwordtxtbox,"admin123").perform();
		
		//login
		//action.click(login).perform();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		action.doubleClick(Usernametxtbox).perform();
		
		Thread.sleep(2000);
		//copy loginname from Usernametxtbox
		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Passwordtxtbox, Keys.CONTROL).perform();
		
		Thread.sleep(2000);
		action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

	}

}
