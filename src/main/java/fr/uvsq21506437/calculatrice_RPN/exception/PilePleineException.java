package fr.uvsq21506437.calculatrice_RPN.exception;

@SuppressWarnings("serial")
public class PilePleineException extends Exception {
	public PilePleineException() {
		super("La pile est pleine !!");
	}

}
