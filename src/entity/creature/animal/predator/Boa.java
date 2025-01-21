package entity.creature.animal.predator;

import java.util.Random;

public class Boa extends Predator {

    public double weight = 15;
    public int maxQuantity = 30;

    public int getQuantity() {
        return new Random().nextInt(maxQuantity);
    }

}
