import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {

    private final String type = "grass";

    private List<String> attacks = Arrays.asList("leafStorm", "solarBeam", "leechSeed", "leaveBlade");

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    @Override
    public String getType() {
        return type;
    }

    public List<String> getAttacks() {
        return attacks;
    }

    public void leafStorm(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with his Storm of Leaves!");
        switch (enemy.getType()) {
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp((enemy.getHp() - 10));
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp((enemy.getHp() - 15));
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp((enemy.getHp() - 20));
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp((enemy.getHp() - 25));
            }
        }
        System.out.println(enemy.getName() + " now has " + enemy.getHp() + "hp left!");
    }

    public void solarBeam(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with his Solar Beam!");
        switch (enemy.getType()) {
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp((enemy.getHp() - 10));
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp((enemy.getHp() - 20));
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp((enemy.getHp() - 25));
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp((enemy.getHp() - 40));
            }
        }
        System.out.println(enemy.getName() + " now has " + enemy.getHp() + "hp left!");
    }

    public void leechSeed(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with LeechSeed!");
        switch (enemy.getType()) {
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp((enemy.getHp() - 10));
                System.out.println("The attack drains some hp from " + enemy.getName() + " to " + name.getName());
                name.setHp(name.getHp() + 10);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp((enemy.getHp() - 15));
                System.out.println("The attack drains some hp from " + enemy.getName() + " to " + name.getName());
                name.setHp(name.getHp() + 15);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp((enemy.getHp() - 25));
                System.out.println("The attack drains some hp from " + enemy.getName() + " to " + name.getName());
                name.setHp(name.getHp() + 25);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp((enemy.getHp() - 30));
                System.out.println("The attack drains some hp from " + enemy.getName() + " to " + name.getName());
                name.setHp(name.getHp() + 30);
            }
        }
        System.out.println(enemy.getName() + " now has " + enemy.getHp() + "hp left!");
    }

    public void leaveBlade(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with his Blade!");
        switch (enemy.getType()) {
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp((enemy.getHp() - 20));
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp((enemy.getHp() - 30));
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp((enemy.getHp() - 40));
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 50 hp");
                enemy.setHp((enemy.getHp() - 50));
            }
        }
        System.out.println(enemy.getName() + " now has " + enemy.getHp() + "hp left!");
    }
}

