package javafoundation.online_sem;

import java.util.ArrayList;
import java.util.Collections;

public class Demo_Shuffle {
    public static void main(String[] args) {
        ArrayList<Integer> lottery = new ArrayList<>(100);
        for (int i = 1; i <= 100; i++){
            lottery.add(i); // добавление чисел от 0 до 100
        }
        Collections.shuffle(lottery); // метод перемешивания
        System.out.println("Наши 10 случайных чисел:");
        for (int i = 0; i < 10; i++){
            System.out.println(lottery.get(i));
        }
    }
}