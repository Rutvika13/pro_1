package Amazon_pacakge.Amazon_project;



import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.ElementNotInteractableException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListners1.class)
public class Test_4_Execution_Editprofile extends Basepage
{
	@DataProvider(name="data")
	public Object[][] Datafeatching() throws EncryptedDocumentException, IOException, ElementNotInteractableException
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

@Test(retryAnalyzer=IRetrylogic.class,dataProvider="data")

public void editprofile(String username,String Password) throws InterruptedException
{
	
	Caseno_4_Editprofile c2=new Caseno_4_Editprofile(driver);
	c2.youract();
	Thread.sleep(1000);
	c2.loginandsecbtn();
	c2.addads();
	
	Homepage c1= new Homepage(driver);
	c1.usernameforlogin(username);;
	c1.continebtn();
	Thread.sleep(3000);
	c1.passwordforlogin(Password);;
	Thread.sleep(1000);
	c1.finalsigning();
	c2.editbtn();
	c2.changenamebtn();
	c2.savebtn();
	
	
	
	
	
	
}
}
