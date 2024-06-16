package Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoiboiboHotel {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "E:\\Selenium\\Browser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("chrome lunched successfully");
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/header/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div/div[1]/div[1]/input")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div/div[2]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"downshift-1-input\"]")).sendKeys("Goa");
		
		driver.findElement(By.xpath("//*[@id=\"downshift-1-menu\"]/div/ul/li[2]/div/p")).click();
		//List<webElement>dynamicList=driver.findElement(null)
	
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div/div[3]/div/div[1]/div/h4")).click();
		

	}

}
