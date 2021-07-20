package BOT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Chotbt_Testng {
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
	
	@Test(priority =1)
	public void WUTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title , "westernunion.com | AI - Virtual Assistant | AI bot", "title is not matched");
		
	}
	
	
	@Test(priority =2)
	public void WULogo() {
		boolean b = driver.findElement(By.xpath("//a[@class = 'navbar-brand u-header__navbar-brand u-header__navbar-brand-center']//img[1]")).isDisplayed();
		Assert.assertTrue(b);
}
	
	@Test(priority =3)
	public void WU_Bot_Response() throws InterruptedException {
		 //driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
		Thread.sleep(10000);
		 driver.findElement(By.xpath("//button[@data-content= \"Hi, Thanks for reaching out to WU, how may I help you?\"]")).click();
		 //js.executeScript("arguments[0].click();", button);
		//img[@src = "https://skil-ai-cf.s3.amazonaws.com/widget/chat/images/icon5.png"]
		 Thread.sleep(8000);
		 boolean b = driver.findElement(By.xpath("//div[contains(text() , 'Hi, Thanks for reaching out to WU, how may I help you?')]")).isDisplayed();
	     Assert.assertTrue(b);
	    
		 Assert.assertEquals("Hi, Thanks for reaching out to WU, how may I help you?",driver.findElement(By.xpath("//div[contains(text() , 'Hi, Thanks for reaching out to WU, how may I help you?')]")).getText());
	     //String element = driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).getText();
		//s System.out.println(driver.findElement(By.xpath("//div[contains(text() , 'Hi, Thanks for reaching out to WU, how may I help you?')]")).getText());  
		Thread.sleep(4000);
		
		
	}
	
	@Test(priority = 4)
	public void WU_Bot_Buttons() throws InterruptedException {
		
//		 driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
//		 Thread.sleep(5000);
		 boolean b = driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).isDisplayed();
	     Assert.assertTrue(b);
//		Assert.assertEquals("Existing transfer",driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).getText());
//		//String element = driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).getText();
//		System.out.println(driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).getText());  
		Thread.sleep(3000);
		boolean b1 = driver.findElement(By.xpath("//div[@btn-title = 'general_inquiry']")).isDisplayed();
	     Assert.assertTrue(b1);
//		Assert.assertEquals("General inquiry",driver.findElement(By.xpath("//div[@btn-title = 'general_inquiry']")).getText());
//		//String element = driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).getText();
//		System.out.println(driver.findElement(By.xpath("//div[@btn-title = 'general_inquiry']")).getText()); 
		Thread.sleep(3000);
		boolean b2 = driver.findElement(By.xpath("//div[@btn-title = 'product_and_services']")).isDisplayed();
	     Assert.assertTrue(b2);
//		Assert.assertEquals("Products & Services",driver.findElement(By.xpath("//div[@btn-title = 'product_and_services']")).getText());
//		//String element = driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).getText();
//		System.out.println(driver.findElement(By.xpath("//div[@btn-title = 'product_and_services']")).getText()); 
		Thread.sleep(3000);
		boolean b3 = driver.findElement(By.xpath("//div[@btn-title = 'wucom_mobileapp']")).isDisplayed();
	    Assert.assertTrue(b3);
		
//		Assert.assertEquals("WU.com/Mobile app",driver.findElement(By.xpath("//div[@btn-title = 'wucom_mobileapp']")).getText());
//		//String element = driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).getText();
//		System.out.println(driver.findElement(By.xpath("//div[@btn-title = 'wucom_mobileapp']")).getText()); 
	    
	    
	    Thread.sleep(3000);
		boolean b4 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
	    Assert.assertTrue(b4);
		
	}
	
	@Test(priority = 5)
	public void Existing_transfer_response_and_Buttons() throws InterruptedException {
		
		 //driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).click();
		 Thread.sleep(10000);
		 Assert.assertEquals("You can select the following options for your Existing transfer:",driver.findElement(By.xpath("//div[contains(text() , 'You can select the following options for your Existing transfer:')]")).getText());
		 //String element = driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).getText();
		 boolean ele= driver.findElement(By.xpath("//div[contains(text() ,  'You can select the following options for your Existing transfer:')]")).isDisplayed();
		 Assert.assertTrue(ele);
		  Thread.sleep(4000);
		  boolean b = driver.findElement(By.xpath("//div[@btn-title = 'transfer_status']")).isDisplayed();
		     Assert.assertTrue(b);
		     Thread.sleep(3000);
		     boolean b2 = driver.findElement(By.xpath("//div[@btn-title = 'change_transfer']")).isDisplayed();
		     Assert.assertTrue(b2);
		     Thread.sleep(3000);
		     boolean b3 = driver.findElement(By.xpath("//div[@btn-title = 'cancel_refund']")).isDisplayed();
		     Assert.assertTrue(b3);
		     Thread.sleep(3000);
		     boolean b4 = driver.findElement(By.xpath("//div[@btn-title = 'fraud']")).isDisplayed();
		     Assert.assertTrue(b4);
		     Thread.sleep(3000);
		     boolean b5 = driver.findElement(By.xpath("//div[@btn-title = 'need_something_else']")).isDisplayed();
		     Assert.assertTrue(b5);
		     Thread.sleep(3000);
		     boolean b6 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
		     Assert.assertTrue(b6);
		     Thread.sleep(3000);
		     boolean b7 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
		     Assert.assertTrue(b7);
		     Thread.sleep(4000);
	}
		     
