import java.util.Random;

public class Randomizer {
    public int getGetal() {
        Random random = new Random();
        int getal = random.nextInt(1000);
        return getal;
    }
}
