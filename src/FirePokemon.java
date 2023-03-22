import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon{

    //in de main wordt argumant type niet aangeroepen dus die wijzen we hier toe, namelijk is altijd van het type Fire

    private final String type = "Fire";
   private List<String> attacks = Arrays.asList("nferno", "pyroBall","fireLash","flameThrower");

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    public List<String> getAttacks() {
        return attacks;
    }
    public void inferno(Pokemon name, Pokemon enemy){
    }
    public void pyroBall(Pokemon name, Pokemon enemy){
    }
    public void fireLash(Pokemon name, Pokemon enemy){
    }
    public void flameThrower(Pokemon name, Pokemon enemy){
    }
}