//		    @Test(priority = 6)
//		 	public void Transfer_status_ResponseandButtons() throws InterruptedException {
////		    	 driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
////				 Thread.sleep(6000);
////				 driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).click();
////				 Thread.sleep(6000);
//				 driver.findElement(By.xpath("//div[@btn-title = 'transfer_status']")).click();
//				 Thread.sleep(6000);
//				 WebElement ele= driver.findElement(By.xpath("//div[contains(text() ,  'You can check the status of your transfer anytime at')]"));
//				 System.out.println("Transfer_status bot response: "+ ele.getText());
//				 Thread.sleep(5000);
//				 boolean b6 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
//			     Assert.assertTrue(b6);
//			     Thread.sleep(4000);
//			     boolean b7 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
//			     Assert.assertTrue(b7);
//			     Thread.sleep(4000);
//				 
//  }
//		 
		 
		    @Test(priority = 7)
		 	public void change_transfer_ResponseandButtons() throws InterruptedException {
//		    	 driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
//				 Thread.sleep(5000);
//				 driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).click();
//				 Thread.sleep(5000);
				 driver.findElement(By.xpath("//div[@btn-title = 'change_transfer']")).click();
				 Thread.sleep(10000);
				 boolean ele= driver.findElement(By.xpath("//div[contains(text() ,  'You can correct any minor typographical or spelling errors. We do not allow full name change. Click')]")).isDisplayed();
				 Assert.assertTrue(ele);
				 Thread.sleep(4000);
				 System.out.println("change_transfer_fonts:");
				 WebElement ele1 = driver.findElement(By.xpath("//div[contains(text() ,  'You can correct any minor typographical or spelling errors. We do not allow full name change. Click')]"));
				 String fontSize = ele1.getCssValue("font-size");
				 System.out.println("Font Size---->"+fontSize);
				 
				 String fontColor = ele1.getCssValue("color");
				 System.out.println("Font colour---->"+fontColor);
				 
				 String fonttxtAlign = ele1.getCssValue("text-align");
				 System.out.println("Font textalignment---->"+fonttxtAlign);
				 boolean b6 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
			     Assert.assertTrue(b6);
			     Thread.sleep(3000);
			     boolean b7 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
			     Assert.assertTrue(b7);
			     Thread.sleep(3000);
				 
  }	 
		    @Test(priority = 8)
		 	public void cancel_refund_ResponseandButtons() throws InterruptedException {
//		    	 driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
//				 Thread.sleep(5000);
//				 driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).click();
//				 Thread.sleep(5000);
		    	driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).click();
		    	Thread.sleep(4000);
		    	driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).click();
		    	Thread.sleep(5000);
				 driver.findElement(By.xpath("//div[@btn-title = 'cancel_refund']")).click();
				 Thread.sleep(8000);
				 boolean ele= driver.findElement(By.xpath("//div[contains(text() ,  \"You may be able to cancel your money transfer if it has not been picked up or deposited. Click\")]")).isDisplayed();
				 Assert.assertTrue(ele);
				 Thread.sleep(4000);
				 System.out.println("cancel_refund_fonts:");
				 WebElement ele1 = driver.findElement(By.xpath("//div[contains(text() ,  \"You may be able to cancel your money transfer if it has not been picked up or deposited. Click\")]"));
				 String fontSize = ele1.getCssValue("font-size");
				 System.out.println("Font Size---->"+fontSize);
				 
				 String fontColor = ele1.getCssValue("color");
				 System.out.println("Font colour---->"+fontColor);
				 
				 String fonttxtAlign = ele1.getCssValue("text-align");
				 System.out.println("Font textalignment---->"+fonttxtAlign);
				 boolean b6 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
			     Assert.assertTrue(b6);
			     Thread.sleep(3000);
			     boolean b7 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
			     Assert.assertTrue(b7);
			     Thread.sleep(3000);
				 
  }	 
		    @Test(priority = 9)
				 	public void Fraud_ResponseandButtons() throws InterruptedException {
//				    	 driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
//						 Thread.sleep(5000);
//						 driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).click();
//						 Thread.sleep(5000);
		    	         driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).click();
		    	         Thread.sleep(4000);
		    	         driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).click();
		    	         Thread.sleep(5000);
						 driver.findElement(By.xpath("//div[@btn-title = 'fraud']")).click();
						 Thread.sleep(10000);
						 boolean c = driver.findElement(By.xpath("//div[contains(text() ,  'It looks like you may need to chat with an agent? ')]")).isDisplayed();
						 Assert.assertTrue(c);
						 Thread.sleep(4000);
						 System.out.println("Fraud_fonts:");
						 WebElement ele = driver.findElement(By.xpath("//div[contains(text() ,  'It looks like you may need to chat with an agent? ')]"));
						 String fontSize = ele.getCssValue("font-size");
						 System.out.println("Font Size---->"+fontSize);
						 
						 String fontColor = ele.getCssValue("color");
						 System.out.println("Font colour---->"+fontColor);
						 
						 String fonttxtAlign = ele.getCssValue("text-align");
						 System.out.println("Font textalignment---->"+fonttxtAlign);
						 
						 boolean b6 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
					     Assert.assertTrue(b6);
					     Thread.sleep(3000);
					     boolean b7 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
					     Assert.assertTrue(b7);
					     Thread.sleep(3000);
		    }
						 
		    @Test(priority = 10)
		 	public void Need_something_else_ResponseandButtons() throws InterruptedException {
//		    	 driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
//				 Thread.sleep(5000);
//				 driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).click();
//				 Thread.sleep(5000);
		    	driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).click();
		    	Thread.sleep(4000);
		    	driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).click();
		    	Thread.sleep(5000);
				 driver.findElement(By.xpath("//div[@btn-title = 'need_something_else']")).click();
				 Thread.sleep(8000);
				 boolean c= driver.findElement(By.xpath("//div[contains(text() ,  'Sure! Let me know what you need.')]")).isDisplayed();
				 Assert.assertTrue(c);
				 Thread.sleep(4000);
				 System.out.println("Need_something_else_fonts:");
				 WebElement ele = driver.findElement(By.xpath("//div[contains(text() ,  'Sure! Let me know what you need.')]"));
				 String fontSize = ele.getCssValue("font-size");
				 System.out.println("Font Size---->"+fontSize);
				 
				 String fontColor = ele.getCssValue("color");
				 System.out.println("Font colour---->"+fontColor);
				 
				 String fonttxtAlign = ele.getCssValue("text-align");
				 System.out.println("Font textalignment---->"+fonttxtAlign);
				 boolean b3 = driver.findElement(By.xpath("//div[@btn-title = 'transfer_status']")).isDisplayed();
			     Assert.assertTrue(b3);
			     Thread.sleep(3000);
			     boolean b4 = driver.findElement(By.xpath("//div[@btn-title = 'send_money']")).isDisplayed();
			     Assert.assertTrue(b4);
			     Thread.sleep(3000);
			     boolean b5 = driver.findElement(By.xpath("//div[@btn-title = 'change_transfer']")).isDisplayed();
			     Assert.assertTrue(b5);
			     Thread.sleep(3000);
				 boolean b6 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
			     Assert.assertTrue(b6);
			     Thread.sleep(3000);
			     boolean b7 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
			     Assert.assertTrue(b7);
			     Thread.sleep(3000);
    }
		    
		    @Test(priority = 11)
		 	public void Existing_transfer_main_menu_ResponseandButtons() throws InterruptedException {
//		    	 driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
//				 Thread.sleep(5000);
//				 driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).click();
//				 Thread.sleep(5000);
				 driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).click();
				 Thread.sleep(5000);
				boolean c= driver.findElement(By.xpath("//div[contains(text() ,  'Please select from the following options:')]")).isDisplayed();
				Assert.assertTrue(c);
				 Thread.sleep(4000);
				 boolean b = driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).isDisplayed();
			     Assert.assertTrue(b);
//				Assert.assertEquals("Existing transfer",driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).getText());
//				//String element = driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).getText();
//				System.out.println(driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).getText());  
				Thread.sleep(3000);
				boolean b1 = driver.findElement(By.xpath("//div[@btn-title = 'general_inquiry']")).isDisplayed();
			     Assert.assertTrue(b1);
//				Assert.assertEquals("General inquiry",driver.findElement(By.xpath("//div[@btn-title = 'general_inquiry']")).getText());
//				//String element = driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).getText();
//				System.out.println(driver.findElement(By.xpath("//div[@btn-title = 'general_inquiry']")).getText()); 
				Thread.sleep(3000);
				boolean b2 = driver.findElement(By.xpath("//div[@btn-title = 'product_and_services']")).isDisplayed();
			     Assert.assertTrue(b2);
//				Assert.assertEquals("Products & Services",driver.findElement(By.xpath("//div[@btn-title = 'product_and_services']")).getText());
//				//String element = driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).getText();
//				System.out.println(driver.findElement(By.xpath("//div[@btn-title = 'product_and_services']")).getText()); 
				Thread.sleep(3000);
				boolean b3 = driver.findElement(By.xpath("//div[@btn-title = 'wucom_mobileapp']")).isDisplayed();
			    Assert.assertTrue(b3);
				
