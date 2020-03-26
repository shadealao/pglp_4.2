package fr.uvsq21506437.calculatrice_RPN;

import java.util.HashMap;

/** The Invoker class */
class Switch {
    private final HashMap<String, Interpreteur> commandMap = new HashMap<String, Interpreteur>();
    
    public void register(String commandName, Interpreteur inter) {
        commandMap.put(commandName, inter);
    }
    
    public void execute(String commandName) {
    	Interpreteur inter = commandMap.get(commandName);
        if (inter == null) {
            throw new IllegalStateException("no command registered for " + commandName);
        }
        inter.execute();
    }
}