import abstracts.Page;
import utils.Base;
import utils.decorators.Doctor;
import utils.decorators.Patient;

public class Main {
    public static void main(String[] args) {
        Page p = new Base();
        System.out.println(p.getDescription());

        p = new Doctor(
                "Doctor Name: Dr. Seus",
                new String[]{"Winnie", "igor", "Tiger"}
        );
        System.out.println(p.getDescription());

        p = new Patient(
                "Patient Name: Sherlock Holmes",
                "Schizophrenia and paranoia ",
                new String[]{"Fluoxetine", "Lorezapam"}
        );
        System.out.println(p.getDescription());
    }
}