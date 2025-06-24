package Amazon_pacakge.Amazon_project;


import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class TestListners1  implements ITestListener
{
	public static WebDriver driver;

	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println("New test started"+  result.getName());
//		Date d1=new Date();
//	    System.out.println(d1.getTime());
//	    
//	    Date d2 =new Date(d1.getTime()+(60*60*1000*24*5));
//	   System.out.println(d2);
//	   String f1=d2.toString();
//	   String year=f1.substring(f1.length()-4);
//	   System.out.println(year);
//	   String month=f1.substring(4,7);
//	   String date=f1.substring(8,10);
//	   String day=f1.substring(0,3);
//	   String hours=f1.substring(11,13);
//	   String min=f1.substring(14,16);   
//	   String sec=f1.substring(17,19);
//	   
//	     String f2=date.concat(month).concat(year);
//	     System.out.println(f2);
//	     String f3=date.concat("").concat(day).concat("").concat(f2).concat("").concat(hours).concat("").concat(min).concat("").concat(sec);
//	   System.out.println(f3);
		 Object testClass = result.getInstance();
	     WebDriver driver = ((Basepage) testClass).driver;
		

		try {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File Destination=ts.getScreenshotAs(OutputType.FILE);
		File Source = new File("C:\\Users\\DELL\\eclipse-workspace\\Amazon_project\\target\\Screenshots\\pass" +".png" );
		
			FileHandler.copy(Destination, Source);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void onTestSuccess(ITestResult result) {
	
		Object testClass = result.getInstance();
	     WebDriver driver =( (Basepage)testClass).driver;
		
		System.out.println("Test successful"+result.getName());
		Date d1=new Date();
	    System.out.println(d1.getTime());
	    
	    Date d2 =new Date(d1.getTime()+(60*60*1000*24*5));
	   System.out.println(d2);
	   String f1=d2.toString();
	   String year=f1.substring(f1.length()-4);
	   System.out.println(year);
	   String month=f1.substring(4,7);
	   String date=f1.substring(8,10);
	   String day=f1.substring(0,3);
	   String hours=f1.substring(11,13);
	   String min=f1.substring(14,16);   
	   String sec=f1.substring(17,19);
	   
	     String f2=date.concat(month).concat(year);
	     System.out.println(f2);
	     String f3=date.concat("").concat(day).concat("").concat(f2).concat("").concat(hours).concat("").concat(min).concat("").concat(sec);
	   System.out.println(f3);
	   
	   
		TakesScreenshot ts = (TakesScreenshot) driver;
		File Destination=ts.getScreenshotAs(OutputType.FILE);
		File Source = new File("C:\\Users\\DELL\\eclipse-workspace\\Amazon_project\\target\\Screenshots\\pass"+new TestListners1().getClass()+f3+".png" );
		try {
			FileHandler.copy(Destination, Source);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test failure"+result.getName());
//		Date d1=new Date();
//	    System.out.println(d1.getTime());
//	    
//	    Date d2 =new Date(d1.getTime()+(60*60*1000*24*5));
//	   System.out.println(d2);
//	   String f1=d2.toString();
//	   String year=f1.substring(f1.length()-4);
//	   System.out.println(year);
//	   String month=f1.substring(4,7);
//	   String date=f1.substring(8,10);
//	   String day=f1.substring(0,3);
//	   String hours=f1.substring(11,13);
//	   String min=f1.substring(14,16);   
//	   String sec=f1.substring(17,19);
//	   
//	     String f2=date.concat(month).concat(year);
//	     System.out.println(f2);
//	     String f3=date.concat("").concat(day).concat("").concat(f2).concat("").concat(hours).concat("").concat(min).concat("").concat(sec);
//	   System.out.println(f3);
	   
//	   
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File Destination=ts.getScreenshotAs(OutputType.FILE);
//		File Source = new File("C:\\Users\\DELL\\eclipse-workspace\\Amazon_project\\target\\Screenshots\\fail" +new TestListners1().getClass()+result+".png" );
//		try {
//			FileHandler.copy(Destination, Source);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		
		
		}
		
	

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped"+result.getName());
		
	}

	

	@Override
	public void onTestFailedWithTimeout(ITestResult result) 
	{
		System.out.println("Test failure with timeout"+result.getName());
		
	}

	@Override
	public void onStart(ITestContext context) 
	{
		System.out.println("Test on start"+ context.getName());
		
	}
	
	
	}