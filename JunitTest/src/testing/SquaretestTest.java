package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquaretestTest {

	@Test
	public void test1() {
		Squaretest obj=new Squaretest();
		int c=obj.square(4);
	     assertEquals(16, c);
	}
      @Test
      public void test2() {
      Squaretest obj=new Squaretest();
      assertEquals(6.0,obj.add(2,5));
      
      }
}
