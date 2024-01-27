package Abhishek1.Anay1;

import java.util.List;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Demo {
	
	static WebDriver driver;
	
	
	
	public static void BrowserSettings() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Project\\Anay1\\Driver\\chrome.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(10000);
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		BrowserSettings();
		String OmayoPageUrl= driver.getCurrentUrl();
		System.out.println("Omayo Page Url is"+ OmayoPageUrl);
		
		String OmayoPageTitle= driver.getTitle();
		System.out.println("Omayo Page Title is"+ OmayoPageTitle);
		
		
		driver.findElement(By.id("ta1")).sendKeys("omprehension passages are sure-shot scoring questions that are usually asked in competitive examinations. Candidates must practice questions on this topic to score well in the exams. \r\n"
				+ "\r\n"
				+ "Reading Comprehension is a fundamental skill often tested as part of Verbal Ability in competitive "
				+ "examinations. It is especially important for Job seekers taking exams like SSC, RRB, Bank, Insurance, and other government exams as it constitutes a whole section for these tests. Practicing Reading Comprehension Questions and Answers thus has a big influence on an individual’s overall score since it needs both skill and accuracy to solve them correctly.");
		
		
				WebElement TextAreaField2= driver.findElement(By.xpath("//*[contains(text(),'The cat was playing in the garden.')]"));
		TextAreaField2.clear();
		TextAreaField2.sendKeys("   Text Area Field 2 Reading Comprehension is an essential skill that involves being able to make sense of a passage quickly and accurately, both retaining and applying the information it contains. Different types of passages can come up on exams, such as narrative passages or passages involving more complex concepts"
				+ "Here, we have some comprehension practice questions along with the answers and reasoning. By practicing these questions, you can improve your comprehension skills so that you can ace those reading-based sections! So try to practice these questions and improve your knowledge on the topic.");
		
		driver.findElement(By.xpath("//a[@id='link1']")).click();
		String Selenium143PageUrl= driver.getCurrentUrl();
		System.out.println("Title of Selenium143PageUrl"+ Selenium143PageUrl);
		
		String Selenium143PageTitle= driver.getTitle();
		
		if(Selenium143PageTitle.equals(Selenium143PageTitle)) {
			
			System.out.println("Page navigated to link Selenium143PageTitle");
			System.out.println("Selenium143 PageTitle is "+ Selenium143PageTitle);
			driver.navigate().back();
			
			if(OmayoPageTitle.equals("omayo (QAFox.com)")){
				
				System.out.println("Page returned back to Omayo Page");
				
			}
			
			WebElement DisplayForTimeAndDissapear=driver.findElement(By.id("alert2"));
			DisplayForTimeAndDissapear.click();
			Alert alert = driver.switchTo().alert(); // switch to alert

			String alertMessage= driver.switchTo().alert().getText(); // capture alert message

			System.out.println(alertMessage); // Print Alert Message
			Thread.sleep(5000);
			alert.accept();
			
			LinkTexts();
			
			}
		
		}
	
	
	public static void LinkTexts() throws InterruptedException {
		
		
		List<WebElement> links= driver.findElements(By.xpath("//div[@id='LinkList1']//a"));
		int noOfLinks= links.size();
		System.out.println(noOfLinks);
		@SuppressWarnings("unused")
		String path= ("//div[@id='LinkList1']//a");
		
		for(int i=0; i<noOfLinks; i++) {
			
			String elementpath= path + "[\"+i\"]";
			driver.findElement(By.xpath(elementpath)).click();
			driver.navigate().back();
			
			
		}
		
		getLinkTexts();
	}
		public static void getLinkTexts() {
		
		List<WebElement> links= driver.findElements(By.xpath("//div[@id='LinkList1']//a"));
		   for(WebElement e: links) {
			   System.out.println(e.getText());
		   }
	}
		public static void DragAndDrop() {
			
		}

}
