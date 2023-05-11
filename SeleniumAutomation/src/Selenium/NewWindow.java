package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewWindow {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriverManager.edgedriver();
WebDriver driver = new EdgeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://demo.actitime.com/login.do");
Thread.sleep(3000);

WebElement actilink= driver.findElement(By.partialLinkText("actiTIME Inc."));
Actions a= new Actions(driver);
a.contextClick(actilink).perform();
Robot r=new Robot();
r.keyPress(KeyEvent.VK_W);
	}

}
