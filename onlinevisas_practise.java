package BOT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class onlinevisas_practise {
	
	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\chromedriver.exe");
    WebDriver driver =new ChromeDriver(); 
    //driver = new ChromeDriver();
    driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.get("https://stage-liberty.itechlabs.net/login");
	
	
	driver.findElement(By.xpath("//input[@name = 'email']")).sendKeys("sushrutha@skil.ai");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("Enter$1234");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[contains(text() , 'Sign in')]")).click();
	Thread.sleep(8000);
	driver.findElement(By.xpath("//span[contains(text() , 'Client Journey')]")).click();
	Thread.sleep(8000);
	driver.findElement(By.xpath("//a[contains(text() , 'Leads')]")).click();
	Thread.sleep(8000);
	driver.findElement(By.xpath("//button[contains(text() , 'Add New')]")).click();
	Thread.sleep(8000);
	driver.findElement(By.xpath("//div[@class = 'ng-star-inserted']//i[1]")).click();
	Thread.sleep(6000);
	driver.findElement(By.xpath("//button[contains(text() , ' New ')]")).click();
	Thread.sleep(6000);
	driver.findElement(By.xpath("//input[@name = 'ben_fname']")).sendKeys("sridhar");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@name = 'ben_lname']")).sendKeys("tamarapalli");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@name = 'ben_email']")).sendKeys("sridhar@skil.ai");
	Thread.sleep(8000);
	driver.findElement(By.xpath("//ng-select[@formcontrolname= 'petitionerName']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[@class = 'ng-dropdown-panel-items scroll-host']//div[3]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//ng-select[@formcontrolname= 'visa_type']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[@class= 'ng-dropdown-panel-items scroll-host']//div[22]")).click();
	Thread.sleep(5000);
//	driver.findElement(By.xpath("//div[@class = 'ng-dropdown-panel-items scroll-host']//div[3]")).click();
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("//div[@class = 'ng-dropdown-panel-items scroll-host']//div[3]")).click();
	Thread.sleep(5000);
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,-500)");
	Thread.sleep(6000);
	WebElement element = driver.findElement(By.xpath("//button[contains(text() , ' Submit ')]"));
	element.click();
	
	
	

}
}
