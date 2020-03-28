package fr.uvsq21506437.calculatrice_RPN;

public class AfficherOperandes implements Interpreteur{
	private final Action action;
	
	public AfficherOperandes(Action action) {
		this.action = action;
	}

	@Override
	public void execute() {
		action.afficheoperandes();
		
	}
	
	@Override 
    public String execute(String s) {
    	/* enclencher une exception ici */
		return null;
    }
	@Override
	public <T> void operandes(T d) {
		//action.afficheoperandes();
		//générer une exception
		
	}
	
	@Override
	public int getInt() {
		/* enclencher une exception ici */
		return 0;
	}
	

}
