package BOT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Wu_font {
WebDriver driver;
	
	@BeforeTest
	public void setup() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
	
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
		
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	driver.get("https://dev-01.skil.ai/ai-demo/html/pages/wu-assisstant-v1.html");
	
	}
	@Test(priority = 1)
 	public void change_transfer_font_size() throws InterruptedException {
    	 driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).click();
		 Thread.sleep(10000);
		 driver.findElement(By.xpath("//div[@btn-title = 'change_transfer']")).click();
		 Thread.sleep(10000);
		 WebElement ele= driver.findElement(By.xpath("//div[contains(text() ,  'You can correct any minor typographical or spelling errors. We do not allow full name change. Click')]"));
		 System.out.println("change transfer bot response: "+ ele.getText());
		 Thread.sleep(4000);
		 
		 String fontSize = ele.getCssValue("font-size");
		 System.out.println("Font Size---->"+fontSize);
		 
		 String fontColor = ele.getCssValue("color");
		 System.out.println("Font colour---->"+fontColor);
		 
		 String fontType = ele.getCssValue("font-family");
			System.out.println("Font fontType---->"+fontType);
		 
		 String fonttxtAlign = ele.getCssValue("text-align");
		 System.out.println("Font textalignment---->"+fonttxtAlign);
		 
		 boolean b6 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
	     Assert.assertTrue(b6);
	     Thread.sleep(3000);
	     boolean b7 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
	     Assert.assertTrue(b7);
	     Thread.sleep(3000);
		 
}	 
	@Test(priority = 2)
 	public void cancel_refund_ResponseandButtons() throws InterruptedException {
//    	 driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
//		 Thread.sleep(5000);
//		 driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).click();
//		 Thread.sleep(5000);
    	driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).click();
    	Thread.sleep(4000);
    	driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).click();
    	Thread.sleep(5000);
		 driver.findElement(By.xpath("//div[@btn-title = 'cancel_refund']")).click();
		 Thread.sleep(8000);
		 WebElement ele= driver.findElement(By.xpath("//div[contains(text() ,  \"You may be able to cancel your money transfer if it has not been picked up or deposited. Click\")]"));
		 System.out.println("cancel_refund bot response: "+ ele.getText());
		 Thread.sleep(4000);
		 
		 String fontSize = ele.getCssValue("font-size");
		 System.out.println("Font Size---->"+fontSize);
		 
		 String fontColor = ele.getCssValue("color");
		 System.out.println("Font colour---->"+fontColor);
		 
		 String fonttxtAlign = ele.getCssValue("text-align");
		 System.out.println("Font textalignment---->"+fonttxtAlign);
		 
		 String fontType = ele.getCssValue("font-type");
		System.out.println("Font textalignment---->"+fontType);
		 boolean b6 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
	     Assert.assertTrue(b6);
	     Thread.sleep(3000);
	     boolean b7 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
	     Assert.assertTrue(b7);
	     Thread.sleep(3000);
		 
}	 

}
