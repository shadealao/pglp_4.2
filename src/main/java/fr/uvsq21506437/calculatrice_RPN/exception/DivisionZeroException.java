package fr.uvsq21506437.calculatrice_RPN.exception;

@SuppressWarnings("serial")
public class DivisionZeroException extends Exception {
	public DivisionZeroException() {
		super("Division par zero impossible");
	}
}
