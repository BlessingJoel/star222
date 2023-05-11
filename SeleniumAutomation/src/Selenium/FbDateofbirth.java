package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FbDateofbirth {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		  WebDriverManager.edgedriver();
	        WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
       driver.findElement(By.linkText("Create new account")).click();
       
       
     WebElement first=  driver.findElement(By.name("birthday_day"));

    
     Select sel= new Select(first);
     sel.selectByValue("23");
     Thread.sleep(1000);
     sel.selectByIndex(14);
     Thread.sleep(3000);
     sel.selectByVisibleText("25");
      WebElement mothlist= driver.findElement(By.id("month"));
      Select se1= new Select(mothlist);
  	se1.selectByIndex(10);
  	WebElement yearlist= driver.findElement(By.id("year"));
  	Select se2= new Select(yearlist);
  	se2.selectByVisibleText("1996");
     
     
	}

}
