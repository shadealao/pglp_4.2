package fr.uvsq21506437.calculatriceRPN;

import fr.uvsq21506437.calculatriceRPN.exception.ActionNonSupporteeException;
import fr.uvsq21506437.calculatriceRPN.exception.DivisionZeroException;
import fr.uvsq21506437.calculatriceRPN.exception.EstPileVideException;
import fr.uvsq21506437.calculatriceRPN.exception.PilePleineException;
import fr.uvsq21506437.calculatriceRPN.exception.SaisieVideException;

/** L'interface Interpreteur.  */
public interface Interpreteur {
	
	/**
	 * interprete les cmd.
	 * @throws EstPileVideException déclenchée si la pile est vide 
	 * @throws ActionNonSupporteeException  quand une fille de interpreteur ne réalise pas une méthode mère
	 */
	public  void execute() throws EstPileVideException, ActionNonSupporteeException;
	
	public String execute(String s) throws SaisieVideException, ActionNonSupporteeException;
	
	public void operandes(double d) throws PilePleineException, ActionNonSupporteeException;
	
	public void operation(char c) throws DivisionZeroException, EstPileVideException, ActionNonSupporteeException, PilePleineException;
	
	public int getInt() throws EstPileVideException, ActionNonSupporteeException;
}
