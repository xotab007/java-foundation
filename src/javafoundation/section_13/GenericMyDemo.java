package javafoundation.section_13;

public class GenericMyDemo<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {

        GenericMyDemo<String> stringBox = new GenericMyDemo<>();

        stringBox.set("Старая строка");
        System.out.println(stringBox.get());
        stringBox.set("Новая строка");

        System.out.println(stringBox.get());

        // ошибка компиляции
        // stringBox.set(12345);
    }
}
