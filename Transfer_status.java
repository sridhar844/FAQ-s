package BOT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Transfer_status {
WebDriver driver;


@BeforeTest
public void setup() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");

driver = new ChromeDriver();

driver.manage().window().maximize();
driver.manage().deleteAllCookies();
	
driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
driver.get("https://dev-01.skil.ai/ai-demo/html/pages/wu-assisstant-v1.html");

}




@Test(priority = 1)
	public void Transfer_status_Response() throws InterruptedException {
	 driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
	 Thread.sleep(8000);
	 driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).click();
	 Thread.sleep(6000);
	 driver.findElement(By.xpath("//div[@btn-title = 'transfer_status']")).click();
	 Thread.sleep(4000);
	 WebElement ele= driver.findElement(By.xpath("//div[contains(text() ,  'Are you the sender or receiver?')]"));
	 System.out.println("transfer status bot response: "+ ele.getText());
	 Thread.sleep(5000);
	 boolean b6 = driver.findElement(By.xpath("//div[@btn-title = 'am_sender']")).isDisplayed();
     Assert.assertTrue(b6);
     Thread.sleep(4000);
     boolean b7 = driver.findElement(By.xpath("//div[@btn-title = 'am_sender']")).isDisplayed();
     Assert.assertTrue(b7);
     boolean b8 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
     Assert.assertTrue(b8);
     Thread.sleep(4000);
}
@Test(priority = 2)
public void Transfer_status_I_am_sender_Response() throws InterruptedException {
//	 driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
//	 Thread.sleep(4000);
//	 driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).click();
//	 Thread.sleep(6000);
//	 driver.findElement(By.xpath("//div[@btn-title = 'transfer_status']")).click();
//	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//div[@btn-title = 'am_sender']")).click();
	 Thread.sleep(4000);
	 WebElement ele= driver.findElement(By.xpath("//div[contains(text() ,  'Please enter your 10-digit tracking number (MTCN)')]"));
	 System.out.println("transfer_status_i am sender_bot response: "+ ele.getText());
	 Thread.sleep(4000);
	 boolean b6 = driver.findElement(By.xpath("//div[@btn-title = 'do_not_know_mtcn']")).isDisplayed();
     Assert.assertTrue(b6);
     Thread.sleep(4000);
     boolean b7 = driver.findElement(By.xpath("//div[@btn-title = 'to_find_mtcn']")).isDisplayed();
     Assert.assertTrue(b7);
     boolean b8 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
     Assert.assertTrue(b8);
     boolean b9 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
     Assert.assertTrue(b9);
     Thread.sleep(4000);
     
}
@Test(priority = 3)
public void Transfer_status_I_am_sender_where_to_find_MTCN_Response() throws InterruptedException {
//	 driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
//	 Thread.sleep(4000);
//	 driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).click();
//	 Thread.sleep(6000);
//	 driver.findElement(By.xpath("//div[@btn-title = 'transfer_status']")).click();
//	 Thread.sleep(4000);
//	 driver.findElement(By.xpath("//div[@btn-title = 'am_sender']")).click();
//	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//div[@btn-title = 'to_find_mtcn']")).click();
	 Thread.sleep(4000);
	 WebElement ele= driver.findElement(By.xpath("//div[contains(text() ,  'Your tracking number (MTCN) can be found on the transfer history page once you login to your account. It may also be found on the printed or emailed receipt.')]"));
	 System.out.println("transfer_status_i am sender_bot response: "+ ele.getText());
	 Thread.sleep(4000);
	 boolean b7 = driver.findElement(By.xpath("//div[@btn-title = 'am_sender']")).isDisplayed();
     Assert.assertTrue(b7);
     boolean b8 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
     Assert.assertTrue(b8);
     boolean b9 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
     Assert.assertTrue(b9);
     Thread.sleep(4000);
}

@Test(priority = 4)
public void Correct_MTCN_response() throws InterruptedException {
//	 driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
//	 Thread.sleep(4000);
//	 driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).click();
//	 Thread.sleep(6000);
//	 driver.findElement(By.xpath("//div[@btn-title = 'transfer_status']")).click();
//	 Thread.sleep(4000);
//	 driver.findElement(By.xpath("//div[@btn-title = 'am_sender']")).click();
//	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//textarea[@placeholder = \"Type a message…\"]")).sendKeys("4246585691");
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//button[@title= \"Send Message to Assistant\"]")).click();
	 Thread.sleep(10000);
	 //driver.findElement(By.xpath("//div[@btn-title = 'am_sender']")).click();
	 //Thread.sleep(5000);
	 boolean b7 = driver.findElement(By.xpath("//div[contains(text(),  \"Here is the current status\")]")).isDisplayed();
     Assert.assertTrue(b7);
     Thread.sleep(2000);
     boolean b8 = driver.findElement(By.xpath("//div[@class = 'text-wrap align-content-center message-content']//p")).isDisplayed();
     Assert.assertTrue(b8);
     Thread.sleep(2000);
     boolean b9 = driver.findElement(By.xpath("//div[@class = 'text-wrap align-content-center message-content']//table")).isDisplayed();
     Assert.assertTrue(b9);
     Thread.sleep(2000);
     boolean b10 = driver.findElement(By.xpath("//strong[contains(text() , \"The money transfer was sent to the receiver's bank. If the bank is unable to process the transfer, we will notify the sender.\")]")).isDisplayed();
     Assert.assertTrue(b10);
     Thread.sleep(2000);
     boolean b11 = driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).isDisplayed();
     Assert.assertTrue(b11);
     Thread.sleep(2000);
     boolean b12 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
     Assert.assertTrue(b12);
     Thread.sleep(3000);
	 }


