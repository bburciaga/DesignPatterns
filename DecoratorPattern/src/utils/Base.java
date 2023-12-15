package utils;

import abstracts.Page;

public class Base extends Page {
    String description;

    public Base () {
        this.description = "Welcome to the patient monitoring system.";
    }

    @Override
    public String getDescription() {
        return description;
    }
}
