package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.ebay.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	WebElement ele = driver.findElement(By.xpath("//a[text()='Sports']"));
	
	Actions a=new Actions(driver);
	a.moveToElement(ele).perform();

	
	driver.findElement(By.xpath("//a[text()='Swimming']")).click();

	Thread.sleep(3000);
	driver.close();
	}

}
