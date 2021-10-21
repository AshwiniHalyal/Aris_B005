package Demo1;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Demo_Elements2 {

	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.edge.driver","C:\\Users\\00004852\\Documents\\edgedriver_win64\\msedgedriver.exe");
		
		WebDriver driver= new EdgeDriver();
		
		driver.get("https://www.gmail.com"); 
		
		System.out.println("Title" +driver.getTitle());
		
		driver.findElement(By.linkText("Help")).click();
		
		Set<String> ids = driver.getWindowHandles();
		
		Iterator<String> it = ids.iterator();
		
		
		//System.out.println(ids);
		
		String GmailWindowID =it.next();
		String HelpWindowID=it.next();
		
		System.out.println("Gmail Window " +GmailWindowID);
		System.out.println("Help Window "+HelpWindowID);
		
		driver.switchTo().window(HelpWindowID);
		
		System.out.println("Title is : " +driver.getTitle());
		
		driver.close();
		
		driver.quit();
		
		
		
	}
	
		
}
