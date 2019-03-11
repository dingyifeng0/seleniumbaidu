package day02;

import org.testng.annotations.Test;

public class Lianxi9 {
@Test
	public int add(int a,int b) {
		
		return a+b;
	}
@Test
	public int sub(int a,int b) {
		return a-b;
	}
@Test
	public int cheng(int a,int b) {
		return a*b;
	}
@Test
	public void chu(int a,int b) {
		if(a%3==0) {
			System.out.println(a);
		}else {
			System.out.println("这个数不能整除");
		}
		
	}
}

