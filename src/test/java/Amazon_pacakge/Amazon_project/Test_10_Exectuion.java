package Amazon_pacakge.Amazon_project;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListners1.class)
public class Test_10_Exectuion extends Basepage 
{
	
	@DataProvider(name="data")
	public Object[][] datafeatching() throws EncryptedDocumentException, IOException
	{
		String Filelocation="C:\\Users\\DELL\\eclipse-workspace\\Amazon_project\\testdata\\amazontestdata.xlsx";
		Object[][] ob1= new Object[1][2];
		
		ob1[0][0]= Commonfiles.fetchingnumericdeta(Filelocation, "testcase2", 0, 0);
		ob1[0][1]= Commonfiles.FetchingStringdata(Filelocation, "testcase2", 0, 1);
		return ob1;
		
	}
	
	@Test(retryAnalyzer=IRetrylogic.class,dataProvider="data")
	public void addtocart(String username,String pasword) throws InterruptedException 
	{
		Homepage c1 = new Homepage(driver);
		c1.login();
		c1.usernameforlogin(username);;
		c1.continebtn();
		Thread.sleep(1000);
		c1.passwordforlogin(pasword);
		c1.finalsigning();

		Caseno_9_Addtocart c2 = new Caseno_9_Addtocart(driver);
		c2.search();
		c2.firstproduct();
		
		Caseno_10_Addandremoveproduct c3 = new Caseno_10_Addandremoveproduct(driver);
		// c3.parenttochild(driver);

		c3.addtocartbtn();
		c3.gotocartbtn();
		c3.addquantitybtn();
		Thread.sleep(1000);
		c3.delecttocartbtn();

	}

}
