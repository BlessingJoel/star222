package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssselectorNavigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver();
        WebDriver driver = new EdgeDriver();
         driver.findElement(By.cssSelector("a[id='d1']")).click();
        driver.navigate().back();
        driver.findElement(By.cssSelector("a[name='n1']")).click();
        driver.navigate().back();
        driver.findElement(By.cssSelector("a[class='c1']")).click();
        driver.navigate().back();
        driver.findElement(By.cssSelector("a[herf='https://www.jspiders.com/']")).click();

	}

}
