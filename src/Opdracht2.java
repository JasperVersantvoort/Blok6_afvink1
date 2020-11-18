import java.util.ArrayList;
import java.util.Collections;

public class Opdracht2 {

    public static void main(String[] args) {
        ArrayList<Integer> intlijst = new ArrayList<>();
        Randomizer random = new Randomizer();
        for (int i = 0; i < 1000; i++) {
            intlijst.add(random.getGetal());
        }

        System.out.println(sort(intlijst));
    }

    public static ArrayList<Integer> sort(ArrayList<Integer> int_lijst) {

        for (int i = 1; i < int_lijst.size(); i++) {

            if (int_lijst.get(i - 1) > int_lijst.get(i)) {
                //System.out.println("i");
                for (int y = i; y > 0; y--) {
                    if (int_lijst.get(y - 1) > int_lijst.get(y)) {
                        //System.out.println("y");
                        int x = int_lijst.get(y - 1);
                        int_lijst.set(y - 1, int_lijst.get(y));
                        int_lijst.set(y, x);
                    } else {
                        //System.out.println("break");
                        break;
                    }

                }

            }
        }
        return int_lijst;
    }


}

