package fr.uvsq21506437.calculatrice_RPN;

import java.util.ArrayList;

import fr.uvsq21506437.calculatrice_RPN.exception.PilePleineException;

public class AddOperande implements Interpreteur {
	private final Action action;
	public  AddOperande(Action action) {
		this.action = action;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		/* enclencher une exception ici */
	}

	@Override
	public <T> void operandes(T d) throws PilePleineException {
		action.addOp((double)d);
		
	}

}
