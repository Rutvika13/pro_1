package Amazon_pacakge.Amazon_project;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Caseno_10_Addandremoveproduct
{	
	@FindBy(xpath ="(//span[@class='a-icon a-icon-small-add'])[1]")
	WebElement addquantity;
	
	@FindBy(xpath ="//input[@title='Add to Shopping Cart']")
	WebElement addtocart;
	
	@FindBy(xpath ="//span[@id='nav-cart-count']")
	WebElement gotocart;
	
	@FindBy(xpath ="//input[@data-action='delete-active']")
	WebElement delecttocart;

	
	
	
	public void parenttochild(WebDriver driver) 
	{
		Set<String>ids=driver.getWindowHandles();
		System.out.println(ids);
		
		Iterator<String>link= ids.iterator();
		String PI=link.next();
		String CI=link.next();
		System.out.println(PI);
		System.out.println(CI);
		driver.switchTo().window(CI);
	}
	
	public void addquantitybtn() 
	{
//		Select s1=new Select(addquantity);
//		s1.selectByValue("2");
		addquantity.click();
		
	}
	
	public void addtocartbtn() 
	{
		addtocart.click();
	}
	
	public void gotocartbtn() 
	{
		gotocart.click();
	}
	public void delecttocartbtn() 
	{
		delecttocart.click();
	}
public Caseno_10_Addandremoveproduct (WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
	}


	
}


