package day20;

	class D {
	int chang;
       void dongwu(){
    	   System.out.println("�һ��");
       }}
       class zhu extends D {
    	   String name="Ұ��";
    	  public void pp(){
    	   System.out.println("���֣�"+name+"\t"+"����"+chang);}
    	  void dongwu() {
    		  System.out.println("����վ�ڷ�ڵ�pig�������������졣");
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
