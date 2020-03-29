package fr.uvsq21506437.calculatriceRPN;

import fr.uvsq21506437.calculatriceRPN.MoteurRPN;
import fr.uvsq21506437.calculatriceRPN.exception.ActionNonSupporteeException;
import fr.uvsq21506437.calculatriceRPN.exception.DivisionZeroException;
import fr.uvsq21506437.calculatriceRPN.exception.EstPileVideException;
import fr.uvsq21506437.calculatriceRPN.exception.PilePleineException;
import fr.uvsq21506437.calculatriceRPN.exception.SaisieVideException;
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
	
	public void testUndo() throws PilePleineException, DivisionZeroException, EstPileVideException, ActionNonSupporteeException, SaisieVideException{
        MoteurRPN M = new MoteurRPN();
        String chaineavant , chaineapres; 
        
        M.associateNameCmd();
        M.mySwitch.operande("add",2.0);
        M.mySwitch.operande("add", 3.0);
        M.mySwitch.operation("op", '+');
        M.mySwitch.operation("op", '-');
        chaineavant = "2.0 3.0 + -";
        chaineapres = M.mySwitch.execute("undo", chaineavant); 
		
		assertEquals(chaineavant, chaineapres);
    }

}
