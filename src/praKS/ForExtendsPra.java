package praKS;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class ForExtendsPra extends Config{

	@Test(priority=1)
	public void SingUpTest () {
		System.out.println("Facebook Sing Up test++++++++++++++++++");
		driver.findElement(By.xpath(fn)).sendKeys( fval);
		driver.findElement(By.xpath(ln)).sendKeys( lst);
		
	

	}
	@Test(priority=2)
 public void loginTest() {
		System.out.println("This is Facebook loing test+++++++++++++++++++++");
		driver.findElement(By.xpath(fn)).sendKeys( fval);
		driver.findElement(By.xpath(ln)).sendKeys( lst);
	}
@Test(priority=3)	
  public void logoutTest() {
	 System.out.println("This is logout test;;;;;;;;;;;;;;;;;");
}
 @Test(priority=4)
 public void skipTest() {
	 System.out.println(" This is test is goin to be skipped since no long needs");
	 
	 throw new SkipException(" Skipping this test because business requiment are change here is the JERA ticket#SR=");
 }
  @Test(priority=5, enabled=false)
  public void distableTest() {
	  System.out.println(" Don't want to exectue the test at all and it won't show up in report");
	  
  }
  
	@Test(priority=5, enabled=true)
	public void trycatchTest(){
		System.out.println (" try catch block test");
		
		String actual 		= "Hi, TalentTEK";
		String expected 	= "Hi, TalentTEK Consulting";
		try {
			Assert.assertEquals(actual, expected);
		}catch (Throwable issue){
			System.err.println ("actual is not matching with expected" + issue);
	}
		}
				

	
}
