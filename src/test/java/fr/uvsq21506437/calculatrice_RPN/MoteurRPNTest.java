package fr.uvsq21506437.calculatrice_RPN;

import fr.uvsq21506437.calculatrice_RPN.exception.DivisionZeroException;
import fr.uvsq21506437.calculatrice_RPN.exception.EstPileVideException;
import fr.uvsq21506437.calculatrice_RPN.exception.PilePleineException;
import junit.framework.TestCase;

public class MoteurRPNTest extends TestCase{
	public void testMoteur() throws PilePleineException, DivisionZeroException, EstPileVideException{
        MoteurRPN M = new MoteurRPN();
        M.associateNameCmd();
        M.mySwitch.ope("add",2.0);
        M.mySwitch.ope("add", 3.0);
        M.mySwitch.ope("op", '+');
        M.mySwitch.execute("afficher");
		
		assertTrue(true );
    }

}
