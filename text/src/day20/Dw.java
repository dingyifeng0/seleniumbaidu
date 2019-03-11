package day20;

	class D {
	int chang;
       void dongwu(){
    	   System.out.println("我会飞");
       }}
       class zhu extends D {
    	   String name="野猪";
    	  public void pp(){
    	   System.out.println("名字："+name+"\t"+"身长："+chang);}
    	  void dongwu() {
    		  System.out.println("我是站在风口的pig，所以你能上天。");
    	  }
       }
       public class Dw {
    	   public static void main(String[] args) {
    		   zhu d=new zhu();
    		  d.chang=10;
    		  d.dongwu();
    		  d.pp();
    	   }
       
}
