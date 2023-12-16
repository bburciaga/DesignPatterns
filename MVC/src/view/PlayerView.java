package view;

import model.Player;

public class PlayerView {
    public static void drawGameArea(Player player) {
        System.out.println("Position X: " + Integer.toString(player.getPosition()[0]) );
        System.out.println("Position y: " + Integer.toString(player.getPosition()[1]) );
    }
}
