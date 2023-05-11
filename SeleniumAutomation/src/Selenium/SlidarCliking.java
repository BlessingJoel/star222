package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SlidarCliking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriverManager.edgedriver();
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://thronerecliners.com/#/");
	        driver.findElement(By.xpath("//*[@class='fa fa-times']")).click();
	        WebElement first = driver.findElement(By.xpath("//*[@id=\'heroCarousel\']/div/swiper/div[2]"));
			Actions act = new Actions(driver);
			 act.moveToElement(first).perform();
			 act.doubleClick(first).perform();

	}

}
