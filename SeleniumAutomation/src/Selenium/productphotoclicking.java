package Selenium;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class productphotoclicking {

	public static void main(String[] args) throws Throwable {
	WebDriverManager.edgedriver();

	WebDriver driver = new EdgeDriver();
   driver.get("https://thronerecliners.com/#/");
   driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
   driver.findElement(By.xpath("//*[@id='close']/i")).click();
   
   JavascriptExecutor executor=(JavascriptExecutor)driver;
   executor.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
   Thread.sleep(3000);
   
   WebElement to1 = driver.findElement(By.xpath("(//*[@class='portfolio-info'])[20]"));
  Actions actions = new Actions(driver);
	actions.moveToElement(to1).perform();


driver.findElement(By.xpath("(//*[@class='bx bx-plus'])[20]")).click();



	}

}
