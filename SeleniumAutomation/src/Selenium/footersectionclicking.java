package Selenium;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class footersectionclicking {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		  WebDriverManager.edgedriver();
	       WebDriver driver = new EdgeDriver();
	        driver.navigate().to("https://thronerecliners.com/#/");

	        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	       driver.findElement(By.xpath("//*[@id='close']")).click();
	       
	       JavascriptExecutor executor=(JavascriptExecutor)driver;
	       executor.executeScript("window.scroll(0,400)", "");
	       	 WebElement to = driver.findElement(By.xpath("(//*[@class='portfolio-info'])[1]"));
	    Actions act=new Actions(driver);
//		act.moveToElement(to).perform();
//		
//		
//		driver.findElement(By.xpath("(//*[@class='bx bx-plus'])[1]")).click();		
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@class='fa fa-times-circle'][1]")).click();
//		driver.findElement(By.xpath("//*[@class='bx bx-link']")).click();
//		driver.navigate().back();
		
//		WebElement to1 = driver.findElement(By.xpath("(//*[@class='portfolio-info'])[2]"));
//		Actions act1 =new Actions(driver);
//		act1.moveToElement(to1).perform();
//		
//		driver.findElement(By.xpath("(//*[@class='bx bx-plus'])[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@class='fa fa-times-circle']")).click();
//		Thread.sleep(2000);
//	     driver.findElement(By.xpath("(//*[@class='bx bx-link'])[2]")).click();
//	     driver.navigate().back();
	   
//			executor.executeScript("window.scroll(0,400)", "");
//			
//		     WebElement to2 = driver.findElement(By.xpath("(//*[@class='img-fluid'])[3]"));
//				Actions act2 =new Actions(driver);
//				act2.moveToElement(to2).perform();
//				
//			driver.findElement(By.xpath("(//*[@class='bx bx-plus'])[3]")).click();
//			Thread.sleep(5000);
//			driver.findElement(By.xpath("//*[@class='fa fa-times-circle']")).click();
//		
//			driver.findElement(By.xpath("(//*[@class='bx bx-link'])[3]")).click();
//		
//		    driver.navigate().back();
//		    
//		    
//		    WebElement to3 = driver.findElement(By.xpath("(//*[@class='bx bx-plus'])[4]"));
//			Actions act3 =new Actions(driver);
//			act3.moveToElement(to3).perform();
//			
//			driver.findElement(By.xpath("(//*[@class='bx bx-plus'])[4]")).click();			
//			Thread.sleep(5000);
//			driver.findElement(By.xpath("//*[@class='fa fa-times-circle']")).click();
//					driver.findElement(By.xpath("(//*[@class='bx bx-link'])[4]")).click();
//			
//		    driver.navigate().back();
		driver.findElement(By.xpath("CINEMA SEATINGS")).click();
	       
	}

}
