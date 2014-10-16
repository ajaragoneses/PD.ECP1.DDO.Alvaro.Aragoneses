package es.upm.miw.pd.doo.colops;

public class Subtraction extends Operation{

	public Subtraction(int operator1, int operator2) {
		super(operator1, operator2);
		this.simboloOperacion = "-";
	}

	@Override
	public int operate() {
		return this.operator1 - this.operator2;
	}
}
