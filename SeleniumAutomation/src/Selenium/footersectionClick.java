package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class footersectionClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver();
        WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://thronerecliners.com/#/");

        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
       driver.findElement(By.xpath("//*[@id='close']")).click();
       
       JavascriptExecutor executor=(JavascriptExecutor)driver;
       executor.executeScript("window.scroll(0,400)", "");
       driver.findElement(By.xpath("(//*[text()='About us'])")).click();
       
	}

}
