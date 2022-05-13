package Week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSnapshot {
	

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		 driver.get("http://www.leafground.com/pages/Window.html");	
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  File sourceImage = driver.getScreenshotAs(OutputType.FILE);
		  File destImage=new File("./snaps/IMG001.png");
		  FileUtils.copyFile(sourceImage, destImage);
		
	
	
	}

}
