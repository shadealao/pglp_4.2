  package fr.uvsq21506437.calculatrice_RPN;

import java.util.ArrayList;
import java.util.HashMap;

import fr.uvsq21506437.calculatrice_RPN.exception.DivisionZeroException;
import fr.uvsq21506437.calculatrice_RPN.exception.EstPileVideException;
import fr.uvsq21506437.calculatrice_RPN.exception.PilePleineException;

/** The Invoker class */
class Switch {
    private final HashMap<String, Interpreteur> commandMap = new HashMap<String, Interpreteur>();
    
    public void register(String commandName, Interpreteur inter) {
        commandMap.put(commandName, inter);
    }
    
    public void execute(String commandName) throws EstPileVideException {
    	Interpreteur inter = commandMap.get(commandName);
        if (inter == null) {
            throw new IllegalStateException("no command registered for " + commandName);
        }
        	inter.execute();
               
    }
    public <T> void ope(String commandName, T d) throws PilePleineException, DivisionZeroException, EstPileVideException {
    	Interpreteur inter = commandMap.get(commandName);
        if (inter == null) {
            throw new IllegalStateException("no command registered for " + commandName);
        }
        //vérifier le type double ou char
        inter.operandes(d);
        
    }
    
}