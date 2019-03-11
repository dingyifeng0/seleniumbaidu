package day02;

import java.io.File;
import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.io.FileHandler;

public class Lianxi8 {
@Test
public void open() throws IOException {
	/*
	 * 创建目录
	 */
	/*FileHandler.createDir(new File("f:\\pppppp"));*/
	//复制文件从什么地方复制到另一个地方
	//FileHandler.copy(new File("e:\\PPT"), new File ("f:\\pppppp"));
	//第二种方法复制文件
	//FileHandler.copy(new File("e:\\PPT"), new File ("f:\\pppppp"),".txt");
	FileHandler.delete(new File("f:\\pppppp"));
	FileHandler.readAsString(new File("e:/自动化测试"));
}
}
