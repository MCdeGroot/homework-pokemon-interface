import java.security.PublicKey;

public abstract class Pokemon {

    // dit wordt abstracte Super class
    //eerst gaan we hier alle standaard variabelen toevoegen die iedere Pokemon moet worden gedeclareerd.
// In Class variabelen staan variabelen die meerdere keren voor komen een eenmaal, dit moet precies andersom toch zijn? Type komt bijvoorbeeld maar 1 keer voor toch? en kunnen dan Final gemaakt worden?

    private final String name; //final hoeft niet meer aangepast te worden
    private final int level;//final hoeft niet meer aangepast te worden
    private int hp;//Dit is de enige niet final variabele
    private final String food;
    private final String sound;

    private String type;

    public Pokemon(String name, int level, int hp, String food, String sound) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getFood() {
        return food;
    }

    public String getSound() {
        return sound;
    }

    public String getType(){
        return type;
    }

}

