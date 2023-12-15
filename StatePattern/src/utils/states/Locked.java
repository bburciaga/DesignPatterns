package utils.states;

import interfaces.State;

public class Locked implements State {

    @Override
    public void handle() {
        System.out.println("System is locked...");
    }
}
