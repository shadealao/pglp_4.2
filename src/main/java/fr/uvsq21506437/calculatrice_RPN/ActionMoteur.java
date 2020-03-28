package fr.uvsq21506437.calculatrice_RPN;

import java.util.ArrayList;

import fr.uvsq21506437.calculatrice_RPN.exception.DivisionZeroException;
import fr.uvsq21506437.calculatrice_RPN.exception.EstPileVideException;
import fr.uvsq21506437.calculatrice_RPN.exception.PilePleineException;


/** The Receiver class */
public class ActionMoteur {
	private static final int TMAX = 20;
	private ArrayList<Double> operande ;
	
	
	public ActionMoteur ( ArrayList<Double> operande) {
		this.operande = operande;
	}
	
   
    
	public void addOp(Double d) throws PilePleineException {
		if (operande.size() == TMAX)
            throw new PilePleineException();
		operande.add(d);
	}
	public void deleteOp() throws EstPileVideException{
		if (operande.size() != 0) {
			operande.remove(operande.size()-1);
		}
		else throw new EstPileVideException();
	}
	
	public boolean opBinaire(char symbole) {
		if(operande.size()-1<0 || operande.size()-2<0|| (symbole != '+' && symbole != '-' && symbole != '/' && symbole != '*'))
			return false;
		return true; 
		
	}
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
	
	public ArrayList<Double> retournerListeOperande() {
		ArrayList<Double> List = new ArrayList<>();
		int n = operande.size();
		for (int i = n-1 ; i>= 0; i--) List.add(operande.get(i));
		for(int i  = 0; i<List.size(); i++) operande.set(i,  List.get(i)) ;
		return List;
	}
	
	public void afficheoperandes () {
		ArrayList<Double> List = this.retournerListeOperande();
		String s ="La pile : ";
		for (Double double1 : List) {
			s+= " "+double1 + " "	;
		}
		System.out.println(s);
	}
	
	public int getSizeListeOperande() {
		return this.operande.size();
	}
}
