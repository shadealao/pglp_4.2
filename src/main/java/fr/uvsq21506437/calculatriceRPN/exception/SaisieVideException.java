package fr.uvsq21506437.calculatriceRPN.exception;

@SuppressWarnings("serial")
public class SaisieVideException extends Exception {
	public SaisieVideException() {
		super("Il n'y a plus aucun élément à retirer de la pile");
	}
}