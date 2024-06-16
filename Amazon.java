package Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "E:\\\\Selenium\\\\Browser\\\\chrome\\\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("chrome lunched successfully");
		driver.get("https://www.amazon.in/Samsung-Galaxy-Awesome-128GB-Storage/dp/B0B4S3283N/ref=sr_1_1?crid=2BHMHIHUB5RVE&keywords=Samsung%2BA73&qid=1663037764&refinements=p_89%3ASamsung&rnid=3837712031&s=electronics&sprefix=samsung%2Ba73%2Caps%2C680&sr=1-1&th=1");
		driver.manage().window().maximize();
		//use of Implicitwait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//input[@class=\"a-button-input\"])[13]")).click();
	}

}
