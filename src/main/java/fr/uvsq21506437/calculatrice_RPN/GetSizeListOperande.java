package fr.uvsq21506437.calculatrice_RPN;

import fr.uvsq21506437.calculatrice_RPN.exception.DivisionZeroException;
import fr.uvsq21506437.calculatrice_RPN.exception.EstPileVideException;
import fr.uvsq21506437.calculatrice_RPN.exception.PilePleineException;

public class GetSizeListOperande implements Interpreteur{
	private final Action action; 
	
	public GetSizeListOperande(Action action) {
		this.action = action;
	}

	@Override
	public void execute() throws EstPileVideException {
		/* enclencher une exception ici */
		
	}
	
	@Override 
    public String execute(String s) {
    	/* enclencher une exception ici */
		return null;
    }

	@Override
	public <T> void operandes(T d) throws PilePleineException, DivisionZeroException, EstPileVideException {
		//Générer une exception
		
	}
	
	@Override
	public int getInt() {
		return action.getSizeListeOperande();
	}

}
