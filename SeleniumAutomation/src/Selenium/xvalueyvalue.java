package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xvalueyvalue {

	private static Point value;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver();
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.facebook.com/login/");
		//facebook font size
		 WebElement font =driver.findElement(By.xpath("//*[@class='_97vu img']"));
		String datafont = font.getCssValue("font-size");
		System.out.println("font size="+datafont);
		//facebook colour
       WebElement color= driver.findElement(By.xpath("//button[@name='login']"));
      String output= color.getCssValue("background-color");
      System.out.println("color="+output);
      //Button xvalue yvalue
       value =color.getLocation();
    int data =value.getX();
      int data1 =value.getY();
     
       System.out.println("x="+value.getX());
       System.out.println("y="+value.getY());
      
       System.out.println("x="+data);
       System.out.println("y="+data1);
       System.out.println(value);

	}

}