//				Assert.assertEquals("WU.com/Mobile app",driver.findElement(By.xpath("//div[@btn-title = 'wucom_mobileapp']")).getText());
//				//String element = driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).getText();
//				System.out.println(driver.findElement(By.xpath("//div[@btn-title = 'wucom_mobileapp']")).getText()); 
			    
			    
			    Thread.sleep(3000);
				boolean b4 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
			    Assert.assertTrue(b4);
    }
		    @Test(priority = 12)
		 	public void general_inquiry_ResponseandButtons() throws InterruptedException {
		    	// driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
				 Thread.sleep(5000);
                 driver.findElement(By.xpath("//div[@btn-title = 'general_inquiry']")).click();
				 Thread.sleep(5000);
				 boolean c = driver.findElement(By.xpath("//div[contains(text() ,  'Please select from the following options:')]")).isDisplayed();
				 Assert.assertTrue(c);
				 Thread.sleep(4000);
				 boolean b = driver.findElement(By.xpath("//div[@btn-title = 'agent_locator']")).isDisplayed();
			     Assert.assertTrue(b);
				 Thread.sleep(4000);
				 boolean b2 = driver.findElement(By.xpath("//div[@btn-title = 'send_money']")).isDisplayed();
			     Assert.assertTrue(b2);
				 Thread.sleep(4000);
				 boolean b3 = driver.findElement(By.xpath("//div[@btn-title = 'receive_money']")).isDisplayed();
			     Assert.assertTrue(b3);
				 Thread.sleep(4000);
				 boolean b4 = driver.findElement(By.xpath("//div[@btn-title = 'pricing_fx_rates']")).isDisplayed();
			     Assert.assertTrue(b4);
				 Thread.sleep(4000);
				 boolean b5 = driver.findElement(By.xpath("//div[@btn-title = 'id_requirements']")).isDisplayed();
			     Assert.assertTrue(b5);
				 Thread.sleep(3000);
				 boolean b6 = driver.findElement(By.xpath("//div[@btn-title = 'customer_complaint']")).isDisplayed();
			     Assert.assertTrue(b6);
				 Thread.sleep(3000);
				 boolean b7 = driver.findElement(By.xpath("//div[@btn-title = 'privacy']")).isDisplayed();
			     Assert.assertTrue(b7);
				 Thread.sleep(3000);
				 boolean b8 = driver.findElement(By.xpath("//div[@btn-title = 'fraud_information']")).isDisplayed();
			     Assert.assertTrue(b8);
				 boolean b9 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
			     Assert.assertTrue(b9);
			     Thread.sleep(3000);
			     boolean b10 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
			     Assert.assertTrue(b10);
			     Thread.sleep(3000);
		    }
		    @Test(priority = 13)
		 	public void agent_locator_ResponseandButtons() throws InterruptedException {
//		    	 driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
//				 Thread.sleep(5000);
//				 driver.findElement(By.xpath("//div[@btn-title = 'general_inquiry']")).click();
				 Thread.sleep(5000);
				 driver.findElement(By.xpath("//div[@btn-title = 'agent_locator']")).click();
				 Thread.sleep(4000);
				 boolean c = driver.findElement(By.xpath("//div[contains(text() , \"You can find agent's location by visiting\")]")).isDisplayed();
				 Assert.assertTrue(c);
				 Thread.sleep(3000);
				 System.out.println("agent_locator_fonts:");
				 WebElement ele = driver.findElement(By.xpath("//div[contains(text() , \"You can find agent's location by visiting\")]"));
				 String fontSize = ele.getCssValue("font-size");
				 System.out.println("Font Size---->"+fontSize);
				 
				 String fontColor = ele.getCssValue("color");
				 System.out.println("Font colour---->"+fontColor);
				 
				 String fonttxtAlign = ele.getCssValue("text-align");
				 System.out.println("Font textalignment---->"+fonttxtAlign);
				 
				 boolean b6 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
			     Assert.assertTrue(b6);
			     Thread.sleep(3000);
			     boolean b7 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
			     Assert.assertTrue(b7);
			     Thread.sleep(3000);
				 
  }	 
		    @Test(priority = 14)
		 	public void send_money_ResponseandButtons() throws InterruptedException {
//		    	 driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
//				 Thread.sleep(5000);
//				 driver.findElement(By.xpath("//div[@btn-title = 'general_inquiry']")).click();
		    	driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).click();
		    	Thread.sleep(4000);
		    	driver.findElement(By.xpath("//div[@btn-title = 'general_inquiry']")).click();
		    	Thread.sleep(5000);
				// Thread.sleep(5000);
				 driver.findElement(By.xpath("//div[@btn-title = 'send_money']")).click();
				 Thread.sleep(5000);
				 boolean c= driver.findElement(By.xpath("//div[contains(text() ,  'There are different ')]")).isDisplayed();
				 Assert.assertTrue(c);
				 Thread.sleep(4000);
				 System.out.println("send_money_fonts:");
				 WebElement ele = driver.findElement(By.xpath("//div[contains(text() ,  'There are different ')]"));
				 String fontSize = ele.getCssValue("font-size");
				 System.out.println("Font Size---->"+fontSize);
				 
				 String fontColor = ele.getCssValue("color");
				 System.out.println("Font colour---->"+fontColor);
				 
				 String fonttxtAlign = ele.getCssValue("text-align");
				 System.out.println("Font textalignment---->"+fonttxtAlign);
				 boolean b6 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
			     Assert.assertTrue(b6);
			     Thread.sleep(3000);
			     boolean b7 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
			     Assert.assertTrue(b7);
			     Thread.sleep(3000);
				 
  }	 
		    @Test(priority = 15)
				 	public void receive_money_ResponseandButtons() throws InterruptedException {
//				    	 driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
//						 Thread.sleep(5000);
//						 driver.findElement(By.xpath("//div[@btn-title = 'general_inquiry']")).click();
//						 Thread.sleep(5000);
						 driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).click();
					    	Thread.sleep(4000);
					    	driver.findElement(By.xpath("//div[@btn-title = 'general_inquiry']")).click();
					    	Thread.sleep(5000);
						 driver.findElement(By.xpath("//div[@btn-title = 'receive_money']")).click();
						 Thread.sleep(5000);
						 boolean c = driver.findElement(By.xpath("//div[contains(text() ,  'This depends on the money transfer delivery options available in the destination country. You must be at least 18 years old to send or receive money with Western Union. Click ')]")).isDisplayed();
						 Assert.assertTrue(c);
						 Thread.sleep(4000);
						 System.out.println("receive_money_fonts:");
						 WebElement ele = driver.findElement(By.xpath("//div[contains(text() ,  'This depends on the money transfer delivery options available in the destination country. You must be at least 18 years old to send or receive money with Western Union. Click ')]"));
						 String fontSize = ele.getCssValue("font-size");
						 System.out.println("Font Size---->"+fontSize);
						 
						 String fontColor = ele.getCssValue("color");
						 System.out.println("Font colour---->"+fontColor);
						 
						 String fonttxtAlign = ele.getCssValue("text-align");
						 System.out.println("Font textalignment---->"+fonttxtAlign);
						 boolean b6 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
					     Assert.assertTrue(b6);
					     Thread.sleep(3000);
					     boolean b7 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
					     Assert.assertTrue(b7);
					     Thread.sleep(3000);
						 
		  }	     
		    @Test(priority = 16)
		 	public void pricing_fx_rates_ResponseandButtons() throws InterruptedException {
//		    	 driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
//				 Thread.sleep(5000);
//				 driver.findElement(By.xpath("//div[@btn-title = 'general_inquiry']")).click();
//				 Thread.sleep(5000);
		    	driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).click();
		    	Thread.sleep(4000);
		    	driver.findElement(By.xpath("//div[@btn-title = 'general_inquiry']")).click();
		    	Thread.sleep(5000);
				 driver.findElement(By.xpath("//div[@btn-title = 'pricing_fx_rates']")).click();
				 Thread.sleep(5000);
				 boolean ele = driver.findElement(By.xpath("//div[contains(text() ,  'You can find the fee and applicable foreign exchange (FX) rates of your transfers online at WU.com. Click')]")).isDisplayed();
				 Assert.assertTrue(ele);
				 Thread.sleep(4000);
				 System.out.println("pricing_fx_rates_fonts:");
				 WebElement ele1 = driver.findElement(By.xpath("//div[contains(text() ,  'You can find the fee and applicable foreign exchange (FX) rates of your transfers online at WU.com. Click')]"));
				 String fontSize = ele1.getCssValue("font-size");
				 System.out.println("Font Size---->"+fontSize);
				 
				 String fontColor = ele1.getCssValue("color");
				 System.out.println("Font colour---->"+fontColor);
				 
				 String fonttxtAlign = ele1.getCssValue("text-align");
				 System.out.println("Font textalignment---->"+fonttxtAlign);
//				 boolean b4 = driver.findElement(By.xpath("//div[@btn-val = 'How much does it cost to send a transfer?']")).isDisplayed();
//			     Assert.assertTrue(b4);
//			     Thread.sleep(3000);
//			     
				 boolean b6 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
			     Assert.assertTrue(b6);
			     Thread.sleep(3000);
//			     boolean b5 = driver.findElement(By.xpath("//div[@btn-title = 'need_something_else']")).isDisplayed();
//			     Assert.assertTrue(b5);
//			     Thread.sleep(3000);
			     boolean b7 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
			     Assert.assertTrue(b7);
			     Thread.sleep(3000);
				 
  }	     
		    @Test(priority = 17)
		 	public void id_requirements_ResponseandButtons() throws InterruptedException {
//		    	 driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
//				 Thread.sleep(5000);
//				 driver.findElement(By.xpath("//div[@btn-title = 'general_inquiry']")).click();
//				 Thread.sleep(5000);
		    	driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).click();
		    	Thread.sleep(4000);
		    	driver.findElement(By.xpath("//div[@btn-title = 'general_inquiry']")).click();
		    	Thread.sleep(5000);
				 driver.findElement(By.xpath("//div[@btn-title = 'id_requirements']")).click();
				 Thread.sleep(5000);
				 boolean ele= driver.findElement(By.xpath("//div[contains(text() ,  \"Western Union is required to comply with the laws and regulations of the originating / destination country where we do business. For this reason, additional details might be required depending on transfer details.\")]")).isDisplayed();
				  Assert.assertTrue(ele);
				 Thread.sleep(4000);
				 System.out.println("id_requirements_fonts:");
				 WebElement ele1 = driver.findElement(By.xpath("//div[contains(text() ,  'You can find the fee and applicable foreign exchange (FX) rates of your transfers online at WU.com. Click')]"));
				 String fontSize = ele1.getCssValue("font-size");
				 System.out.println("Font Size---->"+fontSize);
				 
				 String fontColor = ele1.getCssValue("color");
				 System.out.println("Font colour---->"+fontColor);
				 
				 String fonttxtAlign = ele1.getCssValue("text-align");
				 System.out.println("Font textalignment---->"+fonttxtAlign);
