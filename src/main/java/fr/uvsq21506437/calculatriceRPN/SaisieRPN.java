package fr.uvsq21506437.calculatriceRPN;

import fr.uvsq21506437.calculatriceRPN.exception.ActionNonSupporteeException;
import fr.uvsq21506437.calculatriceRPN.exception.DivisionZeroException;
import fr.uvsq21506437.calculatriceRPN.exception.ErreurDeSaisieException;
import fr.uvsq21506437.calculatriceRPN.exception.EstPileVideException;
import fr.uvsq21506437.calculatriceRPN.exception.PilePleineException;
import fr.uvsq21506437.calculatriceRPN.exception.QteSymbolesException;
import fr.uvsq21506437.calculatriceRPN.exception.SaisieVideException;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Interface utilisateur : il a insère des données dans sa calculatrice.
 *
 */
public class SaisieRPN {
	public Scanner sc; //scanner
	private String chaine; //chaine entrée
	MoteurRPN moteur;
	ArrayList<Character> operateur;
	
	/**
	 * Constructeur Saisie RPN.
	 */
	public SaisieRPN() {
		super();
		moteur = new MoteurRPN();
		moteur.associateNameCmd();
		operateur = new ArrayList<Character>();
	}
	
	/**
	 * L'utilisateur entre des données dans la calculatrice.
	 * @throws EstPileVideException regarde si la pile est vide 
	 * @throws SaisieVideException regarde si j'essaie de faire une action sur la saisie et que celle-ci est vide 
	 * @throws ActionNonSupporteeException quand l'action demandée n'est pas implémentée dans la classe
	 */
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
			 } else  if(!saisie.equalsIgnoreCase("quit")) {
				 chaine = chaine+ " " + saisie; 
			 }
			 System.out.println("Saisie courante : "+chaine);
			 System.out.println("Saisie: '"+saisie+"'");
		}while(!saisie.equalsIgnoreCase("quit"));
		
		moteur.mySwitch.execute("quit"); 
	}
	
	/**
	 * renvoie la chaine de saisie. 
	 * @return une chaine de différentes données que l'utilisateur à précédemment rentré
	 */
	public String getChaine() {
		return this.chaine;
	}
	
	/**
	 * Après que l'utilisateur ait fini de rentrer les données on les trie dans deux piles distinctes : opérandes et opérateurs. On vérifie également le type de chaque entrées.
	 * @throws ErreurDeSaisieException si la saisie n'est pas undo quit nbr ou + - / *
	 * @throws PilePleineException si la pile est pleine
	 * @throws DivisionZeroException si on divise par 0
	 * @throws EstPileVideException regarde si la pile est vide 
	 * @throws ActionNonSupporteeException quand l'action demandée n'est pas implémentée dans la classe
	 */
	public void remplirPiles() throws ErreurDeSaisieException, PilePleineException, DivisionZeroException, EstPileVideException, ActionNonSupporteeException {
		for(int i = 0; i < chaine.length(); i++) {
			if(chaine.charAt(i) >= 65 && (chaine.charAt(i) != ' ')) {
				throw new ErreurDeSaisieException();
			} else if((chaine.charAt(i) != '+') && (chaine.charAt(i) != '-') && (chaine.charAt(i) != '/') && (chaine.charAt(i) != '*') && (chaine.charAt(i) != ' ')) {
				
				String a = "";
				a +=chaine.charAt(i);
		       	double d = Double.parseDouble(a);
		       	moteur.mySwitch.operande("add",d);
			} else if((chaine.charAt(i) == '+') || (chaine.charAt(i) == '-') || (chaine.charAt(i) == '/') || (chaine.charAt(i) == '*')){
				operateur.add(chaine.charAt(i));
			}
       }
		
		//moteur.mySwitch.execute("afficher");
	}
	
	/**
	 * Effectue le calcul de la pile s'il y a assez d'opérateurs pour chaque opérandes.
	 * @throws QteSymbolesException il n'y a pas assez ou il y a trop de symboles pour la liste de nbr
	 * @throws PilePleineException si la pile est pleine
	 * @throws DivisionZeroException si on divise par 0
	 * @throws EstPileVideException regarde si la pile est vide 
	 * @throws ActionNonSupporteeException quand l'action demandée n'est pas implémentée dans la classe
	 */
	public void Calculer() throws QteSymbolesException, EstPileVideException, PilePleineException, DivisionZeroException, ActionNonSupporteeException {
		if(operateur.size() != moteur.mySwitch.getInteger("get_size_list_operande") - 1) {
	   		throw new QteSymbolesException();
	   	} else {
	   		int nbrOperateurs = operateur.size();
	   		
		   	for(int i = 0; i < nbrOperateurs; i++) {
		   		moteur.mySwitch.operation("op", operateur.get(0));
		   		operateur.remove(0);
		   	}
		   	moteur.mySwitch.execute("afficher");
	   	}
	}	
}
