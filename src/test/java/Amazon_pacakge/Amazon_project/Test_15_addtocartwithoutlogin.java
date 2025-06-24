package Amazon_pacakge.Amazon_project;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListners1.class)

public class Test_15_addtocartwithoutlogin extends Basepage {

	@Test()
	public void addtocartnologin() throws InterruptedException {
		Caseno_9_Addtocart withoutlogin = new Caseno_9_Addtocart(driver);
		withoutlogin.search();
		withoutlogin.firstproduct();
		//withoutlogin.addtocartbtn(driver);
		Thread.sleep(1000);
		withoutlogin.addbtn();
	}

}
