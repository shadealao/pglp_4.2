package fr.uvsq21506437.calculatrice_RPN;

import fr.uvsq21506437.calculatrice_RPN.exception.DivisionZeroException;
import fr.uvsq21506437.calculatrice_RPN.exception.EstPileVideException;
import fr.uvsq21506437.calculatrice_RPN.exception.PilePleineException;

/** L'interface Interpreteur  */
public interface Interpreteur {
	public  void execute() throws EstPileVideException ;
	public <T> void operandes(T d) throws PilePleineException, DivisionZeroException, EstPileVideException;
	public int getInt();
}
