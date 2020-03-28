package fr.uvsq21506437.calculatrice_RPN;

import java.util.ArrayList;

import fr.uvsq21506437.calculatrice_RPN.exception.DivisionZeroException;
import fr.uvsq21506437.calculatrice_RPN.exception.EstPileVideException;
import fr.uvsq21506437.calculatrice_RPN.exception.PilePleineException;


public class MoteurRPN {
	Action action ;
	Switch mySwitch;
	private ArrayList<Double> operande ;
	
	
	public MoteurRPN() {
		mySwitch = new Switch();
		operande = new ArrayList<Double>();
		action = new Action(operande);
	}
	
	public void associateNameCmd() {
		Interpreteur annuler = new Undo(action);
		Interpreteur arreter = new Quit(action);
		Interpreteur ajouterOperande = new AddOperande(action);
		Interpreteur appliquerOperation = new OperationBinaire(action);
		Interpreteur afficherListeOperande = new AfficherOperandes(action);
		
		
		this.mySwitch.register("undo", annuler);
		this.mySwitch.register("quit", arreter);
		this.mySwitch.register("add", ajouterOperande);
		this.mySwitch.register("op", appliquerOperation);
		this.mySwitch.register("afficher", afficherListeOperande);
		
		
		
	}
	/* pour annuler le dernier élément, arret la saisie et afficher la liste */
	public void undoStop(String tache) throws EstPileVideException {
		this.mySwitch.execute(tache);
		
		
	}
	
	/* Pour ajouter une opérande et appliquer une opération sur deux operandes */
	public <T> void actionSurOperandes(String tache, T d) throws PilePleineException, DivisionZeroException, EstPileVideException {
		//attention avant d'ajouter supprimer vérifier si liste vide, pleine etc.
		this.mySwitch.ope(tache, d);
	}
	

}
