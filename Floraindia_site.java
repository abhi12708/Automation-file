package Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Floraindia_site {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "E:\\Selenium\\Browser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("chrome lunched successfully");
		driver.get("https://www.floraindia.com/");
		 //use of Implicitwait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//*[text()='All Flowers'])[3]")).click();
		
		//Explicitwait driver object
			//	WebDriverWait wait = new WebDriverWait(driver,10);
				
				//use of Explicitwait
			/*//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@id=\\\"product-collection-image-1721\\\"]")));
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				System.out.println("visible");
				driver.findElement(By.xpath("//img[@id=\"product-collection-image-1721\"]")).click();
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.findElement(By.xpath("//*[@class=\"button btn-cart \"]")).click();*/
		
		
		

	}

}
                                                                            