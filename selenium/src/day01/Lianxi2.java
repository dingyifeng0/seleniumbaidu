package day01;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lianxi2 {
@Test
public void open() {
	System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String url="https://www.v2ex.com";
	String url1="https://www.baidu.com";
	
	driver.get(url1);
	driver.get(url);
	driver.manage().window().maximize();
	driver.navigate().back();
	String title=driver.getTitle();
	System.out.println(title);
	driver.navigate().forward();
	String title1=driver.getTitle();
	System.out.println(title1);
}
}
