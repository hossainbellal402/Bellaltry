package praKS;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTest extends Config {

	
	@Test
	public void assertionPrec() {
		String exp = "SignUp";
		String act = driver.findElement(By.xpath("//*[@id='content']/div/div/div/div[2]/div[1]/h2")).getText();
		System.out.println ("my actual text is: " + act);
		Assert.assertEquals(act, exp);

	}

}