//				 boolean b1 = driver.findElement(By.xpath("//div[@btn-title = 'transfer_status']")).isDisplayed();
//			     Assert.assertTrue(b1);
//			     Thread.sleep(3000);
//			     boolean b2 = driver.findElement(By.xpath("//div[@btn-title = 'change_transfer']")).isDisplayed();
//			     Assert.assertTrue(b2);
//			     Thread.sleep(3000);
//			     boolean b3 = driver.findElement(By.xpath("//div[@btn-title = 'wucom_mobileapp']")).isDisplayed();
//			     Assert.assertTrue(b3);
//			     Thread.sleep(3000);
//			     boolean b4 = driver.findElement(By.xpath("//div[@btn-title = 'fraud']")).isDisplayed();
//			     Assert.assertTrue(b4);
//			     Thread.sleep(3000);
//			     boolean b5 = driver.findElement(By.xpath("//div[@btn-title = 'cancel_refund']")).isDisplayed();
//			     Assert.assertTrue(b5);
//			     Thread.sleep(3000);
//			     boolean b8 = driver.findElement(By.xpath("//div[@btn-title = 'pricing_fx_rates']")).isDisplayed();
//			     Assert.assertTrue(b8);
//			     Thread.sleep(3000);
				 boolean b6 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
			     Assert.assertTrue(b6);
			     Thread.sleep(3000);
			     boolean b7 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
			     Assert.assertTrue(b7);
			     Thread.sleep(3000);
		    }
		    
		    @Test(priority = 18)
		 	public void customer_complaint_ResponseandButtons() throws InterruptedException {
//		    	 driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
//				 Thread.sleep(5000);
//				 driver.findElement(By.xpath("//div[@btn-title = 'general_inquiry']")).click();
//				 Thread.sleep(5000);
		    	driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).click();
		    	Thread.sleep(4000);
		    	driver.findElement(By.xpath("//div[@btn-title = 'general_inquiry']")).click();
		    	Thread.sleep(5000);
				 driver.findElement(By.xpath("//div[@btn-title = 'customer_complaint']")).click();
				 Thread.sleep(5000);
				 boolean c = driver.findElement(By.xpath("//div[contains(text() ,  \"We'd love to hear your feedback about our product and service to continuously improve the way we serve our valued customers. Visit our\")]")).isDisplayed();
				 Assert.assertTrue(c);
				 Thread.sleep(4000);
				 System.out.println("customer_complaint_fonts:");
				 WebElement ele = driver.findElement(By.xpath("//div[contains(text() ,  \"We'd love to hear your feedback about our product and service to continuously improve the way we serve our valued customers. Visit our\")]"));
				 String fontSize = ele.getCssValue("font-size");
				 System.out.println("Font Size---->"+fontSize);
				 
				 String fontColor = ele.getCssValue("color");
				 System.out.println("Font colour---->"+fontColor);
				 
				 String fonttxtAlign = ele.getCssValue("text-align");
				 System.out.println("Font textalignment---->"+fonttxtAlign);
				 boolean b6 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
			     Assert.assertTrue(b6);
			     Thread.sleep(3000);
			     boolean b7 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
			     Assert.assertTrue(b7);
			     Thread.sleep(3000);
		    }
		    @Test(priority = 19)
		 	public void privacy_ResponseandButtons() throws InterruptedException {
//		    	 driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
//				 Thread.sleep(5000);
//				 driver.findElement(By.xpath("//div[@btn-title = 'general_inquiry']")).click();
//				 Thread.sleep(5000);
		    	driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).click();
		    	Thread.sleep(4000);
		    	driver.findElement(By.xpath("//div[@btn-title = 'general_inquiry']")).click();
		    	Thread.sleep(5000);
				 driver.findElement(By.xpath("//div[@btn-title = 'privacy']")).click();
				 Thread.sleep(5000);
				 boolean c = driver.findElement(By.xpath("//div[contains(text() ,  \"Click \")]")).isDisplayed();
				 Assert.assertTrue(c);
				 Thread.sleep(5000);
				 System.out.println("privacy_fonts:");
				 WebElement ele = driver.findElement(By.xpath("//div[contains(text() ,  \"Click \")]"));
				 String fontSize = ele.getCssValue("font-size");
				 System.out.println("Font Size---->"+fontSize);
				 
				 String fontColor = ele.getCssValue("color");
				 System.out.println("Font colour---->"+fontColor);
				 
				 String fonttxtAlign = ele.getCssValue("text-align");
				 System.out.println("Font textalignment---->"+fonttxtAlign);
				 boolean b6 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
			     Assert.assertTrue(b6);
			     Thread.sleep(3000);
			     boolean b7 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
			     Assert.assertTrue(b7);
			     Thread.sleep(3000);
		    }
          @Test(priority = 20)
           public void general_inquiry_main_menu_ResponseandButtons() throws InterruptedException {
//		    	 driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
//				 Thread.sleep(5000);
//				 driver.findElement(By.xpath("//div[@btn-title = 'general_inquiry']")).click();
//				 Thread.sleep(5000);
				 driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).click();
				 Thread.sleep(5000);
				 boolean c = driver.findElement(By.xpath("//div[contains(text() ,  'Please select from the following options:')]")).isDisplayed();
				 Assert.assertTrue(c);
				 Thread.sleep(4000);
				 boolean b = driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).isDisplayed();
			     Assert.assertTrue(b);
//				Assert.assertEquals("Existing transfer",driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).getText());
//				//String element = driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).getText();
//				System.out.println(driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).getText());  
				Thread.sleep(3000);
				boolean b1 = driver.findElement(By.xpath("//div[@btn-title = 'general_inquiry']")).isDisplayed();
			     Assert.assertTrue(b1);
//				Assert.assertEquals("General inquiry",driver.findElement(By.xpath("//div[@btn-title = 'general_inquiry']")).getText());
//				//String element = driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).getText();
//				System.out.println(driver.findElement(By.xpath("//div[@btn-title = 'general_inquiry']")).getText()); 
				Thread.sleep(3000);
				boolean b2 = driver.findElement(By.xpath("//div[@btn-title = 'product_and_services']")).isDisplayed();
			     Assert.assertTrue(b2);
//				Assert.assertEquals("Products & Services",driver.findElement(By.xpath("//div[@btn-title = 'product_and_services']")).getText());
//				//String element = driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).getText();
//				System.out.println(driver.findElement(By.xpath("//div[@btn-title = 'product_and_services']")).getText()); 
				Thread.sleep(3000);
				boolean b3 = driver.findElement(By.xpath("//div[@btn-title = 'wucom_mobileapp']")).isDisplayed();
			    Assert.assertTrue(b3);
				
//				Assert.assertEquals("WU.com/Mobile app",driver.findElement(By.xpath("//div[@btn-title = 'wucom_mobileapp']")).getText());
//				//String element = driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).getText();
//				System.out.println(driver.findElement(By.xpath("//div[@btn-title = 'wucom_mobileapp']")).getText()); 
			    
			    
			    Thread.sleep(3000);
				boolean b4 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
			    Assert.assertTrue(b4);
    }
          @Test(priority = 21)
		 	public void product_and_services_ResponseandButtons() throws InterruptedException {
		    	// driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
				 Thread.sleep(5000);
				 driver.findElement(By.xpath("//div[@btn-title = 'product_and_services']")).click();
				 Thread.sleep(5000);
				 boolean c= driver.findElement(By.xpath("//div[contains(text() ,  \"WU provides you range of products, select from the following: \")]")).isDisplayed();
				 Assert.assertTrue(c);
				 Thread.sleep(4000);
				 boolean b = driver.findElement(By.xpath("//div[@btn-title = 'bill_payments']")).isDisplayed();
			     Assert.assertTrue(b);
				 Thread.sleep(4000);
				 boolean b2 = driver.findElement(By.xpath("//div[@btn-title = 'loyalty']")).isDisplayed();
			     Assert.assertTrue(b2);
				 Thread.sleep(3000);
				 boolean b3 = driver.findElement(By.xpath("//div[@btn-title = 'money_orders']")).isDisplayed();
			     Assert.assertTrue(b3);
				 Thread.sleep(3000);
				 boolean b4 = driver.findElement(By.xpath("//div[@btn-title = 'promotions']")).isDisplayed();
			     Assert.assertTrue(b4);
				 Thread.sleep(3000);
				 boolean b5 = driver.findElement(By.xpath("//div[@btn-title = 'amazon_paycode']")).isDisplayed();
			     Assert.assertTrue(b5);
				 Thread.sleep(3000);
				 boolean b6 = driver.findElement(By.xpath("//div[@btn-title = 'prepaid_cards']")).isDisplayed();
			     Assert.assertTrue(b6);
				 Thread.sleep(3000);
//				 boolean b7 = driver.findElement(By.xpath("//div[@btn-title = 'privacy']")).isDisplayed();
//			     Assert.assertTrue(b7);
//				 Thread.sleep(5000);
//				 boolean b8 = driver.findElement(By.xpath("//div[@btn-title = 'fraud_information']")).isDisplayed();
//			     Assert.assertTrue(b8);
				 boolean b9 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
			     Assert.assertTrue(b9);
			     Thread.sleep(3000);
			     boolean b10 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
			     Assert.assertTrue(b10);
			     Thread.sleep(3000);
		    }
          @Test(priority = 22)
		 	public void bill_payments_ResponseandButtons() throws InterruptedException {
//        	     driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
//				 Thread.sleep(5000);
//				 driver.findElement(By.xpath("//div[@btn-title = 'product_and_services']")).click();
//				 Thread.sleep(5000);
				 driver.findElement(By.xpath("//div[@btn-title = 'bill_payments']")).click();
				 Thread.sleep(5000);
				 boolean c= driver.findElement(By.xpath("//div[contains(text() ,  \"Log on to your \")]")).isDisplayed();
				 Assert.assertTrue(c);
				 Thread.sleep(4000);
				 System.out.println("bill_payments_fonts:");
				 WebElement ele = driver.findElement(By.xpath("//div[contains(text() ,  \"Log on to your \")]"));
				 String fontSize = ele.getCssValue("font-size");
				 System.out.println("Font Size---->"+fontSize);
				 
				 String fontColor = ele.getCssValue("color");
				 System.out.println("Font colour---->"+fontColor);
				 
				 String fonttxtAlign = ele.getCssValue("text-align");
				 System.out.println("Font textalignment---->"+fonttxtAlign);
				 
				 boolean b6 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
			     Assert.assertTrue(b6);
			     Thread.sleep(3000);
			     boolean b7 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
			     Assert.assertTrue(b7);
			     Thread.sleep(3000);
		    }
          @Test(priority = 22)
		 	public void loyalty_ResponseandButtons() throws InterruptedException {
//		    	 driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
//				 Thread.sleep(5000);
//				 driver.findElement(By.xpath("//div[@btn-title = 'product_and_services']")).click();
//				 Thread.sleep(5000);
        	  driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).click();
		    	Thread.sleep(4000);
		    	driver.findElement(By.xpath("//div[@btn-title = 'product_and_services']")).click();
		    	Thread.sleep(5000);
				 driver.findElement(By.xpath("//div[@btn-title = 'loyalty']")).click();
				 Thread.sleep(5000);
				 boolean ele= driver.findElement(By.xpath("//div[contains(text() ,  \"To thank you when you choose Western Union and because we continue to earn your business, we have created our My WU loyalty program. Learn more about My WU and our special offers by going to \")]")).isDisplayed();
				 Assert.assertTrue(ele);
				 Thread.sleep(4000);
				 System.out.println("loyalty_fonts:");
				 WebElement ele1 = driver.findElement(By.xpath("//div[contains(text() ,  \"Log on to your \")]"));
				 String fontSize = ele1.getCssValue("font-size");
				 System.out.println("Font Size---->"+fontSize);
				 
				 String fontColor = ele1.getCssValue("color");
				 System.out.println("Font colour---->"+fontColor);
				 
				 String fonttxtAlign = ele1.getCssValue("text-align");
				 System.out.println("Font textalignment---->"+fonttxtAlign);
