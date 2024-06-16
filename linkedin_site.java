package Project;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class linkedin_site {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver" , "E:\\Selenium\\Browser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("chrome lunched successfully");
		driver.get("https://www.linkedin.com/");
		driver.manage().window().maximize();
		 //use of Implicitwait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//WebElement a = driver.findElement(By.xpath("//*[@id=\"session_key\"]"));
		WebElement a = driver.findElement(By.cssSelector("input[id='session_key']"));
		//
		a.click();
		a.sendKeys("abhishek12708@gmail.com");
		WebElement s = driver.findElement(By.xpath("//*[@id=\"session_password\"]"));
		s.click();
		s.sendKeys("Abhi12708@");
		
		driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[1]/div/div/form/button")).click();
		 //System.out.println("attribute"+a.getAttribute(null));
		/*
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("E:\\Selenium\\Screenshort\\bansi.png"));
		System.out.println("The screenshort is capture");
*/
		driver.findElement(By.xpath("//*[@id=\"ember19\"]")).click();
		driver.findElement(By.xpath("//a[@class='global-nav__secondary-link mv1']")).click();
		
		 //

	}

}
