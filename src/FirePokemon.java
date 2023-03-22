import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {

    //in de main wordt argumant type niet aangeroepen dus die wijzen we hier toe, namelijk is altijd van het type Fire

    private final String type = "fire";
    private List<String> attacks = Arrays.asList("inferno", "pyroBall", "fireLash", "flameThrower");

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    @Override
    public String getType() {
        return type;
    }

    public List<String> getAttacks() {
        return attacks;
    }

    public void inferno(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Inferno!");
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp((enemy.getHp() - 10));
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp((enemy.getHp() - 20));}
            case "water" -> {
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp((enemy.getHp() - 30));
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp((enemy.getHp() - 40));
            }
        }
        System.out.println(enemy.getName() + " now has " + enemy.getHp() + "hp left!");
    }

    public void pyroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with a Pyro Ball!");
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp((enemy.getHp() - 15));
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp((enemy.getHp() - 25));}
            case "water" -> {
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp((enemy.getHp() - 30));
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp((enemy.getHp() - 40));
            }
        }
        System.out.println(enemy.getName() + " now has " + enemy.getHp() + "hp left!");
    }

    public void fireLash(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with a Lash of Fire!");
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp((enemy.getHp() - 15));
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp((enemy.getHp() - 25));}
            case "water" -> {
                System.out.println(enemy.getName() + " loses 35 hp");
                enemy.setHp((enemy.getHp() - 35));
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp((enemy.getHp() - 40));
            }
        }
        System.out.println(enemy.getName() + " now has " + enemy.getHp() + "hp left!");
    }

    public void flameThrower(Pokemon name, Pokemon enemy) {
        System.out.println("Wait! What's that ?!? Looks like " + name.getName() + " has a little trick up his sleeve and attacks " + enemy.getName() + " with a Flame Thrower!");
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp((enemy.getHp() - 20));
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp((enemy.getHp() - 30));}
            case "water" -> {
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp((enemy.getHp() - 40));
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 50 hp");
                enemy.setHp((enemy.getHp() - 50));
            }
        }
        System.out.println(enemy.getName() + " now has " + enemy.getHp() + "hp left!");
    }
}
