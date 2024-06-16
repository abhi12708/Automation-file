package Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandel {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "E:\\Selenium\\Browser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("chrome lunched successfully");
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
		
		//shift to alert
		Alert alt1= driver.switchTo().alert();
		
		String s =alt1.getText();
		System.out.println("Alert text is: " +s);
		
		
		//accept alert
		
		alt1.accept();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//cancel alert

		WebElement b=driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button"));
		b.click();
		Alert alt2= driver.switchTo().alert();

		alt2.dismiss();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//senkeys
		WebElement c=driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button"));
		c.click();
	    Alert alt3=driver.switchTo().alert();
		
		alt3.sendKeys("Abhi");
		alt3.accept();
		
		
		
		

	}

}
