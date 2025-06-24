package Amazon_pacakge.Amazon_project;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(TestListners1.class)
public class Tase_9_Execution_Addtocart extends Basepage
{
	@DataProvider(name="data")
	
	public Object[][] datafetching() throws EncryptedDocumentException, IOException
	{
		String Filelocation="C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Amazon_project\\\\testdata\\\\amazontestdata.xlsx";
		Object[][] ob1= new Object[1][2];
		try
		{
		ob1[0][0]=Commonfiles.fetchingnumericdeta(Filelocation,"testcase2", 0, 0);
		ob1[0][1]=Commonfiles.FetchingStringdata(Filelocation, "testcase2", 0, 1);
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return ob1;
		
		
	}
	
	
	
	
	
	@Test(retryAnalyzer=IRetrylogic.class,dataProvider="data")
	public void addtocart(String username, String password) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Homepage addtocart= new Homepage(driver);
		addtocart.login();
		addtocart.usernameforlogin(username);
		addtocart.continebtn();
		Thread.sleep(2000);
		addtocart.passwordforlogin(password);
		Thread.sleep(1000);
		addtocart.finalsigning();
		
		Caseno_9_Addtocart c2= new Caseno_9_Addtocart(driver);
		c2.search();
		c2.firstproduct();
		//c2.addtocartbtn(driver);
		c2.addbtn();
	}

}
