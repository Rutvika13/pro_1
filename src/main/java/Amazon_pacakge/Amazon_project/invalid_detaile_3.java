package Amazon_pacakge.Amazon_project;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class invalid_detaile_3 
{

WebDriver driver;
//step 1

@FindBy(xpath="//span[@class='nav-action-inner']")
WebElement signin1;

@FindBy(xpath="//input[@name='email']")
WebElement un;

@FindBy(xpath="//span[@id='continue']")
WebElement contbtn;

@FindBy(xpath="//input[@name='password']")
WebElement password;

@FindBy(xpath="//input[@type='submit']")
WebElement signin2;



//step 2



public void username()
{
	un.sendKeys("kalyanimshende@gmail.com");
}


public void passw()
{
	password.sendKeys("kalyani@99"+Keys.ENTER);
	//Assert.assertEquals(password.isDisplayed(),false);
}


//step 3
public invalid_detaile_3(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
	
}

}



