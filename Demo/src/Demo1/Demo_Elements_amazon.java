package Demo1;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;


public class Demo_Elements_amazon {

	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.edge.driver","C:\\Users\\00004852\\Documents\\edgedriver_win64\\msedgedriver.exe");
		
		WebDriver driver= new EdgeDriver();
		
	
        driver.get("https://www.amazon.in");
        System.out.println("title is : "+driver.getTitle());

        Actions act=new Actions(driver);
        act.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();

        driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span")).click();


        System.out.println("title is : "+driver.getTitle());

        Thread.sleep(4000);

        driver.close();
		
		
	}
	
		
}
