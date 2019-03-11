package day02;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lianxi11 {
	@Test
	public void open() {
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="http://localhost:8080/Banksys_ssh/login.jsp";
		driver.get(url);
		driver.findElement(By.name("userNO")).sendKeys("1545622768146 ");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.id("loginValidate_0")).click();
		driver.switchTo().frame("leftFrame");
		driver.findElement(By.xpath("/html/body/p[3]/a/img")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainFrame");
		driver.findElement(By.name("money")).sendKeys("500");
		driver.findElement(By.id("fmoneyValidate_0")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("leftFrame");
		driver.findElement(By.xpath("/html/body/p[4]/a/img")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainFrame");
		String a=driver.findElement(By.xpath("/html/body/center")).getText();
		System.out.println(a);
		driver.switchTo().defaultContent();
		//第二次取款
		driver.switchTo().frame("leftFrame");
		driver.findElement(By.xpath("/html/body/p[3]/a/img")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainFrame");
		driver.findElement(By.name("money")).sendKeys("8500");
		driver.findElement(By.id("fmoneyValidate_0")).click();
		String c=driver.findElement(By.xpath("/html/body/center")).getText();
		System.out.println(c);
		driver.switchTo().defaultContent();
}}
