package javafoundation.online_sem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public  class Demo_MinMax {
    public static void main(java.lang.String[] args) {
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(Collections.max(num));
        System.out.println(Collections.min(num));
    }
}