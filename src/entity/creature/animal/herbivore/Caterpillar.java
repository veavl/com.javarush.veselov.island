package entity.creature.animal.herbivore;

/* Гусеница */

import java.util.Random;

public class Caterpillar extends Herbivore {

    public double weight = 0.01;
    public int maxQuantity = 1000;

    public int getQuantity() {
        return new Random().nextInt(maxQuantity);
    }

}
