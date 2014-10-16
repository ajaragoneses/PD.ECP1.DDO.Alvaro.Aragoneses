package es.upm.miw.pd.doo.colops;

public abstract class Operation {
	
	protected int operator1;
	protected int operator2;
	protected String simboloOperacion;

	public Operation(final int operator1, final int operator2) {
        this.operator1 = operator1;
        this.operator2 = operator2;
    }

    public int getOperator1() {
        return operator1;
    }

    public int getOperator2() {
        return operator2;
    }

    public abstract int operate();

    @Override
    public String toString() {
        return "[" + operator1 + simboloOperacion + operator2 + "]";
    }

}
