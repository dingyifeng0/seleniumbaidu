package day03;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

public class Lianxi12 {
	WebDriver driver;
	String url;
	@BeforeClass
	public void kaishi() {
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		driver=new ChromeDriver();
		url="http://localhost:8080/Exam_ssh/admin.do";
	}
	@Test  //登录
	public void a() {
		
		//打开网址
		driver.get(url);
		//输入用户
		driver.findElement(By.name("name")).sendKeys("admin");
		//输入密码
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("B1")).click();}
	@Test
	public void b() {
		//点击添加考试类型
		driver.findElement(By.linkText("添加考试类型")).click();
		driver.findElement(By.id("testName")).sendKeys("智商考试");
		driver.findElement(By.id("testTime")).sendKeys("90");
		driver.findElement(By.name("submit")).click();}
	@Test
	public void c() {
		//点击添加试题
		driver.findElement(By.linkText("添加试题")).click();
		driver.findElement(By.id("title")).sendKeys("你是不是傻");
		
		//选择题目难度
		WebElement a=driver.findElement(By.name("examType"));
		Select s1=new Select(a);
		s1.selectByIndex(2);
		//选择分数
		WebElement w=driver.findElement(By.id("score"));
		Select s2=new Select(w);
		s2.selectByIndex(9);
		//选择单选
		WebElement q=driver.findElement(By.id("note"));
		Select s3=new Select(q);
		s3.selectByIndex(0);
		driver.findElement(By.id("choices")).sendKeys("1.是:2.不是");
		driver.findElement(By.id("standardAnswer")).sendKeys("1.是");
		driver.findElement(By.name("submit")).click();}
	@Test
	public void d() {
		//浏览试题并打印
		driver.findElement(By.linkText("浏览全部试题")).click();
		String c=driver.findElement(By.xpath("/html/body/div/table[1]/tbody/tr[2]/td[2]")).getText();
		System.out.println(c);}
	@Test
	public void e() {
		//添加考生信息
		driver.findElement(By.linkText("添加考生数据")).click();
		driver.findElement(By.id("id")).sendKeys("123456");
		driver.findElement(By.id("realname")).sendKeys("123456");
		driver.findElement(By.id("className")).sendKeys("123456");
		driver.findElement(By.id("phone")).sendKeys("123456");
		driver.findElement(By.id("humanId")).sendKeys("123456");
		driver.findElement(By.id("email")).sendKeys("123456");
		driver.findElement(By.id("address")).sendKeys("123456");
		driver.findElement(By.id("stuNumber")).sendKeys("123456");
		driver.findElement(By.className("Sborder")).click();}
	@Test
	public void f() {
		//浏览全部学生并打印
		driver.findElement(By.linkText("浏览全部考生")).click();
		String r=driver.findElement(By.xpath("/html/body/div/table[1]/tbody/tr[2]/td[2]")).getText();
		System.out.println(r);}
@AfterClass
		public void aa() {
		driver.close();
	}
	
}
