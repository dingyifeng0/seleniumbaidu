package day20;
class onkey{
	public onkey(String s) {
		System.out.println(s);
	}
	public void speak() {
		System.out.println("����ѽѽ������");
	}
}
class people extends onkey{
	public people() {
		super("w");
		
	}
	public void speak(){
		System.out.println("С���ģ�������");
		super.speak();
	}
	public void think() {
		System.out.println("��˵��������˼��");
	}
}

public class Monkey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		people p=new people();
		p.speak();
		p.think();
		
	}

}
