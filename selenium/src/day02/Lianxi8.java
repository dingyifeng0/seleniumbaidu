package day02;

import java.io.File;
import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.io.FileHandler;

public class Lianxi8 {
@Test
public void open() throws IOException {
	/*
	 * ����Ŀ¼
	 */
	/*FileHandler.createDir(new File("f:\\pppppp"));*/
	//�����ļ���ʲô�ط����Ƶ���һ���ط�
	//FileHandler.copy(new File("e:\\PPT"), new File ("f:\\pppppp"));
	//�ڶ��ַ��������ļ�
	//FileHandler.copy(new File("e:\\PPT"), new File ("f:\\pppppp"),".txt");
	FileHandler.delete(new File("f:\\pppppp"));
	FileHandler.readAsString(new File("e:/�Զ�������"));
}
}
