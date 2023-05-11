package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeOpen {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
        WebDriverManager.edgedriver();
        WebDriver driver = new EdgeDriver();
       Thread.sleep(5000);
        driver.close();
        Thread.sleep(4000);
        driver.quit();
        
       
	}

}
