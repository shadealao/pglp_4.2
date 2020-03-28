package fr.uvsq21506437.calculatrice_RPN.exception;

@SuppressWarnings("serial")
public class ActionNonSupporteeException extends Exception{
	public ActionNonSupporteeException() {
		super("Cette action n'est pas supportée");
	}

}
