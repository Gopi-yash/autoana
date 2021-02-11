package Qtree;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class Logics extends Helper{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logics obj2=new Logics();
		PageEco obj3=new PageEco();
		WebDriver driver=obj2.launchChrome();
		obj2.launchurl(driver, "http://automationpractice.com/index.php");
		obj2.clickbutton(driver, obj3.Tshirt);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().back();
		obj2.action(driver, obj3.women);
		obj2.clickbutton(driver, obj3.eveningdress);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,800)");
		obj2.clickbutton(driver, obj3.addcart);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);
		obj2.clickbutton(driver, obj3.quantity);
		obj2.clickbutton(driver, obj3.productsubmit);
		addcart(driver);
		obj2.action(driver, obj3.cartbutton);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		obj2.clickbutton(driver, obj3.cartsubmitbutton);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		 js1.executeScript("window.scrollBy(0,300)");
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 obj2.clickbutton(driver, obj3.continueshopping);
		 
		
		
		
	
		
		
		
		

	}
	public static void addcart(WebDriver driver)
	{
		Logics obj2=new Logics();
		PageEco obj3=new PageEco();
		String parents=driver.getWindowHandle();
		Set<String> handle=driver.getWindowHandles();
		for(String handles : handle)
		{
			if (handles.equalsIgnoreCase(parents))
			{
				driver.switchTo().window(parents);
				obj2.clickbutton(driver, obj3.proceedcheck);
			}
		}
		
	}

}
