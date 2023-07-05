package ABC;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;

/*
 * Count no. of Hyper link and Image link
 * check working of Radio button and their redirection
 * Logged in person should not login
 * check and verify all the drop down options _ if no redirection take the Screen sho
 * Check and Verify Navigation button
 * Check and verify Webpage Layout
 * 
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ABC_Ayush_Selenium {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user2\\Documents\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.idbidirect.in");
		
		//System.out.println(driver.getTitle());
		HashMap<String,String> FLocation=new HashMap<>();
		FLocation.put("//body/form[@id='form1']/div/div[@class='container-fluid']/div[@class='container paddingLeftRight0']/div[@class='menu DesktopMenuShowHide']/ul/li[1]", "C:\\Users\\user2\\Desktop\\AUX Testing\\IDBI_home_Market.txt");
		FLocation.put("//body/form[@id='form1']/div/div[@class='container-fluid']/div[@class='container paddingLeftRight0']/div[@class='menu DesktopMenuShowHide']/ul/li[1]", "C:\\Users\\user2\\Desktop\\AUX Testing\\IDBI_home_Offering.txt");
		String abc="//body/form[@id='form1']/div/div[@class='container-fluid']/div[@class='container paddingLeftRight0']/div[@class='menu DesktopMenuShowHide']/ul/li[1]";
		//System.out.println(abc);
		
		
		//driver.findElement(By.xpath("//a[normalize-space()='x']")).click();
		//driver.findElement(By.xpath("//body/form[@id='form1']/div/div[@class='container-fluid']/div[@class='container paddingLeftRight0']/div[@class='menu DesktopMenuShowHide']/ul/li[1]")).click();
		//driver.findElement(By.xpath("//a[@href='/Markets/Equity/Gainers.aspx']")).click();
		//driver.findElement(By.xpath(abc)).click();
		//driver.navigate().back();
		//driver.findElement(By.xpath("//a[normalize-space()='x']")).click();
		
		BufferedReader reader = new BufferedReader(new FileReader("\\C:\\Users\\user2\\Desktop\\AUX Testing\\IDBI_home_Market.txt"));
		String Line;
		while((Line=reader.readLine())!=null)
		{
			System.out.println(Line+"\n");
			
			driver.findElement(By.xpath("//a[normalize-space()='x']")).click();//Attention close
			driver.findElement(By.xpath(abc)).click();//Market Tab open
			driver.findElement(By.xpath(Line)).click();// nth Pointer line opened
			if(driver.getCurrentUrl()=="https://www.idbidirect.in")
			{
				System.out.println("Error in Tab opening"+Line+"\n");
				}
			driver.navigate().back();
		}
		reader.close();
		//System.out.println(driver.getPageSource());
		driver.close();
		//Thread.sleep(null);
		
	}
	
	//next day:   web page Diemention and X/Y cordination

}