//				 boolean b4 = driver.findElement(By.xpath("//div[@btn-val = ' what is MyWU loyalty program?']")).isDisplayed();
//			     Assert.assertTrue(b4);
//			     Thread.sleep(3000);
//			     boolean b5 = driver.findElement(By.xpath("//div[@btn-title = 'need_something_else']")).isDisplayed();
//			     Assert.assertTrue(b5);
//			     Thread.sleep(3000);
				 boolean b6 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
			     Assert.assertTrue(b6);
			     Thread.sleep(3000);
			     boolean b7 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
			     Assert.assertTrue(b7);
			     Thread.sleep(3000);
		    }
          @Test(priority = 23)
		 	public void money_orders_ResponseandButtons() throws InterruptedException {
//		    	 driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
//				 Thread.sleep(5000);
//				 driver.findElement(By.xpath("//div[@btn-title = 'product_and_services']")).click();
				 //Thread.sleep(5000);
        	  
				 driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).click();
			    	Thread.sleep(4000);
			    	driver.findElement(By.xpath("//div[@btn-title = 'product_and_services']")).click();
			    	Thread.sleep(5000);
				 driver.findElement(By.xpath("//div[@btn-title = 'money_orders']")).click();
				 Thread.sleep(5000);
				 boolean c = driver.findElement(By.xpath("//div[contains(text() ,  \"You may be able to cash your money order at banks and other retailers (grocery stores, check-cashing locations or other stores where you’ve been able to cash checks). In some circumstances, the bank or retailer may charge you to cash your money order. You may also be able to deposit the money order into your bank account (depositing into their bank account is the best option). Note, not all Western Union locations, including where you buy a money order, are able to cash them\")]")).isDisplayed();
				 Assert.assertTrue(c);
				 Thread.sleep(4000);
				 System.out.println("money_orders_fonts:");
				 WebElement ele= driver.findElement(By.xpath("//div[contains(text() ,  \"You may be able to cash your money order at banks and other retailers (grocery stores, check-cashing locations or other stores where you’ve been able to cash checks). In some circumstances, the bank or retailer may charge you to cash your money order. You may also be able to deposit the money order into your bank account (depositing into their bank account is the best option). Note, not all Western Union locations, including where you buy a money order, are able to cash them\")]"));
				 String fontSize = ele.getCssValue("font-size");
				 System.out.println("Font Size---->"+fontSize);
				 
				 String fontColor = ele.getCssValue("color");
				 System.out.println("Font colour---->"+fontColor);
				 
				 String fonttxtAlign = ele.getCssValue("text-align");
				 System.out.println("Font textalignment---->"+fonttxtAlign);
				 boolean b6 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
			     Assert.assertTrue(b6);
			     Thread.sleep(3000);
			     boolean b7 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
			     Assert.assertTrue(b7);
			     Thread.sleep(3000);
		    }
          @Test(priority = 24)
		 	public void promotions_ResponseandButtons() throws InterruptedException {
//		    	 driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
//				 Thread.sleep(5000);
//				 driver.findElement(By.xpath("//div[@btn-title = 'product_and_services']")).click();
//				 Thread.sleep(5000);
        	  driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).click();
		    	Thread.sleep(4000);
		    	driver.findElement(By.xpath("//div[@btn-title = 'product_and_services']")).click();
		    	Thread.sleep(5000);
				 driver.findElement(By.xpath("//div[@btn-title = 'promotions']")).click();
				 Thread.sleep(5000);
				 boolean c = driver.findElement(By.xpath("//div[contains(text() ,  \"On WU.com or the \")]")).isDisplayed();
				 Assert.assertTrue(c);
				 Thread.sleep(4000);
				 System.out.println("promotions_fonts:");
				 WebElement ele= driver.findElement(By.xpath("//div[contains(text() ,  \"On WU.com or the \")]"));
				 String fontSize = ele.getCssValue("font-size");
				 System.out.println("Font Size---->"+fontSize);
				 
				 String fontColor = ele.getCssValue("color");
				 System.out.println("Font colour---->"+fontColor);
				 
				 String fonttxtAlign = ele.getCssValue("text-align");
				 System.out.println("Font textalignment---->"+fonttxtAlign);
				 boolean b6 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
			     Assert.assertTrue(b6);
			     Thread.sleep(3000);
			     boolean b7 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
			     Assert.assertTrue(b7);
			     Thread.sleep(3000);
		    }
          @Test(priority = 24)
		 	public void amazon_paycode_ResponseandButtons() throws InterruptedException {
//		    	 driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
//				 Thread.sleep(5000);
//				 driver.findElement(By.xpath("//div[@btn-title = 'product_and_services']")).click();
//				 Thread.sleep(5000);
        	  driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).click();
		    	Thread.sleep(4000);
		    	driver.findElement(By.xpath("//div[@btn-title = 'product_and_services']")).click();
		    	Thread.sleep(5000);
				 driver.findElement(By.xpath("//div[@btn-title = 'amazon_paycode']")).click();
				 Thread.sleep(5000);
				 
				
				 boolean ele = driver.findElement(By.xpath("//div[contains(text() ,  \"Also known as Pay @ WU, is a feature which allows Amazon customers to pay for their order in cash at participating Western Union locations. Amazon refers to this feature as PayCode. During checkout at www.amazon.com, customers will see Amazon PayCode as a payment option. The customer can take this information to participating Western Union locations to pay for his/her order\")]")).isDisplayed();
				 Assert.assertTrue(ele);
				 Thread.sleep(4000);
				 System.out.println("amazon_paycode_fonts:");
				 WebElement ele1= driver.findElement(By.xpath("//div[contains(text() ,  \"On WU.com or the \")]"));
				 String fontSize = ele1.getCssValue("font-size");
				 System.out.println("Font Size---->"+fontSize);
				 
				 String fontColor = ele1.getCssValue("color");
				 System.out.println("Font colour---->"+fontColor);
				 
				 String fonttxtAlign = ele1.getCssValue("text-align");
				 System.out.println("Font textalignment---->"+fonttxtAlign);
