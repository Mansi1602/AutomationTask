package task;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.monte.media.VideoFormatKeys.*;

import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.io.File;

import org.monte.media.Format;
import org.monte.media.math.Rational;
import org.monte.screenrecorder.ScreenRecorder;

public class HomePage_Sheffield  {
	

	public static void main(String[] args) throws Exception

	{
		
		SpecializedScreenRecorder.startRecording();
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Mansi\\UniversityOfSheffield\\chromedriver.exe");
		driver = new ChromeDriver();
		// Navigating to URL //
		driver.get("https://www.sheffield.ac.uk/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// Scrolling down till the text is displayed //
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,6000)");
		Thread.sleep(1000);
		// Verifying if the Text is Displayed //
		WebElement element = driver.findElement(By.xpath("//div[@class='large-5 columns copyright']"));
		String UniversityOfSheffield = element.getText();
		if (element.isDisplayed()) {
			System.out.println("Text is displayed " + UniversityOfSheffield);
		}
		// Closing the ChromeDriver
		driver.close();
		// TODO Auto-generated method stub
		SpecializedScreenRecorder.stopRecording();
	}

	
	}


