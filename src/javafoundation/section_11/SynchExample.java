package javafoundation.section_11;

public class SynchExample {
    private static String cat1 = "Рукавичка";
    private static String cat2 = "Пуффин";

    public static void swap(){
        synchronized (SynchExample.class) {
            String s = cat1;
            cat1 = cat2;
            cat2 = s;
        }
    }
}
