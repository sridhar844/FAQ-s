package BOT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class botpractise {
	
	public static void main(String[] args) throws Exception {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\chromedriver.exe");
		    WebDriver driver =new ChromeDriver(); 
		    //driver = new ChromeDriver();
		    driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.get("https://www.iiechatbot.com/iie-web/html/home/itech-prod-workloads.html");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//label[contains(text() ,  'Search an email/ftp by Email ID, Subject, Document ID, Attachment Name/File name')]")).sendKeys("invoices@fraleyandschilling.com");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//span[contains(text() ,  'Search')]")).click();
			
			//driver.findElement(By.xpath("//button[contains(@data-content,\"Hey there! 👋 What's up? Have any questions? We're here to help! 😇 🦄\")]")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//button[@class = 's-m1-btn staring_message']")).click();
//			//driver.findElement(By.xpath("//textarea[@placeholder = 'Reply to Lisa from ExoIS']")).sendKeys(question);
//			//driver.findElement(By.xpath("//button[@title = 'Send Message to Lisa']")).click();
//		    
//			driver.findElement(By.xpath("//div[@btn-title = 'Hi']//p")).click();

}
}
