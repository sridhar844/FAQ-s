package BOT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class chatbot_wu {
	
	
//	public static void main(String[] args) throws Exception {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver(); 
	    //driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://dev-01.skil.ai/ai-demo/html/pages/wu-assisstant-v1.html");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
	    Thread.sleep(6000);
	    Assert.assertEquals("Hi, Thanks for reaching out to WU, how may I help you?",driver.findElement(By.xpath("//div[contains(text() , 'Hi, Thanks for reaching out to WU, how may I help you?')]")).getText());
		//String element = driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).getText();
		System.out.println(driver.findElement(By.xpath("//div[contains(text() , 'Hi, Thanks for reaching out to WU, how may I help you?')]")).getText());  
		Thread.sleep(4000);
		Assert.assertEquals("Existing transfer",driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).getText());
		//String element = driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).getText();
		System.out.println(driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).getText());  
		Thread.sleep(4000);
		Assert.assertEquals("General inquiry",driver.findElement(By.xpath("//div[@btn-title = 'general_inquiry']")).getText());
		//String element = driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).getText();
		System.out.println(driver.findElement(By.xpath("//div[@btn-title = 'general_inquiry']")).getText()); 
		Thread.sleep(4000);
		Assert.assertEquals("Products & Services",driver.findElement(By.xpath("//div[@btn-title = 'product_and_services']")).getText());
		//String element = driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).getText();
		System.out.println(driver.findElement(By.xpath("//div[@btn-title = 'product_and_services']")).getText()); 
		Thread.sleep(4000);
		Assert.assertEquals("WU.com/Mobile app",driver.findElement(By.xpath("//div[@btn-title = 'wucom_mobileapp']")).getText());
		//String element = driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).getText();
		System.out.println(driver.findElement(By.xpath("//div[@btn-title = 'wucom_mobileapp']")).getText()); 
		}

		
		
		}