@Test(priority = 5)
public void Do_not_have_a_mtcn_response_send_amount() throws InterruptedException {
//	 driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
//	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).click();
	  Thread.sleep(3000);
	 driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).click();
	 Thread.sleep(6000);
	 driver.findElement(By.xpath("//div[@btn-title = 'transfer_status']")).click();
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//div[@btn-title = 'am_sender']")).click();
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//div[@btn-title = 'do_not_know_mtcn']")).click();
	 Thread.sleep(4000);
	 boolean b9 = driver.findElement(By.xpath("//div[contains(text(), 'No problem. Can you provide any of the following?')]")).isDisplayed();
     Assert.assertTrue(b9);
     Thread.sleep(2000);
     boolean b10 = driver.findElement(By.xpath("//div[@btn-title = 'sender_phone_number']")).isDisplayed();
     Assert.assertTrue(b10); //sender_phone_number
     Thread.sleep(2000);
     boolean b11 = driver.findElement(By.xpath("//div[@btn-title = 'sender_receiver_name']")).isDisplayed();
     Assert.assertTrue(b11);  //sender_receiver_name
     Thread.sleep(2000);
     boolean b12 = driver.findElement(By.xpath("//div[@btn-title = 'do_not_know']")).isDisplayed();
     Assert.assertTrue(b12);
     Thread.sleep(2000);
     driver.findElement(By.xpath("//div[@btn-title = 'sender_phone_number']")).click();
     Thread.sleep(4000);
     boolean b1 = driver.findElement(By.xpath("//div[contains(text(), \"Please provide the sender's phone number without the country code, spaces or hyphens\")]")).isDisplayed();
     Assert.assertTrue(b1);
     Thread.sleep(2000);
     boolean b13 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
     Assert.assertTrue(b13);
     boolean b14 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
     Assert.assertTrue(b14);
     driver.findElement(By.xpath("//textarea[@placeholder = \"Type a message…\"]")).sendKeys("7147858145");
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//button[@title= \"Send Message to Assistant\"]")).click();
	 Thread.sleep(10000);
	 boolean b15 = driver.findElement(By.xpath("//div[contains(text(), 'Provide the name of the country the transfer was sent to')]")).isDisplayed();
     Assert.assertTrue(b15);
     Thread.sleep(2000);
     boolean b16 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
     Assert.assertTrue(b16);
     boolean b17 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
     Assert.assertTrue(b17);
     Thread.sleep(3000);
     driver.findElement(By.xpath("//textarea[@placeholder = \"Type or ask a brief question…\"]")).sendKeys("us");
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//button[@title= \"Send Message to Assistant\"]")).click();
	 Thread.sleep(10000);
	 boolean b18 = driver.findElement(By.xpath("//div[contains(text(), 'Do you know the send amount or receive amount?')]")).isDisplayed();
     Assert.assertTrue(b18);
     Thread.sleep(2000);
     boolean b19 = driver.findElement(By.xpath("//div[@btn-title = 'send_amount']")).isDisplayed();
     Assert.assertTrue(b19);
     boolean b20 = driver.findElement(By.xpath("//div[@btn-title = 'receive_amount']")).isDisplayed();
     Assert.assertTrue(b20);
     boolean b21 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
     Assert.assertTrue(b21);
     Thread.sleep(4000);
     driver.findElement(By.xpath("//div[@btn-title = 'send_amount']")).click();
     Thread.sleep(4000);
     boolean b23 = driver.findElement(By.xpath("//div[contains(text() ,'Enter the Send amount')]")).isDisplayed();
     Assert.assertTrue(b23);
     Thread.sleep(2000);
     boolean b24 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
     Assert.assertTrue(b24);
     boolean b25 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
     Assert.assertTrue(b25);
     Thread.sleep(2000);
     driver.findElement(By.xpath("//textarea[@placeholder = \"Type a message…\"]")).sendKeys("-$50");
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//button[@title= \"Send Message to Assistant\"]")).click();
	 Thread.sleep(10000);
	 boolean b7 = driver.findElement(By.xpath("//div[contains(text() ,  \"Please wait while we validate your results...\")]")).isDisplayed();
     Assert.assertTrue(b7);
     Thread.sleep(2000);
	boolean b28 = driver.findElement(By.xpath("//div[contains(text() ,  \"Here is the current status\")]")).isDisplayed();
    Assert.assertTrue(b28);
     Thread.sleep(2000);
     //boolean b8 = driver.findElement(By.xpath("//div[@class = 'text-wrap align-content-center message-content']//p")).isDisplayed();
     //Assert.assertTrue(b8);
     Thread.sleep(2000);
     boolean b26 = driver.findElement(By.xpath("//div[@class = 'text-wrap align-content-center message-content']//table")).isDisplayed();
     Assert.assertTrue(b26);
     Thread.sleep(2000);
     boolean b27 = driver.findElement(By.xpath("//strong[contains(text() , \"The money transfer was sent to the receiver's bank. If the bank is unable to process the transfer, we will notify the sender.\")]")).isDisplayed();
     Assert.assertTrue(b27);
     Thread.sleep(2000);
     boolean b29 = driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).isDisplayed();
     Assert.assertTrue(b29);
     Thread.sleep(2000);
     boolean b30 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
     Assert.assertTrue(b30);
     Thread.sleep(3000);
	 
}

@Test(priority = 6)
public void Do_not_have_a_mtcn_response_send_amount_$50usd() throws InterruptedException {
//	 driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
//	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).click();
	  Thread.sleep(3000);
	 driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).click();
	 Thread.sleep(6000);
	 driver.findElement(By.xpath("//div[@btn-title = 'transfer_status']")).click();
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//div[@btn-title = 'am_sender']")).click();
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//div[@btn-title = 'do_not_know_mtcn']")).click();
	 Thread.sleep(4000);
//	 boolean b9 = driver.findElement(By.xpath("//div[contains(text(), 'No problem. Can you provide any of the following?')]")).isDisplayed();
//     Assert.assertTrue(b9);
//     Thread.sleep(2000);
//     boolean b10 = driver.findElement(By.xpath("//div[@btn-title = 'sender_phone_number']")).isDisplayed();
//     Assert.assertTrue(b10); //sender_phone_number
//     Thread.sleep(2000);
//     boolean b11 = driver.findElement(By.xpath("//div[@btn-title = 'sender_receiver_name']")).isDisplayed();
//     Assert.assertTrue(b11);  //sender_receiver_name
//     Thread.sleep(2000);
//     boolean b12 = driver.findElement(By.xpath("//div[@btn-title = 'do_not_know']")).isDisplayed();
//     Assert.assertTrue(b12);
//     Thread.sleep(2000);
     driver.findElement(By.xpath("//div[@btn-title = 'sender_phone_number']")).click();
     Thread.sleep(4000);
     boolean b1 = driver.findElement(By.xpath("//div[contains(text(), \"Please provide the sender's phone number without the country code, spaces or hyphens\")]")).isDisplayed();
     Assert.assertTrue(b1);
     Thread.sleep(2000);
     boolean b13 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
     Assert.assertTrue(b13);
     boolean b14 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
     Assert.assertTrue(b14);
     driver.findElement(By.xpath("//textarea[@placeholder = \"Type a message…\"]")).sendKeys("7147858145");
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//button[@title= \"Send Message to Assistant\"]")).click();
	 Thread.sleep(10000);
	 boolean b15 = driver.findElement(By.xpath("//div[contains(text(), 'Provide the name of the country the transfer was sent to')]")).isDisplayed();
     Assert.assertTrue(b15);
     Thread.sleep(2000);
     boolean b16 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
     Assert.assertTrue(b16);
     boolean b17 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
     Assert.assertTrue(b17);
     Thread.sleep(3000);
     driver.findElement(By.xpath("//textarea[@placeholder = \"Type or ask a brief question…\"]")).sendKeys("US");
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//button[@title= \"Send Message to Assistant\"]")).click();
	 Thread.sleep(10000);
	 boolean b18 = driver.findElement(By.xpath("//div[contains(text(), 'Do you know the send amount or receive amount?')]")).isDisplayed();
     Assert.assertTrue(b18);
     Thread.sleep(2000);
//     boolean b19 = driver.findElement(By.xpath("//div[@btn-title = 'send_amount']")).isDisplayed();
//     Assert.assertTrue(b19);
//     boolean b20 = driver.findElement(By.xpath("//div[@btn-title = 'receive_amount']")).isDisplayed();
//     Assert.assertTrue(b20);
//     boolean b21 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
//     Assert.assertTrue(b21);
//     Thread.sleep(4000);
     driver.findElement(By.xpath("//div[@btn-title = 'receive_amount']")).click();
     Thread.sleep(5000);
