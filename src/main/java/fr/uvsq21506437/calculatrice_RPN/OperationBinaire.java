package fr.uvsq21506437.calculatrice_RPN;

import fr.uvsq21506437.calculatrice_RPN.exception.DivisionZeroException;
import fr.uvsq21506437.calculatrice_RPN.exception.EstPileVideException;
import fr.uvsq21506437.calculatrice_RPN.exception.PilePleineException;

public class OperationBinaire implements Interpreteur {
	private final Action action;
	
	public OperationBinaire(Action action) {
		this.action = action;
	}
	
	
	@Override
	public void execute() {
		/* enclencher une exception ici */
	}
	
	@Override 
    public String execute(String s) {
    	/* enclencher une exception ici */
		return null;
    }

	@Override
	public <T> void operandes(T c) throws DivisionZeroException, EstPileVideException, PilePleineException {
		action.appliquerOp((char)c);
		
		
	}
	
	@Override
	public int getInt() {
		/* enclencher une exception ici */
		return 0;
	}

}
