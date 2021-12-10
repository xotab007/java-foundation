package javafoundation.section_9;

import java.util.ArrayList;
import java.util.Collections;

public class Demo_Shuffle {
    public static void main(String[] args) {
        ArrayList<Integer> lottery = new ArrayList<>(100);
        for (int i=1; i<= 100; i++){
            lottery.add(i); // добавляем числа от 0 до 100
        }
        Collections.shuffle(lottery); // Перемешивает
        for (int i=0; i < 10; i++){
            System.out.println(lottery.get(i));
        }
    }
}