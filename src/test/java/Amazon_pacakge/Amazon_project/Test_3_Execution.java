package Amazon_pacakge.Amazon_project;




import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.internal.reflect.MethodMatcherException;
@Listeners(TestListners1.class)
public class Test_3_Execution extends Basepage
{
@DataProvider(name="data")
	
	public Object[][] Datafetching() throws EncryptedDocumentException, IOException,MethodMatcherException
	{
		String filelocation="C:\\Users\\DELL\\eclipse-workspace\\Amazon_project\\testdata\\amazontestdata.xlsx";
		Object[][] ob1= new Object[3][2];
		try 
		{
			ob1[0][0]=Commonfiles.fetchingnumericdeta(filelocation, "testcase3", 0, 0);
			ob1[0][1]=Commonfiles.FetchingStringdata(filelocation, "testcase3", 0, 1);
			ob1[1][0]=Commonfiles.FetchingStringdata(filelocation, "testcase3", 1, 0);
			ob1[1][1]=Commonfiles.fetchingnumericdeta(filelocation, "testcase3", 1, 1);
			ob1[2][0]=Commonfiles.fetchingnumericdeta(filelocation, "testcase3", 2, 0);
			ob1[2][1]=Commonfiles.FetchingStringdata(filelocation, "testcase3", 2, 1);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
			return ob1;
	}
	@Test(dataProvider="data")
	public void wrongdetails(String username,String password) throws InterruptedException
	{
		Homepage homepage= new Homepage(driver);
	
		homepage.login();
		homepage.usernameforlogin(username);
		homepage.continebtn();
		Thread.sleep(1000);
		homepage.passwordforlogin(password);
		
		homepage.finalsigning();
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		
	
	}
}
