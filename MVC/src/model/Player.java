package model;

public class Player {
    String name;
    char look;
    int[] position = new int[2];

    public Player (String name, char look) {
        setName(name);
        setLook(look);
        setPosition(0, 0);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLook(char look) {
        this.look = look;
    }

    public void setPosition(int x, int y) {
        this.position[0] = x;
        this.position[1] = y;
    }

    public String getName() {
        return name;
    }

    public char getLook() {
        return look;
    }

    public int[] getPosition() {
        return position;
    }
}
