package day02;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lianxi2 {
@Test
public void open() throws InterruptedException {
	System.setProperty("webdriver.firfox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
	WebDriver driver=new FirefoxDriver();
	String url="file:///E:\\selenium\\页面\\index.html";
	driver.get(url);
	String dqjb=driver.getWindowHandle();
	WebElement iput=driver.findElement(By.className("open"));
	iput.click();
	//获取当前页面的所有句柄，当前有两个页面
	//所以用了一个字符串集合来接收两个句柄
	Set<String> w=driver.getWindowHandles();
	Thread.sleep(2000);
	//随机在句柄集合中，选择一个句柄
	for(String handle:w) {
		driver.switchTo().window(handle);
	Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
		//通过标题判断，所获取的页面是否是我想要的
		//如果是我想要的，就对该页面，进行操作
		if("UIAutomation iFrame".equals(title)) {
			Thread.sleep(2000);
			driver.findElement(By.className("baidu")).click();
			}
			driver.switchTo().window(dqjb);
			driver.findElement(By.id("user")).sendKeys("testing");
	/*String[] handles = new String[driver.getWindowHandles().size()];
	driver.getWindowHandles().toArray(handles);
	WebDriver childWindow = driver.switchTo().window(handles[1]);
	driver.findElement(By.id("user")).sendKeys("22");*/
	//第一种：括号中，直接写上frame标签的id或者name
	driver.switchTo().frame("aa");
	driver.findElement(By.id("user")).sendKeys("test");
	//第二种：通过frame的索引
	driver.switchTo().frame(0);
	driver.findElement(By.id("user")).sendKeys("test");
	//跳回到主页面，也有两种方式
	//跳回到父类页面
	//主页面---iframe--iframe
	//往上跳回一层
	driver.switchTo().parentFrame();
	//直接跳转到最外层
	driver.switchTo().defaultContent();
		}
	
	
}}

