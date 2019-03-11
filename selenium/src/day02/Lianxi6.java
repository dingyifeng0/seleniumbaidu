package day02;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Lianxi6 {
@Test
public void open() {
	System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String url="https:\\www.baidu.com";
	driver.get(url);
	WebElement q=driver.findElement(By.className("bri"));
	Actions p=new Actions(driver);
	p.moveToElement(q).perform();
	driver.findElement(By.className("bdbriimgitem_3")).click();
	
	
}
}
