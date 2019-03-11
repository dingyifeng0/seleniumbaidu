package day02;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Lianxi5 {
@Test
public void open() throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	 String url="https:\\www.baidu.com";
	 driver.get(url);
	 WebElement input=driver.findElement(By.className("s_ipt"));
	 Actions a=new Actions(driver);
	 a.contextClick(input).perform();
	 Thread.sleep(3000);
	 File jietu=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(jietu, new File("E:\\selenium\\Ò³Ãæ\\tt.png"));
		}catch(IOException e) {
			e.printStackTrace();
	 
}
}}
