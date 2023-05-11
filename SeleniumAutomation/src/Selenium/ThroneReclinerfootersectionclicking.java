package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ThroneReclinerfootersectionclicking {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver();
        WebDriver driver = new EdgeDriver();
        
        driver.get("https://thronerecliners.com/#/");
        driver.manage().window().maximize();
        driver.get("http://127.0.0.1:5500/new02.html");
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        int count = allLinks.size();
        System.out.println(count);
        WebElement link= allLinks.get(0);
        String text= link.getText();
        System.out.println(text);

        driver.findElement(By.xpath("//*[@id='close']/i")).click();
        
        JavascriptExecutor executor=(JavascriptExecutor)driver;
       executor.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
       
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text()='About us']")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(2000);
        JavascriptExecutor executor1=(JavascriptExecutor)driver;
        executor.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
        driver.findElement(By.xpath("//*[@id=\'footer\']/div[1]/div/div[1]/div[5]/ul/li[5]/a")).click();
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='footer']/div[1]/div/div[1]/div[2]/div/a[2]")).click();
        driver.navigate().back();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id='close']/i")).click();
        JavascriptExecutor executor2=(JavascriptExecutor)driver;
        executor.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
       
        
        
        driver.findElement(By.xpath("//*[@id='footer']/div[1]/div/div[1]/div[2]/div/a[3]")).click();
	}

}
