package javafoundation.section_11;

public class SynchClass {
    private Object obj = new Object();
    private Object obj2 = new Object();

    public void doSomething(){
        // логика метода, доступная всем потокам
        synchronized (obj){
            // логика одного потока
        }
    }
    public void swap(){
        synchronized (this){
            // логика
        }
    }
}