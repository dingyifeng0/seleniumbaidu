package day20;
class student{
	String name;
	String sex;
	int age;
	public student() {
		name="lulu";
		sex="男";
		age=20;
	}
	public void setname(String a) {
		name=a;
	}
	public void setage(int a) {
		age=a;
	}
	public int getage() {
		return age;
	}
	public void outinfo() {
		System.out.println("学生名："+name+"\r"+"性别为："+sex+"\r"+"年龄为："+age);
	}
}
class graduatestudent extends student{
	String speciallity;
	String teacher;
	public graduatestudent() {
		super();
		speciallity="IT";
		teacher="丁一峰";
	}
	public void outinfo() {
		super.outinfo();
		System.out.println("研究生的专业为："+speciallity+"\r"+"导师为："+teacher);
		}
	
}
public class Class {
	static String schoolname;
	public void setschool(String a) {
		this.schoolname=a;
		System.out.println(this.schoolname);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		graduatestudent g=new graduatestudent();
		g.setname("丁一峰");
		g.setage(18);
		
		if(g.getage()<20) {
			g.outinfo();
		}
		
		Class c=new Class();
		
		c.setschool("江西先锋");
		
	}

}
