package fr.uvsq21506437.calculatriceRPN;

import java.util.ArrayList;

import fr.uvsq21506437.calculatriceRPN.SaisieRPN;
import fr.uvsq21506437.calculatriceRPN.exception.ActionNonSupporteeException;
import fr.uvsq21506437.calculatriceRPN.exception.DivisionZeroException;
import fr.uvsq21506437.calculatriceRPN.exception.ErreurDeSaisieException;
import fr.uvsq21506437.calculatriceRPN.exception.EstPileVideException;
import fr.uvsq21506437.calculatriceRPN.exception.PilePleineException;
import fr.uvsq21506437.calculatriceRPN.exception.QteSymbolesException;
import fr.uvsq21506437.calculatriceRPN.exception.SaisieVideException;
import junit.framework.TestCase;

public class SaisieRPNTest extends TestCase{

	public void testSaisie() throws PilePleineException, DivisionZeroException, EstPileVideException, ErreurDeSaisieException, QteSymbolesException, SaisieVideException, ActionNonSupporteeException{
        SaisieRPN saisie = new SaisieRPN();
        
        saisie.Saisie();
        saisie.remplirPiles();
        saisie.Calculer();
		
		assertTrue(true );
    }
	
	/**
	 * J'essaier d'annuler la derniere saisie sauf que je n'en ait pas effectuer.
	 */
	public void testSaisieVide() {
		Action action = new Action(new ArrayList<Double>());
		String chaine = "";
		Throwable caught = null;
		try {
			action.annuler(chaine);
		} catch (Throwable t) {
		   caught = t;
		}
		assertNotNull(caught);
		assertSame(SaisieVideException.class, caught.getClass());
		
	}
}
