import interfaces.Turkey;
import utils.TurkeyAdapter;
import utils.WildTurkey;

public class Main {
    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();

        TurkeyAdapter ta = new TurkeyAdapter(turkey);
        ta.quick();
        ta.fly();
    }
}