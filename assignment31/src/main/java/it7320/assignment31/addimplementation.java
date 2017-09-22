package it7320.assignment31;

public class addimplementation {
	addinterface calc;

	public void setcalc(addinterface mockobj) {

	}

	
	public void setCalc(addinterface calc) {
		this.calc = calc;
	}



	public int add(int a, int b) {
		return calc.add(a, b);

	}
}
