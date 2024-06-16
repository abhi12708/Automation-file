package Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" , "E:\\Selenium\\Browser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("chrome lunched successfully");
		driver.get("https://www.calculator.net/interest-calculator.html");
		 //use of Implicitwait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Dropdeown
		Select dropdown = new Select(driver.findElement(By.id("ccompound")));
		
		//by text
		dropdown.selectByVisibleText("semiannually");
		
		Thread.sleep(2000);
		//by actual value
		dropdown.deselectByValue("semiannually");
		Thread.sleep(2000);
		
		//by Index value
		dropdown.selectByIndex(2);

	}

}
