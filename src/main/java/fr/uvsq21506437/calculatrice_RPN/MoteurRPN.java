package fr.uvsq21506437.calculatrice_RPN;

import java.util.ArrayList;

import fr.uvsq21506437.calculatrice_RPN.exception.DivisionZeroException;
import fr.uvsq21506437.calculatrice_RPN.exception.EstPileVideException;
import fr.uvsq21506437.calculatrice_RPN.exception.PilePleineException;


public class MoteurRPN {
	ActionMoteur action_moteur ;
	ActionSaisie action_saisie ;
	Switch mySwitch;
	private ArrayList<Double> operande ;
	private String saisie;
	
	
	public MoteurRPN() {
		mySwitch = new Switch();
		operande = new ArrayList<Double>();
		action_moteur = new ActionMoteur(operande);
		action_saisie = new ActionSaisie();
	}
	
	public void associateNameCmd() {
		Interpreteur annuler = new Undo(action_saisie);
		Interpreteur arreter = new Quit(action_saisie);
		Interpreteur ajouterOperande = new AddOperande(action_moteur);
		Interpreteur appliquerOperation = new OperationBinaire(action_moteur);
		Interpreteur afficherListeOperande = new AfficherOperandes(action_moteur);
		Interpreteur tailleListeOperande = new GetSizeListOperande(action_moteur);
		
		
		this.mySwitch.register("undo", annuler);
		this.mySwitch.register("quit", arreter);
		this.mySwitch.register("add", ajouterOperande);
		this.mySwitch.register("op", appliquerOperation);
		this.mySwitch.register("afficher", afficherListeOperande);
		this.mySwitch.register("get_size_list_operande", tailleListeOperande);
		
		
		
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