//				 boolean b1 = driver.findElement(By.xpath("//div[@btn-title = 'transfer_status']")).isDisplayed();
//			     Assert.assertTrue(b1);
//			     Thread.sleep(3000);
//			     boolean b2 = driver.findElement(By.xpath("//div[@btn-title = 'change_transfer']")).isDisplayed();
//			     Assert.assertTrue(b2);
//			     Thread.sleep(3000);
//			     boolean b3 = driver.findElement(By.xpath("//div[@btn-title = 'wucom_mobileapp']")).isDisplayed();
//			     Assert.assertTrue(b3);
//			     Thread.sleep(3000);
//			     boolean b4 = driver.findElement(By.xpath("//div[@btn-title = 'fraud']")).isDisplayed();
//			     Assert.assertTrue(b4);
//			     Thread.sleep(3000);
//			     boolean b5 = driver.findElement(By.xpath("//div[@btn-title = 'cancel_refund']")).isDisplayed();
//			     Assert.assertTrue(b5);
//			     Thread.sleep(3000);
//			     boolean b8 = driver.findElement(By.xpath("//div[@btn-title = 'pricing_fx_rates']")).isDisplayed();
//			     Assert.assertTrue(b8);
//			     Thread.sleep(3000);
				 boolean b6 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
			     Assert.assertTrue(b6);
			     Thread.sleep(3000);
			     boolean b7 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
			     Assert.assertTrue(b7);
			     Thread.sleep(3000);
		    }
          @Test(priority = 25)
		 	public void prepaid_cards_ResponseandButtons() throws InterruptedException {
//		    	 driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
//				 Thread.sleep(5000);
//				 driver.findElement(By.xpath("//div[@btn-title = 'product_and_services']")).click();
//				 Thread.sleep(5000);
        	  driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).click();
		    	Thread.sleep(4000);
		    	driver.findElement(By.xpath("//div[@btn-title = 'product_and_services']")).click();
		    	Thread.sleep(5000);
				 driver.findElement(By.xpath("//div[@btn-title = 'prepaid_cards']")).click();
				 Thread.sleep(5000);
				 boolean ele= driver.findElement(By.xpath("//div[contains(text() ,  \"Western Union and NetSpend have teamed up to offer a powerful prepaid MasterCard. It gives you the convenience of sending and receiving money transfers via the NetSpend card. You can enroll online at\")]")).isDisplayed();
				 Assert.assertTrue(ele);
				 Thread.sleep(4000);
				 System.out.println("prepaid_cards_fonts:");
				 WebElement ele1= driver.findElement(By.xpath("//div[contains(text() ,  \"On WU.com or the \")]"));
				 String fontSize = ele1.getCssValue("font-size");
				 System.out.println("Font Size---->"+fontSize);
				 
				 String fontColor = ele1.getCssValue("color");
				 System.out.println("Font colour---->"+fontColor);
				 
				 String fonttxtAlign = ele1.getCssValue("text-align");
				 System.out.println("Font textalignment---->"+fonttxtAlign);
//				 boolean b1 = driver.findElement(By.xpath("//div[@btn-title = 'transfer_status']")).isDisplayed();
//			     Assert.assertTrue(b1);
//			     Thread.sleep(3000);
//			     boolean b2 = driver.findElement(By.xpath("//div[@btn-title = 'change_transfer']")).isDisplayed();
//			     Assert.assertTrue(b2);
//			     Thread.sleep(3000);
//			     boolean b3 = driver.findElement(By.xpath("//div[@btn-title = 'wucom_mobileapp']")).isDisplayed();
//			     Assert.assertTrue(b3);
//			     Thread.sleep(3000);
//			     boolean b4 = driver.findElement(By.xpath("//div[@btn-title = 'fraud']")).isDisplayed();
//			     Assert.assertTrue(b4);
//			     Thread.sleep(3000);
//			     boolean b5 = driver.findElement(By.xpath("//div[@btn-title = 'cancel_refund']")).isDisplayed();
//			     Assert.assertTrue(b5);
//			     Thread.sleep(3000);
//			     boolean b8 = driver.findElement(By.xpath("//div[@btn-title = 'pricing_fx_rates']")).isDisplayed();
//			     Assert.assertTrue(b8);
//			     Thread.sleep(3000);
				 boolean b6 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
			     Assert.assertTrue(b6);
			     Thread.sleep(3000);
			     boolean b7 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
			     Assert.assertTrue(b7);
			     Thread.sleep(3000);
		    }
          @Test(priority = 26)
      		 	public void product_and_services_with_mainmenu_ResponseandButtons() throws InterruptedException {
//      		    	 driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
//      				 Thread.sleep(5000);
//      				 driver.findElement(By.xpath("//div[@btn-title = 'product_and_services']")).click();
//      				 Thread.sleep(5000);
//      				driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
//   				 Thread.sleep(6000);
//   				 driver.findElement(By.xpath("//div[@btn-title = 'product_and_services']")).click();
//   				 Thread.sleep(6000);
   				 driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).click();
				 Thread.sleep(5000);
				 boolean ele= driver.findElement(By.xpath("//div[contains(text() ,  'Please select from the following options:')]")).isDisplayed();
				 Assert.assertTrue(ele);
				 Thread.sleep(4000);
				 boolean b = driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).isDisplayed();
			     Assert.assertTrue(b);
//				Assert.assertEquals("Existing transfer",driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).getText());
//				//String element = driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).getText();
//				System.out.println(driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).getText());  
				Thread.sleep(3000);
				boolean b1 = driver.findElement(By.xpath("//div[@btn-title = 'general_inquiry']")).isDisplayed();
			     Assert.assertTrue(b1);
//				Assert.assertEquals("General inquiry",driver.findElement(By.xpath("//div[@btn-title = 'general_inquiry']")).getText());
//				//String element = driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).getText();
//				System.out.println(driver.findElement(By.xpath("//div[@btn-title = 'general_inquiry']")).getText()); 
				Thread.sleep(3000);
				boolean b2 = driver.findElement(By.xpath("//div[@btn-title = 'product_and_services']")).isDisplayed();
			     Assert.assertTrue(b2);
//				Assert.assertEquals("Products & Services",driver.findElement(By.xpath("//div[@btn-title = 'product_and_services']")).getText());
//				//String element = driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).getText();
//				System.out.println(driver.findElement(By.xpath("//div[@btn-title = 'product_and_services']")).getText()); 
				Thread.sleep(3000);
				boolean b3 = driver.findElement(By.xpath("//div[@btn-title = 'wucom_mobileapp']")).isDisplayed();
			    Assert.assertTrue(b3);
				
