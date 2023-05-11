package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IconButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		  
		  WebDriverManager.chromedriver();
	        WebDriver driver = new ChromeDriver();
//	        driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
	        driver.get("https://thronerecliners.com/#/");
//	        driver.manage().window().maximize();
	        driver.findElement(By.xpath("//*[@id='close']")).click();
	        
	        
	        Thread.sleep(8000);
	        WebElement first = driver.findElement(By.xpath("(//*[starts-with(@class,'col-lg-4 col-md-6')])[1]"));
	        Actions act=new Actions(driver);
	        act.moveToElement(first).perform();

	}

}
