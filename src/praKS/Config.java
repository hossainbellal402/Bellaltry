package praKS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Config extends WebDriverFunction {
	public String url ="https://www.facebook.com/";
	public String fn ="//input[@id='u_0_m']";
	public String fval="Bella";
	public String ln ="//input[@id='u_0_o']";
	public String lst = "Hossain";
	
	
	
	@BeforeSuite
	public void Beforesuitetest () {
		System.out.println("This test case is getCurrentTime++++++++++++++ ");
		getCurrentTime();

	}
@BeforeMethod	
	public void openBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\bella\\eclipse-workspace\\Bellaltry\\Drivers\\chromedriver.exe");
	
	
	driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	driver .get( "url");
	
	
	
	
		System.out.println("This open Chromedriver+++++++++++++++  ");
		
	}
@AfterMethod
public void closeBrowser() {
	driver.close();
	System.out.println("This is the closeing +++++++++++++++");
	
}
@AfterSuite
public void AfterSuitetest() {
	driver.quit();
	System.out.println("This is the Quit...............");
}

}