//     boolean b23 = driver.findElement(By.xpath("//div[contains(text() ,'Enter the Send amount')]")).isDisplayed();
//     Assert.assertTrue(b23);
     Thread.sleep(2000);
     boolean b24 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
     Assert.assertTrue(b24);
     boolean b25 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
     Assert.assertTrue(b25);
     Thread.sleep(2000);
     driver.findElement(By.xpath("//textarea[@placeholder = \"Type a message…\"]")).sendKeys("$50.00USD");
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//button[@title= \"Send Message to Assistant\"]")).click();
	 Thread.sleep(10000);
	 boolean b7 = driver.findElement(By.xpath("//div[contains(text() ,  \"Please wait while we validate your results...\")]")).isDisplayed();
     Assert.assertTrue(b7);
     Thread.sleep(2000);
	boolean b28 = driver.findElement(By.xpath("//div[contains(text() ,  \"Here is the current status\")]")).isDisplayed();
    Assert.assertTrue(b28);
     Thread.sleep(2000);
     //boolean b8 = driver.findElement(By.xpath("//div[@class = 'text-wrap align-content-center message-content']//p")).isDisplayed();
     //Assert.assertTrue(b8);
     Thread.sleep(2000);
     boolean b26 = driver.findElement(By.xpath("//div[@class = 'text-wrap align-content-center message-content']//table")).isDisplayed();
     Assert.assertTrue(b26);
     Thread.sleep(2000);
     boolean b27 = driver.findElement(By.xpath("//strong[contains(text() , \"The money transfer was sent to the receiver's bank. If the bank is unable to process the transfer, we will notify the sender.\")]")).isDisplayed();
     Assert.assertTrue(b27);
     Thread.sleep(2000);
     boolean b29 = driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).isDisplayed();
     Assert.assertTrue(b29);
     Thread.sleep(2000);
     boolean b30 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
     Assert.assertTrue(b30);
     Thread.sleep(3000);
	 
}

