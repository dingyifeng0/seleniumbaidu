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
	//����ַ
	driver.get(url);
//	//�������
//	driver.manage().window().maximize();
//	//�����������С
//	Dimension dimension= new Dimension(500,800);
//	driver.manage().window().setSize(dimension);
//	//ˢ��ҳ��
//	driver.navigate().refresh();
//	
//	driver.navigate().to(url1);
//	
//
//	//����ҳ��
//	driver.navigate().back();
//	//ִ�����ҳ��ص��ٶ�
//	//��ӡ����
//	String title=driver.getTitle();
//	System.out.println(title);
//	Thread.sleep(1000);
//	driver.navigate().forward();
//	//��ӡ����
//	String title1=driver.getTitle();
//	System.out.println(title1);
//	//��ӡ��ǰ��ַ
//	String url2=driver.getCurrentUrl();
//	System.out.println(url2);
	//����ҳ���HTML id���в���
	/*WebElement input=driver.findElement(By.id("kw"));
	input.sendKeys("����");
	WebElement buton=driver.findElement(By.id("su"));
	buton.click();*/
	
	driver.findElement(By.linkText("����")).click();
	//driver.findElement(By.partialLinkText("����һ���߹�")).click();
	/*Thread.sleep(2000);
	int a=driver.findElements(By.tagName("a")).size();
	System.out.println(a);*/
	driver.findElement(By.xpath("//*[@id=\"imgView\"]/a/img")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
