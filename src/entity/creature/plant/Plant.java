package entity.creature.plant;

import entity.creature.Creature;

import java.util.Random;

public class Plant extends Creature {

    public double weight = 1;
    public int maxQuantity = 200;

    public int getQuantity() {
        return new Random().nextInt(maxQuantity);
    }

    // РОСТ РАСТЕНИЙ
    // void encreaseQuantity(){
    //       ++quantity
    //    }

}
