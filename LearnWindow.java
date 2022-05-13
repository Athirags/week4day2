package Week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindow {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
	  driver.get("http://www.leafground.com/pages/Window.html");	
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.findElement(By.id("home")).click();
	  Set<String> windowHandles = driver.getWindowHandles();
	  System.out.println(windowHandles);
	  List<String>windowHandleslist=new ArrayList<String>(windowHandles);
	  
	  String newWindowHandle = windowHandleslist.get(1);
	  driver.switchTo().window(newWindowHandle);
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
	  System.out.println("-----------------------------------------------------------"); 
	  
	  driver.switchTo().window(windowHandleslist.get(0));
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
	  System.out.println("-----------------------------------------------------------"); 
	  
	  
	  driver.switchTo().window(windowHandleslist.get(1));
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
	  System.out.println("-----------------------------------------------------------"); 
	  
	  driver.switchTo().window(windowHandleslist.get(0));
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
	driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
	  Set<String> multiplewindowHandles = driver.getWindowHandles();
	  System.out.println("no of windows open in screen is :"+multiplewindowHandles.size());
	  List<String>multiplewindowHandleslist=new ArrayList<String>(multiplewindowHandles);
	  String multiplewindowHandleslistmain = multiplewindowHandleslist.get(0);
	  String multiplewindowHandleslist1 = multiplewindowHandleslist.get(1);
	  String multiplewindowHandleslist2 = multiplewindowHandleslist.get(2);
	  
	  driver.switchTo().window(multiplewindowHandleslist.get(0));
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
	  System.out.println("-----------------------------------------------------------"); 
	  
	  driver.switchTo().window(multiplewindowHandleslist.get(1));
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
	  System.out.println("-----------------------------------------------------------"); 
	  
	  driver.switchTo().window(multiplewindowHandleslist.get(2));
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
	  System.out.println("-----------------------------------------------------------"); 
	  
	  driver.switchTo().window(multiplewindowHandleslist.get(3));
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
	  System.out.println("-----------------------------------------------------------"); 
	  //close all except this window
	  Set<String> closemultiplewindowHandles = driver.getWindowHandles();
	  List<String>closemultiplewindowHandleslist=new ArrayList<String>(closemultiplewindowHandles);
	  
	  String closemultiplewindowHandlesmain = closemultiplewindowHandleslist.get(0);
	  String closemultiplewindowHandles1 = closemultiplewindowHandleslist.get(1);
	  String closemultiplewindowHandles2 = closemultiplewindowHandleslist.get(2);
	 
	  System.out.println("--------------close window---------------------------------------------"); 
	   driver.switchTo().window(closemultiplewindowHandleslist.get(1));
	   driver.close();
	  System.out.println("-----------------------------------------------------------"); 
	  
	  driver.switchTo().window(closemultiplewindowHandleslist.get(2));
	  driver.close();
	  System.out.println("-----------------------------------------------------------"); 
	  
	  driver.switchTo().window(closemultiplewindowHandleslist.get(3));
	  driver.close();
	  System.out.println("-----------------------------------------------------------"); 
	  driver.switchTo().window(multiplewindowHandleslist.get(0));
	  driver.findElement(By.xpath("(//button[@id='color'])[2]")).click();
	  Thread.sleep(3000);
	}

}

