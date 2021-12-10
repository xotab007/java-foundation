package javafoundation.section_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo_ArrayList {
    public static void main(String[] args) {

        String mercury = new String("Меркурий");
        String venus = new String("Венера");
        String earth = new String("Земля");
        String mars = new String("Марс");
        String jupiter = new String("Юпитер");

        // List<String> solarSystem = Collections.unmodifiableList(new ArrayList<>(Arrays.asList(mercury, venus, earth, mars, jupiter)));
        ArrayList<String> solarSystem1 = new ArrayList<>(Arrays.asList(mercury, venus, earth));
        ArrayList<String> solarSystem2 = new ArrayList<>(Arrays.asList(mars, jupiter, earth));
        // System.out.println(solarSystem);
        // Collections.swap(solarSystem, solarSystem.indexOf(mercury), solarSystem.indexOf(jupiter));
        // Collections.sort(solarSystem);
        // Collections.reverse(solarSystem);
        System.out.println(Collections.disjoint(solarSystem1, solarSystem2));
    }
}