package util;

import entity.creature.animal.Animal;
import entity.creature.animal.herbivore.*;
import entity.creature.animal.predator.*;
import entity.creature.plant.Plant;

public class SimpleAnimalFactory {

    Animal animal = null;

    public Animal createAnimal(AnimalType animalType) {

        switch (animalType) {
            case WOLF:
                animal = new Wolf();
                break;
            case BOA:
                animal = new Boa();
                break;
            case FOX:
                animal = new Fox();
                break;
            case BEAR:
                animal = new Bear();
                break;
            case EAGLE:
                animal = new Eagle();
                break;
            case HORSE:
                animal = new Horse();
                break;
            case DEER:
                animal = new Deer();
                break;
            case RABBIT:
                animal = new Rabbit();
                break;
            case MOUSE:
                animal = new Mouse();
                break;
            case GOAT:
                animal = new Goat();
                break;
            case SHEEP:
                animal = new Sheep();
                break;
            case PIG:
                animal = new Pig();
                break;
            case BUFFALO:
                animal = new Buffalo();
                break;
            case DUCK:
                animal = new Duck();
                break;
            case CATERPILLAR:
                animal = new Caterpillar();
                break;
//        switch (animalType) {
//            case WOLF -> new Wolf();
//            case BOA -> new Boa();
//            case FOX -> new Fox();
//            case BEAR -> new Bear();
//            case EAGLE -> new Eagle();
//            case HORSE -> new Horse();
//            case DEER -> new Deer();
//            case RABBIT -> new Rabbit();
//            case MOUSE -> new Mouse();
//            case GOAT -> new Goat();
//            case SHEEP -> new Sheep();
//            case PIG -> new Pig();
//            case BUFFALO -> new Buffalo();
//            case DUCK -> new Duck();
//            case CATERPILLAR -> new Caterpillar();
//            //case PLANT -> new Plant();
        }
        return animal;
    }
}

//          switch (animalType) {
//            case WOLF:
//                animal = new Wolf();
//                break;
//            case BOA:
//                animal = new Boa();
//                break;