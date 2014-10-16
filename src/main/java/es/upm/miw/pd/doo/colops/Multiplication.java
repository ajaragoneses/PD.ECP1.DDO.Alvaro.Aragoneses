package es.upm.miw.pd.doo.colops;

public class Multiplication extends Operation {

	public Multiplication(int operator1, int operator2) {
		super(operator1, operator2);
		this.simboloOperacion= "*";
	}

	@Override
	public int operate() {
		return this.operator1 * this.operator2;
	}

}
