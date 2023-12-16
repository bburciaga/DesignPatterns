import controller.PlayerController;
import model.Player;

public class Main {
    public static void main(String[] args) {
        PlayerController c = new PlayerController("Brian", 'T');
        while (true) {
            char input = ' ';
            input = c.move();
            if ('q' == input) return;
            else c.updateView();
        }
    }
}