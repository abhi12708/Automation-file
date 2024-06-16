package Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3school {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "E:\\Selenium\\Browser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("chrome lunched successfully");
		driver.get("https://www.w3schools.com/css/default.asp");
		 //use of Implicitwait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[text()='Free Website']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String parentWin = driver.getWindowHandle();
		System.out.println("parentWin" +parentWin);
		//driver.close();
		//driver.quit();

	}

}
