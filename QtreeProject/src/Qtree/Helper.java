package Qtree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Helper {
	public WebDriver launchChrome()
    {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        return driver;
    }
	public WebDriver launchurl(WebDriver driver,String URL)
	{
			driver.get(URL);
			driver.manage().window().maximize();
			return driver;	
	}
	public void clickbutton(WebDriver driver, By element)
	{
		
		driver.findElement(element).click();
	}
//	public void waitclick(WebDriver driver, By element)
//	{
//		WebDriverWait waitW=new WebDriverWait(driver,20);
//		waitW.until(ExpectedConditions.elementToBeClickable(element));
//	}
//	public WebDriver login(WebDriver driver,By element,String textenter)
//	{
//		driver.findElement(element).sendKeys("gopi@gmail.com");
//		driver.findElement(element).sendKeys("123456");
//		return driver;
//	}
//	public void search(WebDriver driver,By element)
//	{
//		driver.findElement(element).sendKeys("Printed");
//	}
	public Actions action(WebDriver driver, By element)
	{
		Actions act=new Actions(driver);
		WebElement ele= driver.findElement(element);
		act.moveToElement(ele).build().perform();
		return act;
	}
	
	
	
	
}
