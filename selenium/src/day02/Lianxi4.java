package day02;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Lianxi4 {
@Test
public void open() throws InterruptedException {
	WebDriver driver = null;
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
	 driver=new ChromeDriver();
	String url="file:///E:/selenium/页面/frame.html";
	driver.get(url);
	driver.switchTo().frame(0);
	driver.findElement(By.id("input1")).sendKeys("123");
	driver.switchTo().defaultContent();
	String wen=driver.findElement(By.id("id1")).getText();
	System.out.println(wen);
	File jietu=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(jietu, new File("E:\\selenium\\页面\\test.png"));
	}catch(IOException e) {
		e.printStackTrace();
		/*
		 * 1.进入index页面
		 * 2.找到输入框
		 * 3.点击右键
		 */
		driver.get(url);
		WebElement input=driver.findElement(By.id("user"));
		Actions a=new Actions(driver);
		/*a.contextClick(input).perform();
		Thread.sleep(3000);*/
		a.clickAndHold().perform();
		/*
		 * 1。进入index页面
		 * 2.点击wait按钮
		 * 3.点击双击
		 * 4.打印出现的文本
		 */
		
		driver.get(url);
		WebElement wait=driver.findElement(By.linkText("wait"));
		Actions aa=new Actions(driver);
		aa.doubleClick(wait).perform();		
		/*
		 * 1.进入index页面
		 * 2.定位到action按钮
		 * 3.把鼠标移动到该按钮上
		 */
		String url1="file:///E:/selenium/页面/index.html";
		driver.get(url1);
		WebElement aaa=driver.findElement(By.className("over"));
				Actions aaaa=new Actions(driver);
				aaaa.moveToElement(aaa).perform();
				String h=driver.findElement(By.id("over")).getText();
				System.out.println(h);
		
	}
	}
	
}

