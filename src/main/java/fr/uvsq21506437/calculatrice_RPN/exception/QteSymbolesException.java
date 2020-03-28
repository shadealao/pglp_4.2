package fr.uvsq21506437.calculatrice_RPN.exception;

@SuppressWarnings("serial")
public class QteSymbolesException extends Exception {
	public QteSymbolesException() {
		super("Pas assez ou trop de symbole ==> Opération invalide");
	}
}
