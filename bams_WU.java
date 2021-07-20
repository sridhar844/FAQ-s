package BOT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class bams_WU {
	WebDriver driver;
	
	
	
	
	
	@BeforeTest
	public void setup() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
	
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
		
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	driver.get("https://alpha.skil.ai/ai-demo/html/pages/swwoon.html");
	
	}
	@Test(priority =1)
	public void Swwoon_Bot_Response() throws InterruptedException {
		Thread.sleep(2000);
		 //driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
		//
		driver.findElement(By.xpath("//button[@data-content = \"Hey there! 👋 What's up? Have any questions? We're here to help! 😇 🦄\"]//i")).click();
		//img[@src = "https://skil-ai-cf.s3.amazonaws.com/widget/chat/images/icon5.png"]
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//p[contains(text() , 'Lets Talk Now')]")).click();
		 
		 boolean b = driver.findElement(By.xpath("//div[contains(text() , 'Hello !')]")).isDisplayed();
	     Assert.assertTrue(b);	
	     Thread.sleep(2000);
	     boolean b1 = driver.findElement(By.xpath("//div[contains(text() , \"Let's get to know each other first . I'm quokka, the happiest bot in the world\")]")).isDisplayed();
	     Assert.assertTrue(b1);
	     Thread.sleep(2000);
	     boolean b2 = driver.findElement(By.xpath("//div[contains(text() , \"How is your day going so far ?\")]")).isDisplayed();
	     Assert.assertTrue(b2);
	     Thread.sleep(2000);
	     boolean b3 = driver.findElement(By.xpath("//div[@btn-val =  ' Good']")).isDisplayed();
	     Assert.assertTrue(b3);
	     Thread.sleep(2000);
	     boolean b4 = driver.findElement(By.xpath("//div[@btn-val =  ' Not Good']")).isDisplayed();
	     Assert.assertTrue(b4);
	     Thread.sleep(2000);
	}
	     @Test(priority =2)
	 	public void Swwoon_Good_Bot_Response() throws InterruptedException {
	     driver.findElement(By.xpath("//div[@btn-val =  ' Good']")).click();
	     Thread.sleep(3000);
	     boolean b5 = driver.findElement(By.xpath("//img[@src = 'https://skil-ai-cf.s3.amazonaws.com/widget/chat/images/good.png']")).isDisplayed();
	     Assert.assertTrue(b5);	
	     Thread.sleep(2000);
	     boolean b6 = driver.findElement(By.xpath("//div[contains(text() ,  \"So what's on your mind?\")]")).isDisplayed();
	     Assert.assertTrue(b6);
	     Thread.sleep(2000);
	     boolean b7 = driver.findElement(By.xpath("//div[contains(text() ,  \"Take a second to reflect on it while taking a deep breath\")]")).isDisplayed();
	     Assert.assertTrue(b7);
	     Thread.sleep(2000);
	     boolean b8 = driver.findElement(By.xpath("//div[contains(text() ,  \"The thought on your mind made you\")]")).isDisplayed();
	     Assert.assertTrue(b8);
	     Thread.sleep(2000);
	     boolean b9 = driver.findElement(By.xpath("//p[contains(text() ,  \"Smile\")]")).isDisplayed();
	     Assert.assertTrue(b9);
	     Thread.sleep(2000);
	     boolean b10 = driver.findElement(By.xpath("//p[contains(text() ,  \"Think\")]")).isDisplayed();
	     Assert.assertTrue(b10);
	     Thread.sleep(2000);
	     boolean b11 = driver.findElement(By.xpath("//p[contains(text() ,  \"Worry\")]")).isDisplayed();
	     Assert.assertTrue(b11);
	     Thread.sleep(2000);
	     }
	     @Test(priority =3)
		 public void Swwoon_Smile_Bot_Response() throws InterruptedException {
	     driver.findElement(By.xpath("//p[contains(text() ,  \"Smile\")]")).click();
	     Thread.sleep(3000);
	     boolean b12 = driver.findElement(By.xpath("//img[@src =  \"https://d3dqyamsdzq0rr.cloudfront.net/images/swwoon_bot_icon.png\"]")).isDisplayed();
	     Assert.assertTrue(b12);	
	     Thread.sleep(2000);
	     boolean b13 = driver.findElement(By.xpath("//div[contains(text() ,  \"Do you like to share with me ?\")]")).isDisplayed();
	     Assert.assertTrue(b13);
	     Thread.sleep(2000);
	     boolean b14 = driver.findElement(By.xpath("//div[@btn-val = \" Not Sure\"]")).isDisplayed();
	     Assert.assertTrue(b14);
	     Thread.sleep(2000);
	     boolean b15 = driver.findElement(By.xpath("//div[@btn-val = \" No\"]")).isDisplayed();
	     Assert.assertTrue(b15);
	     Thread.sleep(2000);
	     boolean b16 = driver.findElement(By.xpath("//div[@btn-val = \" Oh Yes!\"]")).isDisplayed();
	     Assert.assertTrue(b16);
	     Thread.sleep(2000);
	     }
	     @Test(priority =4)
	     public void Swwoon_No_Bot_Response() throws InterruptedException {
	     driver.findElement(By.xpath("//div[@btn-val = \" No\"]")).click();	
	     boolean b5 = driver.findElement(By.xpath("//img[@src = 'https://skil-ai-cf.s3.amazonaws.com/widget/chat/images/good.png']")).isDisplayed();
	     Assert.assertTrue(b5);	
	     Thread.sleep(2000);
	     boolean b6 = driver.findElement(By.xpath("//div[contains(text() ,  \"So what's on your mind?\")]")).isDisplayed();
	     Assert.assertTrue(b6);
	     Thread.sleep(2000);
	     boolean b7 = driver.findElement(By.xpath("//div[contains(text() ,  \"Take a second to reflect on it while taking a deep breath\")]")).isDisplayed();
	     Assert.assertTrue(b7);
	     Thread.sleep(2000);
	     boolean b8 = driver.findElement(By.xpath("//div[contains(text() ,  \"The thought on your mind made you\")]")).isDisplayed();
	     Assert.assertTrue(b8);
	     Thread.sleep(2000);
	     boolean b9 = driver.findElement(By.xpath("//p[contains(text() ,  \"Smile\")]")).isDisplayed();
	     Assert.assertTrue(b9);
	     Thread.sleep(2000);
	     boolean b10 = driver.findElement(By.xpath("//p[contains(text() ,  \"Think\")]")).isDisplayed();
	     Assert.assertTrue(b10);
	     Thread.sleep(2000);
	     boolean b11 = driver.findElement(By.xpath("//p[contains(text() ,  \"Worry\")]")).isDisplayed();
	     Assert.assertTrue(b11);
	     Thread.sleep(2000);
	    	 
	    	 
	    	 
	     }
//		 Assert.assertEquals("Hi, Thanks for reaching out to WU, how may I help you?",driver.findElement(By.xpath("//div[contains(text() , 'Hi, Thanks for reaching out to WU, how may I help you?')]")).getText());
//	     //String element = driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).getText();
//		 System.out.println(driver.findElement(By.xpath("//div[contains(text() , 'Hi, Thanks for reaching out to WU, how may I help you?')]")).getText());  
//		Thread.sleep(4000);
		
		
	     @AfterTest
	     public void teardown() {
	     	driver.quit();
	     	
	     }

	     }