//				Assert.assertEquals("WU.com/Mobile app",driver.findElement(By.xpath("//div[@btn-title = 'wucom_mobileapp']")).getText());
//				//String element = driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).getText();
//				System.out.println(driver.findElement(By.xpath("//div[@btn-title = 'wucom_mobileapp']")).getText()); 
			    
			    
			    Thread.sleep(3000);
				boolean b4 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
			    Assert.assertTrue(b4);
    }
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          @Test(priority = 27)
		 	public void wucom_mobileapp_ResponseandButtons() throws InterruptedException {
//		    	 driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
//				 Thread.sleep(5000);
				 driver.findElement(By.xpath("//div[@btn-title = 'wucom_mobileapp']")).click();
				 Thread.sleep(5000);
				 boolean ele= driver.findElement(By.xpath("//div[contains(text() ,  \"Here are some items you can select for WU.com/Mobile app related stuff: \")]")).isDisplayed();
				 Assert.assertTrue(ele);
				 Thread.sleep(5000);
				 boolean b = driver.findElement(By.xpath("//div[@btn-title = 'registration']")).isDisplayed();
			     Assert.assertTrue(b);
				 Thread.sleep(4000);
				 boolean b2 = driver.findElement(By.xpath("//div[@btn-title = 'password_reset']")).isDisplayed();
			     Assert.assertTrue(b2);
				 Thread.sleep(4000);
				 boolean b3 = driver.findElement(By.xpath("//div[@btn-title = 'unlock_account']")).isDisplayed();
			     Assert.assertTrue(b3);
				 Thread.sleep(4000);
				 boolean b4 = driver.findElement(By.xpath("//div[@btn-title = 'account_update']")).isDisplayed();
			     Assert.assertTrue(b4);
				 Thread.sleep(3000);
				 boolean b5 = driver.findElement(By.xpath("//div[@btn-title = 'pin_request']")).isDisplayed();
			     Assert.assertTrue(b5);
				 Thread.sleep(3000);
				 boolean b6 = driver.findElement(By.xpath("//div[@btn-title = 'usage_assistance']")).isDisplayed();
			     Assert.assertTrue(b6);
				 Thread.sleep(3000);
				 boolean b7 = driver.findElement(By.xpath("//div[@btn-title = 'fraud']")).isDisplayed();
			     Assert.assertTrue(b7);
				 Thread.sleep(3000);
				 boolean b8 = driver.findElement(By.xpath("//div[@btn-title = 'need_something_else']")).isDisplayed();
			     Assert.assertTrue(b8);
				 boolean b9 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
			     Assert.assertTrue(b9);
			     Thread.sleep(3000);
			     boolean b10 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
			     Assert.assertTrue(b10);
			     Thread.sleep(3000);
		    }
        @Test(priority = 28)
		 	public void registration_ResponseandButtons() throws InterruptedException {
//		    	 driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
//				 Thread.sleep(5000);
//				 driver.findElement(By.xpath("//div[@btn-title = 'wucom_mobileapp']")).click();
//				 Thread.sleep(5000);
        	 driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).click();
		    	Thread.sleep(4000);
		    	driver.findElement(By.xpath("//div[@btn-title = 'wucom_mobileapp']")).click();
		    	Thread.sleep(5000);
				 driver.findElement(By.xpath("//div[@btn-title = 'registration']")).click();
				 Thread.sleep(5000);
				 boolean c = driver.findElement(By.xpath("//div[contains(text() ,  \"If you have not done so, create a profile on WU.com. Then follow the instructions on the screen for \")]")).isDisplayed();
				 Assert.assertTrue(c);
				 Thread.sleep(4000);
				 System.out.println("registration_fonts:");
				 WebElement ele= driver.findElement(By.xpath("//div[contains(text() ,  \"If you have not done so, create a profile on WU.com. Then follow the instructions on the screen for \")]"));
				 String fontSize = ele.getCssValue("font-size");
				 System.out.println("Font Size---->"+fontSize);
				 
				 String fontColor = ele.getCssValue("color");
				 System.out.println("Font colour---->"+fontColor);
				 
				 String fonttxtAlign = ele.getCssValue("text-align");
				 System.out.println("Font textalignment---->"+fonttxtAlign);
				 boolean b6 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
			     Assert.assertTrue(b6);
			     Thread.sleep(3000);
			     boolean b7 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
			     Assert.assertTrue(b7);
			     Thread.sleep(3000);
		    }
        @Test(priority = 29)
		 	public void password_reset_ResponseandButtons() throws InterruptedException {
//		    	 driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
//				 Thread.sleep(5000);
//				 driver.findElement(By.xpath("//div[@btn-title = 'wucom_mobileapp']")).click();
//				 Thread.sleep(5000);
        	driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).click();
	    	Thread.sleep(4000);
	    	driver.findElement(By.xpath("//div[@btn-title = 'wucom_mobileapp']")).click();
	    	Thread.sleep(5000);
				 driver.findElement(By.xpath("//div[@btn-title = 'password_reset']")).click();
				 Thread.sleep(5000);
				 boolean c= driver.findElement(By.xpath("//div[contains(text() ,  \"If you forgot your password, you can choose the \")]")).isDisplayed();
				 Assert.assertTrue(c);
				 Thread.sleep(4000);
				 System.out.println("password_reset_fonts:");
				 WebElement ele= driver.findElement(By.xpath("//div[contains(text() ,  \"If you forgot your password, you can choose the \")]"));
				 String fontSize = ele.getCssValue("font-size");
				 System.out.println("Font Size---->"+fontSize);
				 
				 String fontColor = ele.getCssValue("color");
				 System.out.println("Font colour---->"+fontColor);
				 
				 String fonttxtAlign = ele.getCssValue("text-align");
				 System.out.println("Font textalignment---->"+fonttxtAlign);
				 boolean b6 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
			     Assert.assertTrue(b6);
			     Thread.sleep(3000);
			     boolean b7 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
			     Assert.assertTrue(b7);
			     Thread.sleep(3000);
		    }
        @Test(priority = 30)
		 	public void unlock_account_ResponseandButtons() throws InterruptedException {
//		    	 driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
//				 Thread.sleep(5000);
//				 driver.findElement(By.xpath("//div[@btn-title = 'wucom_mobileapp']")).click();
//				 Thread.sleep(5000);
        	driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).click();
	    	Thread.sleep(4000);
	    	driver.findElement(By.xpath("//div[@btn-title = 'wucom_mobileapp']")).click();
	    	Thread.sleep(5000);
				 driver.findElement(By.xpath("//div[@btn-title = 'unlock_account']")).click();
				 Thread.sleep(5000);
				 boolean c= driver.findElement(By.xpath("//div[contains(text() ,  \"Click \")]")).isDisplayed();
				 Assert.assertTrue(c);
				 Thread.sleep(4000);
				 System.out.println("unlock_account_fonts:");
				 WebElement ele= driver.findElement(By.xpath("//div[contains(text() ,  \"Click \")]"));
				 String fontSize = ele.getCssValue("font-size");
				 System.out.println("Font Size---->"+fontSize);
				 
				 String fontColor = ele.getCssValue("color");
				 System.out.println("Font colour---->"+fontColor);
				 
				 String fonttxtAlign = ele.getCssValue("text-align");
				 System.out.println("Font textalignment---->"+fonttxtAlign);
				 boolean b6 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
			     Assert.assertTrue(b6);
			     Thread.sleep(3000);
			     boolean b7 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
			     Assert.assertTrue(b7);
			     Thread.sleep(3000);
		    }
        @Test(priority = 31)
		 	public void account_update_ResponseandButtons() throws InterruptedException {
//		    	 driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
//				 Thread.sleep(5000);
//				 driver.findElement(By.xpath("//div[@btn-title = 'wucom_mobileapp']")).click();
        	driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).click();
	    	Thread.sleep(4000);
	    	driver.findElement(By.xpath("//div[@btn-title = 'wucom_mobileapp']")).click();
	    	Thread.sleep(5000);
				 Thread.sleep(5000);
				 driver.findElement(By.xpath("//div[@btn-title = 'account_update']")).click();
				 Thread.sleep(5000);
				 boolean c = driver.findElement(By.xpath("//div[contains(text() ,  \"You can update almost any information in your profile by going to \")]")).isDisplayed();
				 Assert.assertTrue(c);
				 Thread.sleep(4000);
				 System.out.println("account_update_fonts:");
				 WebElement ele= driver.findElement(By.xpath("//div[contains(text() ,  \"You can update almost any information in your profile by going to \")]"));
				 String fontSize = ele.getCssValue("font-size");
				 System.out.println("Font Size---->"+fontSize);
				 
				 String fontColor = ele.getCssValue("color");
				 System.out.println("Font colour---->"+fontColor);
				 
				 String fonttxtAlign = ele.getCssValue("text-align");
				 System.out.println("Font textalignment---->"+fonttxtAlign);
				 boolean b6 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
			     Assert.assertTrue(b6);
			     Thread.sleep(3000);
			     boolean b7 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
			     Assert.assertTrue(b7);
			     Thread.sleep(3000);
		    }
        @Test(priority = 32)
		 	public void pin_request_ResponseandButtons() throws InterruptedException {
//		    	 driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
//				 Thread.sleep(5000);
//				 driver.findElement(By.xpath("//div[@btn-title = 'wucom_mobileapp']")).click();
//				 Thread.sleep(5000);
        	driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).click();
	    	Thread.sleep(4000);
	    	driver.findElement(By.xpath("//div[@btn-title = 'wucom_mobileapp']")).click();
	    	Thread.sleep(5000);
	    	
				 driver.findElement(By.xpath("//div[@btn-title = 'pin_request']")).click();
				 Thread.sleep(5000);
				 boolean ele = driver.findElement(By.xpath("//div[contains(text() ,  \"While creating a profile online on \")]")).isDisplayed();
				 Assert.assertTrue(ele);
				 Thread.sleep(4000);
				 System.out.println("pin_request_fonts:");
				 WebElement ele1= driver.findElement(By.xpath("//div[contains(text() ,  \"You can update almost any information in your profile by going to \")]"));
				 String fontSize = ele1.getCssValue("font-size");
				 System.out.println("Font Size---->"+fontSize);
				 
				 String fontColor = ele1.getCssValue("color");
				 System.out.println("Font colour---->"+fontColor);
				 
				 String fonttxtAlign = ele1.getCssValue("text-align");
				 System.out.println("Font textalignment---->"+fonttxtAlign);
