package day02;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lianxi3 {
	@Test
	public void open() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String url="file:///E:/selenium/ҳ��/main.html";
	driver.get(url);
	/*driver.findElement(By.id("goo")).click();
	String[] handles = new String[driver.getWindowHandles().size()];
	driver.getWindowHandles().toArray(handles);
	WebDriver childWindow = driver.switchTo().window(handles[1]);
	Set<String>w=driver.getWindowHandles();
	Thread.sleep(2000);
	//����ھ�������У�ѡ��һ�����
	for(String handle:w) {
		driver.switchTo().window(handle);
	Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
		//ͨ�������жϣ�����ȡ��ҳ���Ƿ�������Ҫ��
		//���������Ҫ�ģ��ͶԸ�ҳ�棬���в���
		if("UIAutomation iFrame".equals(title)) {
			Thread.sleep(2000);
	driver.findElement(By.id("kw")).sendKeys("��ʺ");
	driver.findElement(By.id("su")).click();
	driver.findElement(By.xpath("//*[@id=\"1\"]/h3/a")).click();
	String[] handle = new String[driver.getWindowHandles().size()];
	driver.getWindowHandles().toArray(handle);
	WebDriver childWindo = driver.switchTo().window(handle[2]);
	driver.findElement(By.linkText("����")).click();*/
	driver.findElement(By.id("input1")).sendKeys("123");
	WebElement input=driver.findElement(By.id("div1"));
	System.out.println(input);
}}
