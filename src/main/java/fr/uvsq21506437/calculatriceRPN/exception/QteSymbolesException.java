package fr.uvsq21506437.calculatriceRPN.exception;

@SuppressWarnings("serial")
public class QteSymbolesException extends Exception {
	public QteSymbolesException() {
		super("Pas assez ou trop de symbole ==> Opération invalide");
	}
}
