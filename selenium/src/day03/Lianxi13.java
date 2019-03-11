package day03;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Lianxi13 {
	WebDriver driver;
	String url;
	@BeforeClass
	public void kaishi() {
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		driver=new ChromeDriver();
		url="http://localhost:8080/Exam_ssh/";
	}
	@Test 
	public void a() throws InterruptedException {
		driver.get(url);
		driver.findElement(By.linkText("开始在线考试")).click();
		//driver.switchTo().frame("StudentLoginForm");
		driver.findElement(By.name("stuNumber")).sendKeys("123");
		driver.findElement(By.name("stuName")).sendKeys("213");
		driver.findElement(By.name("B1")).click();
		WebElement a=driver.findElement(By.name("examType"));
		Select s=new Select(a);
		s.selectByIndex(1);
		driver.findElement(By.name("start_b")).click();
		driver.findElement(By.name("questionOption")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[4]/td[2]/div/input[1]")).click();
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[4]/td[2]/div/input[2]")).click();
		Thread.sleep(3000);
	}
	@AfterClass
	public void uuu() {
		driver.close();
	}

}
