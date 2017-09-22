package it7320.assignment31;
import static org.mockito.Mockito.*;

import junit.framework.TestCase;

public class multiplytest1 extends TestCase {
	multiplyimplementation obj;
	int a,b;
	protected void steup() throws Exception{
		obj =new multiplyimplementation();
		a=3;
		b=5;
		multiplyinterface mockobj =mock(multiplyinterface.class);
		when(mockobj.multiply(a, b)).thenReturn(a*b);
		obj.setCalc(mockobj);
	}
	public void multiply() {
		assertEquals(15,obj.multiply(a, b));}
		public void testmultiply() {
	
	obj=null;
	a=0;
	b=0;
	}
}
