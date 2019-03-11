package day01;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lianxi1 {
@Test
	public void open() {
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="https://www.baidu.com";
		driver.get(url);
		String title=driver.getTitle();
		System.out.println(title);
		String title1=driver.getCurrentUrl();
		System.out.println(title1);
	}

}
