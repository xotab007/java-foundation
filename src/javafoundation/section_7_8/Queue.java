package javafoundation.section_7_8;

public class Queue {
    char q[]; // массив для хранения элементов очереди
    int putloc, getloc; // индексы для вставки и извлечения элементов очереди

    // элементов очереди
    Queue(int size) {
        q = new char[size + 1]; // выделить память для очереди
        putloc = getloc = 0;
    }

    // Поместить символ в очередь
    void put(char ch) {
        if (putloc == q.length - 1) {
            System.out.println(" - Очередь заполнена");
            return;
        }
        putloc++;
        // q[putloc] ch;
        }
    // Извлечь символ из очереди
    char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }
}

//Демонстрация использования класса
class QDemo {
    public static void main(String args[]) { Queue bigQ = new Queue(100);
        Queue srnallQ = new Queue(4);
        char ch;
        int i;
        System.out.println("Иcпoльзoвaниe очереди ЬigQ для сохранения алфавита");
        // Поместить буквенные символы в очередь ЬigQ
        for(i=0; i < 26; i++)
            bigQ.put((char) ('А' + i));
        // Извлечь буквенные символы из очереди ЬigQ и отобразить
        System.out.print("Coдepжимoe очереди ЬigQ: ");
        for(i=0; i < 26; i++) {
            ch = bigQ.get();
            if(ch != (char) 0) System.out.print(ch);
        }
        System.out.println("\n");
        System.out.println("Иcпoльзoвaниe очереди srnallQ для генерации ошибок");
        // Использовать очередь srnallQ для генерации ошибок
        for(i=0; i < 5; i++) {
            System.out.print("Пoпыткa сохранения " + (char) ('z' - i));
            srnallQ.put((char) ('Z' - i));
            System.out.println();
        }
        System.out.println();
        // Дополнительные ошибки при обращении к очереди srnallQ
        System.out.print("Coдepжимoe srnallQ: ");
        for(i=0; i < 5; i++) {
            ch = srnallQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }
    }
}