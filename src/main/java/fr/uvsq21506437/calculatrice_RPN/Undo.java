package fr.uvsq21506437.calculatrice_RPN;

import fr.uvsq21506437.calculatrice_RPN.exception.ActionNonSupporteeException;
import fr.uvsq21506437.calculatrice_RPN.exception.EstPileVideException;
import fr.uvsq21506437.calculatrice_RPN.exception.SaisieVideException;

/** The Command for annuler une saisie */
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
	public <T> void operandes(T d)throws ActionNonSupporteeException {
		throw new ActionNonSupporteeException();
	}
    
    @Override
	public int getInt()throws ActionNonSupporteeException {
		throw new ActionNonSupporteeException();
	} 
}
