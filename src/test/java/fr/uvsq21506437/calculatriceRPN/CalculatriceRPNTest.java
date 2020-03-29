package fr.uvsq21506437.calculatriceRPN;

import fr.uvsq21506437.calculatriceRPN.exception.ActionNonSupporteeException;
import fr.uvsq21506437.calculatriceRPN.exception.DivisionZeroException;
import fr.uvsq21506437.calculatriceRPN.exception.ErreurDeSaisieException;
import fr.uvsq21506437.calculatriceRPN.exception.EstPileVideException;
import fr.uvsq21506437.calculatriceRPN.exception.PilePleineException;
import fr.uvsq21506437.calculatriceRPN.exception.QteSymbolesException;
import fr.uvsq21506437.calculatriceRPN.exception.SaisieVideException;
import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class CalculatriceRPNTest extends TestCase{

    /**
     * Test main : j'effectue un calcul sur une pile vide
     */
    public void testCalculatrice() {
    	SaisieRPN saisie = new SaisieRPN();
    	Throwable caught = null;
        try {
	        saisie.Calculer();
		} catch (EstPileVideException | ActionNonSupporteeException | QteSymbolesException | PilePleineException | DivisionZeroException e) {
			caught = e.fillInStackTrace();
		}
		
        assertNotNull(caught);
		assertSame(EstPileVideException.class, caught.getClass());
    }
}
