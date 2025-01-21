package entity.creature.animal.herbivore;

import java.util.Random;

public class Mouse extends Herbivore {

    public double weight = 0.05;
    public int maxQuantity = 500;

    public int getQuantity() {
        return new Random().nextInt(maxQuantity);
    }

}
