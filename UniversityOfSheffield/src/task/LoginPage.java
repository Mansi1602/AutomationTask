package task;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class LoginPage {

	public static void main(String[] args) throws Exception 
	{
		
		// Created the Login Page Object
		LoginPage page = new LoginPage();
		String fileWithPath = "D:\\Mansi\\UniversityOfSheffield\\Screenshots\\";
		// Created the object for Webdriver
		WebDriver driver;
		// Setting the property for ChromeDriver Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Mansi\\UniversityOfSheffield\\chromedriver.exe");
		driver = new ChromeDriver();
		// Navigating to URL //
		driver.get("https://www.sheffield.ac.uk/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		// Redirecting to LoginPage
		driver.findElement(By.xpath("//a[contains(text(),'Log in to MUSE ')]")).click();
		Thread.sleep(200);
		// Entering the Username and Password
		driver.findElement(By.id("username")).sendKeys("abc162");
		driver.findElement(By.id("password")).sendKeys("abcx");
		driver.findElement(By.name("submit")).click();
		// Calling the Screenshots method
		String SS = page.takeSnapShot(driver, fileWithPath);
		Thread.sleep(200);
		driver.close();
		
	}

	public String takeSnapShot(WebDriver driver, String fileWithPath) throws Exception {

		// Convert web driver object to TakeScreenshot

		TakesScreenshot scrShot = ((TakesScreenshot) driver);

		// Call getScreenshotAs method to create image file

		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

		// Move image file to new destination

		File DestFile = new File(fileWithPath);

		// Copy file at destination	
		FileUtils.copyFile(SrcFile, new File(fileWithPath + ".png"));
		return fileWithPath;

	}

}
