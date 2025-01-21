import java.util.Random;

public class Settings {

  public final static int columnsCount = 1;
  public final static int rowsCount = 1;

  public String[] arrayCreatureRu = {"Волк", "Удав", "Лиса", "Медведь", "Орел", "Лошадь", "Олень", "Кролик", "Мышь", "Коза", "Овца", "Кабан", "Буйвол", "Утка", "Гусеница", "Растения"};

  public Integer[][] probabilityEating = {
          {null, 0, 0, 0, 0, 10, 15, 60, 80, 60, 70, 15, 10, 40, 0, 0},
          {0, null, 15, 0, 0, 0, 0, 20, 40, 0,	0, 0, 0, 10, 0, 0},
          {0, 0, null, 0, 0, 0, 0, 70, 90, 0, 0, 0, 0, 60, 40, 0},
          {0, 80, 0, null, 0, 40, 80, 80, 90, 70, 70, 50, 20, 10, 0, 0},
          {0, 0, 10, 0, null, 0, 0, 90, 90, 0, 0, 0, 0, 80, 0, 0},
          {0, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100},
          {0, 0, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 100},
          {0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 100},
          {0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 90, 100},
          {0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 100},
          {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, 0, 100},
          {0, 0, 0, 0, 0, 0, 0, 0, 50, 0, 0, null, 0, 0, 90, 100},
          {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 100},
          {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 90, 100},
          {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null ,100},
  };


}
