package Selenium;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebookinstatwittermove {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver();
        WebDriver driver = new EdgeDriver();
        driver.get("https://thronerecliners.com/#/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      driver.findElement(By.xpath("//*[@id='close']")).click();
      
     WebElement to= driver.findElement(By.xpath("//*[@id='facebook']/a/img"));
     Actions act=new Actions(driver);
     act.moveToElement(to).perform();
     Thread.sleep(3000);
     
     WebElement to1= driver.findElement(By.xpath("//*[@id='instagram']/a/img"));
     Actions act1=new Actions(driver);
     act1.moveToElement(to1).perform();
     Thread.sleep(3000);
     
     WebElement to2= driver.findElement(By.xpath("//*[@id=\'whatsapp\']/a/img"));
     Actions act2=new Actions(driver);
     act2.moveToElement(to2).perform();
     

	
		
	}

}
