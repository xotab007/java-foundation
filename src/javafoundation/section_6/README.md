# Сортировка

В проекте [`Buble.java`](Buble.java) реализован простой алгоритм сортировки массива. Вам, вероятно, известно, что существуют разные алгоритмы сортировки, в том числе быстрая сортировка, сортировка перемешиванием, сортировка методом Шелла и т.п. Но самым простым и общеизвестным алгоритмом является пузырьковая сортировка. Этот алгоритм не очень эффективен, но отлично подходит для сортировки небольших массивов.

В алгоритме пузырьковой сортировки соседние элементы массива сравниваются между собой и, если требуется, меняются местами. При этом меньшие значения сдвигаются к одному краю массива, а большие - к другому. Этот процесс напоминает всплывание пузырьков воздуха на разные уровни в емкости с жидкостью, откуда и произошло название данного алгоритма. Пузырьковая сортировка пред­ полагает обработку массива в несколько проходов. Элементы, взаимное расположение которых отличается от требуемого, меняются местами. Число проходов, необходимых для упорядочения элементов этим способом, на единицу меньше количества элементов в массиве.

Ниже приведен исходный код, составляющий основу алгоритма пузырьковой сортировки. Сортируемый массив называется `nums`.

```java
public class Buble {
    public static void main(String[] args) {
        int [] nums = {99, -10, 100123, 18, -978, 165, 5623, 463, -9, 287, 49}; // Создание массива
        int a, b, t, size = 10;
        // Метод пузырьковой сортировки
        for (a = 1; a < size; a++)
            for (b = size - 1; b >= a; b--) {
                if (nums[b - 1] > nums[b]) { // если требуемый порядок
                                             // следования не соблюдается,
                                             // поменять элементы местами
                    t = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = t;
                }
            }
    }
}
```

Как видите, в приведенном выше фрагменте кода используется два цикла `for`. Во внутреннем цикле сравниваются соседние элементы массива и выявляются элементы, находящиеся не на своих местах. При обнаружении элемента, нарушающего требуемый порядок, два соседних элемента меняются местами. На каждом проходе наименьший элемент перемещается на одну позицию в нужное положение. Внешний цикл обеспечивает повторение описанного процесса до завершения всего процесса сортировки.