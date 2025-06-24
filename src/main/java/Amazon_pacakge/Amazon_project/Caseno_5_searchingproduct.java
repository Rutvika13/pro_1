package Amazon_pacakge.Amazon_project;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.testng.Assert;

public class Caseno_5_searchingproduct
{
	
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	WebElement searchitem;
	

	@FindBy(xpath ="(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]")
	WebElement firstshoe;
	
	@FindBy(xpath ="//input[@id='buy-now-button']")
	WebElement buynow;
	
	

	
	
	public void search() {
		searchitem.sendKeys("shoe"+Keys.ENTER);
	}
	
	public void firstproduct() {
		firstshoe.click();
	}
	public void parenttochild(WebDriver driver) throws InterruptedException 
	{
		
		Set<String>ids=driver.getWindowHandles();
		Iterator<String> link=ids.iterator();
		String PI=link.next();
		String CI=link.next();
		System.out.println(PI);
		System.out.println(CI);
		Thread.sleep(3000);
		driver.switchTo().window(CI);
		
		
		//Assert.assertEquals(buynow.isDisplayed(), true);
	}
	
	public void bynwbtn() {
		buynow.click();
	}
public Caseno_5_searchingproduct (WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
	}


	
}
