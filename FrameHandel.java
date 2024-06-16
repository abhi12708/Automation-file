package Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandel {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "E:\\Selenium\\Browser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("chrome lunched successfully");
		driver.get("https://the-internet.herokuapp.com/frames");
		driver.manage().window().maximize();
		 //use of Implicitwait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/a")).click();
		
		//switch to frame with frame name
		driver.switchTo().frame("frame-top");
		System.out.println("Switch to the frame");
		
		java.util.List<WebElement>frame=driver.findElements(By.tagName("frame"));
		System.out.println("Number of frame in the page is ="+frame.size());
		System.out.println("--------------");
		
		for(int i=1; i<frame.size(); i=i+1)
		{
			System.out.println("name of frame#" +i+ ":" +frame.get(i).getSize());
			
		}
		
		//Switch back to main web page
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame-bottom");
		System.out.println("Switch to the  bottom-frame");
		
		WebElement a= driver.findElement(By.cssSelector("body"));
		System.out.println("Text is:" +a.getText());
		System.out.println("page source is:" +driver.getPageSource());



	}

}
