package entity.creature.animal.herbivore;

/* Олень */

import java.util.Random;

public class Deer extends Herbivore {

    public double weight = 300;
    public int maxQuantity = 20;

    public int getQuantity() {
        return new Random().nextInt(maxQuantity);
    }

}
