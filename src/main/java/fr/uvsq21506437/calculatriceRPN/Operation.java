package fr.uvsq21506437.calculatriceRPN;

import fr.uvsq21506437.calculatriceRPN.exception.DivisionZeroException;

public enum Operation {
	PLUS('+') { @Override public double eval(double x, double y) { return x + y; } },
    MOINS('-') { @Override public double eval(double x, double y) { return x - y; } },
    MULT('+'){ @Override public double eval(double x, double y) { return x * y; } },
    DIV('/') {
        @Override
        public double eval(double x, double y) throws DivisionZeroException {
            if(y == 0) throw new DivisionZeroException();
            return x / y;
        } 
    };
    
    private char symbole;
    
    private Operation(char symbole) {
		this.symbole = symbole;
	}

	public abstract double eval(double x, double y) throws DivisionZeroException;


	public char getSymbole() {
		return symbole;
	}

	public void setSymbole(char symbole) {
		this.symbole = symbole;
	}

}
