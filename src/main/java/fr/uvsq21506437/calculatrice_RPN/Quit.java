package fr.uvsq21506437.calculatrice_RPN;

/** The Command for arreter la saisie */
public class Quit implements Interpreteur {
    private final ActionSaisie action;

    public Quit(ActionSaisie arretSuppr) {
        this.action = arretSuppr;
    }

    @Override // Command
    public void execute() {
    	action.arreter();
    }
   
    @Override 
    public String execute(String s) {
    	/* enclencher une exception ici */
		return null;
    }

	@Override
	public <T> void operandes(T d) {
		/* enclencher une exception ici */
	}
	
	@Override
	public int getInt() {
		/* enclencher une exception ici */
		return 0;
	}
}
