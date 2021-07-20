package BOT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class onlinevisas_indexing {
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
 	public void Chat_with_an_agent() throws InterruptedException {
		
//		 System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Documents\\chromedriver.exe");
//		    WebDriver driver =new ChromeDriver(); 
//		    //driver = new ChromeDriver();
//		    driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			driver.manage().deleteAllCookies();
//			driver.get("https://dev-01.skil.ai/ai-demo/html/pages/wu-assisstant-v1.html");
			
			driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
			 Thread.sleep(5000);
			 driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).click();
			 Thread.sleep(5000);
			//input[@name = "lastName"]
			 driver.findElement(By.xpath("//input[@name = \"firstName\"]")).sendKeys("sri-ram");
			 Thread.sleep(4000);
			 driver.findElement(By.xpath("//input[@name = \"lastName\"]")).sendKeys("sri-kumar");
			 Thread.sleep(4000);
			 driver.findElement(By.xpath("//input[@name = \"emailId\"]")).sendKeys("sri@gmail.com");
			 Thread.sleep(3000);
			 driver.findElement(By.xpath("//button[contains(text() , 'Chat with an agent')]")).click();
			 Thread.sleep(2000);
			 boolean b = driver.findElement(By.xpath("//div[contains(text() , \"Great I'm looking up and validating your inputs before I connect to agent.\")]")).isDisplayed();
			 Assert.assertTrue(b);
			 Thread.sleep(4000);
			 driver.findElement(By.xpath("//span[@class = \"agent-exit-btn\"]")).click();
			 Thread.sleep(3000);
			 boolean c = driver.findElement(By.xpath("//div[contains(text() , 'For further assistance, please select the Main Menu button below.')]")).isDisplayed();
			 Assert.assertTrue(c);
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).click();
			 Thread.sleep(3000);
			 boolean c1 = driver.findElement(By.xpath("//div[contains(text() ,  'Please select from the following options:')]")).isDisplayed();
			 Assert.assertTrue(c1);
			 Thread.sleep(4000);
//			 System.out.println("fraud_fonts:");
//			 WebElement ele= driver.findElement(By.xpath("//div[contains(text() ,  'Please select from the following options:')]"));
//			 String fontSize = ele.getCssValue("font-size");
//			 System.out.println("Font Size---->"+fontSize);
//			 
//			 String fontColor = ele.getCssValue("color");
//			 System.out.println("Font colour---->"+fontColor);
//			 
//			 String fonttxtAlign = ele.getCssValue("text-align");
//			 System.out.println("Font textalignment---->"+fonttxtAlign);
			 boolean b1 = driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).isDisplayed();
		     Assert.assertTrue(b1);
//			Assert.assertEquals("Existing transfer",driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).getText());
//			//String element = driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).getText();
//			System.out.println(driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).getText());  
			Thread.sleep(3000);
			boolean b4 = driver.findElement(By.xpath("//div[@btn-title = 'general_inquiry']")).isDisplayed();
		     Assert.assertTrue(b4);
//			Assert.assertEquals("General inquiry",driver.findElement(By.xpath("//div[@btn-title = 'general_inquiry']")).getText());
//			//String element = driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).getText();
//			System.out.println(driver.findElement(By.xpath("//div[@btn-title = 'general_inquiry']")).getText()); 
			Thread.sleep(3000);
			boolean b2 = driver.findElement(By.xpath("//div[@btn-title = 'product_and_services']")).isDisplayed();
		     Assert.assertTrue(b2);
//			Assert.assertEquals("Products & Services",driver.findElement(By.xpath("//div[@btn-title = 'product_and_services']")).getText());
//			//String element = driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).getText();
//			System.out.println(driver.findElement(By.xpath("//div[@btn-title = 'product_and_services']")).getText()); 
			Thread.sleep(3000);
			boolean b3 = driver.findElement(By.xpath("//div[@btn-title = 'wucom_mobileapp']")).isDisplayed();
		    Assert.assertTrue(b3);
			
//			Assert.assertEquals("WU.com/Mobile app",driver.findElement(By.xpath("//div[@btn-title = 'wucom_mobileapp']")).getText());
//			//String element = driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).getText();
//			System.out.println(driver.findElement(By.xpath("//div[@btn-title = 'wucom_mobileapp']")).getText()); 
		    
		    
		    Thread.sleep(3000);
			boolean b5 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
		    Assert.assertTrue(b5);
		    Thread.sleep(5000);
		    
	}
		    
		    
		    @AfterTest
			public void teardown() {
				driver.quit();
			 
		    }
	
			
			
			
			
			
			
			
			
			
			
//			driver.findElement(By.xpath("//input[@name = 'email']")).sendKeys("sushrutha@skil.ai");
//			Thread.sleep(5000);
//			driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("Enter$1234");
//			Thread.sleep(5000);
//			driver.findElement(By.xpath("//button[contains(text() , 'Sign in')]")).click();
//			Thread.sleep(5000);
//			driver.findElement(By.xpath("//span[contains(text() , 'Client Journey')]")).click();
//			Thread.sleep(5000);
//			driver.findElement(By.xpath("//a[contains(text() , 'Leads')]")).click();
//			Thread.sleep(5000);
//			driver.findElement(By.xpath("//span[contains(text() , '  Marine peckular')]")).click();
//			Thread.sleep(8000);
//			 driver.findElement(By.xpath("//button[contains(text() , ' Review Document')]")).click();
//		        Thread.sleep(20000);
//		        driver.findElement(By.xpath("//button[contains(text() , 'REFRESH')]")).click();
//		        WebDriverWait wait = new WebDriverWait(driver, 12);
//		        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text() , 'submitted h1b_1620025019283')]")));
//		        driver.findElement(By.xpath("//span[contains(text() , 'submitted h1b_1620025019283')]")).click();
////		        WebElement element;
////		        WebDriverWait wait = new WebDriverWait(driver, 100);
////		        element= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text() , 'g. SUBRAMANIAM__Passport, Visa, H4 Approvals, I-94_1619006548210')]")));
////		        element.click();
////		        Thread.sleep(15000);
////		        driver.findElement(By.xpath("//button[contains(text() , ' SAVE ')]")).click();
////		        Thread.sleep(15000);
////		        driver.findElement(By.xpath("//button[contains(text() , ' SAVE ')]")).click();
////		        Thread.sleep(15000);
////		        driver.findElement(By.xpath("//button[contains(text() , ' SAVE ')]")).click();
////		        Thread.sleep(15000);
////		        driver.findElement(By.xpath("//button[contains(text() , ' SAVE ')]")).click();
////		        Thread.sleep(15000);
////		        driver.findElement(By.xpath("//a[@id = 'boxclose']")).click();
////		        Thread.sleep(15000);
////		        driver.findElement(By.xpath("//button[contains(text() , ' Upload / View ')]")).click();
//////				Thread.sleep(5000);
////				////img[@src = '/assets/SVG/down-arrow.svg']
//		        driver.findElement(By.xpath("//img[@src = '/assets/SVG/down-arrow.svg']")).click();
				
		       }
