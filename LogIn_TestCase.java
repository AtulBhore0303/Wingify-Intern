package qawingifyAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn_TestCase {

	public static void main(String[] args)  {

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver/chromedriver.exe");

		WebDriver driver= new ChromeDriver();

		driver.get("https://sakshingp.github.io/assignment/login.html");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Atul");

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Atul@123");

		driver.findElement(By.xpath("//button[@id='log-in']")).click();


	}

}
