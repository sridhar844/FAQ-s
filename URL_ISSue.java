package BOT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class URL_ISSue {
  WebDriver driver;
	
	@BeforeMethod
	public void setup() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
	
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
		
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	driver.get("https://lisa-app-uat.lisawu.ml/ai-demo/html/pages/wu-assisstant-v1.html?language=en_ie");
	
	}
	
	@Test(priority =3)
	public void WU_Bot_Response() throws InterruptedException {
		 //driver.findElement(By.xpath("//img[@src = 'https://skil-ai-cf.s3.amazonaws.com/widget/chat/images/icon5.png']")).click();
		Thread.sleep(4000);
		 driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
		//driver.findElement(By.xpath("//button[@data-content = \"Hey there! 👋 What's up? Have any questions? We're here to help! 😇 🦄\"]")).click();
		 //js.executeScript("arguments[0].click();", button);
		//img[@src = "https://skil-ai-cf.s3.amazonaws.com/widget/chat/images/icon5.png"]
		 Thread.sleep(4000);
//		 driver.findElement(By.xpath("//textarea[@placeholder = \"Type or ask a brief question…\"]")).sendKeys("existing_transfer");
//		 Thread.sleep(4000);
		// driver.findElement(By.xpath("//p[contains(text() , 'Lets Talk Now')]")).click();
	    
//		 Assert.assertEquals("Hi, Thanks for reaching out to WU, how may I help you?",driver.findElement(By.xpath("//div[contains(text() , 'Hi, Thanks for reaching out to WU, how may I help you?')]")).getText());
//	     //String element = driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).getText();
//		 System.out.println(driver.findElement(By.xpath("//div[contains(text() , 'Hi, Thanks for reaching out to WU, how may I help you?')]")).getText());  
//		Thread.sleep(4000);
		
		
	}
	
}
