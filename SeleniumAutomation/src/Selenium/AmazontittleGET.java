package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazontittleGET {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  WebDriverManager.edgedriver();
	        WebDriver driver = new ChromeDriver();
//	        WebDriver driver1=new ChromeDriver();
	        driver.get("https://www.amazon.in/");
	      String title1=  driver.getTitle();
	       System.out.println(title1);
	         Thread.sleep(3000);
	         WebDriver driver1 = null;
			String title = null;
			driver1.get("https://www.youtube.com/");
	       String title11=driver1.getTitle();
	        System.out.println("web page title:"+title11);
	       String Output=driver1.getCurrentUrl();
	       System.out.println("url="+Output);
	      String output1= driver1.getPageSource();
	      System.out.println(output1);
	      //Maximize screen
	      driver1.manage().window().maximize();
	      //minimize screen
	      driver1.manage().window().maximize();

	}

}
