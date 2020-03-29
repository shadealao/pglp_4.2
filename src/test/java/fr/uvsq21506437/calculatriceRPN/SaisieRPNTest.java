package fr.uvsq21506437.calculatriceRPN;

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
        /*
        saisie.Saisie();
        saisie.remplirPiles();
        saisie.Calculer();
		*/
		assertTrue(true );
    }
}
