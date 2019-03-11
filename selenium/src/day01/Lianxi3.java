package day01;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Lianxi3 {
	@Test
	public void zuoye() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="http://localhost:8080/mobile_mysql/index.jsp";
		driver.get(url);
		WebElement input=driver.findElement(By.name("name"));
		input.sendKeys("丁一峰");
		WebElement input1=driver.findElement(By.name("password"));
		input1.sendKeys("123456");
		driver.findElement(By.className("input1")).click();
		driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[2]/table[3]/tbody/tr/td/table[1]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[4]/td/a")).click();
		/*String url1="http://localhost:8080/mobile_mysql/goodsAction.do?action=16&id=8";
		driver.get(url1);*/
		String[] handles = new String[driver.getWindowHandles().size()];
		driver.getWindowHandles().toArray(handles);
		WebDriver childWindow = driver.switchTo().window(handles[1]);
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[4]/td/input")).click();
		Alert alert=driver.switchTo().alert();
		Thread.sleep(1000);
		alert.accept();
		WebDriver childWindo = driver.switchTo().window(handles[0]);
		driver.findElement(By.linkText("购物车")).click();
		driver.findElement(By.linkText("去收银台结账")).click();
		driver.findElement(By.name("address")).sendKeys("先锋");
		driver.findElement(By.name("tel")).sendKeys("123456789");
		WebElement s=driver.findElement(By.name("setMoney"));
		Select s1=new Select(s);
		s1.selectByIndex(3);
		WebElement s3=driver.findElement(By.name("post"));
		Select s2=new Select(s3);
		s2.selectByIndex(2);
		driver.findElement(By.name("bz")).sendKeys("不快不给钱");
		driver.findElement(By.name("Submit2")).click();
		Thread.sleep(1000);
		Alert aler=driver.switchTo().alert();
		Thread.sleep(1000);
		aler.accept();
		
	}

	
	
}
