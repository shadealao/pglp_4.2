package fr.uvsq21506437.calculatrice_RPN;

import java.util.ArrayList;
import java.util.Scanner;

import fr.uvsq21506437.calculatrice_RPN.exception.ActionNonSupporteeException;
import fr.uvsq21506437.calculatrice_RPN.exception.DivisionZeroException;
import fr.uvsq21506437.calculatrice_RPN.exception.ErreurDeSaisieException;
import fr.uvsq21506437.calculatrice_RPN.exception.EstPileVideException;
import fr.uvsq21506437.calculatrice_RPN.exception.PilePleineException;
import fr.uvsq21506437.calculatrice_RPN.exception.QteSymbolesException;
import fr.uvsq21506437.calculatrice_RPN.exception.SaisieVideException;


public class SaisieRPN {
	public Scanner sc; //scanner
	private String chaine; //chaine entrée
	MoteurRPN moteur;
	ArrayList<Character> operateur ;
	
	public SaisieRPN() {
		super();
		moteur = new MoteurRPN();
		moteur.associateNameCmd();
		operateur = new ArrayList<Character>();
		
	}

	public void Saisie() throws EstPileVideException, SaisieVideException, ActionNonSupporteeException {
		sc = new Scanner(System.in);
		String saisie= "";
		chaine = "";
		System.out.print("Entrez les opérations un à un en appuyant sur la touche entrée. "
				+ " \n Pour finir saisissez 'quit' et pour annuler la précédente commande 'undo' ");
		
		do {
			 saisie = sc.nextLine();
			 if(saisie.equalsIgnoreCase("undo")) {
				 chaine = moteur.mySwitch.execute("undo", chaine); 
			 }
			 else  if(!saisie.equalsIgnoreCase("quit")) {
				 chaine = chaine+ " " + saisie; 
			 }
			 System.out.println("Saisie courante : "+chaine);
			 System.out.println("Saisie: '"+saisie+"'");
		}while(!saisie.equalsIgnoreCase("quit"));
		
		moteur.mySwitch.execute("quit"); 
	}
	
	public String getChaine() {
		return this.chaine;
	}
	
	public void remplirPiles () throws ErreurDeSaisieException, PilePleineException, DivisionZeroException, EstPileVideException, ActionNonSupporteeException {
		for(int i = 0 ; i<chaine.length() ; i++) {
			if(chaine.charAt(i)>= 65 && (chaine.charAt(i) != ' ')) {
				throw new ErreurDeSaisieException();
			}
			else if((chaine.charAt(i) != '+') && (chaine.charAt(i) != '-') && (chaine.charAt(i) != '/') && (chaine.charAt(i) != '*') && (chaine.charAt(i) != ' ')) {
				
				String a = "";
				a +=chaine.charAt(i);
		       	double d = Double.parseDouble(a);
		       	moteur.mySwitch.ope("add",d);
			}
			else if((chaine.charAt(i) == '+') || (chaine.charAt(i) == '-') || (chaine.charAt(i) == '/') || (chaine.charAt(i) == '*')){
				operateur.add(chaine.charAt(i));
			}
       }
		
		//moteur.mySwitch.execute("afficher");
	}
	
	public void Calculer() throws QteSymbolesException, EstPileVideException, PilePleineException, DivisionZeroException, ActionNonSupporteeException {
		if(operateur.size() != moteur.mySwitch.getInteger("get_size_list_operande") - 1) {
	   		throw new QteSymbolesException();
	   	}
	   	else {
	   		int nbrOperateurs = operateur.size();
	   		
		   	for(int i = 0 ; i < nbrOperateurs ; i++){
		   		moteur.mySwitch.ope("op", operateur.get(0));
		   		operateur.remove(0);
		   	}
		   	
		   	moteur.mySwitch.execute("afficher");
	   	}
	}
	
	
	
	
	
	
	
	
}
