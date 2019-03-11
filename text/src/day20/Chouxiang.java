package day20;
abstract class dongwu{
	abstract public void eat();
}
class cat extends dongwu{
	public void eat() {
		System.out.println("√®≥‘”„");
	}
}
class dog extends dongwu{
	public void eat() {
		System.out.println("π∑≥‘π«Õ∑");
	}
}
public class Chouxiang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
cat a=new cat();
dog d=new dog();
a.eat();
d.eat();
	}

}