//@Test(priority = 7)
//public void Do_not_have_a_mtcn_response_recevie_amount() throws InterruptedException {
////	 driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
////	 Thread.sleep(4000);
//	driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).click();
//	  Thread.sleep(3000);
//	 driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).click();
//	 Thread.sleep(6000);
//	 driver.findElement(By.xpath("//div[@btn-title = 'transfer_status']")).click();
//	 Thread.sleep(4000);
//	 driver.findElement(By.xpath("//div[@btn-title = 'am_sender']")).click();
//	 Thread.sleep(4000);
//	 driver.findElement(By.xpath("//div[@btn-title = 'do_not_know_mtcn']")).click();
//	 Thread.sleep(4000);
//	 boolean b9 = driver.findElement(By.xpath("//div[contains(text(), 'No problem. Can you provide any of the following?')]")).isDisplayed();
//    Assert.assertTrue(b9);
//    Thread.sleep(2000);
//    boolean b10 = driver.findElement(By.xpath("//div[@btn-title = 'sender_phone_number']")).isDisplayed();
//    Assert.assertTrue(b10); //sender_phone_number
//    Thread.sleep(2000);
//    boolean b11 = driver.findElement(By.xpath("//div[@btn-title = 'sender_receiver_name']")).isDisplayed();
//    Assert.assertTrue(b11);  //sender_receiver_name
//    Thread.sleep(2000);
//    boolean b12 = driver.findElement(By.xpath("//div[@btn-title = 'do_not_know']")).isDisplayed();
//    Assert.assertTrue(b12);
//    Thread.sleep(2000);
//    driver.findElement(By.xpath("//div[@btn-title = 'sender_phone_number']")).click();
//    Thread.sleep(4000);
//    boolean b1 = driver.findElement(By.xpath("//div[contains(text(), \"Please provide the sender's phone number without the country code, spaces or hyphens\")]")).isDisplayed();
//    Assert.assertTrue(b1);
//    Thread.sleep(2000);
//    boolean b13 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
//    Assert.assertTrue(b13);
//    boolean b14 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
//    Assert.assertTrue(b14);
//    Thread.sleep(2000);
//    driver.findElement(By.xpath("//textarea[@placeholder = \"Type or ask a brief question…\"]")).sendKeys("7147858145");
//	 Thread.sleep(4000);
//	 driver.findElement(By.xpath("//button[@title= \"Send Message to Assistant\"]")).click();
//	 Thread.sleep(10000);
//	 boolean b15 = driver.findElement(By.xpath("//div[contains(text(), 'Provide the name of the country the transfer was sent to')]")).isDisplayed();
//    Assert.assertTrue(b15);
//    Thread.sleep(2000);
//    boolean b16 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
//    Assert.assertTrue(b16);
//    boolean b17 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
//    Assert.assertTrue(b17);
//    Thread.sleep(2000);
//    driver.findElement(By.xpath("//textarea[@placeholder = \"Type or ask a brief question…\"]")).sendKeys("us");
//	 Thread.sleep(4000);
//	 driver.findElement(By.xpath("//button[@title= \"Send Message to Assistant\"]")).click();
//	 Thread.sleep(10000);
//	 boolean b18 = driver.findElement(By.xpath("//div[contains(text(), 'Do you know the send amount or receive amount?')]")).isDisplayed();
//    Assert.assertTrue(b18);
//    Thread.sleep(2000);
//    boolean b19 = driver.findElement(By.xpath("//div[@btn-title = 'send_amount']")).isDisplayed();
//    Assert.assertTrue(b19);
//    boolean b20 = driver.findElement(By.xpath("//div[@btn-title = 'receive_amount']")).isDisplayed();
//    Assert.assertTrue(b20);
//    boolean b21 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
//    Assert.assertTrue(b21);
//    Thread.sleep(4000);
//    driver.findElement(By.xpath("//div[@btn-title = 'receive_amount']")).click();
//    Thread.sleep(2000);
//    boolean b23 = driver.findElement(By.xpath("//div[contains(text() , 'Enter the receive amount')]")).isDisplayed();
//    Assert.assertTrue(b23);
//    Thread.sleep(2000);
//    boolean b24 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
//    Assert.assertTrue(b24);
//    boolean b25 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
//    Assert.assertTrue(b25);
//    Thread.sleep(2000);
//    driver.findElement(By.xpath("//textarea[@placeholder = \"Type or ask a brief question…\"]")).sendKeys("50.00");
//	 Thread.sleep(4000);
//	 driver.findElement(By.xpath("//button[@title= \"Send Message to Assistant\"]")).click();
//	 Thread.sleep(10000);
//	 boolean b7 = driver.findElement(By.xpath("//div[contains(text() ,  \"Please wait while we validate your results...\")]")).isDisplayed();
//    Assert.assertTrue(b7);
//    Thread.sleep(2000);
//	 boolean b28 = driver.findElement(By.xpath("//div[contains(text() ,  \"Here is the current status\")]")).isDisplayed();
//    Assert.assertTrue(b28);
//    Thread.sleep(2000);
//    //boolean b8 = driver.findElement(By.xpath("//div[@class = 'text-wrap align-content-center message-content']//p")).isDisplayed();
//    //Assert.assertTrue(b8);
//    Thread.sleep(2000);
//    boolean b26 = driver.findElement(By.xpath("//div[@class = 'text-wrap align-content-center message-content']//table")).isDisplayed();
//    Assert.assertTrue(b26);
//    Thread.sleep(2000);
//    boolean b27 = driver.findElement(By.xpath("//strong[contains(text() , \"The money transfer was sent to the receiver's bank. If the bank is unable to process the transfer, we will notify the sender.\")]")).isDisplayed();
//    Assert.assertTrue(b27);
//    Thread.sleep(2000);
//    boolean b29 = driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).isDisplayed();
//    Assert.assertTrue(b29);
//    Thread.sleep(2000);
//    boolean b30 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
//    Assert.assertTrue(b30);
//    Thread.sleep(2000);
//    
//	
//}
//@Test(priority = 8)
//public void Do_not_have_a_mtcn_response_recevie_amount_50() throws InterruptedException {
////	 driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
////	 Thread.sleep(4000);
//	  driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).click();
//	  Thread.sleep(3000);
//	 driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).click();
//	 Thread.sleep(6000);
//	 driver.findElement(By.xpath("//div[@btn-title = 'transfer_status']")).click();
//	 Thread.sleep(4000);
//	 driver.findElement(By.xpath("//div[@btn-title = 'am_sender']")).click();
//	 Thread.sleep(4000);
//	 driver.findElement(By.xpath("//div[@btn-title = 'do_not_know_mtcn']")).click();
//	 Thread.sleep(4000);
//	 boolean b9 = driver.findElement(By.xpath("//div[contains(text(), 'No problem. Can you provide any of the following?')]")).isDisplayed();
//    Assert.assertTrue(b9);
//    Thread.sleep(2000);
////    boolean b10 = driver.findElement(By.xpath("//div[@btn-title = 'sender_phone_number']")).isDisplayed();
////    Assert.assertTrue(b10); //sender_phone_number
////    Thread.sleep(2000);
////    boolean b11 = driver.findElement(By.xpath("//div[@btn-title = 'sender_receiver_name']")).isDisplayed();
////    Assert.assertTrue(b11);  //sender_receiver_name
////    Thread.sleep(2000);
////    boolean b12 = driver.findElement(By.xpath("//div[@btn-title = 'do_not_know']")).isDisplayed();
////    Assert.assertTrue(b12);
//    Thread.sleep(2000);
//    driver.findElement(By.xpath("//div[@btn-title = 'sender_phone_number']")).click();
//    Thread.sleep(4000);
//    boolean b1 = driver.findElement(By.xpath("//div[contains(text(), \"Please provide the sender's phone number without the country code, spaces or hyphens\")]")).isDisplayed();
//    Assert.assertTrue(b1);
//    Thread.sleep(2000);
//    boolean b13 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
//    Assert.assertTrue(b13);
//    boolean b14 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
//    Assert.assertTrue(b14);
//    Thread.sleep(2000);
//    driver.findElement(By.xpath("//textarea[@placeholder = \"Type or ask a brief question…\"]")).sendKeys("7147858145");
//	 Thread.sleep(4000);
//	 driver.findElement(By.xpath("//button[@title= \"Send Message to Assistant\"]")).click();
//	 Thread.sleep(10000);
//	 boolean b15 = driver.findElement(By.xpath("//div[contains(text(), 'Provide the name of the country the transfer was sent to')]")).isDisplayed();
//    Assert.assertTrue(b15);
//    Thread.sleep(2000);
//    boolean b16 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
//    Assert.assertTrue(b16);
//    boolean b17 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
//    Assert.assertTrue(b17);
//    Thread.sleep(2000);
//    driver.findElement(By.xpath("//textarea[@placeholder = \"Type or ask a brief question…\"]")).sendKeys("us");
//	 Thread.sleep(4000);
//	 driver.findElement(By.xpath("//button[@title= \"Send Message to Assistant\"]")).click();
//	 Thread.sleep(10000);
//	 boolean b18 = driver.findElement(By.xpath("//div[contains(text(), 'Do you know the send amount or receive amount?')]")).isDisplayed();
//    Assert.assertTrue(b18);
//    Thread.sleep(2000);
//    boolean b19 = driver.findElement(By.xpath("//div[@btn-title = 'send_amount']")).isDisplayed();
//    Assert.assertTrue(b19);
//    boolean b20 = driver.findElement(By.xpath("//div[@btn-title = 'receive_amount']")).isDisplayed();
//    Assert.assertTrue(b20);
//    boolean b21 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
//    Assert.assertTrue(b21);
//    Thread.sleep(4000);
//    driver.findElement(By.xpath("//div[@btn-title = 'receive_amount']")).click();
//    Thread.sleep(2000);
//    boolean b23 = driver.findElement(By.xpath("//div[contains(text() , 'Enter the receive amount')]")).isDisplayed();
//    Assert.assertTrue(b23);
//    Thread.sleep(2000);
//    boolean b24 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
//    Assert.assertTrue(b24);
//    boolean b25 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
//    Assert.assertTrue(b25);
//    Thread.sleep(2000);
//    driver.findElement(By.xpath("//textarea[@placeholder = \"Type or ask a brief question…\"]")).sendKeys("50.00");
//	 Thread.sleep(4000);
//	 driver.findElement(By.xpath("//button[@title= \"Send Message to Assistant\"]")).click();
//	 Thread.sleep(10000);
//	 boolean b7 = driver.findElement(By.xpath("//div[contains(text() ,  \"Please wait while we validate your results...\")]")).isDisplayed();
//    Assert.assertTrue(b7);
//    Thread.sleep(2000);
//	 boolean b28 = driver.findElement(By.xpath("//div[contains(text() ,  \"Here is the current status\")]")).isDisplayed();
//    Assert.assertTrue(b28);
//    Thread.sleep(2000);
//    //boolean b8 = driver.findElement(By.xpath("//div[@class = 'text-wrap align-content-center message-content']//p")).isDisplayed();
//    //Assert.assertTrue(b8);
//    Thread.sleep(2000);
//    boolean b26 = driver.findElement(By.xpath("//div[@class = 'text-wrap align-content-center message-content']//table")).isDisplayed();
//    Assert.assertTrue(b26);
//    Thread.sleep(2000);
//    boolean b27 = driver.findElement(By.xpath("//strong[contains(text() , \"The money transfer was sent to the receiver's bank. If the bank is unable to process the transfer, we will notify the sender.\")]")).isDisplayed();
//    Assert.assertTrue(b27);
//    Thread.sleep(2000);
//    boolean b29 = driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).isDisplayed();
//    Assert.assertTrue(b29);
//    Thread.sleep(2000);
//    boolean b30 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
//    Assert.assertTrue(b30);
//    Thread.sleep(2000);
//    
//	
//}

@Test(priority = 9)
public void Do_not_have_a_mtcn_response_sender_and_recevier_names_send_amount()throws InterruptedException {
//	 driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
//	 Thread.sleep(4000);
	  driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).click();
	  Thread.sleep(3000);
	 driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).click();
	 Thread.sleep(6000);
	 driver.findElement(By.xpath("//div[@btn-title = 'transfer_status']")).click();
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//div[@btn-title = 'am_sender']")).click();
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//div[@btn-title = 'do_not_know_mtcn']")).click();
	 Thread.sleep(4000);
	 boolean b9 = driver.findElement(By.xpath("//div[contains(text(), 'No problem. Can you provide any of the following?')]")).isDisplayed();
    Assert.assertTrue(b9);
    Thread.sleep(2000);
