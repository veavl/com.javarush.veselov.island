package entity.creature.animal.predator;

import java.util.Random;

public class Fox extends Predator {

    public double weight = 8;
    public int maxQuantity = 30;

    public int getQuantity() {
        return new Random().nextInt(maxQuantity);
    }

}
