import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {

    private final String type = "water";
    private final List<String> attacks = Arrays.asList("surf", "hydroPump", "hydroCanon", "rainDance");

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    @Override
    public String getType() {
        return type;
    }

    public List<String> getAttacks() {
        return attacks;
    }

    public void surf(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with his Surf Attack!");
        switch (enemy.getType()) {
            case "water" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp((enemy.getHp() - 10));
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp((enemy.getHp() - 20));
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp((enemy.getHp() - 30));
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp((enemy.getHp() - 40));
            }
        }
        System.out.println(enemy.getName() + " now has " + enemy.getHp() + "hp left!");
    }

    public void hydroPump(Pokemon name, Pokemon enemy) {
        System.out.println("Lets pump it up!!!" + name.getName() + " attacks " + enemy.getName() + " with his Hydro Pump!");
        switch (enemy.getType()) {
            case "water" -> {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp((enemy.getHp() - 15));
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp((enemy.getHp() - 25));
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 35 hp");
                enemy.setHp((enemy.getHp() - 35));
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 45 hp");
                enemy.setHp((enemy.getHp() - 45));
            }
        }
        System.out.println(enemy.getName() + " now has " + enemy.getHp() + "hp left!");
    }

    public void hydroCanon(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " is about to blast things away and attacks " + enemy.getName() + " with his Hydro Canon!");
        switch (enemy.getType()) {
            case "water" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp((enemy.getHp() - 10));
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp((enemy.getHp() - 15));
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 35 hp");
                enemy.setHp((enemy.getHp() - 35));
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 45 hp");
                enemy.setHp((enemy.getHp() - 45));
            }
        }
        System.out.println(enemy.getName() + " now has " + enemy.getHp() + "hp left!");
    }

    public void rainDance(Pokemon name, Pokemon enemy) {
        System.out.println( "Look at that! I hope you brought your dancing shoes, cuz we are going to dance in the rain!! " + name.getName() + " performs a rain dance and rain falls down on " + enemy.getName() + "!");
        switch (enemy.getType()) {
            case "water" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp((enemy.getHp() - 10));
            }
            case "grass" -> {
                System.out.println("Too bad for " + name.getName() + "The rain gives some extra strength to " + enemy.getType() + " Pokemons like" + enemy.getName());
                System.out.println(enemy.getName() + " gains 15 hp from the rain");
                enemy.setHp((enemy.getHp() + 15));
            }
            case "electric" -> {
                System.out.println("Too bad for " + name.getName() + "His magic dance doesn't have any effect on " + enemy.getType() + " Pokemons like" + enemy.getName());
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 50 hp");
                enemy.setHp((enemy.getHp() - 50));
            }
        }
        System.out.println(enemy.getName() + " now has " + enemy.getHp() + "hp left!");
    }


}
