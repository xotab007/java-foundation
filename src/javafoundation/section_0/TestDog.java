package javafoundation.section_0;

public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog ("Snoop", 2);
        Dog d2 = new Dog ("Helen", 7);
        Dog d3 = new Dog ("Bob");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}