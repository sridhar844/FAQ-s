package BOT;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class chatbot {
	
	public static void main(String[] args) throws Exception {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Documents\\chromedriver.exe");
		    WebDriver driver =new ChromeDriver(); 
		    //driver = new ChromeDriver();
		    driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.get("https://dev-01.skil.ai/ai-demo/html/pages/wu-assisstant-v1.html?language=en_eg");
			Thread.sleep(6000);
			driver.findElement(By.xpath("//button[contains(@data-content,\"Hi, Thanks for reaching out to WU, how may I help you?\")]")).click();
            Thread.sleep(8000);
            //driver.findElement(By.xpath("//p[contains(text() , 'Existing Transfer')]")).click();
			//Thread.sleep(10000);
			ArrayList<String> inputQuestions = new ArrayList<String>();
			ArrayList<String> botAnswers = new ArrayList<String>();

			File f1 = new File("C:\\Users\\hp\\Documents\\egpt.Xlsx");
			FileInputStream fio = null;
			try {
				fio = new FileInputStream(f1);
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

			XSSFWorkbook workbook = null;
			try {
				workbook = new XSSFWorkbook(fio);
			} catch (IOException e) {
				e.printStackTrace();
			}
			XSSFSheet sheet1 = workbook.getSheet("Questions");
			for (int i = 0; i < sheet1.getLastRowNum(); i++) {
				XSSFRow row = sheet1.getRow(i);
				XSSFCell cell = row.getCell(0);
				String stringCellValue = cell.getStringCellValue();
				inputQuestions.add(stringCellValue);
			}

			 for (String question : inputQuestions) {
				if(!question.isEmpty()) {
					driver.findElement(By.xpath("//textarea[@placeholder = 'Type a message…']")).sendKeys(question);
					driver.findElement(By.xpath("//button[@title = 'Send Message to Assistant']")).click();
					Thread.sleep(10000);
					
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					String xpathForAnswer = "//p[normalize-space(text())=\"" + question.trim()
							+ "\"]/parent::div/following-sibling::*[1]//*[contains(@class,'message-content')]";
					System.out.println(xpathForAnswer);
					String answer = driver.findElement(By.xpath(xpathForAnswer)).getText();
					botAnswers.add(answer);
					
					
		           driver.findElement(By.xpath("//textarea[@placeholder = 'Type a message…']")).clear();
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
			for (int i = 0; i < botAnswers.size(); i++) {
				XSSFRow row = sheet1.getRow(i);
				XSSFCell cell = row.createCell(1);
				cell.setCellType(CellType.STRING);
				cell.setCellValue(botAnswers.get(i));
			}
			
	
	
	
	   FileOutputStream fos = null;
	    try {
		fos = new FileOutputStream(f1);
	 } catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	try {
		workbook.write(fos);
	} catch (IOException e) {
		e.printStackTrace();
	}
	try {
		fos.flush();
		fos.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
   driver.close();
}
		

	}
	
	
////label[text()="{0}"]\\following-sibling::div[@id="{1}"]
//	static String constuctXpathText(String text, int... args) {
//		// using for each loop to display contents of a
//		for (int i;i<args.length; i++) {
//			text.replace("{"+i+"}", args[i]);
//		}
//		return text;
//	}
//}


