package day20;
class student{
	String name;
	String sex;
	int age;
	public student() {
		name="lulu";
		sex="��";
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
		System.out.println("ѧ������"+name+"\r"+"�Ա�Ϊ��"+sex+"\r"+"����Ϊ��"+age);
	}
}
class graduatestudent extends student{
	String speciallity;
	String teacher;
	public graduatestudent() {
		super();
		speciallity="IT";
		teacher="��һ��";
	}
	public void outinfo() {
		super.outinfo();
		System.out.println("�о�����רҵΪ��"+speciallity+"\r"+"��ʦΪ��"+teacher);
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
		g.setname("��һ��");
		g.setage(18);
		
		if(g.getage()<20) {
			g.outinfo();
		}
		
		Class c=new Class();
		
		c.setschool("�����ȷ�");
		
	}

}
