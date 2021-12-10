package javafoundation.section_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public  class Demo_MinMax {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(Collections.max(numbers));
        System.out.println(Collections.min(numbers));
    }
}