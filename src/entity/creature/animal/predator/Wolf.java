package entity.creature.animal.predator;

import java.util.Random;

public class Wolf extends Predator {

    public double weight = 50;
    public int maxQuantity = 30;

    public int getQuantity() {
        return new Random().nextInt(maxQuantity);
    }

}
