package javafoundation.section_5;

import java.util.Scanner;

public class EvenOrNotEven {
    public static int recursion(double n) {
        // приравниваем n == 1
        if (n == 1) {
            return 1; }
        // n > 1 или n < 2
        else if (n > 1 && n < 2) {
            return 0; }
        else {
            return recursion(n / 2); }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        if (recursion(n) == 1) { System.out.println("Even");
        } else {
            System.out.println("Not even"); }
    }
}
