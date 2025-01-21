package entity.creature.animal.herbivore;

/* Овца */

import java.util.Random;

public class Sheep extends Herbivore {

    public double weight = 70;
    public int maxQuantity = 140;

    public int getQuantity() {
        return new Random().nextInt(maxQuantity);
    }

}
