package it7320.assignment31;
import static org.mockito.Mockito.*;

import junit.framework.TestCase;

public class Testsubtract extends TestCase {
	Calcimplementation11 obj;
	int a,b;
	protected void steup() throws Exception{
		obj =new Calcimplementation11 ();
		a=3;
		b=5;
		calcinterface1 mockobj =mock(calcinterface1.class);
		when(mockobj.subtract(a, b)).thenReturn(a-b);
		obj.setcalc(mockobj);
	}
	public void subtracttwonums() {
		assertEquals(-2,obj.subtract(a, b));}
		public void testadd() {
			
		}
	public  void subtract()
	{
		
	}
	
	protected void teardown() throws Exception {
	obj=null;
	a=0;
	b=0;
	}
}