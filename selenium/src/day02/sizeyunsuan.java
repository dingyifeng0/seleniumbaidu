package day02;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.junit.Assert;
import org.testng.annotations.AfterClass;

public class sizeyunsuan {
	Lianxi9 y=new Lianxi9();
  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeclass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterclass");
	 
  }


  @Test
  public void add() {
	  int result=y.add(8,9);
	Assert.assertEquals(result, 17); 
	  
  }

  
  @Test
  public void chu() {
	 y.chu(7,0);
   }

  @Test
  public void sub() {
	  int result=y.sub(8,9);
		Assert.assertEquals(result, -1); 
   }
  @Test
  public void cheng() {
	  int result=y.cheng(8,9);
		Assert.assertEquals(result, 72); 
   }

}
