package fr.uvsq21506437.calculatrice_RPN;

import fr.uvsq21506437.calculatrice_RPN.exception.EstPileVideException;

/** The Command for annuler une saisie */
public class Undo implements Interpreteur {
    private final Action action;

    public Undo(Action arretSuppr) {
        this.action = arretSuppr;
    }

    @Override // Command
    public void execute() throws EstPileVideException {
    	/* enclencher une exception ici */
    }
    
    @Override 
    public String execute(String s) {
    	return action.annuler(s);
    }
    @Override
	public <T> void operandes(T d) {
		/* enclencher une exception ici */
	}
    
    @Override
	public int getInt() {
		/* enclencher une exception ici */
		return 0;
	}
}
