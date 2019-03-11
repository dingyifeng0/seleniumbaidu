package day01;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class openliulanqi {
@Test
public void open() throws InterruptedException {
	//System.setProperty("webdriver.firfox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
	//WebDriver driver=new FirefoxDriver();
	System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String url="https://www.baidu.com";
	String url1="https://www.163.com";
	//打开网址
	driver.get(url);
//	//窗口最大化
//	driver.manage().window().maximize();
//	//设置浏览器大小
//	Dimension dimension= new Dimension(500,800);
//	driver.manage().window().setSize(dimension);
//	//刷新页面
//	driver.navigate().refresh();
//	
//	driver.navigate().to(url1);
//	
//
//	//后退页面
//	driver.navigate().back();
//	//执行完后，页面回到百度
//	//打印标题
//	String title=driver.getTitle();
//	System.out.println(title);
//	Thread.sleep(1000);
//	driver.navigate().forward();
//	//打印标题
//	String title1=driver.getTitle();
//	System.out.println(title1);
//	//打印当前网址
//	String url2=driver.getCurrentUrl();
//	System.out.println(url2);
	//利用页面的HTML id进行操作
	/*WebElement input=driver.findElement(By.id("kw"));
	input.sendKeys("梁猪");
	WebElement buton=driver.findElement(By.id("su"));
	buton.click();*/
	
	driver.findElement(By.linkText("新闻")).click();
	//driver.findElement(By.partialLinkText("我们一起走过")).click();
	/*Thread.sleep(2000);
	int a=driver.findElements(By.tagName("a")).size();
	System.out.println(a);*/
	driver.findElement(By.xpath("//*[@id=\"imgView\"]/a/img")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
