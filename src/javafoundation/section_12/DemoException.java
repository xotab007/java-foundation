package javafoundation.section_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoException extends Throwable {
    public DemoException(String s) {
    }

    public String input() throws DemoException { // throws - предупреждает, что метод может выбросить исключение
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        // заключаем в try код, в котором может произойти исключение
        try {
            s = reader.readLine();
            // заключаем в catch код, который обработает исключение IOException
        } catch (IOException e) {
            System.out.println(e.getMessage());
            // finally - закрывает поток чтения
        } finally {
            // возможное исключение при закрытии потока
            try {
                reader.close();
                // обработка исключения при закрытии потока
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        if (s.equals("")) {
            // прерывание выполнения программы с генерацией своего типа исключения
            throw new DemoException("String can not be empty!");
        }
        return s;
    }
}
