package utils.decorators;

import abstracts.Decorator;

public class Patient extends Decorator {
    private String description;
    private String history;
    private String[] prescriptions;

    public Patient(String description, String history, String[] prescriptions) {
        this.description = description;
        this.history = history;
        this.prescriptions = prescriptions;
    }

    @Override
    public String getDescription() {
        return (description + '\n' + getHistory() + '\n');
    }

    public String getHistory() {
        return history;
    }

    public String[] getPrescriptions() {
        return prescriptions;
    }
}
