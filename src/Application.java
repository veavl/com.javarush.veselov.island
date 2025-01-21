import entity.Island;
import entity.creature.animal.Animal;
import util.SimpleAnimalFactory;
import util.AnimalType;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Application {

    // МЕТОД ПОЛУЧЕНИЯ ОБЪЕКТА ЖИВОТНОГО ИЗ ФАБРИКИ
    static Animal objectAnimal(int numberAnimalType) {                              // НОМЕР Животного из ENUM
        AnimalType animalType = AnimalType.values()[numberAnimalType];
        Animal animalObject = new SimpleAnimalFactory().createAnimal(animalType);
        return animalObject;                                                        // ОБЪЕКТ животного из Фабрики
    }

    public static void main(String[] args) throws IllegalAccessException, InterruptedException {
        // ТОЧКА СБОРКИ И СТАРТА МОЕГО ПРИЛОЖЕНИЯ
        Island island = new Island(Settings.columnsCount, Settings.rowsCount);

        Settings settings = new Settings();                                         // ДАННЫЕ ИЗ Settings
        String[] arrayCreatureRu = settings.arrayCreatureRu;                        // Массив Сущностей RU
        Integer[][] probabilityEating = settings.probabilityEating;                 // С какой вероятностью животное съедает "пищу"

// Массив для хранения списков Животных -->
// КАЖДЫЙ СПИСОК List<Animal> массива ЗАПОЛНЯЕТСЯ ОБЪЕКТАМИ КОНКРЕТНОГО ЖИВОТНОГО
// в количестве, указанном в ПОЛЕ maxQuantity

        List<Animal>[] arrayLists = new ArrayList[15];
        for (int i = 0; i < arrayLists.length; i++) {
            arrayLists[i] = new ArrayList<>();
            Animal currentAnimal = objectAnimal(i);
            Field[] declaredFields = currentAnimal.getClass().getDeclaredFields();
            int maxQuantity = (int) declaredFields[1].get(currentAnimal);
            for (int j = 0; j < maxQuantity; j++) {
                arrayLists[i].add(currentAnimal);
            }                                                                                  
        }

        System.out.println("Начальное количество животных в одной локации:");
        for (int i = 0; i < 15; i++) {
            System.out.print(arrayCreatureRu[i] + ": " + arrayLists[i].size() + ". ");
        }
        System.out.println();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int randomNumberAnimalEat = new Random().nextInt(15);
                int randomNumberAnimalEating = new Random().nextInt(15);
                Animal animalEat = objectAnimal(randomNumberAnimalEat);         // ОБЪЕКТ КТО ЕСТ
                                                                                // Метод eat() Animal.java
                animalEat.eat(randomNumberAnimalEat, randomNumberAnimalEating, probabilityEating, arrayLists);
            }
        };

        for (int i = 0; i < 1000; i++) {
            new Thread(runnable).start();
            System.out.println(i);
        }
        Thread.sleep(1000);

        System.out.println("Результат одного жизненного цикла:");
        for (int i = 0; i < 15; i++) {
            System.out.print(arrayCreatureRu[i] + ": " + arrayLists[i].size() + ". ");
        }

    }
}
