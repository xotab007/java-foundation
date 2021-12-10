# Классы коллекций Java
**Collections Framework** – библиотеке классов, реализующих различные структуры данных, в том числе списки, векторы, множества и отображения.

Класс коллекций - любой класс, реализующий интерфейс `Collection`, от которого берут начало все коллекции.
В каждом классе коллекций определены методы, предназначенные для хранения и обработки наборов значений или объектов.
Коллекция – это набор элементов.

## Класс ArrayList
Один из наиболее популярных классов коллекции `ArrayList` – реализует интерфейс List. Это обобщенный класс и он имеет следующую форму объявления `ArrayList<T>`, где T – тип элементов, хранящихся в списке.

```Java
public class CatsList{
    public static void main(String[] args) {
        
        ArrayList<Cat> cats = new ArrayList<>();
        Cat thom = new Cat("Том");
        Cat behemoth = new Cat("Бегемот");
        Cat puffin = new Cat("Мак Пуффин");

        cats.add(thom);
        cats.add(behemoth);
        cats.add(puffin);

        Cat secondCat = cats.get(1);

        System.out.println(secondCat);
        }
}
```
В пример выше, фраза `ArrayList<Cat> cats` говорит, что на переменную `cats` можно ссылаться как на коллекцию объектов `cat`.
В этой же строке фраза `ArrayList<>` обозначает повторное использование обобщенного типа.

## Класс Stack
Одной из самых простых структур является массив, который представляет собой линейный список элементов, допускающий произвольный доступ к ним.
`Stack` – это набор элементов с организацией доступа по принципу «Last In - First Out» (LIFO) – «первым пришел - последним вышел».
В Java есть одноимённый класс `Stack`. Добавление элементов осуществляется методом `push()`, а удаление методом `pop()`.

```Java
public class CatsBook{ 
    public static void main(String[]args){
        Stack<Integer> book=new Stack<>();
        book.push("Кот в сапогах");
        book.push("Коти-вояки. На волю!");
        book.push("Король Лев");
        while(!book.empty()){
            System.out.println(book.pop());
        }
    }
}
```

## Интерфейс Queue
`Queue` (очередь) – это набор элементов с организацией доступа по принципу «First In - First Out» (FIFO) – «первым пришел - первым вышел».
Одна из самых популярных реализаций очереди это `LinkedList`, представленный ниже.

```Java
public class CatsList {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Том");
        queue.add("Бегемот");
        queue.add("Мак Пуффин");
        while (queue.peek() != null) { // или !queue.isEmpty()
            System.out.println(queue.poll());
        }
    }
}
```
Здесь мы добавляем в очередь `LinkedList` некоторые строки, затем в цикле извлекаем их из очереди и одновременно выводим на экран. Наличие элементов в очереди проверяем через метод `peek()`, который возвращает null в случае, если элементов не осталось.

## Класс Deque
Класс `Deque` – двухсторонняя очередь, наследник интерфейса `Queue` позиционируется как современная альтернатива классу `Stack`.

```Java
public class CatsList {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add("Том");
        deque.add("Бегемот");
        deque.add("Мак Пуффин");
        while (!deque.isEmpty()) {
            System.out.println(deque.pop());
        }
    }
}
```

# Другие коллекции Джава: HashMap
`HashMap` — основан на хэш-таблицах, реализует интерфейс Map (что подразумевает хранение данных в виде пар ключ/значение).
Ключи и значения могут быть любых типов, в том числе и null.
Данная реализация не дает гарантий относительно порядка элементов с течением времени.

## Создание объекта Hashmap
```Java
class HashMap {
    public static void main(String[] args) {
        Map<String, String> hashmap = new HashMap<String, String>();
    }
}
```

Объект `hashmap`, содержит ряд свойств:
- `table` — Массив типа Entry[], который является хранилищем ссылок на списки (цепочки) значений; 
- `loadFactor` — Коэффициент загрузки. Значение по умолчанию 0.75 является хорошим компромиссом между временем доступа и объемом хранимых данных; 
- `threshold` — Предельное количество элементов, при достижении которого, размер хэш-таблицы увеличивается вдвое. Рассчитывается по формуле (capacity * loadFactor); 
- `size` — Количество элементов HashMap-а;

## Добавление элементов
`hashmap.put("0", "zero");`

При добавлении элемента, последовательность шагов следующая:
1. Сначала ключ проверяется на равенство null. Если это проверка вернула true, будет вызван метод `putForNullKey(value)`. 
2. Далее генерируется хэш на основе ключа. Для генерации используется метод `hash(hashCode)`, в который передается `key.hashCode()`.
3. С помощью метода `indexFor(hash, tableLength)`, определяется позиция в массиве, куда будет помещен элемент.
4. Теперь, зная индекс в массиве, мы получаем список (цепочку) элементов, привязанных к этой ячейке. Хэш и ключ нового элемента поочередно сравниваются с хэшами и ключами элементов из списка и, при совпадении этих параметров, значение элемента перезаписывается.
5. Если же предыдущий шаг не выявил совпадений, будет вызван метод `addEntry(hash, key, value, index)` для добавления нового элемента.

Исходник [HashMap](http://hg.openjdk.java.net/jdk7/jdk7/jdk/file/9b8c96f96a0f/src/share/classes/java/util/HashMap.java) JDK 7.

## Задание
1. Создайте класс Pet и его наследников Cat, Dog, Owl.
2. Инициализируйте HashMap.
3. Создайте отображение из домашних животных, где в качестве ключа выступает строка, а в качестве значения класс Pet.
4. Получите набор элементов.
5. Отобразите набор.
6. Добавьте новые значения.
7. Сгенирируйте набор случайных чисел и посчитайте количество повторов.

## Полезные ссылки
1. Interface Collection JavaDoc – [java.util.Collection](https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html).
2. Class Stack JavaDoc – [java.util.Stack](https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html).
3. Interface Queue JavaDoc – [java.util.Queue](https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html).
4. Class Deque JavaDoc – [java.util.ArrayDeque](https://docs.oracle.com/javase/8/docs/api/java/util/Deque.html).
5. Interface Map JavaDoc – [java.util.Map](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html).