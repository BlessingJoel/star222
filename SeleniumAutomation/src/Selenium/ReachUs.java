package Selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReachUs {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		//reach Us box send message
		  WebDriverManager.edgedriver();
	        WebDriver driver = new EdgeDriver();
	        driver.get("https://thronerecliners.com/#/reach-us");
	       driver.manage().window().maximize();
	   	driver.findElement(By.id("name")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER.TAB,"6382928743",Keys.ENTER.TAB,"kerala",Keys.ENTER.TAB,"Throne recliner",Keys.ENTER.TAB,"Hi hello",Keys.ENTER.TAB,"submit");
	   	Thread.sleep(3000);
	   	driver.findElement(By.xpath("//*[@class='fa fa-times']")).click();
	   	Thread.sleep(3000);
	   	 driver.findElement(By.xpath("(//*[@name='submit'])")).click();
	   	

	        

	}

}
