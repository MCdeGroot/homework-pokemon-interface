import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon{

    private final String type = "Water";
    private final List<String> attacks = Arrays.asList("surf", "hydroPump","hydroCanon","rainDance");
    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    public List<String> getAttacks() {
        return attacks;
    }

    public void surf(Pokemon name, Pokemon enemy) {
    }
    public void hydroPump(Pokemon name, Pokemon enemy){
    }
    public void hydroCanon(Pokemon name, Pokemon enemy){
    }
    public void rainDance(Pokemon name, Pokemon enemy){
    }


}
