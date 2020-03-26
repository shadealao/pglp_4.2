package fr.uvsq21506437.calculatrice_RPN;


/** The Command for annuler une saisie */
public class Undo implements Interpreteur {
    private final ArretSppr arretSuppr;

    public Undo(ArretSppr arretSuppr) {
        this.arretSuppr = arretSuppr;
    }

    //@Override // Command
    public void execute() {
    	arretSuppr.annuler();
    }
}
