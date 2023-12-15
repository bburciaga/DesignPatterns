package utils;

import interfaces.State;

public class StateContext {
    private State currentState;

    public StateContext() {
    }

    public void setState(State state) {
        currentState = state;
    }

    public void activateState() {
        currentState.handle();
    }
}
