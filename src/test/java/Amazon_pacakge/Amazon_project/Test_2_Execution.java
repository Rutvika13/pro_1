package Amazon_pacakge.Amazon_project;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.internal.reflect.MethodMatcherException;
@Listeners(TestListners1.class)
public class Test_2_Execution extends Basepage
{
	@DataProvider(name="data")
	
	public Object[][] Datafetching() throws EncryptedDocumentException, IOException,MethodMatcherException
	{
		String filelocation="C:\\Users\\DELL\\eclipse-workspace\\Amazon_project\\testdata\\amazontestdata.xlsx";
		Object[][] ob1= new Object[1][2];
		try 
		{
			ob1[0][0]=Commonfiles.fetchingnumericdeta(filelocation, "testcase2", 0, 0);
			ob1[0][1]=Commonfiles.FetchingStringdata(filelocation, "testcase2", 0, 1);
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
			return ob1;
	}
	
	@Test(dataProvider="data",retryAnalyzer=IRetrylogic.class)
	
	public void sucsessfulloginwithrightdetails(String username,String password) throws InterruptedException
	{
		
		Homepage newuser= new Homepage(driver);
		newuser.login();	
		Thread.sleep(1000);
		newuser.usernameforlogin(username);
		newuser.continebtn();
		Thread.sleep(1000);
		newuser.passwordforlogin(password);;
		newuser.finalsigning();
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
			
	}

}
