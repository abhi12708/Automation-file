package Project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArraylistWindowhandel {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "E:\\Selenium\\Browser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("chrome lunched successfully");
		driver.get("https://www.w3schools.com/css/default.asp");
		driver.manage().window().maximize();
		 //use of Implicitwait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[text()='Free Website']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println("title1:" +driver.getTitle());
		
		//WindowsHandel
		
				String parentWin = driver.getWindowHandle();
				System.out.println("parentWin" +parentWin);
		
		 ArrayList<String> windows = (ArrayList<String>) driver.getWindowHandles();
		 Iterator<String>it=windows.iterator();
		 Collections.sort(windows);  
		    for (String i : windows) {
		    	
		      System.out.println(i);
		    }
		 

	}

}
