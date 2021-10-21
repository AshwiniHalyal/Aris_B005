package Demo1;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;


public class Demo_Elements_4 {

	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.edge.driver","C:\\Users\\00004852\\Documents\\edgedriver_win64\\msedgedriver.exe");
		
		WebDriver driver= new EdgeDriver();
		
	
		driver.get("https://jqueryui.com/droppable/");
		System.out.println("title is : "+driver.getTitle());
		
		String vText=driver.findElement(By.className("entry-title")).getText();
		System.out.println("Main Page Text : "+vText);
		
		
		int vFrame=driver.findElements(By.tagName("iframe")).size();
		System.out.println(vFrame);
		
		//driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		vText=driver.findElement(By.id("draggable")).getText();
		System.out.println(vText);
		
		WebElement Drag=driver.findElement(By.id("draggable"));
		WebElement Drop=driver.findElement(By.id("droppable"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(Drag, Drop).build().perform();
		
		Thread.sleep(4000);
		
		driver.switchTo().defaultContent();
		
		
		vText=driver.findElement(By.className("entry-title")).getText();
		System.out.println("Main Page Text : "+vText);
		
		driver.close();
		
	}
	
		
}
