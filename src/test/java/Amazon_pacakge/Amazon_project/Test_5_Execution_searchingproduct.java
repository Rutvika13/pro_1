package Amazon_pacakge.Amazon_project;

import org.testng.annotations.Test;

public class Test_5_Execution_searchingproduct extends Basepage
{
	

	@Test(retryAnalyzer=IRetrylogic.class)
	public void addtocart() throws InterruptedException 
	{
		Homepage c1= new Homepage(driver);
		c1.login();
		c1.username();
		c1.continebtn();
		c1.passw();
		c1.finalsigning();
		
		Caseno_5_searchingproduct c2= new Caseno_5_searchingproduct(driver);
				c2.search();
				c2.firstproduct();
				//c2.parenttochild(driver);
				
	}

}
