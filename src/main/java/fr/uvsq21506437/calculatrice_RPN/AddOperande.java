package fr.uvsq21506437.calculatrice_RPN;

import fr.uvsq21506437.calculatrice_RPN.exception.PilePleineException;

public class AddOperande implements Interpreteur {
	private final ActionMoteur action;
	public  AddOperande(ActionMoteur action) {
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
	public <T> void operandes(T d) throws PilePleineException {
		action.addOp((double)d);
		
	}
	@Override
	public int getInt() {
		/* enclencher une exception ici */
		return 0;
	}

}
