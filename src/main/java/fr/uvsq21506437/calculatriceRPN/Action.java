package fr.uvsq21506437.calculatriceRPN;

import java.util.ArrayList;

import fr.uvsq21506437.calculatriceRPN.exception.DivisionZeroException;
import fr.uvsq21506437.calculatriceRPN.exception.EstPileVideException;
import fr.uvsq21506437.calculatriceRPN.exception.PilePleineException;
import fr.uvsq21506437.calculatriceRPN.exception.SaisieVideException;


/** The Receiver class. */
public class Action {
	private static final int TMAX = 20;
	private ArrayList<Double> operande;
	
	
	public Action(ArrayList<Double> operande) {
		this.operande = operande;
	}
	
	/**
	 * annule la derniere saisie de l'utilisateur.
	 * @param chaine saisie utilisateur
	 * @return Nouvelle chaine / saisie : on a retirer la derniere saisie
	 * @throws SaisieVideException exception si chaine est vide
	 */
	public String annuler(String chaine)throws SaisieVideException {
		 if(chaine.equals(""))
			 throw new SaisieVideException();
		 
		 String s = "";
		 // -2 car j'enlève le caractere et l'esoace précédent
		 for(int i = 0; i < chaine.length()-2; i++)
			 s += chaine.charAt(i);
		 return s;
	}
	
	public void arreter() {
		System.out.println("Fin de saisie");
	}
	
   /**
    * ajoute un double dans la liste des operandes.
    * @param d : chiffre à rajouter
    * @throws PilePleineException vérifie si la pile n'est pas pleine avant de rajouter d
    */
	public void addOp(Double d) throws PilePleineException {
		if (operande.size() == TMAX)
            throw new PilePleineException();
		operande.add(d);
	}
	
	/**
	 * supprimer le dernier element de la pile.
	 * @throws EstPileVideException la pile est vide : donc rien a aupprimer
	 */
	public void deleteOp() throws EstPileVideException{
		if (operande.size() != 0) {
			operande.remove(operande.size()-1);
		}
		else throw new EstPileVideException();
	}
	
	/**
	 * vérifie si le symbole est bien + - / *.
	 * @param symbole charactere à vérifier 
	 * @return si + - * / renvoie vrai sinon faux
	 */
	public boolean opBinaire(char symbole) {
		if(operande.size()-1<0 || operande.size()-2<0|| 
				(symbole != '+' && symbole != '-' && symbole != '/' && symbole != '*'))
			return false;
		return true; 
	}
	
	/**
	 * effectue une operation.
	 * @param symbole operation a appliquer entre 2 opérandes
	 * @throws DivisionZeroException division par 0
	 * @throws EstPileVideException la pile est vide
	 * @throws PilePleineException la pile est pleine
	 */
	public void appliquerOp(char symbole) throws DivisionZeroException, EstPileVideException, PilePleineException {
		if(opBinaire(symbole)) {
			double res = 0;
			if(symbole == '+') {
				res = Operation.PLUS.eval(operande.get(operande.size()-1), operande.get(operande.size()-2));
			}
			else if(symbole == '-') {
				res = Operation.MOINS.eval(operande.get(operande.size()-1), operande.get(operande.size()-2));
			}
			else if(symbole == '*') {
				res = Operation.MULT.eval(operande.get(operande.size()-1), operande.get(operande.size()-2));
			}
			else if(symbole == '/') {
				res = Operation.DIV.eval(operande.get(operande.size()-1), operande.get(operande.size()-2));
			}
			
			this.deleteOp();
			this.deleteOp();
			this.addOp(res);
		}
	}
	
	/**
	 * retourne la liste.
	 * @return liste operande retournée
	 * @throws EstPileVideException la pile est vide
	 */
	public ArrayList<Double> retournerListeOperande() throws EstPileVideException {
		ArrayList<Double> list = new ArrayList<>();
		if(operande.isEmpty())
				throw new EstPileVideException();
		int n = operande.size();
		for (int i = n-1; i>= 0; i--) list.add(operande.get(i));
		for (int i  = 0; i<list.size(); i++) operande.set(i, list.get(i));
		return list;
	}
	
	/**
	 * affiche la pile d'operande.
	 * @throws EstPileVideException la pile est vide
	 */
	public void afficheoperandes() throws EstPileVideException{
		ArrayList<Double> list = this.retournerListeOperande();
		String s ="La pile : ";
		for (Double double1 : list) {
			s+= " "+double1 + " ";
		}
		System.out.println(s);
	}
	
	/**
	 * nbr d'operandes.
	 * @return nombre d'opérandes 
	 * @throws EstPileVideException la pile est vide
	 */
	public int getSizeListeOperande() throws EstPileVideException {
		if(this.operande.isEmpty()) throw new EstPileVideException();
		return this.operande.size();
	}
}
