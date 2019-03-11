package day20;
class onkey{
	public onkey(String s) {
		System.out.println(s);
	}
	public void speak() {
		System.out.println("咿咿呀呀。。。");
	}
}
class people extends onkey{
	public people() {
		super("w");
		
	}
	public void speak(){
		System.out.println("小样的，不错嘛");
		super.speak();
	}
	public void think() {
		System.out.println("别说话，认真思考");
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
