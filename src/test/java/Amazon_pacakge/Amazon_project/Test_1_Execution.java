package Amazon_pacakge.Amazon_project;



import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(TestListners1.class)
public class Test_1_Execution extends Basepage
{

	@Test()
	public void loginsuccesful() throws InterruptedException, IOException
	{
		Homepage h1= new Homepage(driver);
		Thread.sleep(1000);
		h1.newuserbtn();
		Thread.sleep(1000);
		h1.username();
		h1.continebtn();
		Thread.sleep(1000);
		h1.passw();
		h1.finalsigning();
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		
	}
}
