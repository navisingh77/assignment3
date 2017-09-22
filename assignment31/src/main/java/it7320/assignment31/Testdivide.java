package it7320.assignment31;
import static org.mockito.Mockito.*;

import junit.framework.TestCase;

public class Testdivide extends TestCase {
	divideimplementation obj;
	int a,b;
	protected void steup() throws Exception{
		obj =new divideimplementation ();
		a=3;
		b=5;
		divideinterface mockobj =mock(divideinterface.class);
		when(mockobj.divide(a, b)).thenReturn((double)a/ (double)b);
		obj.setCalc(mockobj);
	}
	public void divide1()
	{
		assertEquals(.6 ,a/b);
		}
		public void testdivide() {
			
		}
	public  void divide()
	{
		
	}
	
	protected void teardown() throws Exception {
	obj=null;
	a=0;
	b=0;
	}
}