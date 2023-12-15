package utils.decorators;

import abstracts.Decorator;

public class Doctor extends Decorator {
    String description; //description o
    String[] patients;

    public Doctor() {
        this.description = "No description";
        this.patients = new String[]{};  //array of strings for patients under dcotr
    }

    public Doctor(String description, String[] patients) { //instant
        this.description = description;
        this.patients = patients;
    }

    public String getPatients() {  //method to view patients
        String s = "";
        // Displaying patient data
        s += "Viewing list of current patients:\n";
        for (String patientName : patients) {
            s += "  - " + patientName; //reiterates and prtints patients
        }

        return s;
    }

    @Override
    public String getDescription() {
        return (description + '\n' + this.getPatients());
    }
}
