package day20;

public class Xueshen {
	private int gao;
	private String name;
	private int age;
	private String xingbie;
	public void setgao(int p) {
		 gao=p;
	}
	public int getgao() {
		return gao;
	}
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
	public void setage(int o) {
		age=o;
	}
	public int getage() {
		return age;
	}
	public void setxingbie(String xingbie) {
		this.xingbie=xingbie;
	}
	public String getxingbie() {
		return xingbie;
	}
	void gaiming(String m) {
		name=m;
		zhaohu();
	}
	void zhaohu() {
		System.out.println("��ã��ҽ�"+name+",����һ��"+age+"���"+xingbie+"���������Ϊ"+gao);
	}
	
}
