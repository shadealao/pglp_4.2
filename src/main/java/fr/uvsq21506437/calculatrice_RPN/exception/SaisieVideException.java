package fr.uvsq21506437.calculatrice_RPN.exception;

@SuppressWarnings("serial")
public class SaisieVideException extends Exception{
	public SaisieVideException() {
		super("Il n'y a plus aucun élément à retirer de la pile");
	}

}
