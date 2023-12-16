package utils;

import interfaces.Component;

import java.util.ArrayList;
import java.util.Stack;

public class Pistol implements Component {
    Stack<Component> rounds;

    public Pistol () {
        rounds = new Stack<>();
    }
    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public int getDamage() {
        return 0;
    }

    @Override
    public void addRound(Component round) {
        rounds.add(round);
    }

    @Override
    public Component removeRound() {
        if (!rounds.isEmpty())
            return rounds.pop();
        return null;
    }

    @Override
    public boolean isEmpty() {
        return rounds.isEmpty();
    }
}
