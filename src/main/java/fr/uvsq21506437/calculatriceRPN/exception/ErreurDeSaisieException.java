package fr.uvsq21506437.calculatriceRPN.exception;

@SuppressWarnings("serial")
public class ErreurDeSaisieException extends Exception {
	public ErreurDeSaisieException() {
		super("Saisissez des opérandes entre [0-9] et des opérations [+,-,*,/]");
	}
}
