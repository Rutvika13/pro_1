package Amazon_pacakge.Amazon_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Homepage

	{
	WebDriver driver;
		//step 1
	@FindBy(xpath="//span[@class='nav-action-inner']")
	WebElement signin1;
	
		@FindBy(xpath="//input[@name='email']")
		WebElement un;
		
		@FindBy(xpath="//span[@id='continue']")
		WebElement contbtn;
		
		@FindBy(xpath="//input[@type='password']")
		WebElement pwd;
		
		@FindBy(xpath="//a[@class='nav-a']")
		WebElement newuser;
		
		@FindBy(xpath="//input[@type='submit']")
		WebElement signin2;
		
		
		
		//step 2
		
		public void login()
		{
			signin1.click();
			Reporter.log("Successful signin1");
		}
		public void newuserbtn()
		{
			newuser.click();
			Reporter.log("signin new user");
		}
		public void username()
		{
			un.sendKeys("7066328484");
			Reporter.log("Enter the username");
		}
		public void continebtn()
		{
			contbtn.click();
			Reporter.log("Cliking continue");
			
		}
		
		public void passw() throws InterruptedException
		{Thread.sleep(1000);
			pwd.sendKeys("kalyani@90");
			Reporter.log("Entering password");
			
		}

		public void finalsigning()
		{
			signin2.click();
			Reporter.log("Successful login in");
			
		}
		
		public void usernameforlogin(String username)
		{
			un.sendKeys(username);
			Reporter.log("Enter the username");
		}
		
		public void passwordforlogin(String password)
		{
			pwd.sendKeys(password);
			Reporter.log("Enter the username");
		}
		//step 3
		public Homepage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			Reporter.log("successful done step 3");
		}
		
	}


