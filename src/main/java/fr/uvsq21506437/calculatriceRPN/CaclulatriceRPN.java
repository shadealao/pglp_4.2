package fr.uvsq21506437.calculatriceRPN;

import fr.uvsq21506437.calculatriceRPN.exception.ActionNonSupporteeException;
import fr.uvsq21506437.calculatriceRPN.exception.DivisionZeroException;
import fr.uvsq21506437.calculatriceRPN.exception.ErreurDeSaisieException;
import fr.uvsq21506437.calculatriceRPN.exception.EstPileVideException;
import fr.uvsq21506437.calculatriceRPN.exception.PilePleineException;
import fr.uvsq21506437.calculatriceRPN.exception.QteSymbolesException;
import fr.uvsq21506437.calculatriceRPN.exception.SaisieVideException;

/**
 * Main de la calculatrice RPN.
 */
public class CaclulatriceRPN {
	
	/**
	 * main du projet.
	 * @throws QteSymbolesException il n'y a pas assez ou il y a trop de symboles pour la liste de nbr
	 * @throws PilePleineException si la pile est pleine
	 * @throws DivisionZeroException si on divise par 0
	 * @throws EstPileVideException regarde si la pile est vide 
	 * @throws ActionNonSupporteeException quand l'action demandée n'est pas implémentée dans la classe
	 * @throws ErreurDeSaisieException si la saisie n'est pas undo quit nbr ou + - / *
	 * @throws SaisieVideException regarde si j'essaie de faire une action sur la saisie et que celle-ci est vide 
	 */
    public static void main() throws EstPileVideException, ErreurDeSaisieException, 
    PilePleineException, DivisionZeroException, QteSymbolesException, SaisieVideException, ActionNonSupporteeException {
    	
    	SaisieRPN saisie = new SaisieRPN();
        
        saisie.Saisie();
        saisie.remplirPiles();
        saisie.Calculer();
    }
}
