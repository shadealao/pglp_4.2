package fr.uvsq21506437.calculatrice_RPN;

import fr.uvsq21506437.calculatrice_RPN.exception.ActionNonSupporteeException;

/** The Command for arreter la saisie */
public class Quit implements Interpreteur {
    private final Action action;

    public Quit(Action arretSuppr) {
        this.action = arretSuppr;
    }

    @Override // Command
    public void execute() {
    	action.arreter();
    }
   
    @Override 
    public String execute(String s)throws ActionNonSupporteeException {
		throw new ActionNonSupporteeException();
	}

	@Override
	public <T> void operandes(T d) throws ActionNonSupporteeException {
		throw new ActionNonSupporteeException();
	}
	
	@Override
	public int getInt() throws ActionNonSupporteeException {
		throw new ActionNonSupporteeException();
	}
}
