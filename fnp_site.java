package Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fnp_site {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "E:\\Selenium\\Browser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("chrome lunched successfully");
		driver.get("https://www.fnp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div[2]/div[2]/div[1]")).click();
		//driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div[2]/div[2]/div[2]/div/div/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"#flowersmenu\"]")).click();

	}

}
