package fr.uvsq21506437.calculatriceRPN;

import fr.uvsq21506437.calculatriceRPN.MoteurRPN;
import fr.uvsq21506437.calculatriceRPN.exception.ActionNonSupporteeException;
import fr.uvsq21506437.calculatriceRPN.exception.DivisionZeroException;
import fr.uvsq21506437.calculatriceRPN.exception.EstPileVideException;
import fr.uvsq21506437.calculatriceRPN.exception.PilePleineException;
import junit.framework.TestCase;

public class MoteurRPNTest extends TestCase{
	public void testMoteur() throws PilePleineException, DivisionZeroException, EstPileVideException, ActionNonSupporteeException{
        MoteurRPN M = new MoteurRPN();
        M.associateNameCmd();
        M.mySwitch.operande("add",2.0);
        M.mySwitch.operande("add", 3.0);
        M.mySwitch.operation("op", '+');
        M.mySwitch.execute("afficher"); 
		
		assertTrue(true );
    }

}
