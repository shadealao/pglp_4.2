package fr.uvsq21506437.calculatriceRPN;

import fr.uvsq21506437.calculatriceRPN.exception.ActionNonSupporteeException;
import fr.uvsq21506437.calculatriceRPN.exception.SaisieVideException;

/** The Command for annuler une saisie. */
public class Undo implements Interpreteur {
    private final Action action;

    public Undo(Action arretSuppr) {
        this.action = arretSuppr;
    }

    @Override // Command
    public void execute()throws ActionNonSupporteeException {
		throw new ActionNonSupporteeException();
	}
    
    @Override 
    public String execute(String s) throws SaisieVideException {
    	return action.annuler(s);
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
	public int getInt()throws ActionNonSupporteeException {
		throw new ActionNonSupporteeException();
	} 
}
