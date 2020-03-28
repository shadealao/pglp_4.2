package fr.uvsq21506437.calculatrice_RPN;

import fr.uvsq21506437.calculatrice_RPN.exception.DivisionZeroException;
import fr.uvsq21506437.calculatrice_RPN.exception.EstPileVideException;
import fr.uvsq21506437.calculatrice_RPN.exception.PilePleineException;
import junit.framework.TestCase;

public class MoteurRPNTest extends TestCase{
	public void testMoteur() throws PilePleineException, DivisionZeroException, EstPileVideException{
        MoteurRPN M = new MoteurRPN();
        M.associateNameCmd();
        System.out.println("ici");
        M.mySwitch.ope("add",2.0);
        M.mySwitch.ope("add", 3.0);
        System.out.println("iciiiii");
        M.mySwitch.ope("op", '+');
        M.mySwitch.execute("afficher");
		
		assertTrue(true );
    }

}
