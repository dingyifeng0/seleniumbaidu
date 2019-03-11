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
	String url="file:///E:/selenium/ҳ��/frame.html";
	driver.get(url);
	driver.switchTo().frame(0);
	driver.findElement(By.id("input1")).sendKeys("123");
	driver.switchTo().defaultContent();
	String wen=driver.findElement(By.id("id1")).getText();
	System.out.println(wen);
	File jietu=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(jietu, new File("E:\\selenium\\ҳ��\\test.png"));
	}catch(IOException e) {
		e.printStackTrace();
		/*
		 * 1.����indexҳ��
		 * 2.�ҵ������
		 * 3.����Ҽ�
		 */
		driver.get(url);
		WebElement input=driver.findElement(By.id("user"));
		Actions a=new Actions(driver);
		/*a.contextClick(input).perform();
		Thread.sleep(3000);*/
		a.clickAndHold().perform();
		/*
		 * 1������indexҳ��
		 * 2.���wait��ť
		 * 3.���˫��
		 * 4.��ӡ���ֵ��ı�
		 */
		
		driver.get(url);
		WebElement wait=driver.findElement(By.linkText("wait"));
		Actions aa=new Actions(driver);
		aa.doubleClick(wait).perform();		
		/*
		 * 1.����indexҳ��
		 * 2.��λ��action��ť
		 * 3.������ƶ����ð�ť��
		 */
		String url1="file:///E:/selenium/ҳ��/index.html";
		driver.get(url1);
		WebElement aaa=driver.findElement(By.className("over"));
				Actions aaaa=new Actions(driver);
				aaaa.moveToElement(aaa).perform();
				String h=driver.findElement(By.id("over")).getText();
				System.out.println(h);
		
	}
	}
	
}