//				 boolean b1 = driver.findElement(By.xpath("//div[@btn-title = 'transfer_status']")).isDisplayed();
//			     Assert.assertTrue(b1);
//			     Thread.sleep(3000);
//			     boolean b2 = driver.findElement(By.xpath("//div[@btn-title = 'change_transfer']")).isDisplayed();
//			     Assert.assertTrue(b2);
//			     Thread.sleep(3000);
//			     boolean b3 = driver.findElement(By.xpath("//div[@btn-title = 'wucom_mobileapp']")).isDisplayed();
//			     Assert.assertTrue(b3);
//			     Thread.sleep(3000);
//			     boolean b4 = driver.findElement(By.xpath("//div[@btn-title = 'fraud']")).isDisplayed();
//			     Assert.assertTrue(b4);
//			     Thread.sleep(3000);
//			     boolean b5 = driver.findElement(By.xpath("//div[@btn-title = 'cancel_refund']")).isDisplayed();
//			     Assert.assertTrue(b5);
//			     Thread.sleep(3000);
//			     boolean b8 = driver.findElement(By.xpath("//div[@btn-title = 'pricing_fx_rates']")).isDisplayed();
//			     Assert.assertTrue(b8);
//			     Thread.sleep(3000);
				 boolean b6 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
			     Assert.assertTrue(b6);
			     Thread.sleep(3000);
			     boolean b7 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
			     Assert.assertTrue(b7);
			     Thread.sleep(3000);
		    }
        @Test(priority = 33)
		 	public void usage_assistance_ResponseandButtons() throws InterruptedException {
//		    	 driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
//				 Thread.sleep(5000);
//				 driver.findElement(By.xpath("//div[@btn-title = 'wucom_mobileapp']")).click();
//				 Thread.sleep(5000);
        	driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).click();
	    	Thread.sleep(4000);
	    	driver.findElement(By.xpath("//div[@btn-title = 'wucom_mobileapp']")).click();
	    	Thread.sleep(5000);
				 driver.findElement(By.xpath("//div[@btn-title = 'usage_assistance']")).click();
				 Thread.sleep(4000);
				 boolean c= driver.findElement(By.xpath("//div[contains(text() ,  \"There are different \")]")).isDisplayed();
				 Assert.assertTrue(c);
				 Thread.sleep(4000);
				 System.out.println("usage_assistance_fonts:");
				 WebElement ele= driver.findElement(By.xpath("//div[contains(text() ,  \"There are different \")]"));
				 String fontSize = ele.getCssValue("font-size");
				 System.out.println("Font Size---->"+fontSize);
				 
				 String fontColor = ele.getCssValue("color");
				 System.out.println("Font colour---->"+fontColor);
				 
				 String fonttxtAlign = ele.getCssValue("text-align");
				 System.out.println("Font textalignment---->"+fonttxtAlign);
				 boolean b6 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
			     Assert.assertTrue(b6);
			     Thread.sleep(3000);
			     boolean b7 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
			     Assert.assertTrue(b7);
			     Thread.sleep(3000);
		    }
        @Test(priority = 34)
	 	public void fraud_ResponseandButtons() throws InterruptedException {
//	    	 driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
//			 Thread.sleep(5000);
//			 driver.findElement(By.xpath("//div[@btn-title = 'wucom_mobileapp']")).click();
//			 Thread.sleep(5000);
        	driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).click();
	    	Thread.sleep(4000);
	    	driver.findElement(By.xpath("//div[@btn-title = 'wucom_mobileapp']")).click();
	    	Thread.sleep(5000);
			 driver.findElement(By.xpath("//div[@btn-title = 'fraud']")).click();
			 Thread.sleep(5000);
			 boolean c = driver.findElement(By.xpath("//div[contains(text() ,  \"It looks like you may need to chat with an agent? \")]")).isDisplayed();
			 Assert.assertTrue(c);
			 Thread.sleep(4000);
			 System.out.println("fraud_fonts:");
			 WebElement ele= driver.findElement(By.xpath("//div[contains(text() ,  \"It looks like you may need to chat with an agent? \")]"));
			 String fontSize = ele.getCssValue("font-size");
			 System.out.println("Font Size---->"+fontSize);
			 
			 String fontColor = ele.getCssValue("color");
			 System.out.println("Font colour---->"+fontColor);
			 
			 String fonttxtAlign = ele.getCssValue("text-align");
			 System.out.println("Font textalignment---->"+fonttxtAlign);
			 boolean b7 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
		     Assert.assertTrue(b7);
		     Thread.sleep(3000);
		     boolean b6 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
		     Assert.assertTrue(b6);
		     Thread.sleep(3000);
	    }
        @Test(priority = 35)
	 	public void wucom_mobileapp_Need_something_else_ResponseandButtons() throws InterruptedException {
//	    	 driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
//			 Thread.sleep(5000);
//			 driver.findElement(By.xpath("//div[@btn-title = 'wucom_mobileapp']")).click();
//			 Thread.sleep(5000);
        	driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).click();
	    	Thread.sleep(4000);
	    	driver.findElement(By.xpath("//div[@btn-title = 'wucom_mobileapp']")).click();
	    	Thread.sleep(5000);
			 driver.findElement(By.xpath("//div[@btn-title = 'need_something_else']")).click();
			 Thread.sleep(5000);
			  boolean ele= driver.findElement(By.xpath("//div[contains(text() ,  \"Sure! Let me know what you need.\")]")).isDisplayed();
			  Assert.assertTrue(ele);
			 Thread.sleep(4000);
			 boolean b3 = driver.findElement(By.xpath("//div[@btn-title = 'transfer_status']")).isDisplayed();
		     Assert.assertTrue(b3);
		     Thread.sleep(3000);
		     boolean b4 = driver.findElement(By.xpath("//div[@btn-title = 'send_money']")).isDisplayed();
		     Assert.assertTrue(b4);
		     Thread.sleep(3000);
		     boolean b5 = driver.findElement(By.xpath("//div[@btn-title = 'change_transfer']")).isDisplayed();
		     Assert.assertTrue(b5);
		     Thread.sleep(3000);
			 boolean b6 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
		     Assert.assertTrue(b6);
		     Thread.sleep(3000);
		     boolean b7 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
		     Assert.assertTrue(b7);
		     Thread.sleep(3000);
	    }
        @Test(priority = 36)
		 	public void wucom_mobileapp_with_mainmenu_ResponseandButtons() throws InterruptedException {
//		    	 driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
//				 Thread.sleep(5000);
//				 driver.findElement(By.xpath("//div[@btn-title = 'wucom_mobileapp']")).click();
//				 Thread.sleep(5000);
//				driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
//			 Thread.sleep(6000);
//			 driver.findElement(By.xpath("//div[@btn-title = 'product_and_services']")).click();
//			 Thread.sleep(6000);
			 driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).click();
		 Thread.sleep(5000);
		 boolean c = driver.findElement(By.xpath("//div[contains(text() ,  'Please select from the following options:')]")).isDisplayed();
		 Assert.assertTrue(c);
		 Thread.sleep(4000);
//		 System.out.println("fraud_fonts:");
//		 WebElement ele= driver.findElement(By.xpath("//div[contains(text() ,  'Please select from the following options:')]"));
//		 String fontSize = ele.getCssValue("font-size");
//		 System.out.println("Font Size---->"+fontSize);
//		 
//		 String fontColor = ele.getCssValue("color");
//		 System.out.println("Font colour---->"+fontColor);
//		 
//		 String fonttxtAlign = ele.getCssValue("text-align");
//		 System.out.println("Font textalignment---->"+fonttxtAlign);
		 boolean b = driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).isDisplayed();
	     Assert.assertTrue(b);
//		Assert.assertEquals("Existing transfer",driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).getText());
//		//String element = driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).getText();
//		System.out.println(driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).getText());  
		Thread.sleep(3000);
		boolean b1 = driver.findElement(By.xpath("//div[@btn-title = 'general_inquiry']")).isDisplayed();
	     Assert.assertTrue(b1);
//		Assert.assertEquals("General inquiry",driver.findElement(By.xpath("//div[@btn-title = 'general_inquiry']")).getText());
//		//String element = driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).getText();
//		System.out.println(driver.findElement(By.xpath("//div[@btn-title = 'general_inquiry']")).getText()); 
		Thread.sleep(3000);
		boolean b2 = driver.findElement(By.xpath("//div[@btn-title = 'product_and_services']")).isDisplayed();
	     Assert.assertTrue(b2);
//		Assert.assertEquals("Products & Services",driver.findElement(By.xpath("//div[@btn-title = 'product_and_services']")).getText());
//		//String element = driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).getText();
//		System.out.println(driver.findElement(By.xpath("//div[@btn-title = 'product_and_services']")).getText()); 
		Thread.sleep(3000);
		boolean b3 = driver.findElement(By.xpath("//div[@btn-title = 'wucom_mobileapp']")).isDisplayed();
	    Assert.assertTrue(b3);
		
//		Assert.assertEquals("WU.com/Mobile app",driver.findElement(By.xpath("//div[@btn-title = 'wucom_mobileapp']")).getText());
//		//String element = driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).getText();
//		System.out.println(driver.findElement(By.xpath("//div[@btn-title = 'wucom_mobileapp']")).getText()); 
	    
	    
	    Thread.sleep(3000);
		boolean b4 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
	    Assert.assertTrue(b4);
	    Thread.sleep(5000);
}
        @Test(priority = 37)
	 	public void Chat_with_an_agent() throws InterruptedException {
        	
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

}
