// Если в методе main() создать объекты этих классов, то можно узнать информацию о тарелке и
// вызвать пустой метод eat() у кота. Эти объекты пока никак не могут взаимодействовать между собой.
// Можно добавить в классы геттеры и сеттеры и получить код вроде.

// ЗАДАНИЕ

// 1. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды 
// (например, в миске 10 еды, а кот пытается покушать 15-20).
// 2. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). 
// Если коту удалось покушать (хватило еды), сытость = true. Считаем, что если коту 
// мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт 
// (это сделано для упрощения логики программы).
// 3. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и 
// потом вывести информацию о сытости котов в консоль.
// 4. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.

import java.util.ArrayList;
import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 15);
        Cat cat2 = new Cat("Tom", 5);
        Cat cat3 = new Cat("Vasia", 10);
        Cat cat4 = new Cat("Pinachet", 20);
        Cat cat5 = new Cat("Pyx", 5);
        
        Plate plate = new Plate(5);
        
        ArrayList<Cat> cats = new ArrayList<>(Arrays.asList(cat1, cat2, cat3, cat4, cat5));
        plate.info();
        for (Cat cat : cats) {
            cat.eat(plate);
        }
        System.out.println();
        
        plate.info();

        for (Cat cat : cats) {
            cat.info();
        }
    }
}