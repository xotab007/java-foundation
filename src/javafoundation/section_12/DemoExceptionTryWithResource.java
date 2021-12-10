package javafoundation.section_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoExceptionTryWithResource extends Throwable {
    public DemoExceptionTryWithResource(String s) {
    }

    public String input() throws DemoExceptionTryWithResource { // throws - предупреждает, что метод может выбросить исключение
        String s = null;
        // заключаем в try код, в котором может произойти исключение
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            s = reader.readLine();
            if (s.equals("")) {
                // прерывание выполнения программы с генерацией своего типа исключения
                throw new DemoExceptionTryWithResource("String can not be empty!");
            }
            // заключаем в catch код, который обработает исключение IOException
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return s;
    }
}
