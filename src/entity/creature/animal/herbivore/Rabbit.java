package entity.creature.animal.herbivore;

import java.util.Random;

public class Rabbit extends Herbivore {

    public double weight = 2;
    public int maxQuantity = 150;

    public int getQuantity() {
        return new Random().nextInt(maxQuantity);
    }

}
