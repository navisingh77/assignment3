package it7320.assignment31;

public class multiplyimplementation {
	multiplyinterface calc;

	public void setcalc(multiplyinterface mockobj) {

	}

	public void setCalc(multiplyinterface calc) {
		this.calc = calc;
	}

  public int multiply(int a, int b) {
		return calc.multiply(a,b);

	}
}
