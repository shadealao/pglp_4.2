package fr.uvsq21506437.calculatriceRPN.exception;

@SuppressWarnings("serial")
public class ActionNonSupporteeException extends Exception{
	public ActionNonSupporteeException() {
		super("Cette action n'est pas supportée");
	}

}
