package entity.creature.animal;

import entity.creature.Creature;
import util.AnimalType;

import java.util.List;

public abstract class Animal extends Creature {

    // ОБЩИЕ ХАРАКТЕРИСТИКИ
    // СЫТОСТЬ satiety = ? вес

    // ВЕС ЖИВОТНОГО
    int weight;

    // УЕНЬШАЕТСЯ ВЕС
    void decreaseWeight(){
    }


    // СКОРОСТЬ ПЕРЕМЕЩЕНИЯ

    // 2 random number, array probabilityEating, Массив для хранения списков Животных
    public   void eat(int numberEat, int numberEating, Integer[][] probabilityEating, List<Animal>[] arrayLists) {

        // Если есть вероятность быть съеденным - то удаляется объект того Животного, которого съели

        if (probabilityEating[numberEat][numberEating] != null &&  probabilityEating[numberEat][numberEating] != 0) {
            arrayLists[numberEating].remove(0);         // УДАЛЯЕМ ИЗ СООТВЕТСТВУЮЩЕГО СПИСКА ОБЪЕКТ СЪЕДЕННОГО ЖИВОТНОГО
        }
    }

    void move() {
        // ДЕФОЛТНАЯ РЕАЛИЗАЦИЯ
    }

    Creature reproduce() {
        // ДЕФОЛТНАЯ РЕАЛИЗАЦИЯ
        return null;
    }

    void die() {
        // ДЕФОЛТНАЯ РЕАЛИЗАЦИЯ
    }

}
