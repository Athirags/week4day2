package Week4.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundDropdown {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
	  driver.get("http://www.leafground.com/pages/Dropdown.html");	
	  driver.manage().window().maximize();
	  WebElement index = driver.findElement(By.id("dropdown1"));
	  Select select=new Select(index);
	  select.selectByIndex(1);
	  
	  WebElement text = driver.findElement(By.name("dropdown2"));
	  Select select2=new Select(text);
	  select2.selectByVisibleText("Appium");
	  
	  WebElement value = driver.findElement(By.id("dropdown3"));
	  Select select3=new Select(value);
	  select3.selectByValue("1");
	  
	  WebElement option = driver.findElement(By.className("dropdown"));
	  Select select4=new Select(option);
	  List<WebElement> options = select4.getOptions();
	  select4.selectByIndex(options.size()-1);
	  int size = options.size();
	  
	  System.out.println(size);
	  for(WebElement eachoptions:options) {
		  System.out.println(eachoptions.getText());
		driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[5]/select[1]")).sendKeys("Selenium");
		
		WebElement selpro = driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[6]/select[1]"));
		Select select5=new Select(selpro);
		 select5.selectByIndex(1);
		 select5.selectByIndex(2);
		 
		  
		  
		  
		  
	  }
	  
	}
	

}

