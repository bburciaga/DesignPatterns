package utils.states;

import interfaces.State;

public class Card implements State {
    @Override
    public void handle() {
        System.out.println("Inserting card...");
        System.out.println("Enter PIN...");
    }
}
