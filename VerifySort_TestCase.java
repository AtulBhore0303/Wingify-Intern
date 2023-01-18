package qawingifyAssignment;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;


public class VerifySort_TestCase {
	static String sort;
	@SuppressWarnings("deprecation")
	public static void main(String[] args)  {

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver/chromedriver.exe");

		WebDriver driver= new ChromeDriver();

		driver.get("https://sakshingp.github.io/assignment/login.html");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Atul");

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Atul@123");

		driver.findElement(By.xpath("//button[@id='log-in']")).click();
		
		System.out.println("******Before Sort*******");

		List<WebElement> Amount = driver.findElements(By.xpath("//table[@id='transactionsTable']/tbody/tr/td[5]"));

		String[] beforesort = new String[Amount.size()];

		for (int i=0; i<Amount.size(); i++) {
			beforesort[i]=Amount.get(i).getText().trim();
			System.out.println(beforesort[i]);
		}
		 System.out.println("sorting value using sort method");
		for(int i=0; i<Amount.size();i++) {
			Arrays.sort(beforesort);
			 sort = beforesort[i];
			 System.out.println(sort);
		}
		
		System.out.println("******After Sort*******");
		
		
		driver.findElements(By.xpath("//table[@id='transactionsTable']/tbody/tr/th[5]"));

		Amount = driver.findElements(By.xpath("//table[@id='transactionsTable']/tbody/tr/th[5]"));


		String[] aftersort = new String[Amount.size()];
		
		 System.out.println("sorting in application");

		for (int i=0; i<Amount.size(); i++) {
			aftersort[i]=Amount.get(i).getText().trim();
			System.out.println(aftersort[i]);
			
			
		}
		Assert.assertEquals(beforesort, aftersort);
		System.out.println("sorting successful");
		
		
	}
	
	
}

