package entity.creature.animal.herbivore;

import java.util.Random;

public class Pig extends Herbivore {

    public double weight = 400;
    public int maxQuantity = 50;

    public int getQuantity() {
        return new Random().nextInt(maxQuantity);
    }

}
