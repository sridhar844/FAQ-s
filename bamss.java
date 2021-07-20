package BOT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class bamss {
WebDriver driver;
	
	@BeforeTest
	public void setup() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
	
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
		
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	driver.get("https://bams-wucare.cs94.force.com/care/s/chat-with-wu?language=en_US");
	Thread.sleep(12000);
	
	}
	@Test(priority = 1)
 	public void change_transfer_font_size() throws InterruptedException {
    	 driver.findElement(By.xpath("//button[@class = 'ie-css s-m1-btn staring_message wu-icon']")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).click();
		 Thread.sleep(10000);
		 driver.findElement(By.xpath("//div[@btn-title = 'change_transfer']")).click();
}
}
