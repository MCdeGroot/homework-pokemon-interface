import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon{

    private final String type = "Electric";
    private List<String> attacks = Arrays.asList("thunderPunch", "electroBall","thunder","voltTackle");
    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    public List<String> getAttacks() {
        return attacks;
    }

    public void thunderPunch(Pokemon name, Pokemon enemy){
    }
    public void electroBall(Pokemon name, Pokemon enemy){
    }
    public void thunder(Pokemon name, Pokemon enemy){
    }
    public void voltTackle(Pokemon name, Pokemon enemy){
    }
}
