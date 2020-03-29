  package fr.uvsq21506437.calculatriceRPN;

import java.util.HashMap;

import fr.uvsq21506437.calculatriceRPN.exception.ActionNonSupporteeException;
import fr.uvsq21506437.calculatriceRPN.exception.DivisionZeroException;
import fr.uvsq21506437.calculatriceRPN.exception.EstPileVideException;
import fr.uvsq21506437.calculatriceRPN.exception.PilePleineException;
import fr.uvsq21506437.calculatriceRPN.exception.SaisieVideException;

/** The Invoker class. */
public class Switch {
    private final HashMap<String, Interpreteur> commandMap = new HashMap<String, Interpreteur>();
    
    /**
     * Associe à chaque commande une action (interprète chaque cmd).
     * @param commandName nom de la commande
     * @param inter interpréteur : celui qui fait l'action 
     */
    public void register(String commandName, Interpreteur inter) {
        commandMap.put(commandName, inter);
    }
    
    
    /**
     * Lance l'interpréteur correspondant à la cmd.
     * @param commandName nom de la cmd
     * @throws EstPileVideException la pile est vide
     * @throws ActionNonSupporteeException action non supportée par la classe
     */
    public void execute(String commandName) throws EstPileVideException, ActionNonSupporteeException {
    	Interpreteur inter = commandMap.get(commandName);
        if (inter == null) {
            throw new IllegalStateException("no command registered for " + commandName);
        }
        	inter.execute();     
    }
    
    /**
     * Lance l'interpréteur correspondant à la cmd.
     * @param commandName nom de la cmd
     * @param chaine chaine à modifier
     * @return chaine modifée
     * @throws EstPileVideException la pile est vide
     * @throws SaisieVideException quand je veux enlever un caractere de la  saisie mais que celle-ci est vide
     * @throws ActionNonSupporteeException action non implémentée dans la classe
     */
    public String execute(String commandName, String chaine) throws EstPileVideException, SaisieVideException, ActionNonSupporteeException {
    	Interpreteur inter = commandMap.get(commandName);
        if (inter == null) {
            throw new IllegalStateException("no command registered for " + commandName);
        }
        	return inter.execute(chaine);
               
    }
    
    /**
     * Lance l'interpréteur correspondant à la cmd.
     * @param commandName nom de la commande
     * @param d : double à ajouter dans la pile operandes
     * @throws PilePleineException la pile est pleine
     * @throws DivisionZeroException on divise par 0
     * @throws EstPileVideException regarde si la pile est vide
     * @throws ActionNonSupporteeException action non implémentée dans la classe
     */
    public void operande(String commandName, double d) throws PilePleineException, DivisionZeroException, EstPileVideException, ActionNonSupporteeException {
    	Interpreteur inter = commandMap.get(commandName);
        if (inter == null) {
            throw new IllegalStateException("no command registered for " + commandName);
        }
        inter.operandes(d);
        
    }
    
    /**
     *  Lance l'interpréteur correspondant à la cmd.
     * @param commandName nom de la cmd
     * @param c : symbole opération + / - * 
     * @throws PilePleineException pile pleine : trop de nbr
     * @throws DivisionZeroException on divise par 0
     * @throws EstPileVideException regarde si la pile est vide
     * @throws ActionNonSupporteeException action non implémentée dans la classe
     */
    public void operation(String commandName, char c) throws PilePleineException, DivisionZeroException, EstPileVideException, ActionNonSupporteeException {
    	Interpreteur inter = commandMap.get(commandName);
        if (inter == null) {
            throw new IllegalStateException("no command registered for " + commandName);
        }
        inter.operation(c);
        
    }
    
    /**
     * Lance l'interpréteur correspondant à la cmd.
     * @param commandName nom de la cmd
     * @return taille (ici d'une liste)
     * @throws EstPileVideException regarde si la pile est vide
     * @throws ActionNonSupporteeException action non implémentée dans la classe
     */
    public int getInteger(String commandName) throws EstPileVideException, ActionNonSupporteeException {
    	Interpreteur inter = commandMap.get(commandName);
        if (inter == null) {
            throw new IllegalStateException("no command registered for " + commandName);
        }
        return inter.getInt();
    	
    }
    
}