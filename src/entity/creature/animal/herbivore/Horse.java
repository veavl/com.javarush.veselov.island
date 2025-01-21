package entity.creature.animal.herbivore;

import java.util.Random;

public class Horse extends Herbivore{

    public double weight = 400;
    public int maxQuantity = 20;

    public int getQuantity() {
        return new Random().nextInt(maxQuantity);
    }

}
