package entity.creature.animal.herbivore;

/* Коза */

import java.util.Random;

public class Goat extends Herbivore {

    public double weight = 60;
    public int maxQuantity = 140;

    public int getQuantity() {
        return new Random().nextInt(maxQuantity);
    }

}
