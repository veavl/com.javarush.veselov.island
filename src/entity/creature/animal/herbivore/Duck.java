package entity.creature.animal.herbivore;

import java.util.Random;

public class Duck extends Herbivore {

    public double weight = 1;
    public int maxQuantity = 200;

    public int getQuantity() {
        return new Random().nextInt(maxQuantity);
    }

}