//    boolean b10 = driver.findElement(By.xpath("//div[@btn-title = 'sender_phone_number']")).isDisplayed();
//    Assert.assertTrue(b10); //sender_phone_number
//    Thread.sleep(2000);
//    boolean b11 = driver.findElement(By.xpath("//div[@btn-title = 'sender_receiver_name']")).isDisplayed();
//    Assert.assertTrue(b11);  //sender_receiver_name
//    Thread.sleep(2000);
//    boolean b12 = driver.findElement(By.xpath("//div[@btn-title = 'do_not_know']")).isDisplayed();
//    Assert.assertTrue(b12);
    
    driver.findElement(By.xpath("//div[@btn-title = 'sender_receiver_name']")).click();
    Thread.sleep(3000);
    boolean b13 = driver.findElement(By.xpath("//div[contains(text(), \"Please provide the Sender's First Name\")]")).isDisplayed();
    Assert.assertTrue(b13);
    boolean b26 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
    Assert.assertTrue(b26);
    boolean b27 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
    Assert.assertTrue(b27);
    Thread.sleep(2000);
    driver.findElement(By.xpath("//textarea[@placeholder = \"Type a message…\"]")).sendKeys("Stephen");
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//button[@title= \"Send Message to Assistant\"]")).click();
	 Thread.sleep(10000);
	  boolean b18 = driver.findElement(By.xpath("//div[contains(text(), \"Provide the Sender's Last Name\")]")).isDisplayed();
	  Assert.assertTrue(b18);
	  boolean b34 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
	    Assert.assertTrue(b34);
	    boolean b35 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
	    Assert.assertTrue(b35);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//textarea[@placeholder = \"Type a message…\"]")).sendKeys("Johnson");
      Thread.sleep(4000);
	 driver.findElement(By.xpath("//button[@title= \"Send Message to Assistant\"]")).click();
	 Thread.sleep(10000);
	  boolean b29 = driver.findElement(By.xpath("//div[contains(text(), \"Please provide Receiver's First Name\")]")).isDisplayed();
	  Assert.assertTrue(b29);
	  boolean b30 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
	  Assert.assertTrue(b30);
	  boolean b31 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
	  Assert.assertTrue(b31);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//textarea[@placeholder = \"Type a message…\"]")).sendKeys("Celeste");
      Thread.sleep(4000);
	 driver.findElement(By.xpath("//button[@title= \"Send Message to Assistant\"]")).click();
	 Thread.sleep(10000);  
	 boolean b32 = driver.findElement(By.xpath("//div[contains(text(), \"Provide Receiver's Last Name\")]")).isDisplayed();
	  Assert.assertTrue(b32);
	  Thread.sleep(2000);
	  boolean b36 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
	  Assert.assertTrue(b36);
	  boolean b37 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
	  Assert.assertTrue(b37);
	  driver.findElement(By.xpath("//textarea[@placeholder = \"Type a message…\"]")).sendKeys("Johnson");
     Thread.sleep(4000);
	 driver.findElement(By.xpath("//button[@title= \"Send Message to Assistant\"]")).click();
	 Thread.sleep(10000);  
	 boolean b38 = driver.findElement(By.xpath("//div[contains(text(), \"Provide the name of the country the transfer was sent to\")]")).isDisplayed();
	  Assert.assertTrue(b38);
	  Thread.sleep(2000);
	  boolean b39 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
	  Assert.assertTrue(b39);
	  boolean b40 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
	  Assert.assertTrue(b40);
	  driver.findElement(By.xpath("//textarea[@placeholder = \"Type a message…\"]")).sendKeys("us");
    Thread.sleep(4000);
	 driver.findElement(By.xpath("//button[@title= \"Send Message to Assistant\"]")).click();
	 Thread.sleep(10000); 
	 boolean b41 = driver.findElement(By.xpath("//div[contains(text(), 'Do you know the send amount or receive amount?')]")).isDisplayed();
	    Assert.assertTrue(b41);
	    Thread.sleep(2000);
	    boolean b42 = driver.findElement(By.xpath("//div[@btn-title = 'send_amount_1']")).isDisplayed();
	    Assert.assertTrue(b42);
	    boolean b43 = driver.findElement(By.xpath("//div[@btn-title = 'receive_amount_1']")).isDisplayed();
	    Assert.assertTrue(b43);
	    boolean b44 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
	    Assert.assertTrue(b44);
	     Thread.sleep(4000);
	     driver.findElement(By.xpath("//div[@btn-title = 'send_amount_1']")).click();
	     Thread.sleep(2000);
	     boolean b3 = driver.findElement(By.xpath("//div[contains(text() , 'Enter the Send amount')]")).isDisplayed();
	     Assert.assertTrue(b3);
	     boolean b45 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
	     Assert.assertTrue(b45);
	     boolean b46 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
	     Assert.assertTrue(b46);
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//textarea[@placeholder = \"Type a message…\"]")).sendKeys("$50.00");
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//button[@title= \"Send Message to Assistant\"]")).click();
		 Thread.sleep(10000);
		 boolean b7 = driver.findElement(By.xpath("//div[contains(text() ,  \"Please wait while we validate your results...\")]")).isDisplayed();
	     Assert.assertTrue(b7);
	     Thread.sleep(2000);
		 boolean b28 = driver.findElement(By.xpath("//div[contains(text() ,  \"Here is the current status\")]")).isDisplayed();
	     Assert.assertTrue(b28);
	     Thread.sleep(2000);
	     //boolean b8 = driver.findElement(By.xpath("//div[@class = 'text-wrap align-content-center message-content']//p")).isDisplayed();
	     //Assert.assertTrue(b8);
	     Thread.sleep(2000);
	     boolean b48 = driver.findElement(By.xpath("//div[@class = 'text-wrap align-content-center message-content']//table")).isDisplayed();
	     Assert.assertTrue(b48);
	     Thread.sleep(2000);
	     boolean b49 = driver.findElement(By.xpath("//strong[contains(text() , \"The money transfer was sent to the receiver's bank. If the bank is unable to process the transfer, we will notify the sender.\")]")).isDisplayed();
	     Assert.assertTrue(b49);
	     Thread.sleep(2000);
	     boolean b50 = driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).isDisplayed();
	     Assert.assertTrue(b50);
	     Thread.sleep(2000);
	     boolean b51 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
	     Assert.assertTrue(b51);
	     Thread.sleep(3000);
	 
    
}

