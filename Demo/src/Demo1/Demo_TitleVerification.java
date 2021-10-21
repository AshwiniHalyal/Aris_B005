package Demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo_TitleVerification {

	public static void main(String[] args) {
	
System.setProperty("webdriver.edge.driver","C:\\Users\\00004852\\Documents\\edgedriver_win64\\msedgedriver.exe");
		
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.google.com"); //enter the url which you want to launch
		String vTitle= driver.getTitle();
		
		//System.out.println("URL is " +driver.getCurrentUrl());
		//System.out.println("Title is " +vTitle);
		
		
		if(vTitle.equalsIgnoreCase("google"))
		{
			System.out.println("Pass");
		}
		
		else
		{
			System.out.println("Fail");
		}
		
		driver.close();

	}

}
