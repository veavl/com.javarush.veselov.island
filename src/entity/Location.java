package entity;

import entity.creature.Creature;
import entity.creature.animal.Animal;
import entity.creature.animal.predator.Wolf;
import entity.creature.plant.Plant;
import util.AnimalType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Location {

    public Animal createAnimal(AnimalType type) {

        return null;
    }

    Wolf wolf = new Wolf();

    // Animal[] animal = new Animal[15];

    List<Animal> animal = new ArrayList<>();
    List<Plant> plant = new ArrayList<>();

    List<Creature> creatures = new ArrayList<>();



    // ЛОКАЦИЯ ДОЛЖНА ЗНАТЬ ТЕКУЩЕЕ КОЛ-ВО ЖИВОТНЫХ КОНКРЕТНОГО ВИДА
    // НА СЕБЕ
    // МАССИВ?

    // ЛОКАЦИЮ ТОЖЕ НУЖНО ПРАВИЛЬНО СОЗДАТЬ -
    // ИНИЦИАЛИЗИРОВАВ ЕЕ НА СТАРТЕ КАКИМ-ТО КОЛ-ВОМ ЖИВОТНЫХ И РАСТЕНИЙ

}
