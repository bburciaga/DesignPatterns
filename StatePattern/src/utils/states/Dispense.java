package utils.states;

import interfaces.State;

public class Dispense implements State {
    @Override
    public void handle() {
        System.out.println("Dispensing fuel...");
    }
}
