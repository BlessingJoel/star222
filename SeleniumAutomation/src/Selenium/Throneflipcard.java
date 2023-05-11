package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Throneflipcard {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver();
        WebDriver driver = new EdgeDriver();
        driver.get("https://thronerecliners.com/#/");
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      driver.findElement(By.xpath("//*[@id='close']")).click();
     
      Thread.sleep(9000);
      WebElement to = driver.findElement(By.xpath("//*[@class='service-icon yellow']"));
      JavascriptExecutor executor=(JavascriptExecutor)driver;
      executor.executeScript("argument[0].scrollIntoView(true);", "to");
      
       Thread.sleep(3000);
       
      WebElement to1 = driver.findElement(By.xpath("/*[@class='service-icon yellow']"));
	     Actions act=new Actions(driver);
	     act.moveToElement(to1).perform();

	
	     

	}

}
