package Selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcceptDismiss {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		 WebDriverManager.edgedriver();
	        WebDriver driver = new EdgeDriver();
	        driver.get("https://www.leafground.com/alert.xhtml");
			
			//successfull msg alert
			WebElement alert1=driver.findElement(By.id("j_idt88:j_idt91"));
			alert1.click();
			org.openqa.selenium.Alert alert=driver.switchTo().alert();
			alert.accept();
			
			
			//Automatic call alert
			WebElement alert2=driver.findElement(By.id("j_idt88:j_idt93"));
			alert2.click();
			Thread.sleep(3000);
			
			//automatic open and dismiss
			org.openqa.selenium.Alert alert3=driver.switchTo().alert();
			alert3.dismiss();
			
			
			//Automatic alert and enter the value
			WebElement alert4=driver.findElement(By.id("j_idt88:j_idt104"));
			alert4.click();
			Thread.sleep(3000);
			
			org.openqa.selenium.Alert prompt=driver.switchTo().alert();
			prompt.sendKeys("star");
			prompt.accept();

	}

}
