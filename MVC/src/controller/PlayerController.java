package controller;

import model.Player;
import view.PlayerView;

import java.util.Scanner;

public class PlayerController {
    private static Player player;

    public PlayerController (String name, char look) {
        player = new Player(name, look);
    }

    public char move() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Type your next move (WASD) or quit (q): ");
        char move = ' ';  // Default value to handle cases where no input is given
        int[] pos = player.getPosition();

        try {
            String input = scan.next();
            if (!input.isEmpty()) {
                move = input.charAt(0);
            } else {
                System.out.println("Please enter a valid move.");
            }
        } catch (Exception e) {
            System.out.println("Error reading input. Please enter a valid move.");
        } finally {
            switch (move) {
                case 'w':
                    player.setPosition(pos[0], pos[1] - 1);
                    break;
                case 'a':
                    player.setPosition(pos[0] - 1, pos[1]);
                    break;
                case 's':
                    player.setPosition(pos[0], pos[1] + 1);
                    break;
                case 'd':
                    player.setPosition(pos[0] + 1, pos[1]);
                    break;
            }
        }

        return move;
    }

    public void updateView() {
        PlayerView.drawGameArea(player);
    }
}
