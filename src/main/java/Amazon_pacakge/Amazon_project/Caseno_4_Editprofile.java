package Amazon_pacakge.Amazon_project;





import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.testng.Reporter;


public class Caseno_4_Editprofile{
	WebDriver driver;
	// step 1
	@FindBy(xpath = "(//span[@class='nav-text'])[6]")
	WebElement youraccount;

	@FindBy(xpath = "(//h2[@class='a-spacing-none ya-card__heading--rich a-text-normal'])[2]")
	WebElement loginandsecurit;

	@FindBy(xpath = "//div[@class='a-box-inner a-padding-extra-large']")
	WebElement addaddress;

	@FindBy(xpath = "//input[@name='email']")
	WebElement un;

	@FindBy(xpath = "//span[@id='continue']")
	WebElement contbtn;

	@FindBy(xpath = "//input[@type='password']")
	WebElement password;

	@FindBy(id = "signInSubmit")
	WebElement signin2;

	@FindBy(xpath = "(//a[@class='a-button-text'])[1]")
	WebElement editname;
	
	@FindBy(xpath = "//input[@name='customerName']")
	WebElement changename;
	
	@FindBy(xpath = "//input[@class='a-button-input']")
	WebElement savechange;

	public void youract() {
		youraccount.click();
	}

	public void loginandsecbtn() {
		loginandsecurit.click();
	}

	public void addads() {
		addaddress.click();
	}

	

	public void editbtn() {
		editname.click();
		Reporter.log("click on editing");
		//Assert.assertEquals(editname.isDisplayed(), true);
	}
	public void changenamebtn() {
		changename.clear();
		changename.sendKeys("kalyani");
		Reporter.log("Successfully editing");
		
	}

	public void savebtn() {
		savechange.click();
		Reporter.log("save changes");
		//Assert.assertEquals(savechange.isDisplayed(),true);
	}

	
	public Caseno_4_Editprofile(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

}
