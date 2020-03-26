package fr.uvsq21506437.calculatrice_RPN;


/** The Command for arreter la saisie */
public class Quit implements Interpreteur {
    private final ArretSppr arretSuppr;

    public Quit(ArretSppr arretSuppr) {
        this.arretSuppr = arretSuppr;
    }

    //@Override // Command
    public void execute() {
    	arretSuppr.arreter();
    }
}