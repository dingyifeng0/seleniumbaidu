package day01;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Lianxi4 {
@Test
public void open() {
	System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String url="http://localhost:8080/mobile_mysql/fg-memberRegister.jsp";
	driver.get(url);
	driver.findElement(By.linkText("注册")).click();
	WebElement name=driver.findElement(By.name("name"));
	name.sendKeys("baba");
	WebElement mima=driver.findElement(By.name("password"));
	mima.sendKeys("123456");
	WebElement mima1=driver.findElement(By.name("passwordOne"));
	mima1.sendKeys("123456");
	WebElement name1=driver.findElement(By.name("reallyName"));
	name1.sendKeys("成龙");
	WebElement age=driver.findElement(By.name("age"));
	age.sendKeys("20");
	WebElement zhiye=driver.findElement(By.name("profession"));
	zhiye.sendKeys("学生");
	WebElement email=driver.findElement(By.name("email"));
	email.sendKeys("858499@163.com");
	WebElement question=driver.findElement(By.name("question"));
	question.sendKeys("你是不是猪");
	WebElement question1=driver.findElement(By.name("result"));
	question1.sendKeys("是");
	//driver.findElement(By.className("input1")).click();
	WebElement buton=driver.findElement(By.className("input1"));
	buton.click();
	//按照索引来选，第一个选择的内容从0开始
	WebElement s=driver.findElement(By.id("moreSent"));
	Select s1=new Select(s);
	s1.selectByIndex(3);
	//第二种方式by  value
	s1.selectByValue("xiaomi");
	//第三种方式通过可见的值
	s1.selectByVisibleText("huawei");
	//点击alert
	WebElement a1=driver.findElement(By.className(""));
	a1.click();
	//从浏览器跳转到弹出框上去
	Alert alert=driver.switchTo().alert();
	//点击弹框中的确定
	alert.accept();
	//点击弹框中的取消
	alert.dismiss();
}
}
