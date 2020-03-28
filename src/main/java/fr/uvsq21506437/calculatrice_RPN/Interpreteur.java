package fr.uvsq21506437.calculatrice_RPN;

import fr.uvsq21506437.calculatrice_RPN.exception.ActionNonSupporteeException;
import fr.uvsq21506437.calculatrice_RPN.exception.DivisionZeroException;
import fr.uvsq21506437.calculatrice_RPN.exception.EstPileVideException;
import fr.uvsq21506437.calculatrice_RPN.exception.PilePleineException;
import fr.uvsq21506437.calculatrice_RPN.exception.SaisieVideException;

/** L'interface Interpreteur  */
public interface Interpreteur {
	public  void execute() throws EstPileVideException, ActionNonSupporteeException;
	public String execute(String s) throws SaisieVideException, ActionNonSupporteeException;
	public <T> void operandes(T d) throws PilePleineException, DivisionZeroException, EstPileVideException, ActionNonSupporteeException;
	public int getInt() throws EstPileVideException, ActionNonSupporteeException;
}
