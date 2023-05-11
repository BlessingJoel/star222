package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class automatickeyboard {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		  WebDriverManager.edgedriver();
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://timetracker.ctepl.com/actitime/login.do");
			driver.findElement(By.name("username")).sendKeys("star");
			Robot rot =new Robot();
			rot.keyPress(KeyEvent.VK_CONTROL);
			rot.keyPress(KeyEvent.VK_A);
			rot.keyRelease(KeyEvent.VK_A);
			rot.keyRelease(KeyEvent.VK_CONTROL);
			
			rot.keyPress(KeyEvent.VK_CONTROL);
			rot.keyPress(KeyEvent.VK_C);
			rot.keyRelease(KeyEvent.VK_C);
			rot.keyRelease(KeyEvent.VK_CONTROL);
			
			rot.keyPress(KeyEvent.VK_TAB);
			rot.keyRelease(KeyEvent.VK_TAB);
			
			rot.keyPress(KeyEvent.VK_CONTROL);
			rot.keyPress(KeyEvent.VK_V);
			rot.keyRelease(KeyEvent.VK_V);
			rot.keyRelease(KeyEvent.VK_CONTROL);

	}

}
