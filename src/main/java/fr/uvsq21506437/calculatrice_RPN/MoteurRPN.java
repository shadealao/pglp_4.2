package fr.uvsq21506437.calculatrice_RPN;

import java.util.ArrayList;

public class MoteurRPN {
	Action action;
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
		Interpreteur tailleListeOperande = new GetSizeListOperande(action);
		
		
		this.mySwitch.register("undo", annuler);
		this.mySwitch.register("quit", arreter);
		this.mySwitch.register("add", ajouterOperande);
		this.mySwitch.register("op", appliquerOperation);
		this.mySwitch.register("afficher", afficherListeOperande);
		this.mySwitch.register("get_size_list_operande", tailleListeOperande);
		
		
		
	}
	
	

}
