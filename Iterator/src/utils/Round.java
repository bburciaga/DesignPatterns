package utils;

import interfaces.Component;

public class Round implements Component {
    private String name;
    private String description;
    private int damage;

    public Round(String name, String description, int damage) {
        this.name = name;
        this.description = description;
        this.damage = damage;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public void addRound(Component round) {

    }

    @Override
    public Component removeRound() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
