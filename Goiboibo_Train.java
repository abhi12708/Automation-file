package Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goiboibo_Train {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "E:\\Selenium\\Browser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("chrome lunched successfully");
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/header/ul/li[3]/a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/section/section[1]/section[1]/aside[1]/label[1]/div/div/input")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/section/section[1]/section[1]/aside[1]/label[1]/div/div/input")).sendKeys("Pune");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


	driver.findElement(By.xpath("//*[@id=\"autosuggest\"]/ul/li[1]/div[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"autosuggest\"]/ul/li[1]/div[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/section/section[1]/section[1]/aside[1]/label[2]/div/div/input")).sendKeys("Buxar");
	driver.findElement(By.xpath("//*[@id=\"autosuggest\"]/ul/li[1]/div[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"autosuggest\"]/ul/li[1]/div[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"autosuggest\"]/ul/li[3]")).click();

		

	}

}
