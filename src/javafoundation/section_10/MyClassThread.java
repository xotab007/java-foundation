package javafoundation.section_10;

public class MyClassThread extends Thread {
    @Override
    public void run() {
        System.out.println("Поток " + getName());
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            MyClassThread thread = new MyClassThread();
            thread.start();
        }
    }
}