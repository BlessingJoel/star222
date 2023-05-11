package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class carearapplyenter {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriverManager.edgedriver();
	        WebDriver driver = new EdgeDriver();
	        driver.get("https://thronerecliners.com/#/reach-us");
	       driver.manage().window().maximize();
	       driver.findElement(By.xpath("//*[@id='close']/i")).click();
	       driver.findElement(By.xpath("//*[@id='navbar2']/ul/li[6]/a")).click();
       Thread.sleep(3000);
	       driver.findElement(By.xpath("//*[@id='timeline']/div[1]/div[2]/a")).click();
	   	
	       driver.findElement(By.id("name")).sendKeys("blessing",Keys.TAB,"starblessing8@gmail.com",Keys.ENTER.TAB,"6382928743",Keys.ENTER.TAB,"tuty",Keys.ENTER.TAB,"submit");
	   	
	      driver.findElement(By.xpath("//*[@id='select1']")).click();
	     WebElement dropdown = driver.findElement(By.xpath("//*[@id='select1']"));	      
	     Select obj = new Select(dropdown);
	      obj.selectByIndex(1);
	      
	      Thread.sleep(3000);
	      //driver.findElement(By.xpath("//*[@id=\'submit\']")).click();
	

	
	}

}