@Test(priority = 10)
public void Do_not_have_a_mtcn_response_sender_and_recevier_names_recevie_amount()throws InterruptedException {
//	 driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
//	 Thread.sleep(4000);
	driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).click();
	  Thread.sleep(3000);
	 driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).click();
	 Thread.sleep(6000);
	 driver.findElement(By.xpath("//div[@btn-title = 'transfer_status']")).click();
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//div[@btn-title = 'am_sender']")).click();
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//div[@btn-title = 'do_not_know_mtcn']")).click();
	 Thread.sleep(4000);
	 boolean b9 = driver.findElement(By.xpath("//div[contains(text(), 'No problem. Can you provide any of the following?')]")).isDisplayed();
    Assert.assertTrue(b9);
    Thread.sleep(2000);
    boolean b10 = driver.findElement(By.xpath("//div[@btn-title = 'sender_phone_number']")).isDisplayed();
    Assert.assertTrue(b10); //sender_phone_number
    Thread.sleep(2000);
    boolean b11 = driver.findElement(By.xpath("//div[@btn-title = 'sender_receiver_name']")).isDisplayed();
    Assert.assertTrue(b11);  //sender_receiver_name
    Thread.sleep(2000);
    boolean b12 = driver.findElement(By.xpath("//div[@btn-title = 'do_not_know']")).isDisplayed();
    Assert.assertTrue(b12);
    
    driver.findElement(By.xpath("//div[@btn-title = 'sender_receiver_name']")).click();
    
    
    boolean b24 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
    Assert.assertTrue(b24);
    boolean b25 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
    Assert.assertTrue(b25);
    boolean b13 = driver.findElement(By.xpath("//div[contains(text(), \"Please provide the Sender's First Name\")]")).isDisplayed();
    Assert.assertTrue(b13);
    boolean b26 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
    Assert.assertTrue(b26);
    boolean b27 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
    Assert.assertTrue(b27);
    Thread.sleep(2000);
    driver.findElement(By.xpath("//textarea[@placeholder = \"Type a message…\"]")).sendKeys("Stephen");
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//button[@title= \"Send Message to Assistant\"]")).click();
	 Thread.sleep(10000);
	  boolean b18 = driver.findElement(By.xpath("//div[contains(text(), \"Provide the Sender's Last Name\")]")).isDisplayed();
	  Assert.assertTrue(b18);
	  boolean b34 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
	    Assert.assertTrue(b34);
	    boolean b35 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
	    Assert.assertTrue(b35);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//textarea[@placeholder = \"Type a message…\"]")).sendKeys("Johnson");
      Thread.sleep(4000);
	 driver.findElement(By.xpath("//button[@title= \"Send Message to Assistant\"]")).click();
	 Thread.sleep(10000);
	  boolean b29 = driver.findElement(By.xpath("//div[contains(text(), \"Please provide Receiver's First Name\")]")).isDisplayed();
	  Assert.assertTrue(b29);
	  boolean b30 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
	  Assert.assertTrue(b30);
	  boolean b31 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
	  Assert.assertTrue(b31);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//textarea[@placeholder = \"Type a message…\"]")).sendKeys("Celeste");
      Thread.sleep(4000);
	 driver.findElement(By.xpath("//button[@title= \"Send Message to Assistant\"]")).click();
	 Thread.sleep(10000);  
	 boolean b32 = driver.findElement(By.xpath("//div[contains(text(), \"Provide Receiver's Last Name\")]")).isDisplayed();
	  Assert.assertTrue(b32);
	  Thread.sleep(2000);
	  boolean b36 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
	  Assert.assertTrue(b36);
	  boolean b37 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
	  Assert.assertTrue(b37);
	  driver.findElement(By.xpath("//textarea[@placeholder = \"Type a message…\"]")).sendKeys("Johnson");
     Thread.sleep(4000);
	 driver.findElement(By.xpath("//button[@title= \"Send Message to Assistant\"]")).click();
	 Thread.sleep(10000);  
	 boolean b38 = driver.findElement(By.xpath("//div[contains(text(), \"Provide the name of the country the transfer was sent to\")]")).isDisplayed();
	  Assert.assertTrue(b38);
	  Thread.sleep(2000);
	  boolean b39 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
	  Assert.assertTrue(b39);
	  boolean b40 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
	  Assert.assertTrue(b40);
	  driver.findElement(By.xpath("//textarea[@placeholder = \"Type a message…\"]")).sendKeys("US");
    Thread.sleep(4000);
	 driver.findElement(By.xpath("//button[@title= \"Send Message to Assistant\"]")).click();
	 Thread.sleep(10000); 
	 boolean b41 = driver.findElement(By.xpath("//div[contains(text(), 'Do you know the send amount or receive amount?')]")).isDisplayed();
	    Assert.assertTrue(b41);
	    Thread.sleep(2000);
	    boolean b42 = driver.findElement(By.xpath("//div[@btn-title = 'send_amount_1']")).isDisplayed();
	    Assert.assertTrue(b42);
	    boolean b43 = driver.findElement(By.xpath("//div[@btn-title = 'receive_amount_1']")).isDisplayed();
	    Assert.assertTrue(b43);
	    boolean b44 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
	    Assert.assertTrue(b44);
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//div[@btn-title = 'receive_amount_1']")).click();
	     Thread.sleep(2000);
	     boolean b3 = driver.findElement(By.xpath("//div[contains(text() , 'Enter the receive amount')]")).isDisplayed();
	     Assert.assertTrue(b3);
	     boolean b45 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
	     Assert.assertTrue(b45);
	     boolean b46 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
	     Assert.assertTrue(b46);
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//textarea[@placeholder = \"Type a message…\"]")).sendKeys("50");
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//button[@title= \"Send Message to Assistant\"]")).click();
		 Thread.sleep(10000);
		 boolean b7 = driver.findElement(By.xpath("//div[contains(text() ,  \"Please wait while we validate your results...\")]")).isDisplayed();
	     Assert.assertTrue(b7);
	     Thread.sleep(2000);
		boolean b28 = driver.findElement(By.xpath("//div[contains(text() ,  \"Here is the current status\")]")).isDisplayed();
	     //
	    Assert.assertTrue(b28);
	     Thread.sleep(2000);
	     //boolean b8 = driver.findElement(By.xpath("//div[@class = 'text-wrap align-content-center message-content']//p")).isDisplayed();
	     //Assert.assertTrue(b8);
	     Thread.sleep(2000);
	     boolean b48 = driver.findElement(By.xpath("//div[@class = 'text-wrap align-content-center message-content']//table")).isDisplayed();
	     Assert.assertTrue(b48);
	     Thread.sleep(2000);
	     boolean b49 = driver.findElement(By.xpath("//strong[contains(text() , \"The money transfer was sent to the receiver's bank. If the bank is unable to process the transfer, we will notify the sender.\")]")).isDisplayed();
	     Assert.assertTrue(b49);
	     Thread.sleep(2000);
	     //Thread.sleep(2000);
	     boolean b50 = driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).isDisplayed();
	     Assert.assertTrue(b50);
	     Thread.sleep(2000);
	     boolean b51 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
	     Assert.assertTrue(b51);
	     Thread.sleep(3000);
}

@Test(priority = 11)
public void Do_not_have_a_mtcn_response_sender_and_recevier_names_recevie_amount_names_with_spaces()throws InterruptedException {
//	 driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
//	 Thread.sleep(4000);
	driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).click();
	  Thread.sleep(3000);
	 driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).click();
	 Thread.sleep(6000);
	 driver.findElement(By.xpath("//div[@btn-title = 'transfer_status']")).click();
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//div[@btn-title = 'am_sender']")).click();
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//div[@btn-title = 'do_not_know_mtcn']")).click();
	 Thread.sleep(4000);
	 boolean b9 = driver.findElement(By.xpath("//div[contains(text(), 'No problem. Can you provide any of the following?')]")).isDisplayed();
    Assert.assertTrue(b9);
    Thread.sleep(2000);
