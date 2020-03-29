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
	
	public void testUndo() throws PilePleineException, DivisionZeroException, EstPileVideException, ActionNonSupporteeException, SaisieVideException {
		MoteurRPN M = new MoteurRPN();
        String chaine;
        
        M.associateNameCmd();
        M.mySwitch.operande("add",2.0);
        M.mySwitch.operande("add", 3.0);
        M.mySwitch.operation("op", '+');
        M.mySwitch.operation("op", '-');
        chaine = "2.0 3.0 + -";
        chaine = M.mySwitch.execute("undo", chaine); 
		
		assertEquals("2.0 3.0 +", chaine);
    }
	
	/**
	 * j'essaie d'effectuer une action non interprétée. 
	 */
	public void testActionNonInterpretee() {
		MoteurRPN M = new MoteurRPN();
        M.associateNameCmd();
        Throwable caught = null;
        try {
			M.mySwitch.operande("ajout",2.0);
		} catch (IllegalStateException| PilePleineException | DivisionZeroException | EstPileVideException | ActionNonSupporteeException e) {
			caught = e.fillInStackTrace();
		}
		
        assertNotNull(caught);
		assertSame(IllegalStateException.class, caught.getClass());
		
    }
	

}
