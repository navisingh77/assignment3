package it7320.assignment31;

public class Calcimplementation11 {
	calcinterface1 calc;

	public void setcalc(calcinterface1 calc) {

	}

	public void setCalc(calcinterface1 calc) {
		this.calc = calc;
	}

	public int subtract(int a, int b) {
		return calc.subtract(a, b);

	}
}


