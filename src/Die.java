import java.util.Random;

public class Die {

    private int sides;

    public int roll() {
        Random rand = new Random();

        int result = rand.nextInt(getSides()) + 1;

        return result;
    };

    public Die(int sides) {
        this.sides = sides;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }
}
