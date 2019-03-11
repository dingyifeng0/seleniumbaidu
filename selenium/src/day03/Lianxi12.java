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
	@Test  //��¼
	public void a() {
		
		//����ַ
		driver.get(url);
		//�����û�
		driver.findElement(By.name("name")).sendKeys("admin");
		//��������
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("B1")).click();}
	@Test
	public void b() {
		//�����ӿ�������
		driver.findElement(By.linkText("��ӿ�������")).click();
		driver.findElement(By.id("testName")).sendKeys("���̿���");
		driver.findElement(By.id("testTime")).sendKeys("90");
		driver.findElement(By.name("submit")).click();}
	@Test
	public void c() {
		//����������
		driver.findElement(By.linkText("�������")).click();
		driver.findElement(By.id("title")).sendKeys("���ǲ���ɵ");
		
		//ѡ����Ŀ�Ѷ�
		WebElement a=driver.findElement(By.name("examType"));
		Select s1=new Select(a);
		s1.selectByIndex(2);
		//ѡ�����
		WebElement w=driver.findElement(By.id("score"));
		Select s2=new Select(w);
		s2.selectByIndex(9);
		//ѡ��ѡ
		WebElement q=driver.findElement(By.id("note"));
		Select s3=new Select(q);
		s3.selectByIndex(0);
		driver.findElement(By.id("choices")).sendKeys("1.��:2.����");
		driver.findElement(By.id("standardAnswer")).sendKeys("1.��");
		driver.findElement(By.name("submit")).click();}
	@Test
	public void d() {
		//������Ⲣ��ӡ
		driver.findElement(By.linkText("���ȫ������")).click();
		String c=driver.findElement(By.xpath("/html/body/div/table[1]/tbody/tr[2]/td[2]")).getText();
		System.out.println(c);}
	@Test
	public void e() {
		//��ӿ�����Ϣ
		driver.findElement(By.linkText("��ӿ�������")).click();
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
		//���ȫ��ѧ������ӡ
		driver.findElement(By.linkText("���ȫ������")).click();
		String r=driver.findElement(By.xpath("/html/body/div/table[1]/tbody/tr[2]/td[2]")).getText();
		System.out.println(r);}
@AfterClass
		public void aa() {
		driver.close();
	}
	
}
