package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HightWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriverManager.edgedriver();
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.leafground.com/button.xhtml");
	        WebElement Bvalue=driver.findElement(By.id("j_idt88:j_idt90"));
	         Point xyvalue = Bvalue.getLocation();
	        int xvalue=xyvalue.getX();
	  	  int yvalue =xyvalue.getY();
	        System.out.println("xvalue="+xvalue+" "+"yvalue="+yvalue);
	         
	         WebElement colorbutton= driver.findElement(By.id("j_idt2"));
	         String acolor= colorbutton.getCssValue("background");
	         //System.out.print(acolor);
	         
	         WebElement buttonsize= driver.findElement(By.id("j_idt88:j_idt90"));
	         int hight=buttonsize.getSize().getHeight();
	         int width=buttonsize.getSize().getWidth();
	         System.out.println(hight+" "+width);

	}

}
