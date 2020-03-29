package fr.uvsq21506437.calculatriceRPN;

import java.util.ArrayList;

public class MoteurRPN {
	Action action;
	public Switch mySwitch;
	private ArrayList<Double> operande;
	
	/**
	 * Constructeur moteur.
	 */
	public MoteurRPN() {
		mySwitch = new Switch();
		operande = new ArrayList<Double>();
		action = new Action(operande);
	}
	
	/**
	 * correspondance entre une commande et une action (via l'interpréteur).
	 */
	public void associateNameCmd() {
		Interpreteur annuler = new Undo(action);
		Interpreteur arreter = new Quit(action);
		Interpreteur ajouterOperande = new AddOperande(action);
		Interpreteur appliquerOperation = new OperationBinaire(action);
		Interpreteur afficherListeOperande = new AfficherOperandes(action);
		Interpreteur tailleListeOperande = new GetSizeListOperande(action);
		
		
		this.mySwitch.register("undo", annuler);
		this.mySwitch.register("quit", arreter);
		this.mySwitch.register("add", ajouterOperande);
		this.mySwitch.register("op", appliquerOperation);
		this.mySwitch.register("afficher", afficherListeOperande);
		this.mySwitch.register("get_size_list_operande", tailleListeOperande);
		
		
		
	}
	
	

}
