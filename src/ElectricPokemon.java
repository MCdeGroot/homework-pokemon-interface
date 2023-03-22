import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {

    private final String type = "electric";
    private List<String> attacks = Arrays.asList("thunderPunch", "electroBall", "thunder", "voltTackle");

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    @Override
    public String getType() {
        return type;
    }

    public List<String> getAttacks() {
        return attacks;
    }

    public void thunderPunch(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with his Punches of Thunder!");
        switch (enemy.getType()) {
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp((enemy.getHp() - 10));
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp((enemy.getHp() - 20));
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp((enemy.getHp() - 30));
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp((enemy.getHp() - 40));
            }
        }
        System.out.println(enemy.getName() + " now has " + enemy.getHp() + "hp left!");
    }

    public void electroBall(Pokemon name, Pokemon enemy) {
        System.out.println("Well Well Well, I hope "+ enemy.getName() + " got balls of steels, because " + name.getName() + " attacks him with his Electric Balls!");
        switch (enemy.getType()) {
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp((enemy.getHp() - 15));
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp((enemy.getHp() - 20));
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 35 hp");
                enemy.setHp((enemy.getHp() - 35));
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp((enemy.getHp() - 40));
            }
        }
        System.out.println(enemy.getName() + " now has " + enemy.getHp() + "hp left!");
    }

    public void thunder(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with his Thunder!");
        switch (enemy.getType()) {
            case "electric" -> {
                System.out.println("I'm wondering that is what he wanted. The thunder adds some hp to himself but also to his enemy" + enemy.getName() + "!");
                name.setHp(name.getHp()+10);
                enemy.setHp(enemy.getHp()+10);
            }
            case "fire", "grass" -> {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp((enemy.getHp() - 15));
                System.out.println("The thunder drains some hp from " + enemy.getName() + " to " + name.getName());
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp((enemy.getHp() - 20));
                System.out.println("The thunder drains some hp from " + enemy.getName() + " to " + name.getName());
                name.setHp(name.getHp()+20);
            }
        }
        System.out.println(enemy.getName() + " now has " + enemy.getHp() + "hp left!");
    }

    public void voltTackle(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with his Voltage Tackle!");
        switch (enemy.getType()) {
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp((enemy.getHp() - 10));
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp((enemy.getHp() - 15));
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp((enemy.getHp() - 20));
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 50 hp");
                enemy.setHp((enemy.getHp() - 50));
            }
        }
        System.out.println(enemy.getName() + " now has " + enemy.getHp() + "hp left!");
    }
}
