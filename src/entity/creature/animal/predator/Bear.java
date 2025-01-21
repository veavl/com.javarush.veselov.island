package entity.creature.animal.predator;

import java.util.Random;

public class Bear extends Predator {

    public double weight = 500;
    public int maxQuantity = 5;

    public int getQuantity() {
        return new Random().nextInt(maxQuantity);
    }

}
