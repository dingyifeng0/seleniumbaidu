package day02;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Lianxi7 {
@Test
public void open() throws AWTException, InterruptedException {
	/*
	 * 1.������ַ
	 * 2.�϶���ɫ����
	 * 3.����һ������
	 */
	System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String url="file:///E:/selenium/ҳ��/index.html";
	driver.get(url);
	/*WebElement f=driver.findElement(By.id("drag"));
	//WebElement mubiao=driver.findElement(By.xpath("/html/body/h1"));
	Actions aa=new Actions(driver);
	//aa.clickAndHold(f).moveToElement(mubiao).release(f).perform();
	//�����������϶�����λ��
	aa.dragAndDropBy(f, -200, -30).perform();*/
	/*WebElement select=driver.findElement(By.id("selectWithMultipleEqualsMultiple"));
	List<WebElement> option=select.findElements(By.tagName("option"));
	Actions a=new Actions(driver);*/
	/*a.keyDown(Keys.CONTROL).
	click(option.get(2)).perform();	*/

/*	a.keyDown(Keys.SHIFT).
	click(option.get(0)).
	click(option.get(2)).perform();*/
	/*
	 * 1.������ַ
	 * 2.���Ctrl+s
	 * 3.���ȡ��
	 */
	WebElement aaa=driver.findElement(By.id("user"));
//���Ctrl
	Robot w=new Robot();
	//���ctrl
	w.keyPress(KeyEvent.VK_ALT);
	//���s
	w.keyPress(KeyEvent.VK_F4);
	//�ſ�s
	/*w.keyRelease(KeyEvent.VK_W);
	//�ſ�Ctrl
	w.keyRelease(KeyEvent.VK_WINDOWS);*/
	w.keyPress(KeyEvent.VK_ENTER);
	/*Thread.sleep(2000);
	w.keyPress(KeyEvent.VK_ESCAPE);
	Thread.sleep(2000);*/
	
}
}
