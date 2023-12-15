import utils.StateContext;
import utils.states.Card;
import utils.states.Dispense;
import utils.states.Locked;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // create context with starting state as Locked
        StateContext context = new StateContext();
        // activate the state
        context.activateState();
        // move to next state Card to insert a card to pay
        context.setState(new Card());
        // activate the state
        context.activateState();

        if (new Random().nextBoolean())         // if random boolean is true set next state to Dispense
            context.setState(new Dispense());
        else                                    // else set next state to Locked
            context.setState(new Locked());

        // activate the state
        context.activateState();
    }
}