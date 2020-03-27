package fr.uvsq21506437.calculatrice_RPN;

import java.util.ArrayList;

/** The Command for arreter la saisie */
public class Quit implements Interpreteur {
    private final Action action;

    public Quit(Action arretSuppr) {
        this.action = arretSuppr;
    }

    @Override // Command
    public void execute() {
    	action.arreter();
    }

	@Override
	public <T> void operandes(T d) {
		/* enclencher une exception ici */
	}
}
