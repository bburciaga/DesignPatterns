import interfaces.Component;
import utils.Pistol;
import utils.Round;

public class Main {
    private static final Component plasma = new Round(
            "Plasma",
            "Plasma charge from a ray gun... how'd this get in here?",
            117
    );
    private static final Component nine_milimeter = new Round(
            "9mm",
            "9 millimeter round that does average damage",
            10
    );

    public static void main(String[] args) {
        Component nine_eleven = new Pistol();

        nine_eleven.addRound(nine_milimeter);
        nine_eleven.addRound(nine_milimeter);
        nine_eleven.addRound(plasma);
        nine_eleven.addRound(nine_milimeter);

        while (!nine_eleven.isEmpty()) {
            Component round = nine_eleven.removeRound();
            System.out.println(round.getName());
            System.out.println(Integer.toString(round.getDamage()) + "dammage");
        }
    }
}