package Amazon_pacakge.Amazon_project;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListners1.class)
public class Test_11_Execution_addpayment extends Basepage {

	@DataProvider(name="data")
	public Object[][] datafeatching() throws EncryptedDocumentException, IOException
	{
		String Filelocation="C:\\Users\\DELL\\eclipse-workspace\\Amazon_project\\testdata\\amazontestdata.xlsx";
		Object[][] ob1= new Object[1][2];
		
		ob1[0][0]= Commonfiles.fetchingnumericdeta(Filelocation, "testcase2", 0, 0);
		ob1[0][1]= Commonfiles.FetchingStringdata(Filelocation, "testcase2", 0, 1);
		return ob1;
		
	}
	
	@Test (retryAnalyzer=IRetrylogic.class,dataProvider="data")
	public void addpayment(String username,String Password) throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Homepage paymentselection = new Homepage(driver);
		paymentselection.login();
		paymentselection.usernameforlogin(username);
		paymentselection.continebtn();
		Thread.sleep(2000);
		paymentselection.passwordforlogin(Password);;
		paymentselection.finalsigning();

		Caseno_11_allprocesstopayment paymentselection1 = new Caseno_11_allprocesstopayment(driver);
		paymentselection1.search();
		paymentselection1.firstproduct();
		//paymentselection1.parenttochild(driver);		
		paymentselection1.bynowbtn();
		//paymentselection1.delivaryaddbtn();
		paymentselection1.paymentbtn();
		paymentselection1.usepaymentbt();
		//paymentselection1.reviewbtn();
	}
}
