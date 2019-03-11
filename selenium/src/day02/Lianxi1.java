package day02;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Lianxi1 {
@Test
public void open() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String url="file:///E:/selenium/Ò³Ãæ/autotest.html";
	driver.get(url);
	driver.findElement(By.id("accountID")).sendKeys("¶¡Ò»·å");
	driver.findElement(By.id("passwordID")).sendKeys("123456");
	WebElement s=driver.findElement(By.id("areaID"));
	Select s1=new Select(s);
	s1.selectByIndex(1);
	driver.findElement(By.id("sexID1")).click();
	driver.findElement(By.id("u1")).click();
	driver.findElement(By.id("u2")).click();
	String u="C:\\Users\\24324\\Pictures\\Camera Roll\\9.jpg";
	driver.findElement(By.name("file")).sendKeys(u);
	driver.findElement(By.className("u16")).click();
	Alert alert=driver.switchTo().alert();
	Thread.sleep(1000);
	alert.accept();
	String url2=driver.getCurrentUrl();
	System.out.println(url2);
}
}
