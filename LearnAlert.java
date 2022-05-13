package Week4.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {
public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
	  driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");	
	  driver.manage().window().maximize();
}
}
