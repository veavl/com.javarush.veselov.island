package entity.creature.animal.predator;

import java.util.Random;

public class Eagle extends Predator {

    public double weight = 6;
    public int maxQuantity = 20;

    public int getQuantity() {
        return new Random().nextInt(maxQuantity);
    }

}