//    boolean b10 = driver.findElement(By.xpath("//div[@btn-title = 'sender_phone_number']")).isDisplayed();
//    Assert.assertTrue(b10); //sender_phone_number
//    Thread.sleep(2000);
//    boolean b11 = driver.findElement(By.xpath("//div[@btn-title = 'sender_receiver_name']")).isDisplayed();
//    Assert.assertTrue(b11);  //sender_receiver_name
//    Thread.sleep(2000);
//    boolean b12 = driver.findElement(By.xpath("//div[@btn-title = 'do_not_know']")).isDisplayed();
//    Assert.assertTrue(b12);
    
    driver.findElement(By.xpath("//div[@btn-title = 'sender_receiver_name']")).click();
    
    
    boolean b24 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
    Assert.assertTrue(b24);
    boolean b25 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
    Assert.assertTrue(b25);
    boolean b13 = driver.findElement(By.xpath("//div[contains(text(), \"Please provide the Sender's First Name\")]")).isDisplayed();
    Assert.assertTrue(b13);
    boolean b26 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
    Assert.assertTrue(b26);
    boolean b27 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
    Assert.assertTrue(b27);
    Thread.sleep(2000);
    driver.findElement(By.xpath("//textarea[@placeholder = \"Type a message…\"]")).sendKeys("Stephen kumar");
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//button[@title= \"Send Message to Assistant\"]")).click();
	 Thread.sleep(8000);
	  boolean b18 = driver.findElement(By.xpath("//div[contains(text(), \"Provide the Sender's Last Name\")]")).isDisplayed();
	  Assert.assertTrue(b18);
	  boolean b34 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
	    Assert.assertTrue(b34);
	    boolean b35 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
	    Assert.assertTrue(b35);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//textarea[@placeholder = \"Type a message…\"]")).sendKeys("Johnson kumar");
      Thread.sleep(4000);
	 driver.findElement(By.xpath("//button[@title= \"Send Message to Assistant\"]")).click();
	 Thread.sleep(10000);
	  boolean b29 = driver.findElement(By.xpath("//div[contains(text(), \"Please provide Receiver's First Name\")]")).isDisplayed();
	  Assert.assertTrue(b29);
	  boolean b30 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
	  Assert.assertTrue(b30);
	  boolean b31 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
	  Assert.assertTrue(b31);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//textarea[@placeholder = \"Type a message…\"]")).sendKeys("Celeste jhon");
      Thread.sleep(4000);
	 driver.findElement(By.xpath("//button[@title= \"Send Message to Assistant\"]")).click();
	 Thread.sleep(10000);  
	 boolean b32 = driver.findElement(By.xpath("//div[contains(text(), \"Provide Receiver's Last Name\")]")).isDisplayed();
	  Assert.assertTrue(b32);
	  Thread.sleep(2000);
	  boolean b36 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
	  Assert.assertTrue(b36);
	  boolean b37 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
	  Assert.assertTrue(b37);
	  driver.findElement(By.xpath("//textarea[@placeholder = \"Type a message…\"]")).sendKeys("Johnson kumar");
     Thread.sleep(4000);
	 driver.findElement(By.xpath("//button[@title= \"Send Message to Assistant\"]")).click();
	 Thread.sleep(10000);  
	 boolean b38 = driver.findElement(By.xpath("//div[contains(text(), \"Provide the name of the country the transfer was sent to\")]")).isDisplayed();
	  Assert.assertTrue(b38);
	  Thread.sleep(2000);
	  boolean b39 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
	  Assert.assertTrue(b39);
	  boolean b40 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
	  Assert.assertTrue(b40);
	  driver.findElement(By.xpath("//textarea[@placeholder = \"Type a message…\"]")).sendKeys("US");
    Thread.sleep(4000);
	 driver.findElement(By.xpath("//button[@title= \"Send Message to Assistant\"]")).click();
	 Thread.sleep(10000); 
	 boolean b41 = driver.findElement(By.xpath("//div[contains(text(), 'Do you know the send amount or receive amount?')]")).isDisplayed();
	    Assert.assertTrue(b41);
	    Thread.sleep(2000);
	    boolean b42 = driver.findElement(By.xpath("//div[@btn-title = 'send_amount_1']")).isDisplayed();
	    Assert.assertTrue(b42);
	    boolean b43 = driver.findElement(By.xpath("//div[@btn-title = 'receive_amount_1']")).isDisplayed();
	    Assert.assertTrue(b43);
	    boolean b44 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
	    Assert.assertTrue(b44);
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//div[@btn-title = 'receive_amount_1']")).click();
	     Thread.sleep(2000);
	     boolean b3 = driver.findElement(By.xpath("//div[contains(text() , 'Enter the receive amount')]")).isDisplayed();
	     Assert.assertTrue(b3);
	     boolean b45 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
	     Assert.assertTrue(b45);
	     boolean b46 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
	     Assert.assertTrue(b46);
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//textarea[@placeholder = \"Type a message…\"]")).sendKeys("50");
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//button[@title= \"Send Message to Assistant\"]")).click();
		 Thread.sleep(10000);
		 boolean b7 = driver.findElement(By.xpath("//div[contains(text() ,  \"Please wait while we validate your results...\")]")).isDisplayed();
	     Assert.assertTrue(b7);
	     Thread.sleep(2000);
		boolean b28 = driver.findElement(By.xpath("//div[contains(text() ,  \"Here is the current status\")]")).isDisplayed();
	     //
	    Assert.assertTrue(b28);
	     Thread.sleep(2000);
	     //boolean b8 = driver.findElement(By.xpath("//div[@class = 'text-wrap align-content-center message-content']//p")).isDisplayed();
	     //Assert.assertTrue(b8);
	     Thread.sleep(2000);
	     boolean b48 = driver.findElement(By.xpath("//div[@class = 'text-wrap align-content-center message-content']//table")).isDisplayed();
	     Assert.assertTrue(b48);
	     Thread.sleep(2000);
	     boolean b49 = driver.findElement(By.xpath("//strong[contains(text() , \"The money transfer was sent to the receiver's bank. If the bank is unable to process the transfer, we will notify the sender.\")]")).isDisplayed();
	     Assert.assertTrue(b49);
	     Thread.sleep(2000);
	     //Thread.sleep(2000);
	     boolean b50 = driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).isDisplayed();
	     Assert.assertTrue(b50);
	     Thread.sleep(2000);
	     boolean b51 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
	     Assert.assertTrue(b51);
	     Thread.sleep(2000);
}
@Test(priority = 12)
public void Do_not_have_a_mtcn_response_sender_and_recevier_names_recevie_amount_names_with_hypens()throws InterruptedException {
//	 driver.findElement(By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']")).click();
//	 Thread.sleep(4000);
	driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).click();
	 Thread.sleep(6000);
	 driver.findElement(By.xpath("//div[@btn-title = 'transfer_status']")).click();
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//div[@btn-title = 'am_sender']")).click();
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//div[@btn-title = 'do_not_know_mtcn']")).click();
	 Thread.sleep(4000);
	 boolean b9 = driver.findElement(By.xpath("//div[contains(text(), 'No problem. Can you provide any of the following?')]")).isDisplayed();
    Assert.assertTrue(b9);
    Thread.sleep(2000);
