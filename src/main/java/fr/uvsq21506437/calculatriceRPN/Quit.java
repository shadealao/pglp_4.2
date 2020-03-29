package fr.uvsq21506437.calculatriceRPN;

import fr.uvsq21506437.calculatriceRPN.exception.ActionNonSupporteeException;

/** The Command for arreter la saisie. */
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
	public void operandes(double d) throws ActionNonSupporteeException {
		throw new ActionNonSupporteeException();
		//action.afficheoperandes();
	}
	
	@Override
	public void operation(char c) throws ActionNonSupporteeException {
		throw new ActionNonSupporteeException();
	}
	
	@Override
	public int getInt() throws ActionNonSupporteeException {
		throw new ActionNonSupporteeException();
	}
}
