package javafoundation.section_10;

    public class Potok extends Thread {
        @Override
        public void run(){
            System.out.println("Это поток: " + getName());
        }

        public class Main {
            public static void main(String[] args) {
                for (int i = 0; i<10; i++){
                    Potok thread = new Potok();
                    thread.start();
                }
            }
        }
    }

