package entity.creature.animal.herbivore;

import java.util.Random;

public class Buffalo extends Herbivore {

    public double weight = 700;
    public int maxQuantity = 10;

    public int getQuantity() {
        return new Random().nextInt(maxQuantity);
    }

}
