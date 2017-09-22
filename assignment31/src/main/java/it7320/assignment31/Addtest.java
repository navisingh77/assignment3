package it7320.assignment31;
import static org.mockito.Mockito.*;

import junit.framework.TestCase;

public class Addtest extends TestCase {
	addimplementation obj;
	int a,b;
	protected void steup() throws Exception{
		obj =new addimplementation ();
		a=3;
		b=5;
		addinterface mockobj =mock(addinterface.class);
		when(mockobj.add(a, b)).thenReturn(a+b);
		obj.setcalc(mockobj);
	}
	public void addtwonums() {
		assertEquals(8,obj.add(a, b));}
		public void testadd() {
	}
		protected void teardown() throws Exception {
			
	obj=null;
	a=0;
	b=0;
	}
}
