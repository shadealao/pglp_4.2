package fr.uvsq21506437.calculatrice_RPN;


public class ActionSaisie {
	
	public ActionSaisie() {
	}
	
	public String annuler(String chaine) {
		 
		 //lancer une exception si saisie  vide
		 String s = "";
		 // -2 car j'enlève le caractere et l'esoace précédent
		 for(int i = 0; i < chaine.length()-2; i++ )
			 s += chaine.charAt(i);
		 
		 System.out.println("Avant : '"+ chaine +"'  après : '" + s +"'");
		 return s;
	}
	
	public void arreter() {
	        System.out.println("Fin des opérations. Calculatrice arretée");
	        
	    }
	    
}