//    boolean b10 = driver.findElement(By.xpath("//div[@btn-title = 'sender_phone_number']")).isDisplayed();
//    Assert.assertTrue(b10); //sender_phone_number
//    Thread.sleep(2000);
//    boolean b11 = driver.findElement(By.xpath("//div[@btn-title = 'sender_receiver_name']")).isDisplayed();
//    Assert.assertTrue(b11);  //sender_receiver_name
//    Thread.sleep(2000);
//    boolean b12 = driver.findElement(By.xpath("//div[@btn-title = 'do_not_know']")).isDisplayed();
//    Assert.assertTrue(b12);
//    
    driver.findElement(By.xpath("//div[@btn-title = 'sender_receiver_name']")).click();
    
    
    boolean b24 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
    Assert.assertTrue(b24);
    boolean b25 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
    Assert.assertTrue(b25);
    boolean b13 = driver.findElement(By.xpath("//div[contains(text(), \"Please provide the Sender's First Name\")]")).isDisplayed();
    Assert.assertTrue(b13);
    boolean b26 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
    Assert.assertTrue(b26);
    boolean b27 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
    Assert.assertTrue(b27);
    Thread.sleep(2000);
    driver.findElement(By.xpath("//textarea[@placeholder = \"Type a message…\"]")).sendKeys("Stephen-kumar");
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//button[@title= \"Send Message to Assistant\"]")).click();
	 Thread.sleep(10000);
	  boolean b18 = driver.findElement(By.xpath("//div[contains(text(), \"Provide the Sender's Last Name\")]")).isDisplayed();
	  Assert.assertTrue(b18);
	  boolean b34 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
	    Assert.assertTrue(b34);
	    boolean b35 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
	    Assert.assertTrue(b35);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//textarea[@placeholder = \"Type a message…\"]")).sendKeys("Johnson-kumar");
      Thread.sleep(4000);
	 driver.findElement(By.xpath("//button[@title= \"Send Message to Assistant\"]")).click();
	 Thread.sleep(10000);
	  boolean b29 = driver.findElement(By.xpath("//div[contains(text(), \"Please provide Receiver's First Name\")]")).isDisplayed();
	  Assert.assertTrue(b29);
	  boolean b30 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
	  Assert.assertTrue(b30);
	  boolean b31 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
	  Assert.assertTrue(b31);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//textarea[@placeholder = \"Type a message…\"]")).sendKeys("Celeste-jhon");
      Thread.sleep(4000);
	 driver.findElement(By.xpath("//button[@title= \"Send Message to Assistant\"]")).click();
	 Thread.sleep(10000);  
	 boolean b32 = driver.findElement(By.xpath("//div[contains(text(), \"Provide Receiver's Last Name\")]")).isDisplayed();
	  Assert.assertTrue(b32);
	  Thread.sleep(2000);
	  boolean b36 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
	  Assert.assertTrue(b36);
	  boolean b37 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
	  Assert.assertTrue(b37);
	  driver.findElement(By.xpath("//textarea[@placeholder = \"Type a message…\"]")).sendKeys("Johnson-kumar");
     Thread.sleep(4000);
	 driver.findElement(By.xpath("//button[@title= \"Send Message to Assistant\"]")).click();
	 Thread.sleep(10000);  
	 boolean b38 = driver.findElement(By.xpath("//div[contains(text(), \"Provide the name of the country the transfer was sent to\")]")).isDisplayed();
	  Assert.assertTrue(b38);
	  Thread.sleep(2000);
	  boolean b39 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
	  Assert.assertTrue(b39);
	  boolean b40 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
	  Assert.assertTrue(b40);
	  driver.findElement(By.xpath("//textarea[@placeholder = \"Type a message…\"]")).sendKeys("US");
    Thread.sleep(4000);
	 driver.findElement(By.xpath("//button[@title= \"Send Message to Assistant\"]")).click();
	 Thread.sleep(10000); 
	 boolean b41 = driver.findElement(By.xpath("//div[contains(text(), 'Do you know the send amount or receive amount?')]")).isDisplayed();
	    Assert.assertTrue(b41);
	    Thread.sleep(2000);
	    boolean b42 = driver.findElement(By.xpath("//div[@btn-title = 'send_amount_1']")).isDisplayed();
	    Assert.assertTrue(b42);
	    boolean b43 = driver.findElement(By.xpath("//div[@btn-title = 'receive_amount_1']")).isDisplayed();
	    Assert.assertTrue(b43);
	    boolean b44 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
	    Assert.assertTrue(b44);
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//div[@btn-title = 'receive_amount_1']")).click();
	     Thread.sleep(2000);
	     boolean b3 = driver.findElement(By.xpath("//div[contains(text() , 'Enter the receive amount')]")).isDisplayed();
	     Assert.assertTrue(b3);
	     boolean b45 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
	     Assert.assertTrue(b45);
	     boolean b46 = driver.findElement(By.xpath("//div[@btn-title = 'liveChatUserForm']")).isDisplayed();
	     Assert.assertTrue(b46);
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//textarea[@placeholder = \"Type a message…\"]")).sendKeys("50");
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//button[@title= \"Send Message to Assistant\"]")).click();
		 Thread.sleep(10000);
		 boolean b7 = driver.findElement(By.xpath("//div[contains(text() ,  \"Please wait while we validate your results...\")]")).isDisplayed();
	     Assert.assertTrue(b7);
	     Thread.sleep(2000);
		boolean b28 = driver.findElement(By.xpath("//div[contains(text() ,  \"Here is the current status\")]")).isDisplayed();
	     //
	    Assert.assertTrue(b28);
	     Thread.sleep(2000);
	     //boolean b8 = driver.findElement(By.xpath("//div[@class = 'text-wrap align-content-center message-content']//p")).isDisplayed();
	     //Assert.assertTrue(b8);
	     Thread.sleep(2000);
	     boolean b48 = driver.findElement(By.xpath("//div[@class = 'text-wrap align-content-center message-content']//table")).isDisplayed();
	     Assert.assertTrue(b48);
	     Thread.sleep(2000);
	     boolean b49 = driver.findElement(By.xpath("//strong[contains(text() , \"The money transfer was sent to the receiver's bank. If the bank is unable to process the transfer, we will notify the sender.\")]")).isDisplayed();
	     Assert.assertTrue(b49);
	     Thread.sleep(2000);
	     //Thread.sleep(2000);
	     boolean b50 = driver.findElement(By.xpath("//div[@btn-title = 'existing_transfer']")).isDisplayed();
	     Assert.assertTrue(b50);
	     Thread.sleep(2000);
	     boolean b51 = driver.findElement(By.xpath("//div[@btn-title = 'mainMenu']")).isDisplayed();
	     Assert.assertTrue(b51);
	     Thread.sleep(2000);
}

//
//
//
//
//
//
//
//	 
//	 
//	 
//	 
//
//
//


@AfterTest
public void teardown() {
	driver.quit();
	
}

}











