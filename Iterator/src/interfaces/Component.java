package interfaces;

public interface Component {
    public String getName();
    public String getDescription();
    public int getDamage();
    public void addRound(Component round);
    public Component removeRound();
    public boolean isEmpty();
}
