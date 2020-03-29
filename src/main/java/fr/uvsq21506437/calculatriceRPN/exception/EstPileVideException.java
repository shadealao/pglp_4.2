package fr.uvsq21506437.calculatriceRPN.exception;

/**
 * Déclenchée lorsque La pile est vide.
 *
 */
@SuppressWarnings("serial")
public class EstPileVideException extends Exception {
	public EstPileVideException() {
		 super("la pile est vide ");
	 }

}
