package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Headerheadingclicking {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		  WebDriverManager.edgedriver();
	        driver = new EdgeDriver();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        driver.get("https://thronerecliners.com/#/");
	        driver.findElement(By.xpath("//*[@id=\"close\"]/i")).click();
	        
	        JavascriptExecutor ex=(JavascriptExecutor)driver;
	        ex.executeScript("window.scrollBy(0,400)", "");
	       Thread.sleep(3000);
	     driver.findElement(By.xpath("(//*[@id='portfolio-flters'])[1]")).click();
	     driver.findElement(By.xpath("(//*[@id='portfolio-flters'])[2]")).click();
	     driver.findElement(By.xpath("(//*[@id='portfolio-flters'])[3]")).click();
	     driver.findElement(By.xpath("(//*[@id='portfolio-flters'])[4]")).click();
	     driver.findElement(By.xpath("(//*[@id='portfolio-flters'])[5]")).click();

		    

		    

		    
		    

	}

}
