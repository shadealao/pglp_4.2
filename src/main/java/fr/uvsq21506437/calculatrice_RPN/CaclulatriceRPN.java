package fr.uvsq21506437.calculatrice_RPN;

import fr.uvsq21506437.calculatrice_RPN.exception.ActionNonSupporteeException;
import fr.uvsq21506437.calculatrice_RPN.exception.DivisionZeroException;
import fr.uvsq21506437.calculatrice_RPN.exception.ErreurDeSaisieException;
import fr.uvsq21506437.calculatrice_RPN.exception.EstPileVideException;
import fr.uvsq21506437.calculatrice_RPN.exception.PilePleineException;
import fr.uvsq21506437.calculatrice_RPN.exception.QteSymbolesException;
import fr.uvsq21506437.calculatrice_RPN.exception.SaisieVideException;

/**
 * Hello world!
 *
 */
public class CaclulatriceRPN {
    public static void main( String[] args ) throws EstPileVideException, ErreurDeSaisieException, PilePleineException, DivisionZeroException, QteSymbolesException, SaisieVideException, ActionNonSupporteeException{
    	
    	SaisieRPN saisie = new SaisieRPN();
        
        saisie.Saisie();
        saisie.remplirPiles();
        saisie.Calculer();
    }
}
