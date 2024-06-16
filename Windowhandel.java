package Project;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandel {

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
		
		Set<String>windows=driver.getWindowHandles();
		//(interface)         (object)
		Iterator<String>it=windows.iterator();
		
		while(it.hasNext()) {    //(hasnext for inform to where next element is present or not)
			
			String childwin=it.next();  //(next is for move to the next element)
			
			if(!parentWin.equals(childwin)) {
				driver.switchTo().window(childwin);
				System.out.println("childwin"+childwin);
				
				//verify the title of the child windows
				System.out.println("title2: " +driver.getTitle());
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/a[2]")).click();
			}
		}
	}

}
